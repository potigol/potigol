package br.edu.ifrn.potigol;

public class K {
    static final String val = "val ";

    static final String def = "def ";

    static final String semi = " ;\n";

    static final String NL = "\n";

    static final String NL2 = "\n\n";

    static final String igual = " = ";

    static final String virgula = ",";

    static final String var = "var ";

    static final String and = " && ";

    static final String or = " || ";

    static final String enquanto = "while ";

    static final String type = "type ";

    static final String tupla = "Tupla";

    static final String arrow = " => ";

    static final String se = "case _ if (";

    static final String senao = "case _ => ";

    static final String entao = ") => ";

    static String bloco(final String corpo) {
        return "{" + NL + corpo + NL + "}";
    }

    static String generico(final String s) {
        return "[" + s + "]";
    }

    static String exp(final String s) {
        return "(" + s + ")";
    }

    static String param(final String s) {
        return "(" + s + ")";
    }

    static String formato(final String s, final String fmt) {
        return exp(s) + ".format" + param(fmt);
    }

    static String escreva(final String s) {
        return "escreva(" + s + ")";
    }
    
    static String imprima(final String s) {
        return "imprima(" + s + ")";
    }

    static String lista(final String exp) {
        return "Lista(List(" + exp + "))";
    }

    static String guarda(final String cond) {
        if (!cond.isEmpty()) {
            return " if " + cond;
        }
        return " ";
    }

    static String tipo(final String s) {
        if (s.isEmpty()) {
            return "";
        } else {
            return ": " + s;
        }
    }
}
