package br.edu.ifrn.potigol;

import java.util.Arrays;
import java.util.List;

public final class M {
    private static List<String> scalawords = Arrays.asList("type", "yield",
            "lazy", "override", "def", "with", "val", "var", "false", "true",
            "sealed", "abstract", "private", "trait", "object", "null", "if",
            "for", "while", "throw", "finally", "protected", "extends",
            "import", "final", "return", "else", "break", "new", "catch",
            "super", "class", "case", "package", "default", "try", "this",
            "match", "continue", "throws", "do", "while");

    private static int num;

    private static String nextVar() {
        num++;
        return "$a" + num;
    }

    public static String escapeID(final String ident) {
        final String resposta;
        if (scalawords.contains(ident)) {
            resposta = K.GRAVE + ident + K.GRAVE;
        } else {
            resposta = ident;
        }
        return resposta;
    }

    public static String getVetor(final String ident, final String indice) {
        return ident + ".get" + K.param(indice);
    }

    public static String lambda(final String param, final String corpo) {
        return K.ESPACO + K.param(param) + K.ARROW + K.bloco(corpo);
    }

    public static String tipoGenerico(final String ident, final String tipo) {
        return ident + K.generico(tipo);
    }

    public static String tipoFuncao(final String esq, final String dir) {
        return K.exp(esq + K.ARROW + dir);
    }

    public static String tipoTupla(final int tamanho, final String tipo) {
        return K.OPENBRACKET + tipo + K.CLOSEBRACKET;
    }

    public static String chamadaFuncao(final String nome, final String param) {
        final String p;
        if (param == null) {
            p = "";
        } else {
            p = param;
        }
        return nome + K.param(p);
    }

    public static String operacaoBin(final String exp1, final String operador,
            final String exp2) {
        final String exp;
        if ("/".equals(operador)) {
            exp = K.OPENBRACKET + K.exp(exp1) + " * 1.0" + K.CLOSEBRACKET;
        } else {
            exp = exp1;
        }
        return K.LEFTBRACE + exp + K.operador(operador) + exp2 + K.RIGHTBRACE;
    }

    public static String operacaoBinE(final String exp1, final String exp2) {
        return K.LEFTBRACE + exp1 + K.AND + exp2 + K.RIGHTBRACE;
    }

    public static String operacaoBinOu(final String exp1, final String exp2) {
        return K.LEFTBRACE + exp1 + K.OR + exp2 + K.RIGHTBRACE;
    }

    public static String operacaoUnaria(final String operador,
            final String exp) {
        return operador + exp;
    }

    public static String paraFaca(final String faixas, final String guarda,
            final String bloco) {
        return "for" + K.bloco(faixas + K.guarda(guarda)) + " " + bloco;
    }

    public static String expoente(final String base, final String exp) {
        return K.exp("Math.pow(" + base + K.VIRGULA + exp + ")");
    }

    public static String escolha(final String exp, final List<String> casos) {
        final StringBuilder corpo = new StringBuilder();
        for (final String caso : casos) {
            corpo.append(K.indent(caso));
        }
        return K.exp(exp) + " match " + K.bloco(corpo.toString());
    }

    public static String enquanto(final String exp, final String bloco) {
        return K.ENQUANTO + K.exp(exp) + bloco;
    }

    public static String chamadaMetodo(final String objeto, final String metodo,
            final String param) {
        if (param.isEmpty()) {
            return objeto + K.DOT + metodo;
        }
        return objeto + K.DOT + metodo + K.param(param);
    }

    public static String formato(final String exp1, final String fmt) {
        return K.formato(exp1, fmt);
    }

    public static String aliasTipo(final String id, final String tipo) {
        return K.TYPE + escapeID(id) + K.IGUAL + tipo;
    }

    public static String bloco(final String exp) {
        return K.bloco(exp);
    }

    public static String escreva(final String exp, final boolean newline) {
        final String resposta;
        if (newline) {
            resposta = K.escreva(exp);
        } else {
            resposta = K.imprima(exp);
        }
        return resposta;
    }

    public static String paraGere(final String faixas, final String guarda,
            final String gere) {
        return "Lista((for" + K.bloco(faixas + K.guarda(guarda)) + " yield "
                + K.bloco(gere) + ").toList)";
    }

    public static String senaoSe(final String cond, final String entao) {
        return K.SE + cond + K.ENTAO + entao + K.NEWLINE;
    }

    public static String se(final String cond, final String entao,
            final List<String> senaose, final String senao) {
        final StringBuilder resposta = new StringBuilder();
        resposta.append("1 match {").append(K.NEWLINE).append(K.SE).append(cond)
                .append(K.ENTAO).append(entao).append(K.NEWLINE);
        for (final String item : senaose) {
            resposta.append(item + K.NEWLINE);
        }
        resposta.append(K.SENAO + senao + K.NEWLINE + K.RIGHTBRACE);
        return resposta.toString();
    }

    public static String atribSimples(final List<String> ids,
            final String exp) {
        final String var = nextVar();
        final StringBuilder resposta = new StringBuilder();
        resposta.append(K.DEF).append(var).append(K.IGUAL).append(exp)
                .append(K.SEMI);
        for (final String id : ids) {
            resposta.append(id).append(K.IGUAL).append(var).append(K.SEMI);
        }
        return resposta.toString();
    }

    public static String uso(final String uso) {
        return "import " + stripString(uso) + "._";
    }

    public static String stripString(final String texto) {
        return texto.replace("\"", "");
    }

    public static String list2String(final List<String> lista) {
        final StringBuilder resposta = new StringBuilder();
        if (!lista.isEmpty()) {
            resposta.append(lista.get(0));
        }
        for (int i = 1; i < lista.size(); i++) {
            resposta.append(K.VIRGULA).append(lista.get(i));
        }
        return resposta.toString();
    }

    public static List<String> string2List(final String texto) {
        return Arrays.asList(texto.split(K.VIRGULA));
    }

    public static String list2Qualid(final List<String> lista) {
        final StringBuilder resposta = new StringBuilder();
        if (!lista.isEmpty()) {
            resposta.append(lista.get(0));
        }
        for (int i = 1; i < lista.size(); i++) {
            resposta.append(".").append(lista.get(i));
        }
        return resposta.toString();
    }

    public static String[] split(final String id) {
        return id.split(K.VIRGULA);
    }

    public static String defFuncao(final String id, final String param,
            final String tipo, final String corpo) {
        return K.DEF + id + K.param(param) + K.tipo(tipo) + K.IGUAL
                + K.bloco(corpo) + K.NEWLINE;
    }

    public static String declVariavel(final String id, final String exp,
            final String tipo) {
        return K.VAR + id + K.tipo(tipo) + K.IGUAL + exp + K.NEWLINE;
    }

    public static String declVariavel(final String id, final String exp) {
        return declVariavel(id, exp, "");
    }

    public static String declVariavelMult(final String[] ids,
            final String[] exps, final String tipo) {
        final StringBuilder resposta = new StringBuilder();
        for (int i = 0; i < ids.length; i++) {
            resposta.append(M.declVariavel(ids[i], exps[i], tipo) + K.NEWLINE);
        }
        return resposta.toString();
    }

    public static String declVariavelMult(final String[] ids,
            final String[] exps) {
        return declVariavelMult(ids, exps, "");
    }

    public static String tupla(final int tamanho, final String exp) {
        return K.param(exp);
    }

    public static String lista(final String exp) {
        return K.lista(exp);
    }

    public static String booleano(final String bool) {
        final String valor;
        if (K.VERDADEIRO.equals(bool)) {
            valor = Boolean.TRUE.toString();
        } else {
            valor = Boolean.FALSE.toString();
        }
        return valor;
    }

    public static String declValor(final String ident, final String exp) {
        return K.VAL + ident + K.IGUAL + exp + K.SEMI;
    }

    public static String declValor(final String ident, final String exp,
            final String tipo) {
        return K.VAL + ident + K.tipo(tipo) + K.IGUAL + exp + K.SEMI;
    }

    public static String atribMultipla(final List<String> ids,
            final List<String> exps) {
        final String[] aux = new String[ids.size()];
        final StringBuilder resposta = new StringBuilder();
        for (int i = 0; i < ids.size(); i++) {
            aux[i] = nextVar();
            final String linha = K.VAL + aux[i] + K.IGUAL + exps.get(i)
                    + K.SEMI;
            resposta.append(linha);
        }
        for (int i = 0; i < ids.size(); i++) {
            final String linha = ids.get(i) + K.IGUAL + aux[i] + K.SEMI;
            resposta.append(linha);
        }
        return resposta.toString();
    }

    public static String faixa(final String ident, final List<String> exps) {
        final int tamanho = exps.size();
        final String inicio = exps.get(0);
        final String resposta;
        if (tamanho == 1) {
            resposta = inicio;
        } else if (tamanho == 2) {
            final String fim = exps.get(1);
            resposta = inicio + K.ATE + fim;
        } else {
            final String fim = exps.get(1);
            final String passo = exps.get(2);
            resposta = inicio + K.ATE + fim + K.PASSO + passo;
        }
        return ident + K.LEFTARROW + resposta;
    }

    public static String texto(final String texto) {
        String resposta = texto;
        if (resposta.contains(K.LEFTBRACE)) {
            resposta = resposta.replace("$", "$$");
        }
        resposta = resposta.replace(K.LEFTBRACE, "${");
        if (resposta.contains(K.NEWLINE)) {
            resposta = "\"\"" + resposta + "\"\".stripMargin('|')";
        }
        if (resposta.contains(K.LEFTBRACE)) {
            resposta = "p" + resposta;
        }
        return resposta;
    }

    public static String operacaoUnariaNao(final String exp) {
        return K.LEFTBRACE + K.NOT + exp + K.RIGHTBRACE;
    }

    public static String parenteses(final String exp) {
        return K.exp(exp);
    }

    public static String exprList(final List<String> lista) {
        String resposta = K.NEWLINE;
        for (final String s : lista) {
            resposta += K.indent(s);
        }
        return resposta;
    }

    public static String prologo() {
        final String pacote = "import br.edu.ifrn.potigol.";
        final String resposta = pacote + "Potigolutil._" + K.SEMI + pacote
                + "Matematica._" + K.SEMI;
        return resposta;
    }

    public static String organizar(final String programa) {
        return programa.replaceAll(K.NL2, K.NEWLINE).replaceAll(K.NL2,
                K.NEWLINE);
    }

    public static String faixas(final List<String> lista) {
        final StringBuilder resposta = new StringBuilder();
        for (final String s : lista) {
            if (s != lista.get(0)) {
                resposta.append(K.SEMI);
            }
            resposta.append(s);
        }
        return resposta.toString();
    }

    public static String valorMultiplo(final List<String> ids,
            final List<String> exps) {
        return valorMultiplo(ids, exps, "");
    }

    public static String valorMultiplo(final List<String> ids,
            final List<String> exps, final String tipo) {
        final StringBuilder resposta = new StringBuilder();
        for (int i = 0; i < ids.size(); i++) {
            final String id = ids.get(i);
            final String exp = exps.get(i);
            resposta.append(M.declValor(id, exp, tipo));
        }
        return resposta.toString();
    }

    public static String interpolacao(final List<String> string,
            final List<String> interp) {
        final StringBuilder resposta = new StringBuilder();
        int pos = 0;
        for (final String exp : interp) {
            resposta.append(string.get(pos).replace(K.LEFTBRACE, "${"))
                    .append(exp);
            pos++;
        }
        resposta.append(string.get(pos));
        if (resposta.toString().contains("\n")) {
            resposta.insert(0, "\"\"").append("\"\".stripMargin('|')");
        }
        resposta.insert(0, "p");
        return resposta.toString();
    }

    public static String saida(final List<String> warnings,
            final List<String> items) {
        final StringBuilder resposta = new StringBuilder();
        if (!warnings.isEmpty()) {
            resposta.append("escreva(\"===[ATENCAO]===\")\nescreva(\"")
                    .append(warnings.get(0)).append("\")");
        }
        for (final String item : items) {
            resposta.append(item);
        }
        resposta.append(K.NEWLINE).append("\"\"").append(K.NEWLINE);
        return organizar(resposta.toString());
    }

    public static String inst(final int codigo, final String inst) {
        return K.codigo(codigo) + K.NEWLINE + inst + K.SEMI;
    }

    private M() {
    }

    public static String declaracao(final String decl) {
        final String resposta = K.NEWLINE + decl;
        return resposta;
    }

    public static String classe(final String ident, final String membros) {
        final StringBuilder resposta = new StringBuilder("case class ")
                .append(M.escapeID(ident)).append(membros);
        return resposta.toString();
    }

    public static String membros(final List<String> params,
            final List<String> elems) {
        final StringBuilder resposta = new StringBuilder(K.OPENBRACKET);
        for (int i = 0; i < params.size(); i++) {
            final String param = params.get(i);
            resposta.append(K.INDENT).append(param);
            if (i < params.size() - 1) {
                resposta.append(K.VIRGULA);
            }
        }
        resposta.append(K.CLOSEBRACKET);
        resposta.append(K.LEFTBRACE + K.NEWLINE);
        for (String i : elems) {
            resposta.append(i);
        }
        resposta.append(K.RIGHTBRACE);
        return resposta.toString();
    }

    public static String setVetor(final String ident, final List<String> idx,
            final String exp) {
        final StringBuilder resposta = new StringBuilder(ident);
        for (final String ind : idx) {
            resposta.append(K.param(ind + " -1"));
        }
        resposta.append(K.IGUAL).append(exp);
        return resposta.toString();
    }

}
