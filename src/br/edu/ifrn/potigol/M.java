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

    static int num = 0;

    static String nextVar() {
        num++;
        return "$a" + num;
    }

    static String escapeID(final String id) {
        if (scalawords.contains(id)) {
            return "`" + id + "`";
        }
        return id;
    }

    static String getVetor(String id, String indice) {
        return id + ".get(" + indice + ")";
    }

    public static String lambda(String param, String corpo) {
        return " (" + param + ")" + K.arrow + K.bloco(corpo);
    }

    public static String tipoGenerico(String id, String tipo) {
        return id + K.generico(tipo);
    }

    public static String tipoFuncao(String esq, String dir) {
        return K.exp(esq + K.arrow + dir);
    }

    public static String tipoTupla(int tamanho, String tipo) {
        return K.tupla + tamanho + K.generico(tipo);
    }

    public static String chamadaFuncao(String nome, String param) {
        return nome + K.param(param);
    }

    public static String operacaoBin(String exp1, String op, String exp2) {
        return "{" + exp1 + op + exp2 + "}";
    }

    public static String paraFaca(String faixas, String guarda, String bloco) {
        return "for{" + faixas + K.guarda(guarda) + "} " + bloco;
    }

    public static String expoente(String base, String exp) {
        return K.exp("Math.pow(" + base + K.virgula + exp + ")");
    }

    public static String escolha(String exp, List<String> casos) {
        String corpo = "";
        for (final String caso : casos) {
            corpo += "  " + caso + K.NL;
        }
        return K.exp(exp) + " match " + K.bloco(corpo);
    }

    public static String enquanto(String exp, String bloco) {
        return K.enquanto + K.exp(exp) + bloco;
    }

    public static String chamadaMetodo(String objeto, String metodo,
            String param) {
        return objeto + "." + metodo + K.param(param);
    }

    public static String formato(String exp1, String fmt) {
        return K.formato(exp1, fmt);
    }

    public static String aliasTipo(String id, String tipo) {
        return K.type + escapeID(id) + K.igual + tipo;
    }

    public static String bloco(String exp) {
        return K.bloco(exp);
    }

    public static String escreva(String exp, boolean nl) {
        final String s;
        if (nl) {
            s = K.escreva(exp);
        } else {
            s = K.imprima(exp);
        }
        return s;
    }

    public static String paraGere(String faixas, String se, String gere) {
        return "Lista((for{" + faixas + K.guarda(se) + "} yield "
                + K.bloco(gere) + ").toList)";
    }

    public static String senaoSe(String cond, String entao) {
        return K.se + cond + K.entao + entao + K.NL;
    }

    public static String se(String cond, String entao, List<String> senaose,
            String senao) {
        String s = "1 match {" + K.NL;
        s += K.se + cond + K.entao + entao + K.NL;
        for (final String c : senaose) {
            s += c + K.NL;
        }
        s += K.senao + senao + K.NL + "}";
        return s;
    }

    public static String atribSimples(List<String> ids, String exp) {
        final String var = nextVar();
        String s = K.def + var + K.igual + exp + K.semi;
        for (final String id : ids) {
            s += id + K.igual + var + K.semi;
        }
        return s;
    }

    public static String uso(String uso) {
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

    public static String DefFuncao(String id, String param, String tipo,
            String corpo) {
        return K.def + id + K.param(param) + K.tipo(tipo) + K.igual
                + K.bloco(corpo) + K.NL;
    }

    public static String declVariavel(String id, String exp) {
        return K.var + id + K.igual + exp;
    }

    public static String tupla(int tamanho, String exp) {
        return K.tupla + tamanho + K.param(exp);
    }

    public static String lista(String exp) {
        return K.lista(exp);
    }

    public static String booleano(String bool) {
        final String valor;
        if (bool.equals("verdadeiro")) {
            valor = Boolean.TRUE.toString();
        } else {
            valor = Boolean.FALSE.toString();
        }
        return valor;
    }

    public static String declValor(String id, String exp) {
        return K.val + id + K.igual + exp + K.semi;
    }

    public static String atribMultipla(List<String> ids, List<String> exps) {
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

    public static String faixa(String id, List<String> exps) {
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

    public static String texto(String texto) {
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
}
