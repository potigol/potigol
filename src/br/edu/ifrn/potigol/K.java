package br.edu.ifrn.potigol;

public final class K {
    public static final String VAL = "val ";

    public static final String DEF = "def ";

    public static final String SEMI = " ;\n";

    public static final String NEWLINE = "\n";

    public static final String NL2 = "\n\n";

    public static final String IGUAL = " = ";

    public static final String VIRGULA = ",";

    public static final String VAR = "var ";

    public static final String AND = " && ";

    public static final String OR = " || ";

    public static final String ENQUANTO = "while ";

    public static final String TYPE = "type ";

    public static final String TUPLA = "Tupla";

    public static final String ARROW = " => ";

    public static final String SE = "case _ if (";

    public static final String SENAO = "case _ => ";

    public static final String ENTAO = ") => ";

    public static final String ATE = " to ";

    public static final String PASSO = " by ";

    public static final String GRAVE = "`";

    public static final String LEFTBRACE = "{";

    public static final String RIGHTBRACE = "}";

    private K() {
    }

    public static String bloco(final String corpo) {
        return "{" + NEWLINE + corpo + NEWLINE + "}";
    }

    public static String generico(final String tipo) {
        return "[" + tipo + "]";
    }

    public static String exp(final String expr) {
        return "(" + expr + ")";
    }

    public static String param(final String expr) {
        return "(" + expr + ")";
    }

    public static String formato(final String expr, final String fmt) {
        return exp(expr) + ".format" + param(fmt);
    }

    public static String escreva(final String expr) {
        return "escreva(" + expr + ")";
    }

    public static String imprima(final String expr) {
        return "imprima(" + expr + ")";
    }

    public static String lista(final String exp) {
        return "Lista(List(" + exp + "))";
    }

    public static String guarda(final String cond) {
        final String resp;
        if (cond.isEmpty()) {
            resp = " ";
        } else {
            resp = " if " + cond;
        }
        return resp;
    }

    public static String tipo(final String valor) {
        final String resp;
        if (valor.isEmpty()) {
            resp = "";
        } else {
            resp = ": " + valor;
        }
        return resp;
    }
}
