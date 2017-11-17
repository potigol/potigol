/*
 *  Potigol
 *  Copyright (C) 2015-2016 by Leonardo Lucena
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

object Erros {

  private[this] object C {
    val Char = "Char"
    val String = "String"
    val Int = "Int"
    val Boolean = "Boolean"
    val Double = "Double"
    val Inteiro = "Inteiro"
    val Real = "Real"
    val Texto = "Texto"
    val Logico = "Lógico"
    val Caractere = "Caractere"
  }

  private[this] object Erro {
    val naoDeclarado = "not found: value (\\S+).*".r
    val parametroAusente = "not enough arguments for method (\\S+)\\:.+Unspecified value parameter (\\S).*".r
    val parametroMais = "too many arguments for method (\\S+)\\:(.+)\\Z.*".r
    val tipoIndefinido = "not found: type (\\S+).*".r
    val tipoDiferente = "type mismatch.+required: (?:\\S*\\.)?([^| .]+) .*".r
    val parametroTipo = "(?:type|class) (\\S+) takes type parameters .*".r
    val variavelJaExiste = "(\\S+) is already defined as variable .+".r
    val alterarValorConstante = "reassignment to val \\| (\\S+).*".r
    val valorJaDeclarado = "(\\S+) is already defined as value.*".r
    val funcaoJaDefinida = "method (\\S+) is defined twice .*".r
    val funcaoRecursivaSemTipo = "recursive method (\\S+) needs result type.*".r
    val matrizNaoDeclarada = "value (?:get|update) is not (\\S+) member of.*".r
    val metodoNaoExiste = "value (\\S+) is not a member of (?:\\S*\\.)?(\\S+) .*".r
    val semParametros = "(.+) does not take parameters.*".r
    val divisaoTipoErrado = "overloaded method value.*".r
  }

  private[this] object Msg {
    def valorNaoDeclarado(a: String): String = s"Valor '${a}' não declarado."
    def tipoNaoPossuiMetodo(tipo: String, a: String): String =
      s"Valores do tipo '${tipo}' não possuem o método '${a}'."
    def tipoErrado(a: String): String =
      s"Tipo errado.\nEu estava esperando um valor do tipo '${a}'."
    def faltaParametro(a: String, b: String): String =
      s"A função '${a}' precisa de mais parâmetros.\nVocê esqueceu de fornecer o parâmetro '${b}'."
    def parametrosMais(n: Int): String =
      s"Você forneceu mais parâmetros do que o necessário.\nColoque apenas ${n} parâmetro(s)."
    def semParametros(a: String): String = s"um valor ${a} não deve ter parametros."
  }

  private[this] def contar(b: String): Int = b.count(_ == ':')

  private[this] def mensagens(s: String): String = {

    val erro = s.replace("\n", " | ")
    erro match {
      case Erro.naoDeclarado(a) => Msg.valorNaoDeclarado(a)
      case Erro.parametroAusente(a, b) => Msg.faltaParametro(a, b)
      case Erro.parametroMais("apply", b) => Msg.parametrosMais(contar(b))
      case Erro.parametroMais(a, b) if contar(b) == 0 => s"A função '${a}' não precisa de parâmetro."
      case Erro.parametroMais(a, b) if contar(b) == 1 => s"A função '${a}' precisa de apenas 1 parâmetro."
      case Erro.parametroMais(a, b) => s"A função '${a}' precisa de apenas ${contar(b)} parâmetros."
      case Erro.tipoIndefinido(a) => s"O tipo '${a}' não existe.\nNão seria 'Inteiro', 'Real' ou 'Texto'?"
      case Erro.tipoDiferente(C.Int) => Msg.tipoErrado(C.Inteiro)
      case Erro.tipoDiferente(C.Double) => Msg.tipoErrado(C.Real)
      case Erro.tipoDiferente(C.String) => Msg.tipoErrado(C.Texto)
      case Erro.tipoDiferente(C.Boolean) => Msg.tipoErrado(C.Logico)
      case Erro.tipoDiferente(a) => Msg.tipoErrado(a)
      case Erro.parametroTipo(a) => s"'${a}' precisa do tipo.\nPoderia ser '${a}[Inteiro]' ou '${a}[Texto]'?"
      case Erro.variavelJaExiste(a) => s"A variável '${a}' já existe.\nSe quiser modificar o valor de '${a}' use ':=' ao invés de '='."
      case Erro.alterarValorConstante(a) => s"'${a}' é um valor constante, não pode ser alterado."
      case Erro.valorJaDeclarado(a) => s"O valor '${a}' já foi declarado antes.\nUse outro nome."
      case Erro.funcaoJaDefinida(a) => s"Já existe uma função chamada '${a}'.\nUse outro nome."
      case Erro.funcaoRecursivaSemTipo(a) => s"A função recursiva '${a}' precisa definir o tipo do valor de retorno."
      case Erro.metodoNaoExiste(a, C.Int) => Msg.tipoNaoPossuiMetodo(C.Inteiro, a)
      case Erro.metodoNaoExiste(a, C.Double) => Msg.tipoNaoPossuiMetodo(C.Real, a)
      case Erro.metodoNaoExiste(a, C.String) => Msg.tipoNaoPossuiMetodo(C.Texto, a)
      case Erro.metodoNaoExiste(a, C.Boolean) => Msg.tipoNaoPossuiMetodo(C.Logico, a)
      case Erro.metodoNaoExiste("get", C.Char) => Msg.tipoNaoPossuiMetodo(C.Caractere, "[ ]")
      case Erro.metodoNaoExiste(a, C.Char) => Msg.tipoNaoPossuiMetodo(C.Caractere, a)
      case Erro.metodoNaoExiste(a, b) => Msg.tipoNaoPossuiMetodo(b, a)
      case Erro.matrizNaoDeclarada(a) => s"A variável '${a}' não é uma Lista mutável."
      case Erro.semParametros(C.Int) => Msg.semParametros(C.Inteiro)
      case Erro.semParametros(C.Double) => Msg.semParametros(C.Real)
      case Erro.semParametros(C.String) => Msg.semParametros(C.Texto)
      case Erro.semParametros(C.Boolean) => Msg.semParametros(C.Logico)
      case Erro.semParametros(a) => Msg.semParametros(a)
      case Erro.divisaoTipoErrado() => Msg.tipoErrado(C.Real)
      case _ => erro
    }
  }
  def traduzir(texto: String): String = {
    val inicio = texto.indexOf("error:", 0)
    val s = texto.drop(inicio).split('^')(0).split(": ", 3).drop(1)(1)
    mensagens(s)
  }

  def texto(erro: String): String = {
    traduzir(erro)
  }
}
