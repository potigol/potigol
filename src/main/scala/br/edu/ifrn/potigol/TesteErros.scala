package br.edu.ifrn.potigol

import org.antlr.v4.runtime.{ ANTLRInputStream, CommonTokenStream }
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.CharStreams

import br.edu.ifrn.potigol.Erros.texto
import br.edu.ifrn.potigol.parser.{ potigolLexer, potigolParser }

object TesteErros extends App {

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
        """),
    Erro("Tipo", """Lista(1,"q").dssds var a = [1] a := Lista.mutavel(1,"ok")"""))

  def imprimir_erro(erro: Erro): Unit = {
    val code = erro.codigo

    val input = CharStreams.fromString(code)
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

  erros.drop(30).foreach { imprimir_erro }
}
