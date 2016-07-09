package br.edu.ifrn.potigol;

public final class K {
    public static final String val = "val ";

    public static final String def = "def ";

    public static final String semi = " ;\n";

    public static final String NL = "\n";

    public static final String NL2 = "\n\n";

    public static final String igual = " = ";

    public static final String virgula = ",";

    public static final String var = "var ";

    public static final String and = " && ";

    public static final String or = " || ";

    public static final String enquanto = "while ";

    public static final String type = "type ";

    public static final String tupla = "Tupla";

    public static final String arrow = " => ";

    public static final String se = "case _ if (";

    public static final String senao = "case _ => ";

    public static final String entao = ") => ";

    private K() {
    }

    public static String bloco(final String corpo) {
        return "{" + NL + corpo + NL + "}";
    }

    public static String generico(final String s) {
        return "[" + s + "]";
    }

    public static String exp(final String s) {
        return "(" + s + ")";
    }

    public static String param(final String s) {
        return "(" + s + ")";
    }

    public static String formato(final String s, final String fmt) {
        return exp(s) + ".format" + param(fmt);
    }

    public static String escreva(final String s) {
        return "escreva(" + s + ")";
    }

    public static String imprima(final String s) {
        return "imprima(" + s + ")";
    }

    public static String lista(final String exp) {
        return "Lista(List(" + exp + "))";
    }

    public static String guarda(final String cond) {
        if (!cond.isEmpty()) {
            return " if " + cond;
        }
        return " ";
    }

    public static String tipo(final String s) {
        if (s.isEmpty()) {
            return "";
        } else {
            return ": " + s;
        }
    }
}
