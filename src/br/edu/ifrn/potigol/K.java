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

    public static final String LEFTARROW = " <- ";

    public static final String SE = "case _ if (";

    public static final String SENAO = "case _ => ";

    public static final String ENTAO = ") => ";

    public static final String ATE = " to ";

    public static final String PASSO = " by ";

    public static final String GRAVE = "`";

    public static final String LEFTBRACE = "{";

    public static final String RIGHTBRACE = "}";

    public static final String OPENBRACKET = "(";

    public static final String CLOSEBRACKET = ")";

    public static final String VERDADEIRO = "verdadeiro";

    public static final String INDENT = "  ";

    public static final String DOT = ".";

    public static final String DOISPONTOS = ": ";

    public static final String ESPACO = " ";

    public static final String NOT = "!";

    private K() {
    }

    public static String bloco(final String corpo) {
        return LEFTBRACE + NEWLINE + corpo + NEWLINE + RIGHTBRACE;
    }

    public static String generico(final String tipo) {
        return "[" + tipo + "]";
    }

    public static String exp(final String expr) {
        return OPENBRACKET + expr + CLOSEBRACKET;
    }

    public static String param(final String expr) {
        return OPENBRACKET + expr + CLOSEBRACKET;
    }

    public static String formato(final String expr, final String fmt) {
        return exp(fmt) + ".formatLocal(java.util.Locale.US, " + expr
                + CLOSEBRACKET;
    }

    public static String escreva(final String expr) {
        return "escreva" + param(expr);
    }

    public static String imprima(final String expr) {
        return "imprima" + param(expr);
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
            resp = DOISPONTOS + valor;
        }
        return resp;
    }

    public static String operador(final String valor) {
        final String op;
        switch (valor) {
            case "mod":
                op = "%";
                break;
            case "div":
                op = "/";
                break;
            case "<>":
                op = "!=";
                break;
            default:
                op = valor;
                break;
        }
        return " " + op + " ";
    }

    public static String indent(final String valor) {
        return K.INDENT + valor + K.NEWLINE;
    }

    public static String codigo(final int linha) {
        return "/*Codigo: " + linha + " */";
    }
}
