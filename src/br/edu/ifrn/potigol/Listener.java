/*
 *  Potigol
 *  Copyright (C) 2015-2016 by Leonardo Lucena
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

/**
 *   _____      _   _             _ 
 *  |  __ \    | | (_)           | |
 *  | |__) |__ | |_ _  __ _  ___ | |
 *  |  ___/ _ \| __| |/ _` |/ _ \| |
 *  | |  | (_) | |_| | (_| | (_) | |
 *  |_|   \___/ \__|_|\__, |\___/|_|
 *                     __/ |        
 *                    |___/         
 *
 * @author Leonardo Lucena (leonardo.lucena@ifrn.edu.br)
 */

package br.edu.ifrn.potigol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import br.edu.ifrn.potigol.parser.potigolBaseListener;
import br.edu.ifrn.potigol.parser.potigolLexer;
import br.edu.ifrn.potigol.parser.potigolParser;
import br.edu.ifrn.potigol.parser.potigolParser.AliasContext;
import br.edu.ifrn.potigol.parser.potigolParser.Atrib_multiplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.Atrib_simplesContext;
import br.edu.ifrn.potigol.parser.potigolParser.BlocoContext;
import br.edu.ifrn.potigol.parser.potigolParser.BooleanoContext;
import br.edu.ifrn.potigol.parser.potigolParser.CasoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Chamada_funcaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Chamada_metodoContext;
import br.edu.ifrn.potigol.parser.potigolParser.CharContext;
import br.edu.ifrn.potigol.parser.potigolParser.ClasseContext;
import br.edu.ifrn.potigol.parser.potigolParser.ComparacaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.ConsContext;
import br.edu.ifrn.potigol.parser.potigolParser.Dcl1Context;
import br.edu.ifrn.potigol.parser.potigolParser.DclContext;
import br.edu.ifrn.potigol.parser.potigolParser.DclsContext;
import br.edu.ifrn.potigol.parser.potigolParser.DeclContext;
import br.edu.ifrn.potigol.parser.potigolParser.Decl_usoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Decl_var_multiplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.Decl_var_simplesContext;
import br.edu.ifrn.potigol.parser.potigolParser.Def_funcaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Def_funcao_corpoContext;
import br.edu.ifrn.potigol.parser.potigolParser.E_logicoContext;
import br.edu.ifrn.potigol.parser.potigolParser.EnquantoContext;
import br.edu.ifrn.potigol.parser.potigolParser.EntaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.EscolhaContext;
import br.edu.ifrn.potigol.parser.potigolParser.EscrevaContext;
import br.edu.ifrn.potigol.parser.potigolParser.ExpoenteContext;
import br.edu.ifrn.potigol.parser.potigolParser.Expr1Context;
import br.edu.ifrn.potigol.parser.potigolParser.Expr2Context;
import br.edu.ifrn.potigol.parser.potigolParser.ExprContext;
import br.edu.ifrn.potigol.parser.potigolParser.ExprlistContext;
import br.edu.ifrn.potigol.parser.potigolParser.FaixaContext;
import br.edu.ifrn.potigol.parser.potigolParser.FaixasContext;
import br.edu.ifrn.potigol.parser.potigolParser.FormatoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Get_vetorContext;
import br.edu.ifrn.potigol.parser.potigolParser.Id1Context;
import br.edu.ifrn.potigol.parser.potigolParser.Id2Context;
import br.edu.ifrn.potigol.parser.potigolParser.IdContext;
import br.edu.ifrn.potigol.parser.potigolParser.ImprimaContext;
import br.edu.ifrn.potigol.parser.potigolParser.InstContext;
import br.edu.ifrn.potigol.parser.potigolParser.InteiroContext;
import br.edu.ifrn.potigol.parser.potigolParser.LambdaContext;
import br.edu.ifrn.potigol.parser.potigolParser.ListaContext;
import br.edu.ifrn.potigol.parser.potigolParser.Mais_menos_unarioContext;
import br.edu.ifrn.potigol.parser.potigolParser.Mult_divContext;
import br.edu.ifrn.potigol.parser.potigolParser.Nao_logicoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Ou_logicoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Para_facaContext;
import br.edu.ifrn.potigol.parser.potigolParser.Para_gereContext;
import br.edu.ifrn.potigol.parser.potigolParser.ParenContext;
import br.edu.ifrn.potigol.parser.potigolParser.ProgContext;
import br.edu.ifrn.potigol.parser.potigolParser.RealContext;
import br.edu.ifrn.potigol.parser.potigolParser.SeContext;
import br.edu.ifrn.potigol.parser.potigolParser.SenaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.SenaoseContext;
import br.edu.ifrn.potigol.parser.potigolParser.Set_vetorContext;
import br.edu.ifrn.potigol.parser.potigolParser.Soma_subContext;
import br.edu.ifrn.potigol.parser.potigolParser.TextoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Texto_interpolacaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo2Context;
import br.edu.ifrn.potigol.parser.potigolParser.TipoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_funcaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_genericoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_tuplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.TuplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.Valor_multiploContext;
import br.edu.ifrn.potigol.parser.potigolParser.Valor_simplesContext;

public class Listener extends potigolBaseListener {
    private int num = 0;
    private final ParseTreeProperty<String> values = new ParseTreeProperty<String>();
    private final Stack<List<String>> declaracoes = new Stack<List<String>>();
    private final List<String> warnings = new ArrayList<String>();

    private String saida = "";

    static private List<String> scalawords = Arrays.asList("type", "yield", "lazy", "override", "def", "with", "val",
            "var", "false", "true", "sealed", "abstract", "private", "trait", "object", "null", "if", "for", "while",
            "throw", "finally", "protected", "extends", "import", "final", "return", "else", "break", "new", "catch",
            "super", "class", "case", "package", "default", "try", "this", "match", "continue", "throws");

    static class K {
        private static final String val = "val ";
        private static final String def = "def ";
        private static final String semi = " ;\n";
        private static final String igual = " = ";
        private static final String var = "var ";
        private static final String and = " && ";
        private static final String or = " || ";
        private static final String enquanto = "while ";
        private static final String type = "type ";
        private static final String arrow = " => ";
        private static final String se = "case _ if (";
        private static final String senao = "case _ => ";
        private static final String entao = ") => ";

        private static final String bloco(final String corpo) {
            return "{\n" + corpo + "\n}";
        }

        private static final String generico(final String s) {
            return "[" + s + "]";
        }

        private static final String exp(final String s) {
            return "(" + s + ")";
        }

        private static final String param(final String s) {
            return "(" + s + ")";
        }

        private static final String formato(final String s, final String fmt) {
            return exp(s) + ".format" + param(fmt);
        }

        private static final String escreva(final String s) {
            return "escreva(" + s + ")";
        }

        private static final String lista(final String exp) {
            return "Lista(List(" + exp + "))";
        }

        private static final String guarda(final String cond) {
            if (!cond.isEmpty()) {
                return " if " + cond;
            }
            return " ";
        }

        private static String tipo(final String s) {
            if (s.isEmpty()) {
                return "";
            } else
                return ": " + s;
        }
    }

    private String nextVar() {
        num++;
        return "$a" + num;
    }

    private void setValue(final ParseTree node, final String value) {
        values.put(node, value);
    }

    private String getValue(final ParseTree node) {
        return values.get(node);
    }

    private String getOrElse(final ParseTree node, final String s) {
        final String value = getValue(node);
        if (value == null)
            return s;
        return value;
    }

    private String escapeID(final String id) {
        if (scalawords.contains(id)) {
            return "`" + id + "`";
        }
        return id;
    }

    private String stripString(final String s) {
        return s.replace("\"", "");
    }

    @Override
    public void exitChar(final CharContext ctx) {
        final String s = ctx.CHAR().getText();
        setValue(ctx, s);
    }

    @Override
    public void exitGet_vetor(final Get_vetorContext ctx) {
        final String id = getValue(ctx.expr(0));
        final String indice = getValue(ctx.expr(1));
        final String s = id + ".get(" + indice + ")";
        setValue(ctx, s);
    }

    @Override
    public void exitDcl1(final Dcl1Context ctx) {
        final ParseTree p;
        if (ctx.ID() != null)
            p = ctx.ID();
        else if (ctx.expr2() != null)
            p = ctx.expr2();
        else
            p = ctx.dcls();
        setValue(ctx, getValue(p));
    }

    @Override
    public void exitSet_vetor(final Set_vetorContext ctx) {
        final String id = ctx.ID().getText();
        final int dim = ctx.expr().size() - 1;
        final String[] indices = new String[dim];
        for (int i = 0; i < dim; i++)
            indices[i] = getValue(ctx.expr(i));
        final String exp = getValue(ctx.expr(dim));
        final StringBuilder s = new StringBuilder(id);
        for (final String ind : indices)
            s.append(K.param(ind + " -1"));
        s.append(K.igual).append(exp);
        setValue(ctx, s.toString());
    }

    @Override
    public void exitLambda(final LambdaContext ctx) {
        final String param = getValue(ctx.dcl1());
        final String corpo = getValue(ctx.inst());
        final String s = " (" + param + ")" + K.arrow + K.bloco(corpo);
        setValue(ctx, s);
    }

    @Override
    public void exitTipo_generico(final Tipo_genericoContext ctx) {
        final String id = getValue(ctx.ID());
        final String tipo = getValue(ctx.tipo());
        final String s = id + K.generico(tipo);
        setValue(ctx, s);
    }

    @Override
    public void exitTipo_funcao(final Tipo_funcaoContext ctx) {
        final String esq = getValue(ctx.tipo(0));
        final String dir = getValue(ctx.tipo(1));
        final String s = K.exp(esq + K.arrow + dir);
        setValue(ctx, s);
    }

    @Override
    public void exitTipo2(final Tipo2Context ctx) {
        String s = "";
        for (final TipoContext tipo : ctx.tipo()) {
            s += ", " + getValue(tipo);
        }
        s = s.replaceFirst(", ", " ");
        setValue(ctx, s);
    }

    @Override
    public void exitTipo_tupla(final Tipo_tuplaContext ctx) {
        final int tamanho = ctx.tipo2().tipo().size();
        final String tipo = getValue(ctx.tipo2());
        final String s = "Tupla" + tamanho + K.generico(tipo);
        setValue(ctx, s);
    }

    @Override
    public void exitCons(final ConsContext ctx) {
        final String a = getValue(ctx.expr(0));
        final String as = getValue(ctx.expr(1));
        final String s;
        if (ctx.getParent().getRuleIndex() == potigolParser.RULE_caso)
            s = "Lista(collection.immutable.::( " + a + ", a$" + as + "$))";

        else
            s = K.bloco(a + "::" + as);
        setValue(ctx, s);
    }

    @Override
    public void exitExpoente(final ExpoenteContext ctx) {
        final String base = getValue(ctx.expr(0));
        final String exp = getValue(ctx.expr(1));
        final String s = K.exp("Math.pow(" + base + ", " + exp + ")");
        setValue(ctx, s);
    }

    @Override
    public void exitCaso(final CasoContext ctx) {
        final String exp = getValue(ctx.expr(0));
        final String cond = getOrElse(ctx.expr(1), "");
        String exps = getValue(ctx.exprlist());
        int p = exp.indexOf("a$");
        if (p >= 0) {
            String s = exp.substring(p + 2);
            p = s.indexOf("$");
            s = s.substring(0, p);
            // String s = exp.split("if")[0].split("::")[1].replaceAll(" ",
            // "").substring(2);
            exps = K.val + s + K.igual + "Lista(a$" + s + "$);\n" + exps.substring(1);
        }
        String s = "case " + exp + K.guarda(cond) + K.arrow + exps;
        setValue(ctx, s);
    }

    @Override
    public void exitEscolha(final EscolhaContext ctx) {
        final String exp = getValue(ctx.expr());
        String corpo = "";
        for (final CasoContext caso : ctx.caso()) {
            corpo += "  " + getValue(caso) + "\n";
        }
        final String s = K.exp(exp) + " match " + K.bloco(corpo);
        setValue(ctx, s);
    }

    @Override
    public void exitFormato(final FormatoContext ctx) {
        final String exp1 = getValue(ctx.expr(0));
        final String fmt = getValue(ctx.expr(1));
        final String s = K.formato(exp1, fmt);
        setValue(ctx, s);
    }

    @Override
    public void exitAlias(final AliasContext ctx) {
        final String id = ctx.ID().getText();
        final String tipo = getValue(ctx.tipo());
        final String s = K.type + escapeID(id) + K.igual + tipo;
        setValue(ctx, s);
    }

    @Override
    public void exitClasse(final ClasseContext ctx) {
        final String id = ctx.ID().getText();
        String s = "case class " + escapeID(id) + "(";
        for (int i = 2; i < ctx.children.size() - 1; i++) {
            ParseTree d = ctx.children.get(i);
            s += "  " + getValue(d);
            if (i < ctx.children.size() - 2)
                s += ",";
        }
        s += ")";
        setValue(ctx, s);
    }

    @Override
    public void enterProg(final ProgContext ctx) {
        saida += "import br.edu.ifrn.potigol.Potigolutil._\n";
        saida += "import br.edu.ifrn.potigol.Matematica._\n";
        declaracoes.push(new ArrayList<String>());
    }

    @Override
    public void enterExprlist(final ExprlistContext ctx) {
        declaracoes.push(new ArrayList<String>());
    }

    @Override
    public void exitAtrib_multipla(final Atrib_multiplaContext ctx) {
        final String id = getValue(ctx.id2());
        final String[] ids = id.split(", ");
        final String exp = getValue(ctx.expr2());
        final String[] exps = exp.split(", ");
        final String[] aux = new String[ids.length];
        String s = "";
        for (int i = 0; i < ids.length; i++) {
            aux[i] = nextVar();
            s += K.val + aux[i] + K.igual + exps[i] + K.semi;
        }
        for (int i = 0; i < ids.length; i++) {
            s += ids[i] + K.igual + aux[i] + K.semi;
        }
        setValue(ctx, s);
    }

    @Override
    public void exitAtrib_simples(final Atrib_simplesContext ctx) {
        final String id1 = getValue(ctx.id1());
        final String[] ids = id1.split(", ");
        final String exp = getValue(ctx.expr());
        final String var = nextVar();
        String s = K.def + var + K.igual + exp + K.semi;
        for (final String id : ids) {
            s += id + K.igual + var + K.semi;
        }
        setValue(ctx, s);
    }

    @Override
    public void exitChamada_funcao(final Chamada_funcaoContext ctx) {
        final String nome = getValue(ctx.expr());
        final String param = getValue(ctx.expr1());
        final String s = nome + K.param(param);
        setValue(ctx, s);
    }

    @Override
    public void exitChamada_metodo(final Chamada_metodoContext ctx) {
        final String objeto = getValue(ctx.expr());
        final String metodo = getValue(ctx.ID());
        final String param = getOrElse(ctx.expr1(), "");
        final String s = objeto + "." + metodo + K.param(param);
        setValue(ctx, s);
    }

    @Override
    public void exitComparacao(final ComparacaoContext ctx) {
        final String exp1 = getValue(ctx.expr(0));
        final String exp2 = getValue(ctx.expr(1));
        String op = ctx.getChild(1).getText();
        if ("<>".equals(op)) {
            op = "!=";
        }
        setValue(ctx, "{" + exp1 + op + exp2 + "}");
    }

    @Override
    public void exitDcl(final DclContext ctx) {
        final String id = getValue(ctx.id1());
        final String tipo = getValue(ctx.tipo());
        String s = id.replaceAll(", ", ": " + tipo + ", ") + ": " + tipo;
        if (ctx.parent.getRuleIndex() == potigolParser.RULE_decl_tipo) {
            s = "" + s;
        }
        setValue(ctx, s);
    }

    @Override
    public void exitDcls(final DclsContext ctx) {
        final List<String> a = new ArrayList<String>();
        for (final DclContext dcl : ctx.dcl()) {
            a.add(getValue(dcl));
        }
        ids2String(ctx, a);
    }

    @Override
    public void exitDecl(final DeclContext ctx) {
        String s = "";
        for (final ParseTree i : ctx.children) {
            s += "\n" + getValue(i);
        }
        setValue(ctx, s);
    }

    @Override
    public void exitDecl_var_multipla(Decl_var_multiplaContext ctx) {
        final String id = getValue(ctx.id2());
        final String[] ids = id.split(", ");
        final String exp = getValue(ctx.expr2());
        final String[] exps = exp.split(", ");
        String s = "";
        for (int i = 0; i < ids.length; i++) {
            s += K.var + ids[i] + K.igual + exps[i] + "\n";
        }
        setValue(ctx, s);
    }

    @Override
    public void exitDecl_var_simples(final Decl_var_simplesContext ctx) {
        final String id = getValue(ctx.id1());
        final String exp = getValue(ctx.expr());
        setValue(ctx, K.var + id + K.igual + exp);
    }

    @Override
    public void exitDef_funcao(final Def_funcaoContext ctx) {
        final String id = getValue(ctx.ID());
        final String param = getValue(ctx.dcls());
        final String tipo = getOrElse(ctx.tipo(), "");
        final String corpo = getValue(ctx.expr());
        final String s = K.def + id + K.param(param) + K.tipo(tipo) + K.igual + K.bloco(corpo);
        setValue(ctx, s);
    }

    @Override
    public void exitDef_funcao_corpo(final Def_funcao_corpoContext ctx) {
        final String id = getValue(ctx.ID());
        final String param = getValue(ctx.dcls());
        final String tipo = getOrElse(ctx.tipo(), "");
        final String corpo = getValue(ctx.exprlist());
        final String s = K.def + id + K.param(param) + K.tipo(tipo) + K.igual + K.bloco(corpo) + "\n";
        setValue(ctx, s);
    }

    @Override
    public void exitE_logico(final E_logicoContext ctx) {
        final String exp1 = getValue(ctx.expr(0));
        final String exp2 = getValue(ctx.expr(1));
        final String s = K.exp(exp1 + K.and + exp2);
        setValue(ctx, s);
    }

    @Override
    public void exitEnquanto(final EnquantoContext ctx) {
        final String exp = getValue(ctx.expr());
        final String bloco = getValue(ctx.bloco());
        final String s = K.enquanto + K.exp(exp) + bloco;
        setValue(ctx, s);
    }

    @Override
    public void exitBloco(final BlocoContext ctx) {
        final String exp = getValue(ctx.exprlist());
        final String s = K.bloco(exp);
        setValue(ctx, s);
    }

    @Override
    public void exitEscreva(final EscrevaContext ctx) {
        final String exp = getValue(ctx.expr());
        final String s = K.escreva(exp);
        setValue(ctx, s);
    }

    @Override
    public void exitEveryRule(final ParserRuleContext ctx) {
        if (getValue(ctx) == null)
            setValue(ctx, getValue(ctx.getChild(0)));
    }

    @Override
    public void exitExpr1(final Expr1Context ctx) {
        final List<String> a = new ArrayList<String>();
        for (final ExprContext exp : ctx.expr()) {
            a.add(getValue(exp));
        }
        ids2String(ctx, a);
    }

    @Override
    public void exitExpr2(final Expr2Context ctx) {
        final List<String> a = new ArrayList<String>();
        for (final ExprContext exp : ctx.expr()) {
            a.add(getValue(exp));
        }
        ids2String(ctx, a);
        if (ctx.getParent().getRuleIndex() == potigolParser.RULE_expr)
            setValue(ctx,
                    // "Tupla"+ctx.expr().size()+"("+
                    getValue(ctx)
            // +")"
            );
    }

    @Override
    public void exitExprlist(final ExprlistContext ctx) {
        String s = "\n";
        for (final InstContext i : ctx.inst()) {
            s += "  " + getValue(i) + "\n";
        }
        setValue(ctx, s);
        declaracoes.pop();
    }

    @Override
    public void exitFaixa(final FaixaContext ctx) {
        final String s;
        final String id = getValue(ctx.ID());
        final String inicio = getValue(ctx.expr(0));
        final String fim = getValue(ctx.expr(1));
        final String passo = getValue(ctx.expr(2));
        final int tamanho = ctx.expr().size();
        if (tamanho == 1)
            s = inicio;
        else if (tamanho == 2)
            s = inicio + " to " + fim;
        else
            s = inicio + " to " + fim + " by " + passo;
        setValue(ctx, id + " <- " + s);
    }

    @Override
    public void exitFaixas(final FaixasContext ctx) {
        final StringBuilder s = new StringBuilder("");
        for (final FaixaContext f : ctx.faixa()) {
            String faixa = getValue(f);
            if (f != ctx.faixa(0))
                s.append(K.semi);
            s.append(faixa);
        }
        setValue(ctx, s.toString());
    }

    @Override
    public void exitId(final IdContext ctx) {
        setValue(ctx, escapeID(ctx.getText()));
    }

    @Override
    public void exitId1(final Id1Context ctx) {
        final List<String> a = new ArrayList<String>();
        for (final TerminalNode id : ctx.ID()) {
            a.add(getValue(id));
        }
        ids2String(ctx, a);
    }

    @Override
    public void exitId2(final Id2Context ctx) {
        final List<String> a = new ArrayList<String>();
        for (final TerminalNode id : ctx.ID()) {
            a.add(getValue(id));
        }
        ids2String(ctx, a);
    }

    @Override
    public void exitImprima(final ImprimaContext ctx) {
        final String exp = getValue(ctx.expr());
        setValue(ctx, "imprima(" + exp + ")");
    }

    @Override
    public void exitInst(final InstContext ctx) {
        final StringBuilder s = new StringBuilder("");
        // String codigo = ctx.start.getText();
        final int codigo = ctx.getStart().getLine();// ctx.getSourceInterval().a
                                                    // +
        // " .. " +
        // ctx.getSourceInterval().b;
        for (final ParseTree i : ctx.children) {
            s.append("/*Codigo: ").append(codigo).append(" */\n").append(getValue(i)).append("\n");
        }
        setValue(ctx, s.toString());
    }

    @Override
    public void exitInteiro(final InteiroContext ctx) {
        setValue(ctx, ctx.getText());
    }

    @Override
    public void exitLista(final ListaContext ctx) {
        final String exp = getValue(ctx.expr1());
        setValue(ctx, K.lista(exp));
    }

    @Override
    public void exitMais_menos_unario(final Mais_menos_unarioContext ctx) {
        final String exp1 = getValue(ctx.expr());
        final String op = ctx.getChild(0).getText();
        setValue(ctx, op + exp1);
    }

    @Override
    public void exitMult_div(final Mult_divContext ctx) {
        String exp1 = getValue(ctx.expr(0));
        final String exp2 = getValue(ctx.expr(1));
        String op = ctx.getChild(1).getText();
        if ("mod".equals(op))
            op = "%";
        if ("/".equals(op))
            exp1 = K.exp(exp1) + ".toDouble";
        if ("div".equals(op)) {
            op = "/";
        }
        setValue(ctx, "{" + exp1 + " " + op + " " + exp2 + "}");
    }

    @Override
    public void exitNao_logico(final Nao_logicoContext ctx) {
        final String exp = getValue(ctx.expr());
        setValue(ctx, "{!" + exp + "}");
    }

    @Override
    public void exitOu_logico(final Ou_logicoContext ctx) {
        final String exp1 = getValue(ctx.expr(0));
        final String exp2 = getValue(ctx.expr(1));
        final String s = K.exp(exp1 + K.or + exp2);
        setValue(ctx, s);
    }

    @Override
    public void exitPara_faca(final Para_facaContext ctx) {
        final String faixas = getValue(ctx.faixas());
        final String se = getOrElse(ctx.expr(), "");
        final String bloco = getValue(ctx.bloco());
        final String s = "for{" + faixas + K.guarda(se) + "} " + bloco;
        setValue(ctx, s);
    }

    @Override
    public void exitPara_gere(final Para_gereContext ctx) {
        final String faixas = getValue(ctx.faixas());
        final String se = getOrElse(ctx.expr(), "");
        final String gere = getValue(ctx.exprlist());
        final String s = "Lista((for{" + faixas + K.guarda(se) + "} yield " + K.bloco(gere) + ").toList)";
        setValue(ctx, s);
    }

    @Override
    public void exitParen(final ParenContext ctx) {
        final String exp = getValue(ctx.expr());
        final String s = K.exp(exp);
        setValue(ctx, s);
    }

    @Override
    public void exitProg(final ProgContext ctx) {
        if (!warnings.isEmpty()) {
            saida += "escreva(\"===[ATENCAO]===\")\n";
            saida += "escreva(\"" + warnings.get(0) + "\")";
        }
        for (InstContext i : ctx.inst()) {
            saida += getValue(i);
        }
        saida += "\n()\n";
        setValue(ctx, saida);
        declaracoes.pop();
    }

    @Override
    public void exitReal(final RealContext ctx) {
        setValue(ctx, ctx.getText());
    }

    @Override
    public void exitSe(final SeContext ctx) {
        String s = "1 match {\n";
        final String cond = getValue(ctx.expr());
        final String entao = getValue(ctx.entao());
        final String senao = getOrElse(ctx.senao(), "");
        s += K.se + cond + K.entao + entao + "\n";
        for (SenaoseContext c : ctx.senaose()) {
            s += getValue(c) + "\n";
        }
        s += K.senao + senao + "\n}";
        setValue(ctx, s);
    }

    @Override
    public void exitEntao(final EntaoContext ctx) {
        setValue(ctx, getValue(ctx.exprlist()));
    }

    @Override
    public void exitSenao(final SenaoContext ctx) {
        setValue(ctx, getValue(ctx.exprlist()));
    }

    @Override
    public void exitSenaose(final SenaoseContext ctx) {
        final String cond = getValue(ctx.expr());
        final String entao = getValue(ctx.entao());
        final String s = K.se + cond + K.entao + entao + "\n";
        setValue(ctx, s);
    }

    @Override
    public void exitSoma_sub(final Soma_subContext ctx) {
        final String exp1 = getValue(ctx.expr(0));
        final String exp2 = getValue(ctx.expr(1));
        final String op = ctx.getChild(1).getText();
        setValue(ctx, "{" + exp1 + op + exp2 + "}");
    }

    @Override
    public void exitTexto(final TextoContext ctx) {
        String s = ctx.getText();
        if (s.contains("{"))
            s = s.replace("$", "$$");
        s = s.replace("{", "${");
        if (s.contains("\n")) {
            s = "\"\"" + s + "\"\".stripMargin('|')";
        }
        if (s.contains("{")) {
            s = "s" + s;
        }
        setValue(ctx, s);
    }

    @Override
    public void exitTexto_interpolacao(final Texto_interpolacaoContext ctx) {
        String s = ctx.BS().getText().replace("{", "${");
        s = s + getValue(ctx.expr(0));
        int i = 1;
        for (TerminalNode x : ctx.MS()) {
            s = s + x.getText().replace("{", "${");
            s = s + getValue(ctx.expr(i));
            i++;
        }
        s = s + ctx.ES().getText();
        if (s.contains("\n")) {
            s = "\"\"" + s + "\"\".stripMargin('|')";
        }
        s = "s" + s;
        setValue(ctx, s);

    }

    @Override
    public void exitDecl_uso(final Decl_usoContext ctx) {
        final String s = "import " + stripString(getValue(ctx.STRING())) + "._";
        setValue(ctx, s);
    }

    @Override
    public void exitTupla(final TuplaContext ctx) {
        final String exp = getValue(ctx.expr2());
        setValue(ctx, "Tupla" + ctx.expr2().expr().size() + "(" + exp + ")");
    }

    @Override
    public void exitValor_multiplo(final Valor_multiploContext ctx) {
        final String id = getValue(ctx.id2());
        final String[] ids = id.split(", ");
        final String exp = getValue(ctx.expr2());
        final String[] exps = exp.split(", ");
        String s = "";

        for (int i = 0; i < ids.length; i++) {
            s += K.val + ids[i] + K.igual + exps[i] + K.semi;
        }
        setValue(ctx, s);

        for (String i : ids) {
            if (valores().contains(i)) {
                warnings.add("Valor " + i + " declarado duas vezes.");
            }
        }
        declaracoes.peek().addAll(Arrays.asList(ids));
    }

    private List<String> valores() {
        final List<String> a = new ArrayList<String>();
        for (List<String> s : declaracoes) {
            a.addAll(s);
        }
        return a;
    }

    @Override
    public void exitValor_simples(final Valor_simplesContext ctx) {
        final String id = getValue(ctx.id1());
        final String exp = getValue(ctx.expr());
        final List<String> ids = Arrays.asList(id.split(","));
        for (String i : ids) {
            if (valores().contains(i)) {
                warnings.add("Valor " + i + " declarado duas vezes.");
            }
        }
        declaracoes.peek().addAll(ids);
        setValue(ctx, K.val + id + K.igual + exp + K.semi);
    }

    @Override
    public void exitBooleano(final BooleanoContext ctx) {
        final String valor;
        if (ctx.BOOLEANO().getText().equals("verdadeiro"))
            valor = Boolean.TRUE.toString();
        else
            valor = Boolean.FALSE.toString();
        setValue(ctx, valor);
    }

    private void ids2String(final RuleContext ctx, List<String> a) {
        String s = "";
        if (a.size() > 0) {
            s = a.get(0);
        }
        for (int i = 1; i < a.size(); i++) {
            s += ", " + a.get(i);
        }
        setValue(ctx, s);
    }

    @Override
    public void visitTerminal(final TerminalNode node) {
        final String s;
        switch (node.getSymbol().getType()) {
            case potigolLexer.ID:
                s = escapeID(node.getText());
                break;
            default:
                s = node.getText();
                break;
        }
        setValue(node, s);
    }

    public String getSaida() {
        return saida.replaceAll("\n\n", "\n").replaceAll("\n\n", "\n");
    }

}
