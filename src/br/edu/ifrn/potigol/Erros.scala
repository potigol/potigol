package br.edu.ifrn.potigol

object Erros {
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
  }

  private[this] def contar(b: String) = b.count(':' == _)

  private def mensagens(s: String): String = {
    val erro = s.replace("\n", " | ")
    erro match {
      case Erro.naoDeclarado(a) => Msg.valorNaoDeclarado(a)
      case Erro.parametroAusente(a, b) => Msg.faltaParametro(a, b)
      case Erro.parametroMais("apply", b) => Msg.parametrosMais(contar(b))
      case Erro.parametroMais(a, b: String) if contar(b) == 0 => s"A função '${a}' não precisa de parâmetro."
      case Erro.parametroMais(a, b: String) if contar(b) == 1 => s"A função '${a}' precisa de apenas 1 parâmetro."
      case Erro.parametroMais(a, b) => s"A função '${a}' precisa de apenas ${contar(b)} parâmetros."
      case Erro.tipoIndefinido(a) => s"O tipo '${a}' não existe.\nNão seria 'Inteiro', 'Real' ou 'Texto'?"
      case Erro.tipoDiferente("Int") => Msg.tipoErrado("Inteiro")
      case Erro.tipoDiferente("Double") => Msg.tipoErrado("Real")
      case Erro.tipoDiferente("String") => Msg.tipoErrado("Texto")
      case Erro.tipoDiferente("Boolean") => Msg.tipoErrado("Lógico")
      case Erro.tipoDiferente(a) => Msg.tipoErrado(a)
      case Erro.parametroTipo(a) => s"'${a}' precisa do tipo.\nPoderia ser '${a}[Inteiro]' ou '${a}[Texto]'?"
      case Erro.variavelJaExiste(a) => s"A variável '${a}' já existe.\nSe quiser modificar o valor de '${a}' use ':=' ao invés de '='."
      case Erro.alterarValorConstante(a) => s"'${a}' é um valor constante, não pode ser alterado."
      case Erro.valorJaDeclarado(a) => s"O valor '${a}' já foi declarado antes.\nUse outro nome."
      case Erro.funcaoJaDefinida(a) => s"Já existe uma função chamada '${a}'.\nUse outro nome."
      case Erro.funcaoRecursivaSemTipo(a) => s"A função recursiva '${a}' precisa definir o tipo do valor de retorno."
      case Erro.metodoNaoExiste(a, "Int") => Msg.tipoNaoPossuiMetodo("Inteiro", a)
      case Erro.metodoNaoExiste(a, "Double") => Msg.tipoNaoPossuiMetodo("Real", a)
      case Erro.metodoNaoExiste(a, "String") => Msg.tipoNaoPossuiMetodo("Texto", a)
      case Erro.metodoNaoExiste(a, "Boolean") => Msg.tipoNaoPossuiMetodo("Lógico", a)
      case Erro.metodoNaoExiste("get", "Char") => Msg.tipoNaoPossuiMetodo("Caractere", "[ ]")
      case Erro.metodoNaoExiste(a, "Char") => Msg.tipoNaoPossuiMetodo("Caractere", a)
      case Erro.metodoNaoExiste(a, b) => Msg.tipoNaoPossuiMetodo(b, a)
      case Erro.matrizNaoDeclarada(a) => s"A variável '${a}' não é uma Lista mutável."
      case _ => erro
    }
  }
  def traduzir(texto: String): String = {
    val inicio = texto.indexOf("error:")
    val s = texto.drop(inicio).split('^')(0).split(": ", 3).drop(1)(1)
    mensagens(s)
  }

  def texto(erro: String): String = {
    traduzir(erro)
  }
}
