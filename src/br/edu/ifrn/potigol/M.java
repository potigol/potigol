package br.edu.ifrn.potigol;

import java.util.Arrays;
import java.util.List;

public class M {
    private static List<String> scalawords = Arrays.asList("type", "yield",
            "lazy", "override", "def", "with", "val", "var", "false", "true",
            "sealed", "abstract", "private", "trait", "object", "null", "if",
            "for", "while", "throw", "finally", "protected", "extends",
            "import", "final", "return", "else", "break", "new", "catch",
            "super", "class", "case", "package", "default", "try", "this",
            "match", "continue", "throws");

    private static int num = 0;

    private static String nextVar() {
        num++;
        return "$a" + num;
    }

    public static String escapeID(final String id) {
        if (scalawords.contains(id)) {
            return "`" + id + "`";
        }
        return id;
    }

    public static String getVetor(final String id, final String indice) {
        return id + ".get(" + indice + ")";
    }

    public static String lambda(final String param, final String corpo) {
        return " (" + param + ")" + K.arrow + K.bloco(corpo);
    }

    public static String tipoGenerico(final String id, final String tipo) {
        return id + K.generico(tipo);
    }

    public static String tipoFuncao(final String esq, final String dir) {
        return K.exp(esq + K.arrow + dir);
    }

    public static String tipoTupla(final int tamanho, final String tipo) {
        return K.tupla + tamanho + K.generico(tipo);
    }

    public static String chamadaFuncao(final String nome, final String param) {
        return nome + K.param(param);
    }

    public static String operacaoBin(final String exp1, final String op,
            final String exp2) {
        return "{" + exp1 + op + exp2 + "}";
    }

    public static String paraFaca(final String faixas, final String guarda,
            final String bloco) {
        return "for{" + faixas + K.guarda(guarda) + "} " + bloco;
    }

    public static String expoente(final String base, final String exp) {
        return K.exp("Math.pow(" + base + K.virgula + exp + ")");
    }

    public static String escolha(final String exp, final List<String> casos) {
        String corpo = "";
        for (final String caso : casos) {
            corpo += "  " + caso + K.NL;
        }
        return K.exp(exp) + " match " + K.bloco(corpo);
    }

    public static String enquanto(final String exp, final String bloco) {
        return K.enquanto + K.exp(exp) + bloco;
    }

    public static String chamadaMetodo(final String objeto, final String metodo,
            final String param) {
        return objeto + "." + metodo + K.param(param);
    }

    public static String formato(final String exp1, final String fmt) {
        return K.formato(exp1, fmt);
    }

    public static String aliasTipo(final String id, final String tipo) {
        return K.type + escapeID(id) + K.igual + tipo;
    }

    public static String bloco(final String exp) {
        return K.bloco(exp);
    }

    public static String escreva(final String exp, final boolean nl) {
        final String s;
        if (nl) {
            s = K.escreva(exp);
        } else {
            s = K.imprima(exp);
        }
        return s;
    }

    public static String paraGere(final String faixas, final String se,
            final String gere) {
        return "Lista((for{" + faixas + K.guarda(se) + "} yield "
                + K.bloco(gere) + ").toList)";
    }

    public static String senaoSe(final String cond, final String entao) {
        return K.se + cond + K.entao + entao + K.NL;
    }

    public static String se(final String cond, String entao,
            final List<String> senaose, final String senao) {
        String s = "1 match {" + K.NL;
        s += K.se + cond + K.entao + entao + K.NL;
        for (final String c : senaose) {
            s += c + K.NL;
        }
        s += K.senao + senao + K.NL + "}";
        return s;
    }

    public static String atribSimples(final List<String> ids,
            final String exp) {
        final String var = nextVar();
        String s = K.def + var + K.igual + exp + K.semi;
        for (final String id : ids) {
            s += id + K.igual + var + K.semi;
        }
        return s;
    }

    public static String uso(final String uso) {
        return "import " + stripString(uso) + "._";
    }

    public static String stripString(final String s) {
        return s.replace("\"", "");
    }

    public static String list2String(final List<String> a) {
        String s = "";
        if (a.size() > 0) {
            s = a.get(0);
        }
        for (int i = 1; i < a.size(); i++) {
            s += K.virgula + a.get(i);
        }
        return s;
    }

    public static List<String> string2List(final String s) {
        return Arrays.asList(s.split(K.virgula));
    }

    public static String DefFuncao(final String id, final String param,
            final String tipo, final String corpo) {
        return K.def + id + K.param(param) + K.tipo(tipo) + K.igual
                + K.bloco(corpo) + K.NL;
    }

    public static String declVariavel(final String id, final String exp) {
        return K.var + id + K.igual + exp;
    }

    public static String tupla(final int tamanho, final String exp) {
        return K.tupla + tamanho + K.param(exp);
    }

    public static String lista(final String exp) {
        return K.lista(exp);
    }

    public static String booleano(final String bool) {
        final String valor;
        if (bool.equals("verdadeiro")) {
            valor = Boolean.TRUE.toString();
        } else {
            valor = Boolean.FALSE.toString();
        }
        return valor;
    }

    public static String declValor(final String id, final String exp) {
        return K.val + id + K.igual + exp + K.semi;
    }

    public static String atribMultipla(final List<String> ids,
            final List<String> exps) {
        final String[] aux = new String[ids.size()];
        final StringBuilder s = new StringBuilder();
        for (int i = 0; i < ids.size(); i++) {
            aux[i] = nextVar();
            s.append(K.val + aux[i] + K.igual + exps.get(i) + K.semi);
        }
        for (int i = 0; i < ids.size(); i++) {
            s.append(ids.get(i) + K.igual + aux[i] + K.semi);
        }
        return s.toString();
    }

    public static String faixa(final String id, final List<String> exps) {
        final int tamanho = exps.size();
        final String inicio = exps.get(0);
        final String s;
        if (tamanho == 1) {
            s = inicio;
        } else if (tamanho == 2) {
            final String fim = exps.get(1);
            s = inicio + " to " + fim;
        } else {
            final String fim = exps.get(1);
            final String passo = exps.get(2);
            s = inicio + " to " + fim + " by " + passo;
        }
        return id + " <- " + s;
    }

    public static String texto(final String texto) {
        String s = texto;
        if (s.contains("{")) {
            s = s.replace("$", "$$");
        }
        s = s.replace("{", "${");
        if (s.contains(K.NL)) {
            s = "\"\"" + s + "\"\".stripMargin('|')";
        }
        if (s.contains("{")) {
            s = "s" + s;
        }
        return s;
    }

    private M() {
    }
}
