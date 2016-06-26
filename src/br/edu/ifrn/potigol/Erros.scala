package br.edu.ifrn.potigol

object Erros {
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

  private def mensagens(s: String): String = s.replace("\n", " | ") match {
    case erro.naoDeclarado(a) => msg.valorNaoDeclarado(a)
    case erro.parametroAusente(a, b) => msg.faltaParametro(a, b)
    case erro.parametroMais("apply", b) => msg.parametrosMais(contar(b))
    case erro.parametroMais(a, b) if contar(b) == 0 => s"A função '${a}' não precisa de parâmetro."
    case erro.parametroMais(a, b) if contar(b) == 1 => s"A função '${a}' precisa de apenas 1 parâmetro."
    case erro.parametroMais(a, b) => s"A função '${a}' precisa de apenas ${contar(b)} parâmetros."
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
}
