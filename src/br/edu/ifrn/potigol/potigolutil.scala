/*
 *  Potigol
 *  Copyright (C) 2015  Leonardo Lucena
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
 * @author Leonardo Lucena (leonardo.lucena@escolar.ifrn.edu.br)
 */

package br.edu.ifrn.potigol

import collection.generic.CanBuildFrom
import collection.mutable.MutableList
import java.util.IllegalFormatConversionException
import collection.mutable.{ Seq => MSeq }
import io.StdIn

object potigolutil {
  // Tipos
  type Texto = String
  type Inteiro = Int
  type Numero = Double
  type Logico = Boolean
  type Real = Double
  type Caractere = Char
  type Matriz[T] = Lista[Lista[T]]
  type Cubo[T] = Lista[Lista[Lista[T]]]

  var $cor = false

  // valores
  val verdadeiro = true
  val falso = false

  // Expressões Regulares
  private val intRE = """-?\d+""".r
  private val numRE = """-?(\d*)(\.\d*)?""".r

  trait Colecao[T] {
    val lista: Seq[T]
    def apply(a: Int) = lista(a)
    def length = lista.length
    override def toString = lista.mkString("[", ", ", "]")
    def junte(separador: String = "") = lista.mkString(separador)
    def junte(inicio: String, separador: String, fim: String) = lista.mkString(inicio, separador, fim)
    def tamanho: Inteiro = lista.length
    def get(a: Int) = if (a > 0) apply(a - 1) else apply(tamanho + a)
    def posicao(elem: T): Inteiro = lista.indexOf(elem) + 1
    def cabeca = lista.head
    def contem(a: T): Logico = lista.contains(a)
    def ultimo: T = lista.last
    def injete[A >: T](f: (A, T) => A): A = lista.reduceLeft(f)
    def injete[A](neutro: A)(f: (A, T) => A) = lista.foldLeft(neutro)(f)
    def ache(p: T => Logico): Option[T] = lista.find(p)
    def contém = contem _
    def cabeça = cabeca
    def primeiro = cabeca
    def último = ultimo
    def posição = posicao _
    def posiçao = posicao _
    def posicão = posicao _
    def para_lista: Lista[T] = Lista(lista.toList)
    def mutavel: Vetor[T] = Vetor(lista.to)
    def mutável = mutavel
  }

  case class Lista[T](val lista: List[T]) extends IndexedSeq[T] with Colecao[T] {
    def cauda: Lista[T] = Lista(lista.tail)
    def ordene(implicit ord: Ordering[T]): Lista[T] = Lista(lista.sorted)
    def inverta: Lista[T] = Lista(lista.reverse)
    @deprecated("Use 'selecione'", "0.9.4") def filtre(p: T => Logico): Lista[T] = Lista(lista.filter(p))
    def selecione = filtre _
    def mapeie[B](f: T => B): Lista[B] = Lista(lista.map(f))
    def pegue_enquanto(p: T => Boolean): Lista[T] = Lista(lista.takeWhile(p))
    @deprecated("Use 'descarte_enquanto'", "0.9.4") def passe_enquanto(p: T => Boolean): Lista[T] = Lista(lista.dropWhile(p))
    def descarte_enquanto = passe_enquanto _
    @deprecated("Use 'descarte'", "0.9.4") def passe(a: Inteiro): Lista[T] = Lista(lista.drop(a))
    def descarte = passe _
    def pegue(a: Inteiro): Lista[T] = Lista(lista.take(a))
    def +(outra: Lista[T]) = Lista(lista ::: outra.lista)
    def ::[A >: T](a: A): Lista[A] = Lista(a :: lista)
    def remova(i: Inteiro) = Lista(lista.take(i - 1) ::: lista.drop(i))
    def insira(i: Inteiro, valor: T) = Lista(lista.take(i - 1) ::: valor :: lista.drop(i - 1))
    def divida_quando(f: (T, T) => Logico) = Lista(lista.foldRight(List.empty[Lista[T]]) { (a, b) =>
      if (b.isEmpty || f(a, b.head.head)) Lista(a) :: b else (a :: b.head) :: b.tail
    })
  }

  object Lista {
    def apply[A](xs: A*): Lista[A] = Lista(xs.toList)
    def mutavel[A](x: Inteiro, valor: => A): Vetor[A] = Lista(List.fill(x)(valor)).mutavel
    def imutavel[A](x: Inteiro, valor: => A): Lista[A] = Lista(List.fill(x)(valor))
    def vazia[A](x: A) = Lista(List.empty[A])
    def imutável[A] = imutavel[A] _
    def mutável[A] = mutavel[A] _
  }

  object Matriz {
    def mutavel[A](x: Inteiro, y: Inteiro, valor: => A): Vetor[Vetor[A]] = {
      Lista(List.fill(x)(Lista(List.fill(y)(valor)).mutavel)).mutavel
    }
    def imutavel[A](x: Inteiro, y: Inteiro, valor: => A): Matriz[A] = {
      Lista(List.fill(x)(Lista(List.fill(y)(valor))))
    }
    def imutável[A] = imutavel[A] _
    def mutável[A] = mutavel[A] _
  }

  object Cubo {
    def mutavel[A](x: Inteiro, y: Inteiro, z: Inteiro, valor: => A): Vetor[Vetor[Vetor[A]]] = {
      Lista(List.fill(x)(Lista(List.fill(y)(Lista(List.fill(z)(valor)).mutavel)).mutavel)).mutavel
    }
    def imutavel[A](x: Inteiro, y: Inteiro)(valor: => A): Cubo[A] = {
      Lista(List.fill(x)(Lista(List.fill(y)(Lista(List.fill(y)(valor))))))
    }
    def imutável[A] = imutavel[A] _
    def mutável[A] = mutavel[A] _
  }

  case class Vetor[T](lista: MSeq[T]) extends collection.mutable.IndexedSeq[T] with Colecao[T] {
    override def update(ind: Int, elem: T) { lista.update(ind, elem) }
    def cauda: Vetor[T] = Vetor(lista.tail)
    def inverta: Vetor[T] = Vetor(lista.reverse)
    def ordene(implicit ord: Ordering[T]): Vetor[T] = Vetor(lista.sorted)
    @deprecated def filtre(p: T => Logico): Vetor[T] = Vetor(lista.filter(p))
    def selecione = filtre _
    def mapeie[B: Manifest](f: T => B) = Vetor(lista.map(f))
    def pegue_enquanto(p: T => Boolean): Vetor[T] = Vetor(lista.takeWhile(p))
    @deprecated def passe_enquanto(p: T => Boolean): Vetor[T] = Vetor(lista.dropWhile(p))
    def descarte_enquanto = passe_enquanto _
    def remova(i: Inteiro) = Vetor(lista.take(i - 1) ++ lista.drop(i))
    def insira(i: Inteiro, valor: T) = Vetor(lista.take(i - 1) ++ List(valor) ++ lista.drop(i - 1))
  }

  implicit class Textos(val lista: String) {
    @deprecated def para_int: Int = (intRE.findPrefixOf(lista).getOrElse("0")).toInt
    @deprecated def para_i = para_int
    @deprecated def para_inteiro = para_int
    def inteiro = para_int
    def get(a: Int) = if (a > 0) lista(a - 1) else lista(tamanho + a)
    def posicao(elem: Caractere): Int = lista.indexOf(elem) + 1
    def para_numero: Double = ("0" + numRE.findPrefixOf(lista).getOrElse("0.0")).toDouble
    def maiusculo: Texto = lista.toUpperCase()
    def minusculo: Texto = lista.toLowerCase()
    def divida(s: Texto = " "): Lista[Texto] = Lista(lista.replaceAll("( |\\n)+", " ").split(s).toList)
    def divida_quando(f: (Caractere, Caractere) => Logico): Lista[Texto] = Lista((lista.foldRight(List.empty[Lista[Caractere]]) { (a, b) =>
      if (b.isEmpty || f(a, b.head.head)) Lista(a) :: b else (a :: b.head) :: b.tail
    }).map(_.junte("")))
    def contem(a: Char) = lista.contains(a)
    def cabeca = lista.head
    def ultimo = lista.last
    def cauda = lista.tail
    def tamanho = lista.length
    def inverta = lista.reverse
    def filtre(p: Char => Boolean) = lista.filter(p)
    def selecione = filtre _
    def maiúsculo = maiusculo
    def minúsculo = minusculo
    def injete[A >: Char](f: (A, Char) => A): A = lista.reduceLeft(f)
    def injete[A](neutro: A)(f: (A, Char) => A) = lista.foldLeft(neutro)(f)
    def mapeie[B, That](f: Char => B)(implicit bf: CanBuildFrom[String, B, That]): That = lista.map(f)
    def ache(p: Char => Boolean): Option[Char] = lista.find(p)
    def pegue_enquanto(p: Char => Logico) = lista.takeWhile(p)
    @deprecated def passe_enquanto(p: Char => Logico) = lista.dropWhile(p)
    def descarte_enquanto = passe_enquanto _
    def para_lista: List[Char] = lista.toList
    def contém = contem _
    def cabeça = cabeca
    def primeiro = cabeca
    def último = ultimo
    @deprecated def para_num = para_numero
    @deprecated def para_n = para_numero
    @deprecated def para_real = para_numero
    def real = para_numero
    def posição = posicao _
    def posiçao = posicao _
    def posicão = posicao _
  }

  implicit class Reais(x: Double) {
    def arredonde: Inteiro = x.round.toInt
    def arredonde(n: Inteiro): Numero = ((x * Math.pow(10, n)).round / Math.pow(10, n))
  }
  
  implicit class Inteiros(x: Int){
    def caractere: Caractere = x.toChar
  }

  implicit class Todos[T <: Any](x: T) {
    def formato(formato: Texto): Texto =
      try x.formatted(formato)
      catch {
        case e: IllegalFormatConversionException => "Erro de formato"
      }
    def %(formato_ : Texto) = formato(formato_)
    @deprecated def para_texto: Texto = x.toString
    def texto = para_texto
  }

  def leia(): Texto = {
    if ($cor) print("\033[32m")
    val s = StdIn.readLine()
    if ($cor) print("\033[37m")
    s
  }

  def leia(separador: Texto): Lista[Texto] = Lista(leia
    .split(separador.toCharArray())
    .toList) //  .filterNot(_ == "")

  def leia(n: Int): Lista[Texto] = Lista({
    for (i <- 1 to n) yield { leia }
  }.toList)

  def leia_texto = leia
  def leia_textos(n: Int) = leia(n)
  def leia_textos(separador: Texto) = leia(separador)

  def leia_int: Int = leia.para_int
  def leia_ints(n: Int): Lista[Int] = Lista(((1 to n) map { _ => leia_int }).toList)
  def leia_ints(separador: String): Lista[Int] = {
    val l = leia(separador).lista
    Lista(l.map(_.para_int))
  }
  def leia_inteiro = leia_int
  def leia_inteiros(n: Int) = leia_ints(n)
  def leia_inteiros(separador: Texto) = leia_ints(separador)

  def leia_num: Double = leia.para_num
  def leia_numero = leia_num
  def leia_nums(n: Int): Lista[Real] = Lista(((1 to n) map { _ => leia_num }).toList)
  def leia_nums(separador: Texto): Lista[Real] = Lista(leia(separador).lista.map { _.para_num })
  def leia_numeros(n: Int): Lista[Real] = leia_nums(n)
  def leia_numeros(separador: Texto): Lista[Real] = leia_nums(separador)
  def leia_real = leia_num
  def leia_reais(n: Int): Lista[Real] = leia_nums(n)
  def leia_reais(separador: Texto): Lista[Real] = leia_nums(separador)

  def escreva(texto: Any) = {
    if ($cor) print("\033[37m")
    println(texto.toString)
  }
  def imprima(texto: Any) = {
    if ($cor) print("\033[37m")
    print(texto.toString)
  }

  //  case class Tupla1[T1](primeiro: T1)
  case class Tupla2[T1, T2](primeiro: T1, segundo: T2)
  case class Tupla3[T1, T2, T3](primeiro: T1, segundo: T2, terceiro: T3)
  case class Tupla4[T1, T2, T3, T4](primeiro: T1, segundo: T2, terceiro: T3, quarto: T4)
  case class Tupla5[T1, T2, T3, T4, T5](primeiro: T1, segundo: T2, terceiro: T3, quarto: T4, quinto: T5)
  case class Tupla6[T1, T2, T3, T4, T5, T6](primeiro: T1, segundo: T2, terceiro: T3, quarto: T4, quinto: T5, sexto: T6)
  case class Tupla7[T1, T2, T3, T4, T5, T6, T7](primeiro: T1, segundo: T2, terceiro: T3, quarto: T4, quinto: T5, sexto: T6, sétimo: T7) { def setimo = sétimo }
  case class Tupla8[T1, T2, T3, T4, T5, T6, T7, T8](primeiro: T1, segundo: T2, terceiro: T3, quarto: T4, quinto: T5, sexto: T6, sétimo: T7, oitavo: T8) { def setimo = sétimo }
  case class Tupla9[T1, T2, T3, T4, T5, T6, T7, T8, T9](primeiro: T1, segundo: T2, terceiro: T3, quarto: T4, quinto: T5, sexto: T6, sétimo: T7, oitavo: T8, nono: T9) { def setimo = sétimo }
  case class Tupla10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](primeiro: T1, segundo: T2, terceiro: T3, quarto: T4, quinto: T5, sexto: T6, sétimo: T7, oitavo: T8, nono: T9, décimo: T10) { def setimo = sétimo; def decimo = décimo }

}

object Matematica {
  import potigolutil.{ Inteiro, Real, Colecao }
  def sen(a: Real): Real = Math.sin(a)
  def cos(a: Real): Real = Math.cos(a)
  def tg(a: Real): Real = Math.tan(a)
  def arcsen(a: Real): Real = Math.asin(a)
  def arccos(a: Real): Real = Math.acos(a)
  def arctg(a: Real): Real = Math.atan(a)
  def abs(a: Real): Real = Math.abs(a)
  def abs(a: Inteiro): Inteiro = Math.abs(a)
  def raiz(a: Real, b: Real = 2.0): Real = Math.pow(a, 1.0 / b)
  val PI: Real = Math.PI
  def log(a: Real): Real = Math.log(a)
  def log10(a: Real): Real = Math.log10(a)
  def aleatório(): Real = Math.random()
  def aleatorio = aleatório
  def aleatório(ultimo: Inteiro): Inteiro = aleatório(1, ultimo)
  def aleatorio(primeiro: Inteiro) = aleatório(primeiro)
  def aleatório(primeiro: Inteiro, ultimo: Inteiro) = {
    val faixa = ultimo - primeiro + 1
    (Math.random() * faixa).toInt + primeiro
  }
  def aleatorio(primeiro: Inteiro, ultimo: Inteiro): Inteiro = aleatório(primeiro, ultimo)
  def aleatório[T](lista: Colecao[T]): T = lista.get(aleatorio(lista.tamanho))
  def aleatorio[T](lista: Colecao[T]): T = aleatório(lista)
}
