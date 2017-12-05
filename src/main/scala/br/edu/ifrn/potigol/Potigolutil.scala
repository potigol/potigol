/*
 *  Potigol
 *  Copyright (C) 2015-2016  Leonardo Lucena
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

/**
 *   _____      _   _             _
 *  |  __ \    | | (_)           | |
 *  | |__) |__ | |_ _  __ _  ___ | |
 *  |  ___/ _ \| __| |/ _` |/ _ \| |
 *  | |  | (_) | |_| | (_| | (_) | |
 *  |_|   \___/ \__|_|\__, |\___/|_|
 *                     __/ |
 *                    |___/
 *
 * @author Leonardo Lucena (leonardo.lucena@ifrn.edu.br)
 */

package br.edu.ifrn.potigol

import collection.generic.CanBuildFrom
import collection.mutable.{ Seq => MSeq }
import io.StdIn
import util.{ Failure, Success, Try }

object Potigolutil {
  private[this] val since094 = "0.9.4"
  // Tipos
  type Texto = String
  type Inteiro = Int
  type Numero = Double
  type Número = Numero
  type Logico = Boolean
  type Lógico = Logico
  type Real = Double
  type Caractere = Char
  type Matriz[T] = Lista[Lista[T]]
  type Cubo[T] = Lista[Lista[Lista[T]]]
  type Nada = Unit

  var $cor = false

  implicit class PotigolStr(ctx: StringContext) {
    def bool(a: Any) = a match {
      case false => "falso"
      case true  => "verdadeiro"
      case _     => a
    }
    def p(args: Any*): String = ctx.standardInterpolator(a => a, args.map(bool))
  }

  // valores
  val verdadeiro = true
  val falso = false

  // Expressões Regulares
  private[this] val intRE = """-?\d+""".r
  private[this] val numRE = """-?(\d*)(\.\d*)?""".r

  def lista[A](n: Inteiro)(valor: => A) = Lista.apply(n, valor)
  def matriz[A](i: Inteiro, j: Inteiro)(valor: => A): Matriz[A] = Matriz.apply(i, j, valor)
  def cubo[A](i: Inteiro, j: Inteiro, k: Inteiro)(valor: => A): Cubo[A] = Cubo.apply(i, j, k, valor)

  trait Colecao[T] {
    val _lista: Seq[T]
    def apply(a: Int): T = _lista(a)
    def length: Int = _lista.length
    override def toString: String = _lista.mkString("[", ", ", "]")
    def junte(separador: Texto = ""): Texto = _lista.mkString(separador)
    def junte(inicio: Texto, separador: Texto, fim: Texto): Texto = _lista.mkString(inicio, separador, fim)
    def tamanho: Inteiro = _lista.length
    def get(a: Int): T = if (a > 0) apply(a - 1) else apply(tamanho + a)
    def posicao(elem: T): Inteiro = _lista.indexOf(elem, 0) + 1
    def cabeca: T = _lista.head
    def contem(a: T): Lógico = _lista.contains(a)
    def ultimo: T = _lista.last
    def injete[A >: T](f: (A, T) => A): A = _lista.reduceLeft(f)
    def injete[A](neutro: A)(f: (A, T) => A): A = _lista.foldLeft(neutro)(f)
    def ache(p: T => Lógico): Option[T] = _lista.find(p)
    def contém: T => Lógico = contem
    def cabeça: T = cabeca
    def primeiro: T = cabeca
    def último: T = ultimo
    def posição: T => Inteiro = posicao
    def posiçao: T => Inteiro = posicao
    def posicão: T => Inteiro = posicao
    def para_lista: Lista[T] = Lista(_lista.toList)
    def lista: Lista[T] = para_lista
    def mutavel: Vetor[T] = Vetor(_lista.to)
    def mutável: Vetor[T] = mutavel
    def imutável = lista
    def imutavel = lista
    def divida_quando(f: (T, T) => Lógico): Matriz[T] = Lista(_lista.foldRight(List.empty[Lista[T]]) { (a, b) =>
      if (b.isEmpty || f(a, b.head.head)) Lista(List(a)) :: b else (a :: b.head) :: b.tail
    })
  }

  case class Lista[T](val _lista: List[T]) extends IndexedSeq[T] with Colecao[T] {
    def cauda: Lista[T] = Lista(_lista.tail)
    def ordene(implicit ord: Ordering[T]): Lista[T] = Lista(_lista.sorted)
    def inverta: Lista[T] = Lista(_lista.reverse)
    @deprecated("Use 'selecione'", since094) def filtre(p: T => Lógico): Lista[T] = Lista(_lista.filter(p))
    def selecione: (T => Lógico) => Lista[T] = filtre
    def mapeie[B](f: T => B): Lista[B] = Lista(_lista.map(f))
    def pegue_enquanto(p: T => Lógico): Lista[T] = Lista(_lista.takeWhile(p))
    @deprecated("Use 'descarte_enquanto'", since094) def passe_enquanto(p: T => Lógico): Lista[T] = Lista(_lista.dropWhile(p))
    def descarte_enquanto: (T => Lógico) => Lista[T] = passe_enquanto
    @deprecated("Use 'descarte'", since094) def passe(a: Inteiro): Lista[T] = Lista(_lista.drop(a))
    def descarte: Inteiro => Lista[T] = passe _
    def pegue(a: Inteiro): Lista[T] = Lista(_lista.take(a))
    def +(outra: Lista[T]): Lista[T] = Lista(_lista ::: outra._lista)
    def ::[A >: T](a: A): Lista[A] = Lista(a :: _lista)
    def remova(i: Inteiro): Lista[T] = Lista(_lista.take(i - 1) ::: _lista.drop(i))
    def insira(i: Inteiro, valor: T): Lista[T] = Lista(_lista.take(i - 1) ::: valor :: _lista.drop(i - 1))
    def zip[A](outra: Colecao[A]): Lista[(T, A)] = Lista(this._lista.zip(outra._lista))
    def zip(outra: Texto): Lista[(T, Caractere)] = Lista(this._lista.zip(outra))
  }

  object Lista {
    def apply[A]: (Inteiro, => A) => Lista[A] = imutavel
    def mutavel[A](x: Inteiro, valor: => A): Vetor[A] = Lista(List.fill(x)(valor)).mutavel
    def imutavel[A](x: Inteiro, valor: => A): Lista[A] = Lista(List.fill(x)(valor))
    def vazia[A](x: A): Lista[A] = Lista(List.empty[A])
    def imutável[A]: (Inteiro, => A) => Lista[A] = imutavel
    def mutável[A]: (Inteiro, => A) => Vetor[A] = mutavel
  }

  object Matriz {
    def apply[A]: (Inteiro, Inteiro, => A) => Matriz[A] = imutavel
    def mutavel[A](x: Inteiro, y: Inteiro, valor: => A): Vetor[Vetor[A]] = {
      Lista.mutavel(x, Lista.mutavel(y, valor))
    }
    def imutavel[A](x: Inteiro, y: Inteiro, valor: => A): Matriz[A] = {
      Lista.imutavel(x, Lista.imutavel(y, valor))
    }
    def imutável[A]: (Inteiro, Inteiro, => A) => Matriz[A] = imutavel
    def mutável[A]: (Inteiro, Inteiro, => A) => Vetor[Vetor[A]] = mutavel
  }

  object Cubo {
    def apply[A]: (Inteiro, Inteiro, Inteiro, => A) => Cubo[A] = imutavel[A] _
    def mutavel[A](x: Inteiro, y: Inteiro, z: Inteiro, valor: => A): Vetor[Vetor[Vetor[A]]] = {
      Lista.mutavel(x, Lista.mutavel(y, Lista.mutavel(z, valor)))
    }
    def imutavel[A](x: Inteiro, y: Inteiro, z: Inteiro, valor: => A): Cubo[A] = {
      Lista.imutavel(x, Lista.imutavel(y, Lista.imutavel(z, valor)))
    }
    def imutável[A]: (Inteiro, Inteiro, Inteiro, => A) => Cubo[A] = imutavel
    def mutável[A]: (Inteiro, Inteiro, Inteiro, => A) => Vetor[Vetor[Vetor[A]]] = mutavel
  }

  case class Vetor[T](_lista: MSeq[T]) extends collection.mutable.IndexedSeq[T] with Colecao[T] {
    override def update(ind: Int, elem: T): Unit = { _lista.update(ind, elem) }
    def cauda: Vetor[T] = Vetor(_lista.tail)
    def inverta: Vetor[T] = Vetor(_lista.reverse)
    def ordene(implicit ord: Ordering[T]): Vetor[T] = Vetor(_lista.sorted)
    @deprecated def filtre(p: T => Lógico): Vetor[T] = Vetor(_lista.filter(p))
    def selecione: (T => Lógico) => Vetor[T] = filtre
    def mapeie[B: Manifest](f: T => B): Vetor[B] = Vetor(_lista.map(f))
    def pegue(a: Inteiro): Vetor[T] = Vetor(_lista.take(a))
    def descarte(a: Inteiro): Vetor[T] = Vetor(_lista.drop(a))
    def pegue_enquanto(p: T => Lógico): Vetor[T] = Vetor(_lista.takeWhile(p))
    @deprecated def passe_enquanto(p: T => Lógico): Vetor[T] = Vetor(_lista.dropWhile(p))
    def descarte_enquanto: (T => Lógico) => Vetor[T] = passe_enquanto
    def remova(i: Inteiro): Vetor[T] = Vetor(_lista.take(i - 1) ++ _lista.drop(i))
    def insira(i: Inteiro, valor: T): Vetor[T] = Vetor(_lista.take(i - 1) ++ List(valor) ++ _lista.drop(i - 1))
    def +(outra: Colecao[T]): Vetor[T] = Vetor(_lista ++ outra._lista)
    def zip[A](outra: Colecao[A]): Vetor[(T, A)] = Vetor(this._lista.zip(outra._lista))
    def zip(outra: Texto): Vetor[(T, Caractere)] = Vetor(this._lista.zip(outra))
  }

  implicit class Textos(val _lista: String) {
    private[this] val ZERO = "0"

    @deprecated def para_int: Inteiro = {
      if (_lista == null) 0 else
        (intRE.findPrefixOf(_lista).getOrElse(ZERO)).toInt
    }
    @deprecated def para_i: Inteiro = para_int
    @deprecated def para_inteiro: Inteiro = para_int

    def inteiro: Inteiro = para_int
    def get(a: Int): Caractere = if (a > 0) _lista(a - 1) else _lista(tamanho + a)
    def posicao(elem: Caractere): Inteiro = _lista.indexOf(elem, 0) + 1
    def para_numero: Real = {
      if (_lista == null) 0 else
        (numRE.findPrefixOf(_lista).getOrElse(ZERO)).toDouble
    }
    def maiusculo: Texto = _lista.toUpperCase()
    def minusculo: Texto = _lista.toLowerCase()
    def divida(s: Texto = " "): Lista[Texto] = Lista(_lista.replaceAll("( |\\n)+", " ").split(s).toList)
    def divida_quando(f: (Caractere, Caractere) => Lógico): Lista[Texto] = Lista((_lista.foldRight(List.empty[Lista[Caractere]]) { (a, b) =>
      if (b.isEmpty || f(a, b.head.head)) Lista(List(a)) :: b else (a :: b.head) :: b.tail
    }).map(_.junte("")))
    def contem(a: Caractere): Lógico = _lista.contains(a)
    def cabeca: Caractere = _lista.head
    def ultimo: Caractere = _lista.last
    def cauda: Texto = _lista.tail
    def tamanho: Inteiro = _lista.length
    def inverta: Texto = _lista.reverse
    def filtre(a: Caractere => Lógico): Texto = _lista.filter(a)
    def selecione: (Caractere => Lógico) => Texto = filtre
    def maiúsculo: Texto = maiusculo
    def minúsculo: Texto = minusculo
    def injete[A >: Caractere](f: (A, Caractere) => A): A = _lista.reduceLeft(f)
    def injete[A](neutro: A)(f: (A, Caractere) => A): A = _lista.foldLeft(neutro)(f)
    def mapeie[B, That](f: Caractere => B)(implicit bf: CanBuildFrom[String, B, That]): That = _lista.map(f)
    def ache(p: Caractere => Lógico): Option[Caractere] = _lista.find(p)
    def pegue_enquanto(p: Caractere => Lógico): Texto = _lista.takeWhile(p)
    @deprecated def passe_enquanto(p: Caractere => Lógico): Texto = _lista.dropWhile(p)
    def descarte_enquanto: (Caractere => Lógico) => Texto = passe_enquanto
    def lista: Lista[Caractere] = Lista(_lista.toList)
    def junte(separador: Texto = ""): Texto = _lista.mkString(separador)
    def junte(inicio: Texto, separador: Texto, fim: Texto): Texto = _lista.mkString(inicio, separador, fim)
    def ordene: Texto = _lista.sorted
    def descarte(n: Inteiro): Texto = _lista.drop(n)
    def pegue(n: Inteiro): Texto = _lista.take(n)
    def remova(i: Inteiro): Texto = _lista.take(i - 1) + _lista.drop(i)
    def insira(i: Inteiro, valor: Caractere): Texto = _lista.take(i - 1) + valor + _lista.drop(i - 1)
    def insira(i: Inteiro, valor: Texto): Texto = _lista.take(i - 1) + valor + _lista.drop(i - 1)
    def contém: Caractere => Lógico = contem
    def cabeça: Caractere = cabeca
    def primeiro: Caractere = cabeca
    def último: Caractere = ultimo
    @deprecated def para_num: Real = para_numero
    @deprecated def para_n: Real = para_numero
    @deprecated def para_real: Real = para_numero
    def real: Real = para_numero
    def posição: Caractere => Inteiro = posicao
    def posiçao: Caractere => Inteiro = posicao
    def posicão: Caractere => Inteiro = posicao
    val qual_tipo = "Texto"
    def -(s: Texto): Texto = _lista.diff(s)
  }

  implicit class Reais(x: Double) {
    def arredonde: Inteiro = x.round.toInt
    def arredonde(n: Inteiro): Real = {
      val precisao = Math.pow(10, n)
      (x * precisao).round / precisao
    }
    def inteiro: Inteiro = x.toInt
    def real: Real = x
    def piso: Real = x.floor
    def teto: Real = x.ceil
    val qual_tipo = "Real"
  }

  implicit class Inteiros(x: Int) {
    def caractere: Caractere = x.toChar
    def inteiro: Inteiro = x
    def real: Real = x.toDouble
    val qual_tipo = "Inteiro"
  }

  implicit class Todos[T <: Any](x: T) {
    def formato(fmt: Texto): Texto = Try {
      fmt.formatLocal(java.util.Locale.US, x)
    } match {
      case Success(s) => s
      case Failure(_) => "Erro de formato"
    }

    def %(fmt: Texto): Texto = formato(fmt)
    @deprecated def para_texto: Texto = x.toString
    def texto: Texto = para_texto
    def qual_tipo: Texto = x match {
      case a: Inteiro  => "Inteiro"
      case a: Real     => "Real"
      case a: Lógico   => "Logico"
      case a: Texto    => "Texto"
      case a: Lista[T] => "Lista"
      case a: Vetor[T] => "Vetor"
      case a: Product  => "Tupla"
      case a           => a.getClass.getSimpleName.takeWhile(_ != '$')
    }
  }

  private[this] def corSim = print("\033[32m")
  private[this] def corNao = print("\033[37m")
  def leia(): Texto = {
    if ($cor) corSim
    val s = StdIn.readLine()
    if ($cor) corNao
    s
  }

  def leia(separador: Texto): Lista[Texto] = Lista(leia
    .split(separador.toCharArray())
    .toList) //  .filterNot(_ == "")

  def leia(n: Inteiro): Lista[Texto] = Lista({
    for { i <- 1 to n } yield { leia }
  }.toList)

  def leia_texto: Texto = leia
  def leia_textos(n: Inteiro): Lista[Texto] = leia(n)
  def leia_textos(separador: Texto): Lista[Texto] = leia(separador)

  def leia_int: Inteiro = leia.inteiro
  def leia_ints(n: Inteiro): Lista[Inteiro] = {
    var l = Lista.vazia(0)
    while (l.tamanho < n) {
      l = l + leia_ints(" ")
    }
    l.pegue(n)
    //    Lista(((1 to n) map { _ => leia_int }).toList)
  }
  def leia_ints(separador: Texto): Lista[Int] = {
    val l = leia(separador)._lista
    Lista(l.map(_.inteiro))
  }
  def leia_inteiro: Inteiro = leia_int
  def leia_inteiros(n: Inteiro): Lista[Inteiro] = leia_ints(n)
  def leia_inteiros(separador: Texto): Lista[Inteiro] = leia_ints(separador)

  def leia_num: Real = leia.para_num
  def leia_numero: Real = leia_num
  def leia_nums(n: Inteiro): Lista[Real] = {
    var l = Lista.vazia(0.0)
    while (l.tamanho < n) {
      l = l + leia_nums(" ")
    }
    l.pegue(n)
    //    Lista(((1 to n) map { _ => leia_num }).toList)
  }
  def leia_nums(separador: Texto): Lista[Real] = Lista(leia(separador)._lista.map { _.para_num })
  def leia_numeros(n: Inteiro): Lista[Real] = leia_nums(n)
  def leia_numeros(separador: Texto): Lista[Real] = leia_nums(separador)
  def leia_real: Real = leia_num
  def leia_reais(n: Inteiro): Lista[Real] = leia_nums(n)
  def leia_reais(separador: Texto): Lista[Real] = leia_nums(separador)

  def escreva(texto: Any): Unit = {
    if ($cor) corNao
    texto match {
      case true  => Console.println("verdadeiro")
      case false => Console.println("falso")
      case _     => Console.println(texto.toString)
    }
  }
  def imprima(texto: Any): Unit = {
    if ($cor) corNao
    texto match {
      case true  => Console.print("verdadeiro")
      case false => Console.print("falso")
      case _     => Console.print(texto.toString)
    }
  }

  implicit class Tupla2[T1, T2](t: (T1, T2)) {
    def primeiro = t._1
    def segundo = t._2
    def qual_tipo = s"(${t._1.qual_tipo}, ${t._2.qual_tipo})"
  }

  implicit class Tupla3[T1, T2, T3](t: (T1, T2, T3)) {
    def primeiro = t._1
    def segundo = t._2
    def terceiro = t._3
    def tipo = s"(${t._1.qual_tipo}, ${t._2.qual_tipo}, ${t._3.qual_tipo})"
  }

  implicit class Tupla4[T1, T2, T3, T4](t: (T1, T2, T3, T4)) {
    def primeiro = t._1
    def segundo = t._2
    def terceiro = t._3
    def quarto = t._4
    def tipo = s"(${t._1.qual_tipo}, ${t._2.qual_tipo}, ${t._3.qual_tipo}, ${t._4.qual_tipo})"

  }

  implicit class Tupla5[T1, T2, T3, T4, T5](t: (T1, T2, T3, T4, T5)) {
    def primeiro = t._1
    def segundo = t._2
    def terceiro = t._3
    def quarto = t._4
    def quinto = t._5
    def tipo = s"(${t._1.qual_tipo}, ${t._2.qual_tipo}, ${t._3.qual_tipo}, ${t._4.qual_tipo}, ${t._5.qual_tipo})"

  }

  implicit class Tupla6[T1, T2, T3, T4, T5, T6](t: (T1, T2, T3, T4, T5, T6)) {
    def primeiro = t._1
    def segundo = t._2
    def terceiro = t._3
    def quarto = t._4
    def quinto = t._5
    def sexto = t._6
    def tipo = s"(${t._1.qual_tipo}, ${t._2.qual_tipo}, ${t._3.qual_tipo}, ${t._4.qual_tipo}, ${t._5.qual_tipo}, ${t._6.qual_tipo})"

  }

  implicit class Tupla7[T1, T2, T3, T4, T5, T6, T7](
      t: (T1, T2, T3, T4, T5, T6, T7)) {
    def primeiro = t._1
    def segundo = t._2
    def terceiro = t._3
    def quarto = t._4
    def quinto = t._5
    def sexto = t._6
    def setimo = t._7
    def sétimo = t._7
    def tipo = s"(${t._1.qual_tipo}, ${t._2.qual_tipo}, ${t._3.qual_tipo}, ${t._4.qual_tipo}, ${t._5.qual_tipo}, ${t._6.qual_tipo}, ${t._7.qual_tipo})"
  }

  implicit class Tupla8[T1, T2, T3, T4, T5, T6, T7, T8](
      t: (T1, T2, T3, T4, T5, T6, T7, T8)) {
    def primeiro = t._1
    def segundo = t._2
    def terceiro = t._3
    def quarto = t._4
    def quinto = t._5
    def sexto = t._6
    def setimo = t._7
    def sétimo = t._7
    def oitavo = t._8
    def tipo = s"(${t._1.qual_tipo}, ${t._2.qual_tipo}, ${t._3.qual_tipo}, ${t._4.qual_tipo}, ${t._5.qual_tipo}, ${t._6.qual_tipo}, ${t._7.qual_tipo}, ${t._8.qual_tipo})"
  }

  implicit class Tupla9[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      t: (T1, T2, T3, T4, T5, T6, T7, T8, T9)) {
    def primeiro = t._1
    def segundo = t._2
    def terceiro = t._3
    def quarto = t._4
    def quinto = t._5
    def sexto = t._6
    def setimo = t._7
    def sétimo = t._7
    def oitavo = t._8
    def nono = t._9
    def tipo = s"(${t._1.qual_tipo}, ${t._2.qual_tipo}, ${t._3.qual_tipo}, ${t._4.qual_tipo}, ${t._5.qual_tipo}, ${t._6.qual_tipo}, ${t._7.qual_tipo}, ${t._8.qual_tipo}, ${t._9.qual_tipo})"
  }

  implicit class Tupla10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10)) {
    def primeiro = t._1
    def segundo = t._2
    def terceiro = t._3
    def quarto = t._4
    def quinto = t._5
    def sexto = t._6
    def setimo = t._7
    def sétimo = t._7
    def oitavo = t._8
    def nono = t._9
    def decimo = t._10
    def décimo = t._10
    def tipo = s"(${t._1.qual_tipo}, ${t._2.qual_tipo}, ${t._3.qual_tipo}, ${t._4.qual_tipo}, ${t._5.qual_tipo}, ${t._6.qual_tipo}, ${t._7.qual_tipo}, ${t._8.qual_tipo}, ${t._9.qual_tipo}, ${t._10.qual_tipo})"
  }

  case class URL(caminho: Texto) {
    lazy val erro = conteudo == ""
    lazy val conteudo = Try {
      io.Source.fromURL(caminho).mkString("")
    } getOrElse ("")
  }

  import scala.io.Source

  object Arquivo {
    def leia(caminho: Texto): Lista[Texto] = {
      Lista(Source.fromFile(caminho).getLines().toList)
    }
  }
}
