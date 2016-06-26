package br.edu.ifrn.potigol

import Potigolutil.{ Colecao, Inteiro, Real }

object Matematica {
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
  def aleatorio: Real = aleatório
  def aleatório(ultimo: Inteiro): Inteiro = aleatório(1, ultimo)
  def aleatorio(primeiro: Inteiro): Inteiro = aleatório(primeiro)
  def aleatório(primeiro: Inteiro, ultimo: Inteiro): Inteiro = {
    val faixa = ultimo - primeiro + 1
    (Math.random() * faixa).toInt + primeiro
  }
  def aleatorio(primeiro: Inteiro, ultimo: Inteiro): Inteiro = aleatório(primeiro, ultimo)
  def aleatório[T](lista: Colecao[T]): T = lista.get(aleatorio(lista.tamanho))
  def aleatorio[T](lista: Colecao[T]): T = aleatório(lista)
}
