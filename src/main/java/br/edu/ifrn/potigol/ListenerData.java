package br.edu.ifrn.potigol;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ListenerData {
    private final ParseTreeProperty<String> values;

    public List<String> getWarnings() {
        return warnings;
    }

    private final Stack<List<String>> declaracoes;
    private final List<String> warnings;
    private final StringBuilder saida;

    public Stack<List<String>> getDeclaracoes() {
        return declaracoes;
    }

    public ListenerData() {
        this.values = new ParseTreeProperty<>();
        this.declaracoes = new Stack<>();
        this.warnings = new ArrayList<>();
        this.saida = new StringBuilder();
    }

    public void setValue(final ParseTree node, final String value) {
        this.values.put(node, value);
    }

    public String getValue(final ParseTree node) {
        return this.values.get(node);
    }

    public List<String> getValues(final List<? extends ParseTree> list) {
        final List<String> valores = new ArrayList<>();
        for (final ParseTree id : list) {
            valores.add(this.getValue(id));
        }
        return valores;
    }

    public String getOrElse(final ParseTree node, final String defaultValue) {
        String value = this.getValue(node);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    public String getOrElse(final ParseTree node) {
        return this.getOrElse(node, "");
    }

    // TODO: Refatorar
    public void verificarDuplicados(final List<String> ids,
            final ParserRuleContext ctx, final boolean show) {
        if (show) {
            for (final String i : ids) {
                if (this.valores().contains(i)) {
                    final int linha = ctx.getStart().getLine();
                    this.warnings.add("Valor '" + i
                            + "' declarado pela segunda vez na linha " + linha
                            + ".");
                }
            }
        }
        this.declaracoes.peek().addAll(ids);
    }

    public List<String> valores() {
        final List<String> lista = new ArrayList<>();
        for (final List<String> declaracao : this.declaracoes) {
            lista.addAll(declaracao);
        }
        return lista;
    }

    public StringBuilder getSaida() {
        return this.saida;
    }
}
