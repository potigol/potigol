package br.edu.ifrn.potigol

import org.antlr.v4.runtime.{ ANTLRInputStream, CommonTokenStream }
import org.antlr.v4.runtime.tree.ParseTreeWalker

import br.edu.ifrn.potigol.parser.{ potigolLexer, potigolParser }

object Erros extends App {
  case class Erro(erro: String, codigo: String)
  val erros = List(
    Erro("Valor não declarado",
      "escreva x"),
    Erro("Função não declarada",
      "escreva soma(2,3)"),
    Erro("Parâmetro ausente",
      """soma(a, b: Inteiro) = a + b
         soma(2)
      """),
    Erro("Parâmetro a mais 2",
      """soma(a, b: Inteiro) = a + b
         soma(1,2,3)
      """),
    Erro("Parâmetro a mais 1",
      """soma(a: Inteiro) = a + 2
         soma(1,2,3)
      """),
    Erro("Parâmetro a mais 0",
      """soma() = 1 + 2
         soma(1,2,3)
      """),
    Erro("Tipo não definido",
      """soma(a, b: Intei) = a + b
         soma("2","3")
      """),
    Erro("Tipo encontrado diferente do esperado",
      """soma(a, b: Inteiro) = a + b
         soma("2","3")
      """),
    Erro("Tipo encontrado diferente do esperado",
      """soma(a: Int) = a 
         soma("1")
      """),

    Erro("Tipo encontrado diferente do esperado",
      """tipo Pessoa nome: Texto fim
         soma(a: Pessoa) = a
         soma("1")
      """),
    Erro("Lista sem tipo",
      """soma(lista: Lista) = lista.injete(0)(_+_)
      """),
    Erro("Lista sem tipo",
      """soma(lista: Matriz) = lista
      """),
    Erro("Atribuindo um valor de tipo diferente do esperado",
      """var a = 10
         a := "ok"
      """),
    Erro("Declarando um valor com mesmo nome de variável existente",
      """var a = 10
         a = "ok"
      """),
    Erro("Alterando valor constante",
      """a = 10
         a := "ok"
      """),
    Erro("Declarando novamente um valor",
      """a = 10
         a = "ok"
      """),
    Erro("Declarando novamente um valor",
      """soma() = 10
         soma = 20
      """),
    Erro("Declarando novamente um valor",
      """soma() = 10
         soma := 20
      """),
    Erro("Declarando novamente um valor",
      """soma() = 10
         soma() = 20
      """),
    Erro("Função Recursiva sem tipo",
      """soma(a: Inteiro) = se a>1 então 1 + soma(a-1) senão 0 fim
         soma(3)
      """),
    Erro("",
      """var a = 3
         a[0] := 2
      """),
    Erro("",
      """a = 3
         escreva a[0]
      """),
    Erro("",
      """var a = [1,2,3,4,5]
         a[0] := 2
      """),
    Erro("",
      """a = 4
        a.inverta
      """),
    Erro("",
      """tipo P nome: String fim
        P("ok").inverta
      """),
    Erro("",
      """a=""
        a.maior
      """),
    Erro("",
      """a=1.2
        a.maior
      """),
    Erro("",
      """a=verdadeiro
        a.maior
      """),

    Erro("",
      """a = [1,2,3]
        a.maior
      """),

    Erro("",
      """tipo P nome: String fim
        P("ok",4)
      """),
    Erro("",
      """tipo P nome: String fim
        P(4)
      """),

    Erro("Dois erros",
      """a,b = x,y
      """),

    Erro("Método inexistente",
      """ 'a'.get(0)
        """))

  private[this] object erro {
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
  }

  private[this] object msg {
    def valorNaoDeclarado(a: String) = s"Valor '${a}' não declarado."
    def tipoNaoPossuiMetodo(tipo: String, a: String) = s"Valores do tipo '${tipo}' não possuem o método '${a}'."
    def tipoErrado(a: String) = s"Tipo errado.\nEu estava esperando um valor do tipo '${a}'."
  }
  private def mensagens(s: String) = s.replace("\n", " | ") match {
    case erro.naoDeclarado(a) => msg.valorNaoDeclarado(a)
    case erro.parametroAusente(a, b) => s"A função '${a}' precisa de mais parâmetros.\nVocê esqueceu de fornecer o parâmetro '${b}'."
    case erro.parametroMais("apply", b) => s"Você forneceu mais parâmetros do que o necessário.\nColoque apenas ${b.count(':' == _)} parâmetro(s)."
    case erro.parametroMais(a, b) if b.count(':' == _) == 0 => s"A função '${a}' não precisa de parâmetro."
    case erro.parametroMais(a, b) if b.count(':' == _) == 1 => s"A função '${a}' precisa de apenas 1 parâmetro."
    case erro.parametroMais(a, b) => s"A função '${a}' precisa de apenas ${b.count(':' == _)} parâmetros."
    case erro.tipoIndefinido(a) => s"O tipo '${a}' não existe.\nNão seria 'Inteiro', 'Real' ou 'Texto'?"
    case erro.tipoDiferente("Int") => msg.tipoErrado("Inteiro")
    case erro.tipoDiferente("Double") => msg.tipoErrado("Real")
    case erro.tipoDiferente("String") => msg.tipoErrado("Texto")
    case erro.tipoDiferente("Boolean") => msg.tipoErrado("Lógico")
    case erro.tipoDiferente(a) => msg.tipoErrado(a)
    case erro.parametroTipo(a) => s"'${a}' precisa do tipo.\nPoderia ser '${a}[Inteiro]' ou '${a}[Texto]'?"
    case erro.variavelJaExiste(a) => s"A variável '${a}' já existe.\nSe quiser modificar o valor de '${a}' use ':=' ao invés de '='."
    case erro.alterarValorConstante(a) => s"'${a}' é um valor constante, não pode ser alterado."
    case erro.valorJaDeclarado(a) => s"O valor '${a}' já foi declarado antes.\nUse outro nome."
    case erro.funcaoJaDefinida(a) => s"Já existe uma função chamada '${a}'.\nUse outro nome."
    case erro.funcaoRecursivaSemTipo(a) => s"A função recursiva '${a}' precisa definir o tipo do valor de retorno."
    case erro.metodoNaoExiste(a, "Int") => msg.tipoNaoPossuiMetodo("Inteiro", a)
    case erro.metodoNaoExiste(a, "Double") => msg.tipoNaoPossuiMetodo("Real", a)
    case erro.metodoNaoExiste(a, "String") => msg.tipoNaoPossuiMetodo("Texto", a)
    case erro.metodoNaoExiste(a, "Boolean") => msg.tipoNaoPossuiMetodo("Lógico", a)
    case erro.metodoNaoExiste("get", "Char") => msg.tipoNaoPossuiMetodo("Caractere", "[ ]")
    case erro.metodoNaoExiste(a, "Char") => msg.tipoNaoPossuiMetodo("Caractere", a)
    case erro.metodoNaoExiste(a, b) => msg.tipoNaoPossuiMetodo(b, a)
    case erro.matrizNaoDeclarada(a) => s"A variável '${a}' não é uma Lista mutável."
    case a => a
  }
  def traduzir(texto: String): String = {
    val inicio = texto.indexOf("error:")
    val s = texto.drop(inicio).split('^')(0).split(": ", 3).drop(1)(1)
    mensagens(s)
  }

  def texto(erro: String): String = {
    traduzir(erro)
  }

  def imprimir_erro(erro: Erro): Unit = {
    val code = erro.codigo

    val input = new ANTLRInputStream(code)
    val lexer = new potigolLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new potigolParser(tokens)
    val tree = parser.prog()
    val walker = new ParseTreeWalker()
    val listener = new Listener()
    walker.walk(listener, tree)
    val c = new Compilador(false, false)
    println("=======================")
    println(erro.erro)
    println("-----------------------")
    println(erro.codigo)
    println("-----------------------")
    println(texto(c.avaliar(listener.getSaida).toString()))
  }

  //  erros.drop(24).foreach { imprimir_erro }
}
