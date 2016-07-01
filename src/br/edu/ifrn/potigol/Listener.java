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

    private static List<String> scalawords = Arrays.asList("type", "yield",
            "lazy", "override", "def", "with", "val", "var", "false", "true",
            "sealed", "abstract", "private", "trait", "object", "null", "if",
            "for", "while", "throw", "finally", "protected", "extends",
            "import", "final", "return", "else", "break", "new", "catch",
            "super", "class", "case", "package", "default", "try", "this",
            "match", "continue", "throws");

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

        private static String bloco(final String corpo) {
            return "{\n" + corpo + "\n}";
        }

        private static String generico(final String s) {
            return "[" + s + "]";
        }

        private static String exp(final String s) {
            return "(" + s + ")";
        }

        private static String param(final String s) {
            return "(" + s + ")";
        }

        private static String formato(final String s, final String fmt) {
            return exp(s) + ".format" + param(fmt);
        }

        private static String escreva(final String s) {
            return "escreva(" + s + ")";
        }

        private static String lista(final String exp) {
            return "Lista(List(" + exp + "))";
        }

        private static String guarda(final String cond) {
            if (!cond.isEmpty()) {
                return " if " + cond;
            }
            return " ";
        }

        private static String tipo(final String s) {
            if (s.isEmpty()) {
                return "";
            } else {
                return ": " + s;
            }
        }
    }

    private String nextVar() {
        this.num++;
        return "$a" + this.num;
    }

    private void setValue(final ParseTree node, final String value) {
        this.values.put(node, value);
    }

    private String getValue(final ParseTree node) {
        return this.values.get(node);
    }

    private String getOrElse(final ParseTree node, final String s) {
        final String value = this.getValue(node);
        if (value == null) {
            return s;
        }
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
        this.setValue(ctx, s);
    }

    @Override
    public void exitGet_vetor(final Get_vetorContext ctx) {
        final String id = this.getValue(ctx.expr(0));
        final String indice = this.getValue(ctx.expr(1));
        final String s = id + ".get(" + indice + ")";
        this.setValue(ctx, s);
    }

    @Override
    public void exitDcl1(final Dcl1Context ctx) {
        final ParseTree p;
        if (ctx.ID() != null) {
            p = ctx.ID();
        } else if (ctx.expr2() != null) {
            p = ctx.expr2();
        } else {
            p = ctx.dcls();
        }
        this.setValue(ctx, this.getValue(p));
    }

    @Override
    public void exitSet_vetor(final Set_vetorContext ctx) {
        final String id = ctx.ID().getText();
        final int dim = ctx.expr().size() - 1;
        final String[] indices = new String[dim];
        for (int i = 0; i < dim; i++)
            indices[i] = this.getValue(ctx.expr(i));
        final String exp = this.getValue(ctx.expr(dim));
        final StringBuilder s = new StringBuilder(id);
        for (final String ind : indices)
            s.append(K.param(ind + " -1"));
        s.append(K.igual).append(exp);
        this.setValue(ctx, s.toString());
    }

    @Override
    public void exitLambda(final LambdaContext ctx) {
        final String param = this.getValue(ctx.dcl1());
        final String corpo = this.getValue(ctx.inst());
        final String s = " (" + param + ")" + K.arrow + K.bloco(corpo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTipo_generico(final Tipo_genericoContext ctx) {
        final String id = this.getValue(ctx.ID());
        final String tipo = this.getValue(ctx.tipo());
        final String s = id + K.generico(tipo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTipo_funcao(final Tipo_funcaoContext ctx) {
        final String esq = this.getValue(ctx.tipo(0));
        final String dir = this.getValue(ctx.tipo(1));
        final String s = K.exp(esq + K.arrow + dir);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTipo2(final Tipo2Context ctx) {
        String s = "";
        for (final TipoContext tipo : ctx.tipo()) {
            s += ", " + this.getValue(tipo);
        }
        s = s.replaceFirst(", ", " ");
        this.setValue(ctx, s);
    }

    @Override
    public void exitTipo_tupla(final Tipo_tuplaContext ctx) {
        final int tamanho = ctx.tipo2().tipo().size();
        final String tipo = this.getValue(ctx.tipo2());
        final String s = "Tupla" + tamanho + K.generico(tipo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitCons(final ConsContext ctx) {
        final String a = this.getValue(ctx.expr(0));
        final String as = this.getValue(ctx.expr(1));
        final String s;
        if (ctx.getParent().getRuleIndex() == potigolParser.RULE_caso) {
            s = "Lista(collection.immutable.::( " + a + ", a$" + as + "$))";
        } else {
            s = K.bloco(a + "::" + as);
        }
        this.setValue(ctx, s);
    }

    @Override
    public void exitExpoente(final ExpoenteContext ctx) {
        final String base = this.getValue(ctx.expr(0));
        final String exp = this.getValue(ctx.expr(1));
        final String s = K.exp("Math.pow(" + base + ", " + exp + ")");
        this.setValue(ctx, s);
    }

    @Override
    public void exitCaso(final CasoContext ctx) {
        final String exp = this.getValue(ctx.expr(0));
        final String cond = getOrElse(ctx.expr(1), "");
        String exps = this.getValue(ctx.exprlist());
        int p = exp.indexOf("a$", 0);
        if (p >= 0) {
            String s = exp.substring(p + 2);
            p = s.indexOf('$', 0);
            s = s.substring(0, p);
            // String s = exp.split("if")[0].split("::")[1].replaceAll(" ",
            // "").substring(2);
            exps = K.val + s + K.igual + "Lista(a$" + s + "$);\n"
                    + exps.substring(1);
        }
        String s = "case " + exp + K.guarda(cond) + K.arrow + exps;
        this.setValue(ctx, s);
    }

    @Override
    public void exitEscolha(final EscolhaContext ctx) {
        final String exp = this.getValue(ctx.expr());
        String corpo = "";
        for (final CasoContext caso : ctx.caso()) {
            corpo += "  " + this.getValue(caso) + "\n";
        }
        final String s = K.exp(exp) + " match " + K.bloco(corpo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitFormato(final FormatoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String fmt = this.getValue(ctx.expr(1));
        final String s = K.formato(exp1, fmt);
        this.setValue(ctx, s);
    }

    @Override
    public void exitAlias(final AliasContext ctx) {
        final String id = ctx.ID().getText();
        final String tipo = this.getValue(ctx.tipo());
        final String s = K.type + escapeID(id) + K.igual + tipo;
        this.setValue(ctx, s);
    }

    @Override
    public void exitClasse(final ClasseContext ctx) {
        final String id = ctx.ID().getText();
        String s = "case class " + escapeID(id) + "(";
        for (int i = 2; i < ctx.children.size() - 1; i++) {
            ParseTree d = ctx.children.get(i);
            s += "  " + this.getValue(d);
            if (i < ctx.children.size() - 2) {
                s += ",";
            }
        }
        s += ")";
        this.setValue(ctx, s);
    }

    @Override
    public void enterProg(final ProgContext ctx) {
        saida += "import br.edu.ifrn.potigol.Potigolutil._\n";
        saida += "import br.edu.ifrn.potigol.Matematica._\n";
        this.declaracoes.push(new ArrayList<String>());
    }

    @Override
    public void enterExprlist(final ExprlistContext ctx) {
        this.declaracoes.push(new ArrayList<String>());
    }

    @Override
    public void exitAtrib_multipla(final Atrib_multiplaContext ctx) {
        final String id = this.getValue(ctx.id2());
        final String[] ids = id.split(", ");
        final String exp = this.getValue(ctx.expr2());
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
        this.setValue(ctx, s);
    }

    @Override
    public void exitAtrib_simples(final Atrib_simplesContext ctx) {
        final String id1 = this.getValue(ctx.id1());
        final String[] ids = id1.split(", ");
        final String exp = this.getValue(ctx.expr());
        final String var = nextVar();
        String s = K.def + var + K.igual + exp + K.semi;
        for (final String id : ids) {
            s += id + K.igual + var + K.semi;
        }
        this.setValue(ctx, s);
    }

    @Override
    public void exitChamada_funcao(final Chamada_funcaoContext ctx) {
        final String nome = this.getValue(ctx.expr());
        final String param = this.getValue(ctx.expr1());
        final String s = nome + K.param(param);
        this.setValue(ctx, s);
    }

    @Override
    public void exitChamada_metodo(final Chamada_metodoContext ctx) {
        final String objeto = this.getValue(ctx.expr());
        final String metodo = this.getValue(ctx.ID());
        final String param = getOrElse(ctx.expr1(), "");
        final String s = objeto + "." + metodo + K.param(param);
        this.setValue(ctx, s);
    }

    @Override
    public void exitComparacao(final ComparacaoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        String op = ctx.getChild(1).getText();
        if ("<>".equals(op)) {
            op = "!=";
        }
        this.setValue(ctx, "{" + exp1 + op + exp2 + "}");
    }

    @Override
    public void exitDcl(final DclContext ctx) {
        final String id = this.getValue(ctx.id1());
        final String tipo = this.getValue(ctx.tipo());
        String s = id.replaceAll(", ", ": " + tipo + ", ") + ": " + tipo;
        if (ctx.parent.getRuleIndex() == potigolParser.RULE_decl_tipo) {
            s = "" + s;
        }
        this.setValue(ctx, s);
    }

    @Override
    public void exitDcls(final DclsContext ctx) {
        final List<String> a = new ArrayList<String>();
        for (final DclContext dcl : ctx.dcl()) {
            a.add(this.getValue(dcl));
        }
        ids2String(ctx, a);
    }

    @Override
    public void exitDecl(final DeclContext ctx) {
        String s = "";
        for (final ParseTree i : ctx.children) {
            s += "\n" + this.getValue(i);
        }
        this.setValue(ctx, s);
    }

    @Override
    public void exitDecl_var_multipla(Decl_var_multiplaContext ctx) {
        final String id = this.getValue(ctx.id2());
        final String[] ids = id.split(", ");
        final String exp = this.getValue(ctx.expr2());
        final String[] exps = exp.split(", ");
        String s = "";
        for (int i = 0; i < ids.length; i++) {
            s += K.var + ids[i] + K.igual + exps[i] + "\n";
        }
        this.setValue(ctx, s);
    }

    @Override
    public void exitDecl_var_simples(final Decl_var_simplesContext ctx) {
        final String id = this.getValue(ctx.id1());
        final String exp = this.getValue(ctx.expr());
        this.setValue(ctx, K.var + id + K.igual + exp);
    }

    @Override
    public void exitDef_funcao(final Def_funcaoContext ctx) {
        final String id = this.getValue(ctx.ID());
        final String param = this.getValue(ctx.dcls());
        final String tipo = getOrElse(ctx.tipo(), "");
        final String corpo = this.getValue(ctx.expr());
        final String s = K.def + id + K.param(param) + K.tipo(tipo) + K.igual
                + K.bloco(corpo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitDef_funcao_corpo(final Def_funcao_corpoContext ctx) {
        final String id = this.getValue(ctx.ID());
        final String param = this.getValue(ctx.dcls());
        final String tipo = getOrElse(ctx.tipo(), "");
        final String corpo = this.getValue(ctx.exprlist());
        final String s = K.def + id + K.param(param) + K.tipo(tipo) + K.igual
                + K.bloco(corpo) + "\n";
        this.setValue(ctx, s);
    }

    @Override
    public void exitE_logico(final E_logicoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        final String s = K.exp(exp1 + K.and + exp2);
        this.setValue(ctx, s);
    }

    @Override
    public void exitEnquanto(final EnquantoContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String bloco = this.getValue(ctx.bloco());
        final String s = K.enquanto + K.exp(exp) + bloco;
        this.setValue(ctx, s);
    }

    @Override
    public void exitBloco(final BlocoContext ctx) {
        final String exp = this.getValue(ctx.exprlist());
        final String s = K.bloco(exp);
        this.setValue(ctx, s);
    }

    @Override
    public void exitEscreva(final EscrevaContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String s = K.escreva(exp);
        this.setValue(ctx, s);
    }

    @Override
    public void exitEveryRule(final ParserRuleContext ctx) {
        if (this.getValue(ctx) == null) {
            this.setValue(ctx, this.getValue(ctx.getChild(0)));
        }
    }

    @Override
    public void exitExpr1(final Expr1Context ctx) {
        final List<String> a = new ArrayList<String>();
        for (final ExprContext exp : ctx.expr()) {
            a.add(this.getValue(exp));
        }
        ids2String(ctx, a);
    }

    @Override
    public void exitExpr2(final Expr2Context ctx) {
        final List<String> a = new ArrayList<String>();
        for (final ExprContext exp : ctx.expr()) {
            a.add(this.getValue(exp));
        }
        ids2String(ctx, a);
        if (ctx.getParent().getRuleIndex() == potigolParser.RULE_expr) {
            this.setValue(ctx,
                    // "Tupla"+ctx.expr().size()+"("+
                    this.getValue(ctx)
            // +")"
            );
        }
    }

    @Override
    public void exitExprlist(final ExprlistContext ctx) {
        String s = "\n";
        for (final InstContext i : ctx.inst()) {
            s += "  " + this.getValue(i) + "\n";
        }
        this.setValue(ctx, s);
        this.declaracoes.pop();
    }

    @Override
    public void exitFaixa(final FaixaContext ctx) {
        final String s;
        final String id = this.getValue(ctx.ID());
        final String inicio = this.getValue(ctx.expr(0));
        final String fim = this.getValue(ctx.expr(1));
        final String passo = this.getValue(ctx.expr(2));
        final int tamanho = ctx.expr().size();
        if (tamanho == 1) {
            s = inicio;
        } else if (tamanho == 2) {
            s = inicio + " to " + fim;
        } else {
            s = inicio + " to " + fim + " by " + passo;
        }
        this.setValue(ctx, id + " <- " + s);
    }

    @Override
    public void exitFaixas(final FaixasContext ctx) {
        final StringBuilder s = new StringBuilder("");
        for (final FaixaContext f : ctx.faixa()) {
            String faixa = this.getValue(f);
            if (f != ctx.faixa(0)) {
                s.append(K.semi);
            }
            s.append(faixa);
        }
        this.setValue(ctx, s.toString());
    }

    @Override
    public void exitId(final IdContext ctx) {
        this.setValue(ctx, escapeID(ctx.getText()));
    }

    @Override
    public void exitId1(final Id1Context ctx) {
        final List<String> a = new ArrayList<String>();
        for (final TerminalNode id : ctx.ID()) {
            a.add(this.getValue(id));
        }
        ids2String(ctx, a);
    }

    @Override
    public void exitId2(final Id2Context ctx) {
        final List<String> a = new ArrayList<String>();
        for (final TerminalNode id : ctx.ID()) {
            a.add(this.getValue(id));
        }
        ids2String(ctx, a);
    }

    @Override
    public void exitImprima(final ImprimaContext ctx) {
        final String exp = this.getValue(ctx.expr());
        this.setValue(ctx, "imprima(" + exp + ")");
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
            s.append("/*Codigo: ").append(codigo).append(" */\n")
                    .append(this.getValue(i)).append("\n");
        }
        this.setValue(ctx, s.toString());
    }

    @Override
    public void exitInteiro(final InteiroContext ctx) {
        this.setValue(ctx, ctx.getText());
    }

    @Override
    public void exitLista(final ListaContext ctx) {
        final String exp = this.getValue(ctx.expr1());
        this.setValue(ctx, K.lista(exp));
    }

    @Override
    public void exitMais_menos_unario(final Mais_menos_unarioContext ctx) {
        final String exp1 = this.getValue(ctx.expr());
        final String op = ctx.getChild(0).getText();
        this.setValue(ctx, op + exp1);
    }

    @Override
    public void exitMult_div(final Mult_divContext ctx) {
        String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        String op = ctx.getChild(1).getText();
        if ("mod".equals(op)) {
            op = "%";
        }
        if ("/".equals(op)) {
            exp1 = K.exp(exp1) + ".toDouble";
        }
        if ("div".equals(op)) {
            op = "/";
        }
        this.setValue(ctx, "{" + exp1 + " " + op + " " + exp2 + "}");
    }

    @Override
    public void exitNao_logico(final Nao_logicoContext ctx) {
        final String exp = this.getValue(ctx.expr());
        this.setValue(ctx, "{!" + exp + "}");
    }

    @Override
    public void exitOu_logico(final Ou_logicoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        final String s = K.exp(exp1 + K.or + exp2);
        this.setValue(ctx, s);
    }

    @Override
    public void exitPara_faca(final Para_facaContext ctx) {
        final String faixas = this.getValue(ctx.faixas());
        final String se = getOrElse(ctx.expr(), "");
        final String bloco = this.getValue(ctx.bloco());
        final String s = "for{" + faixas + K.guarda(se) + "} " + bloco;
        this.setValue(ctx, s);
    }

    @Override
    public void exitPara_gere(final Para_gereContext ctx) {
        final String faixas = this.getValue(ctx.faixas());
        final String se = getOrElse(ctx.expr(), "");
        final String gere = this.getValue(ctx.exprlist());
        final String s = "Lista((for{" + faixas + K.guarda(se) + "} yield "
                + K.bloco(gere) + ").toList)";
        this.setValue(ctx, s);
    }

    @Override
    public void exitParen(final ParenContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String s = K.exp(exp);
        this.setValue(ctx, s);
    }

    @Override
    public void exitProg(final ProgContext ctx) {
        if (!this.warnings.isEmpty()) {
            saida += "escreva(\"===[ATENCAO]===\")\n";
            saida += "escreva(\"" + this.warnings.get(0) + "\")";
        }
        for (final InstContext i : ctx.inst()) {
            saida += this.getValue(i);
        }
        saida += "\n()\n";
        this.setValue(ctx, saida);
        this.declaracoes.pop();
    }

    @Override
    public void exitReal(final RealContext ctx) {
        this.setValue(ctx, ctx.getText());
    }

    @Override
    public void exitSe(final SeContext ctx) {
        String s = "1 match {\n";
        final String cond = this.getValue(ctx.expr());
        final String entao = this.getValue(ctx.entao());
        final String senao = getOrElse(ctx.senao(), "");
        s += K.se + cond + K.entao + entao + "\n";
        for (final SenaoseContext c : ctx.senaose()) {
            s += this.getValue(c) + "\n";
        }
        s += K.senao + senao + "\n}";
        this.setValue(ctx, s);
    }

    @Override
    public void exitEntao(final EntaoContext ctx) {
        this.setValue(ctx, this.getValue(ctx.exprlist()));
    }

    @Override
    public void exitSenao(final SenaoContext ctx) {
        this.setValue(ctx, this.getValue(ctx.exprlist()));
    }

    @Override
    public void exitSenaose(final SenaoseContext ctx) {
        final String cond = this.getValue(ctx.expr());
        final String entao = this.getValue(ctx.entao());
        final String s = K.se + cond + K.entao + entao + "\n";
        this.setValue(ctx, s);
    }

    @Override
    public void exitSoma_sub(final Soma_subContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        final String op = ctx.getChild(1).getText();
        this.setValue(ctx, "{" + exp1 + op + exp2 + "}");
    }

    @Override
    public void exitTexto(final TextoContext ctx) {
        String s = ctx.getText();
        if (s.contains("{")) {
            s = s.replace("$", "$$");
        }
        s = s.replace("{", "${");
        if (s.contains("\n")) {
            s = "\"\"" + s + "\"\".stripMargin('|')";
        }
        if (s.contains("{")) {
            s = "s" + s;
        }
        this.setValue(ctx, s);
    }

    @Override
    public void exitTexto_interpolacao(final Texto_interpolacaoContext ctx) {
        String s = ctx.BS().getText().replace("{", "${");
        s = s + this.getValue(ctx.expr(0));
        int i = 1;
        for (final TerminalNode x : ctx.MS()) {
            s = s + x.getText().replace("{", "${");
            s = s + this.getValue(ctx.expr(i));
            i++;
        }
        s = s + ctx.ES().getText();
        if (s.contains("\n")) {
            s = "\"\"" + s + "\"\".stripMargin('|')";
        }
        s = "s" + s;
        this.setValue(ctx, s);

    }

    @Override
    public void exitDecl_uso(final Decl_usoContext ctx) {
        final String s = "import " + stripString(this.getValue(ctx.STRING())) + "._";
        this.setValue(ctx, s);
    }

    @Override
    public void exitTupla(final TuplaContext ctx) {
        final String exp = this.getValue(ctx.expr2());
        this.setValue(ctx, "Tupla" + ctx.expr2().expr().size() + "(" + exp + ")");
    }

    @Override
    public void exitValor_multiplo(final Valor_multiploContext ctx) {
        final String id = this.getValue(ctx.id2());
        final String[] ids = id.split(", ");
        final String exp = this.getValue(ctx.expr2());
        final String[] exps = exp.split(", ");
        String s = "";

        for (int i = 0; i < ids.length; i++) {
            s += K.val + ids[i] + K.igual + exps[i] + K.semi;
        }
        this.setValue(ctx, s);

        for (final String i : ids) {
            if (valores().contains(i)) {
                this.warnings.add("Valor " + i + " declarado duas vezes.");
            }
        }
        declaracoes.peek().addAll(Arrays.asList(ids));
    }

    private List<String> valores() {
        final List<String> a = new ArrayList<String>();
        for (final List<String> s : this.declaracoes) {
            a.addAll(s);
        }
        return a;
    }

    @Override
    public void exitValor_simples(final Valor_simplesContext ctx) {
        final String id = this.getValue(ctx.id1());
        final String exp = this.getValue(ctx.expr());
        final List<String> ids = Arrays.asList(id.split(","));
        for (final String i : ids) {
            if (valores().contains(i)) {
                this.warnings.add("Valor " + i + " declarado duas vezes.");
            }
        }
        this.declaracoes.peek().addAll(ids);
        this.setValue(ctx, K.val + id + K.igual + exp + K.semi);
    }

    @Override
    public void exitBooleano(final BooleanoContext ctx) {
        final String valor;
        if (ctx.BOOLEANO().getText().equals("verdadeiro")) {
            valor = Boolean.TRUE.toString();
        } else {
            valor = Boolean.FALSE.toString();
        }
        this.setValue(ctx, valor);
    }

    private void ids2String(final RuleContext ctx, List<String> a) {
        String s = "";
        if (a.size() > 0) {
            s = a.get(0);
        }
        for (int i = 1; i < a.size(); i++) {
            s += ", " + a.get(i);
        }
        this.setValue(ctx, s);
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
        this.setValue(node, s);
    }

    public String getSaida() {
        return saida.replaceAll("\n\n", "\n").replaceAll("\n\n", "\n");
    }

}
