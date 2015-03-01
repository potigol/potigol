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
  type Matriz[T] = List[List[T]]
  type Cubo[T] = List[List[List[T]]]

  // valores
  val verdadeiro = true
  val falso = false

  // Expressões Regulares
  private val intRE = """-?(\d*)""".r
  private val numRE = """-?(\d*)(\.\d*)?""".r

  trait Colecao[T] {
    val lista: Seq[T]
    def apply(a: Int) = lista(a)
    def length = lista.length
    override def toString = lista.mkString("[", ",", "]")
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
    def para_lista: Lista[T] = Lista(lista.toList)
    def mutavel: Vetor[T] = Vetor(lista.to)
    def mutável: Vetor[T] = Vetor(lista.to)
  }

  case class Lista[T](val lista: List[T]) extends IndexedSeq[T] with Colecao[T] {
    def cauda: Lista[T] = Lista(lista.tail)
    def ordene(implicit ord: Ordering[T]): Lista[T] = Lista(lista.sorted)
    def inverta: Lista[T] = Lista(lista.reverse)
    def filtre(p: T => Logico): Lista[T] = Lista(lista.filter(p))
    def mapeie[B](f: T => B): Lista[B] = Lista(lista.map(f))
    def pegue_enquanto(p: T => Boolean): Lista[T] = Lista(lista.takeWhile(p))
    def passe_enquanto(p: T => Boolean): Lista[T] = Lista(lista.dropWhile(p))
    def passe(a: Inteiro): Lista[T] = Lista(lista.drop(a))
    def pegue(a: Inteiro): Lista[T] = Lista(lista.take(a))
    def junte(outra: Lista[T]) = Lista(lista ::: outra.lista)
    def ::[A >: T](a: A) = Lista(a :: lista)
  }

  object Lista {
    def apply[A](xs: A*): Lista[A] = Lista(xs.toList)
  }

  case class Vetor[T](lista: MSeq[T]) extends collection.mutable.IndexedSeq[T] with Colecao[T] {
    override def update(ind: Int, elem: T) { lista.update(ind, elem) }
    def cauda: Vetor[T] = Vetor(lista.tail)
    def inverta: Vetor[T] = Vetor(lista.reverse)
    def ordene(implicit ord: Ordering[T]): Vetor[T] = Vetor(lista.sorted)
    def filtre(p: T => Logico): Vetor[T] = Vetor(lista.filter(p))
    def mapeie[B: Manifest](f: T => B) = Vetor(lista.map(f))
    def pegue_enquanto(p: T => Boolean): Vetor[T] = Vetor(lista.takeWhile(p))
    def passe_enquanto(p: T => Boolean): Vetor[T] = Vetor(lista.dropWhile(p))
  }

  implicit class Textos(val lista: String) {
    def para_int: Int = ("0" + intRE.findPrefixOf(lista).getOrElse("0")).toInt
    def para_i = para_int
    def para_inteiro = para_int
    def get(a: Int) = if (a > 0) lista(a - 1) else lista(tamanho + a)
    def posicao(elem: Caractere): Int = lista.indexOf(elem) + 1
    def para_numero: Double = ("0" + numRE.findPrefixOf(lista).getOrElse("0.0")).toDouble
    def maiusculo: Texto = lista.toUpperCase()
    def minusculo: Texto = lista.toLowerCase()
    def divida(s: Texto = " "): Lista[Texto] = Lista(lista.replaceAll("( |\\n)+", " ").split(s).toList)
    def contem(a: Char) = lista.contains(a)
    def cabeca = lista.head
    def ultimo = lista.last
    def cauda = lista.tail
    def tamanho = lista.length
    def inverta = lista.reverse
    def filtre(p: Char => Boolean) = lista.filter(p)
    def injete[A >: Char](f: (A, Char) => A): A = lista.reduceLeft(f)
    def injete[A](neutro: A)(f: (A, Char) => A) = lista.foldLeft(neutro)(f)
    def mapeie[B, That](f: Char => B)(implicit bf: CanBuildFrom[String, B, That]): That = lista.map(f)
    def ache(p: Char => Boolean): Option[Char] = lista.find(p)
    def pegue_enquanto(p: Char => Logico) = lista.takeWhile(p)
    def passe_enquanto(p: Char => Logico) = lista.dropWhile(p)
    def para_lista: List[Char] = lista.toList
    def contém = contem _
    def cabeça = cabeca
    def primeiro = cabeca
    def último = ultimo
    def para_num = para_numero
    def para_n = para_numero
    def para_real = para_numero
  }

  implicit class Reais(x: Double) {
    def arredonde: Inteiro = x.round.toInt
    def arredonde(n: Inteiro): Numero = ((x * Math.pow(10, n)).round / Math.pow(10, n))
  }

  implicit class Todos[T <: Any](x: T) {
    def formato(formato: Texto): Texto =
      try x.formatted(formato)
      catch {
        case e: IllegalFormatConversionException => "Erro de formato"
      }
    def %(formato_ : Texto) = formato(formato_)
    def para_texto: Texto = x.toString
  }

  def leia: Texto = StdIn.readLine()

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

  def escreva(texto: Any) = println(texto.toString)
  def imprima(texto: Any) = print(texto.toString)
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
