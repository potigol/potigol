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
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
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
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_funcaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_genericoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_tuplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.TuplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.Valor_multiploContext;
import br.edu.ifrn.potigol.parser.potigolParser.Valor_simplesContext;

public class Listener extends potigolBaseListener {

    private final ParseTreeProperty<String> values = new ParseTreeProperty<String>();

    private final Stack<List<String>> declaracoes = new Stack<List<String>>();

    private final List<String> warnings = new ArrayList<String>();

    private String saida = "";

    private void setValue(final ParseTree node, final String value) {
        this.values.put(node, value);
    }

    private String getValue(final ParseTree node) {
        return this.values.get(node);
    }

    private List<String> getValues(final List<? extends ParseTree> list) {
        final List<String> a = new ArrayList<String>();
        for (final ParseTree id : list) {
            a.add(this.getValue(id));
        }
        return a;
    }

    private String getOrElse(final ParseTree node, final String s) {
        final String value = this.getValue(node);
        if (value == null) {
            return s;
        }
        return value;
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
        final String s = M.getVetor(id, indice);
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
        s.append(K.IGUAL).append(exp);
        this.setValue(ctx, s.toString());
    }

    @Override
    public void exitLambda(final LambdaContext ctx) {
        final String param = this.getValue(ctx.dcl1());
        final String corpo = this.getValue(ctx.inst());
        final String s = M.lambda(param, corpo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTipo_generico(final Tipo_genericoContext ctx) {
        final String id = this.getValue(ctx.ID());
        final String tipo = this.getValue(ctx.tipo());
        final String s = M.tipoGenerico(id, tipo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTipo_funcao(final Tipo_funcaoContext ctx) {
        final String esq = this.getValue(ctx.tipo(0));
        final String dir = this.getValue(ctx.tipo(1));
        final String s = M.tipoFuncao(esq, dir);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTipo2(final Tipo2Context ctx) {
        final List<String> lista = this.getValues(ctx.tipo());
        String s = M.list2String(lista);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTipo_tupla(final Tipo_tuplaContext ctx) {
        final int tamanho = ctx.tipo2().tipo().size();
        final String tipo = this.getValue(ctx.tipo2());
        final String s = M.tipoTupla(tamanho, tipo);
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
        final String s = M.expoente(base, exp);
        this.setValue(ctx, s);
    }

    @Override
    public void exitCaso(final CasoContext ctx) {
        final String exp = this.getValue(ctx.expr(0));
        final String cond = this.getOrElse(ctx.expr(1), "");
        String exps = this.getValue(ctx.exprlist());
        int p = exp.indexOf("a$", 0);
        if (p >= 0) {
            String s = exp.substring(p + 2);
            p = s.indexOf('$', 0);
            s = s.substring(0, p);
            // String s = exp.split("if")[0].split("::")[1].replaceAll(" ",
            // "").substring(2);
            exps = K.VAL + s + K.IGUAL + "Lista(a$" + s + "$)" + K.SEMI
                    + exps.substring(1);
        }
        String s = "case " + exp + K.guarda(cond) + K.ARROW + exps;
        this.setValue(ctx, s);
    }

    @Override
    public void exitEscolha(final EscolhaContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final List<String> casos = new ArrayList<String>();
        for (final CasoContext caso : ctx.caso()) {
            casos.add(this.getValue(caso));
        }
        final String s = M.escolha(exp, casos);
        this.setValue(ctx, s);
    }

    @Override
    public void exitFormato(final FormatoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String fmt = this.getValue(ctx.expr(1));
        final String s = M.formato(exp1, fmt);
        this.setValue(ctx, s);
    }

    @Override
    public void exitAlias(final AliasContext ctx) {
        final String id = ctx.ID().getText();
        final String tipo = this.getValue(ctx.tipo());
        final String s = M.aliasTipo(id, tipo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitClasse(final ClasseContext ctx) {
        final String id = ctx.ID().getText();
        StringBuilder s = new StringBuilder();
        s.append("case class " + M.escapeID(id) + "(");
        for (int i = 2; i < ctx.children.size() - 1; i++) {
            ParseTree d = ctx.children.get(i);
            s.append("  " + this.getValue(d));
            if (i < ctx.children.size() - 2) {
                s.append(K.VIRGULA);
            }
        }
        s.append(")");
        this.setValue(ctx, s.toString());
    }

    @Override
    public void enterProg(final ProgContext ctx) {
        String pacote = "import br.edu.ifrn.potigol.";
        saida += pacote + "Potigolutil._" + K.NEWLINE;
        saida += pacote + "Matematica._" + K.NEWLINE;
        this.declaracoes.push(new ArrayList<String>());
    }

    @Override
    public void enterExprlist(final ExprlistContext ctx) {
        this.declaracoes.push(new ArrayList<String>());
    }

    @Override
    public void exitAtrib_multipla(final Atrib_multiplaContext ctx) {
        final List<String> ids = M.string2List(this.getValue(ctx.id2()));
        final List<String> exps = M.string2List(this.getValue(ctx.expr2()));
        final String s = M.atribMultipla(ids, exps);
        this.setValue(ctx, s);
    }

    @Override
    public void exitAtrib_simples(final Atrib_simplesContext ctx) {
        final List<String> ids = M.string2List(this.getValue(ctx.id1()));
        final String exp = this.getValue(ctx.expr());
        final String s = M.atribSimples(ids, exp);
        this.setValue(ctx, s);
    }

    @Override
    public void exitChamada_funcao(final Chamada_funcaoContext ctx) {
        final String nome = this.getValue(ctx.expr());
        final String param = this.getValue(ctx.expr1());
        final String s = M.chamadaFuncao(nome, param);
        this.setValue(ctx, s);
    }

    @Override
    public void exitChamada_metodo(final Chamada_metodoContext ctx) {
        final String objeto = this.getValue(ctx.expr());
        final String metodo = this.getValue(ctx.ID());
        final String param = this.getOrElse(ctx.expr1(), "");
        final String s = M.chamadaMetodo(objeto, metodo, param);
        this.setValue(ctx, s);
    }

    @Override
    public void exitComparacao(final ComparacaoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        String op = ctx.getChild(1).getText().replace("<>", "!=");
        final String s = M.operacaoBin(exp1, op, exp2);
        this.setValue(ctx, s);
    }

    @Override
    public void exitDcl(final DclContext ctx) {
        final String id = this.getValue(ctx.id1());
        final String tipo = this.getValue(ctx.tipo());
        String s = id.replaceAll(K.VIRGULA, ": " + tipo + K.VIRGULA) + ": "
                + tipo;
        if (ctx.parent.getRuleIndex() == potigolParser.RULE_decl_tipo) {
            s = "" + s;
        }
        this.setValue(ctx, s);
    }

    @Override
    public void exitDcls(final DclsContext ctx) {
        final List<String> a = this.getValues(ctx.dcl());
        this.setValue(ctx, M.list2String(a));
    }

    @Override
    public void exitDecl(final DeclContext ctx) {
        String s = "";
        for (final ParseTree i : ctx.children) {
            s += K.NEWLINE + this.getValue(i);
        }
        this.setValue(ctx, s);
    }

    @Override
    public void exitDecl_var_multipla(Decl_var_multiplaContext ctx) {
        final String id = this.getValue(ctx.id2());
        final String[] ids = id.split(K.VIRGULA);
        final String exp = this.getValue(ctx.expr2());
        final String[] exps = exp.split(K.VIRGULA);
        String s = "";
        for (int i = 0; i < ids.length; i++) {
            s += K.VAR + ids[i] + K.IGUAL + exps[i] + K.NEWLINE;
        }
        this.setValue(ctx, s);
    }

    @Override
    public void exitDecl_var_simples(final Decl_var_simplesContext ctx) {
        final String id = this.getValue(ctx.id1());
        final String exp = this.getValue(ctx.expr());
        final String s = M.declVariavel(id, exp);
        this.setValue(ctx, s);
    }

    @Override
    public void exitDef_funcao(final Def_funcaoContext ctx) {
        final String id = this.getValue(ctx.ID());
        final String param = this.getValue(ctx.dcls());
        final String tipo = this.getOrElse(ctx.tipo(), "");
        final String corpo = this.getValue(ctx.expr());
        final String s = M.DefFuncao(id, param, tipo, corpo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitDef_funcao_corpo(final Def_funcao_corpoContext ctx) {
        final String id = this.getValue(ctx.ID());
        final String param = this.getValue(ctx.dcls());
        final String tipo = this.getOrElse(ctx.tipo(), "");
        final String corpo = this.getValue(ctx.exprlist());
        final String s = M.DefFuncao(id, param, tipo, corpo);
        this.setValue(ctx, s);
    }

    @Override
    public void exitE_logico(final E_logicoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        final String s = M.operacaoBin(exp1, K.AND, exp2);
        this.setValue(ctx, s);
    }

    @Override
    public void exitEnquanto(final EnquantoContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String bloco = this.getValue(ctx.bloco());
        final String s = M.enquanto(exp, bloco);
        this.setValue(ctx, s);
    }

    @Override
    public void exitBloco(final BlocoContext ctx) {
        final String exp = this.getValue(ctx.exprlist());
        final String s = M.bloco(exp);
        this.setValue(ctx, s);
    }

    @Override
    public void exitEscreva(final EscrevaContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String s = M.escreva(exp, true);
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
        final List<String> a = this.getValues(ctx.expr());
        this.setValue(ctx, M.list2String(a));
    }

    @Override
    public void exitExpr2(final Expr2Context ctx) {
        final List<String> a = this.getValues(ctx.expr());
        this.setValue(ctx, M.list2String(a));
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
        String s = K.NEWLINE;
        for (final InstContext i : ctx.inst()) {
            s += "  " + this.getValue(i) + K.NEWLINE;
        }
        this.setValue(ctx, s);
        this.declaracoes.pop();
    }

    @Override
    public void exitFaixa(final FaixaContext ctx) {
        final String id = this.getValue(ctx.ID());
        final List<String> exps = this.getValues(ctx.expr());
        final String s = M.faixa(id, exps);
        this.setValue(ctx, s);
    }

    @Override
    public void exitFaixas(final FaixasContext ctx) {
        final StringBuilder s = new StringBuilder();
        for (final FaixaContext f : ctx.faixa()) {
            String faixa = this.getValue(f);
            if (f != ctx.faixa(0)) {
                s.append(K.SEMI);
            }
            s.append(faixa);
        }
        this.setValue(ctx, s.toString());
    }

    @Override
    public void exitId(final IdContext ctx) {
        this.setValue(ctx, M.escapeID(ctx.getText()));
    }

    @Override
    public void exitId1(final Id1Context ctx) {
        final List<String> a = this.getValues(ctx.ID());
        this.setValue(ctx, M.list2String(a));
    }

    @Override
    public void exitId2(final Id2Context ctx) {
        final List<String> a = this.getValues(ctx.ID());
        this.setValue(ctx, M.list2String(a));
    }

    @Override
    public void exitImprima(final ImprimaContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String s = M.escreva(exp, false);
        this.setValue(ctx, s);
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
            s.append("/*Codigo: ").append(codigo).append(" */").append(K.NEWLINE)
                    .append(this.getValue(i)).append(K.NEWLINE);
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
        final String s = M.lista(exp);
        this.setValue(ctx, s);
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
        } else if ("/".equals(op)) {
            exp1 = K.exp(exp1) + ".toDouble";
        } else if ("div".equals(op)) {
            op = "/";
        }
        final String s = M.operacaoBin(exp1, op, exp2);
        this.setValue(ctx, s);
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
        final String s = M.operacaoBin(exp1, K.OR, exp2);
        this.setValue(ctx, s);
    }

    @Override
    public void exitPara_faca(final Para_facaContext ctx) {
        final String faixas = this.getValue(ctx.faixas());
        final String guarda = this.getOrElse(ctx.expr(), "");
        final String bloco = this.getValue(ctx.bloco());
        final String s = M.paraFaca(faixas, guarda, bloco);
        this.setValue(ctx, s);
    }

    @Override
    public void exitPara_gere(final Para_gereContext ctx) {
        final String faixas = this.getValue(ctx.faixas());
        final String se = this.getOrElse(ctx.expr(), "");
        final String gere = this.getValue(ctx.exprlist());
        final String s = M.paraGere(faixas, se, gere);
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
            saida += "escreva(\"===[ATENCAO]===\")" + K.NEWLINE;
            saida += "escreva(\"" + this.warnings.get(0) + "\")";
        }
        for (final InstContext i : ctx.inst()) {
            saida += this.getValue(i);
        }
        saida += K.NEWLINE + "()" + K.NEWLINE;
        this.setValue(ctx, saida);
        this.declaracoes.pop();
    }

    @Override
    public void exitReal(final RealContext ctx) {
        this.setValue(ctx, ctx.getText());
    }

    @Override
    public void exitSe(final SeContext ctx) {
        final String cond = this.getValue(ctx.expr());
        final String entao = this.getValue(ctx.entao());
        final String senao = this.getOrElse(ctx.senao(), "");
        final List<String> senaose = new ArrayList<String>();
        for (final SenaoseContext c : ctx.senaose()) {
            senaose.add(this.getValue(c));
        }
        final String s = M.se(cond, entao, senaose, senao);
        this.setValue(ctx, s);
    }

    @Override
    public void exitEntao(final EntaoContext ctx) {
        final String s = this.getValue(ctx.exprlist());
        this.setValue(ctx, s);
    }

    @Override
    public void exitSenao(final SenaoContext ctx) {
        final String s = this.getValue(ctx.exprlist());
        this.setValue(ctx, s);
    }

    @Override
    public void exitSenaose(final SenaoseContext ctx) {
        final String cond = this.getValue(ctx.expr());
        final String entao = this.getValue(ctx.entao());
        final String s = M.senaoSe(cond, entao);
        this.setValue(ctx, s);
    }

    @Override
    public void exitSoma_sub(final Soma_subContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        final String op = ctx.getChild(1).getText();
        final String s = M.operacaoBin(exp1, op, exp2);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTexto(final TextoContext ctx) {
        final String texto = ctx.getText();
        String s = M.texto(texto);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTexto_interpolacao(final Texto_interpolacaoContext ctx) {
        StringBuilder s = new StringBuilder();
        s.append(ctx.BS().getText().replace("{", "${"));
        s.append(this.getValue(ctx.expr(0)));
        int i = 1;
        for (final TerminalNode x : ctx.MS()) {
            s.append(x.getText().replace("{", "${"));
            s.append(this.getValue(ctx.expr(i)));
            i++;
        }
        s.append(ctx.ES().getText());
        if (s.toString().contains("\n")) {
            s.insert(0, "\"\"").append("\"\".stripMargin('|')");
        }
        s.insert(0, "s");
        this.setValue(ctx, s.toString());
    }

    @Override
    public void exitDecl_uso(final Decl_usoContext ctx) {
        final String uso = this.getValue(ctx.STRING());
        final String s = M.uso(uso);
        this.setValue(ctx, s);
    }

    @Override
    public void exitTupla(final TuplaContext ctx) {
        final String exp = this.getValue(ctx.expr2());
        final int tamanho = ctx.expr2().expr().size();
        String s = M.tupla(tamanho, exp);
        this.setValue(ctx, s);
    }

    @Override
    public void exitValor_multiplo(final Valor_multiploContext ctx) {
        final List<String> ids = M.string2List(this.getValue(ctx.id2()));
        final List<String> exps = M.string2List(this.getValue(ctx.expr2()));
        final StringBuilder s = new StringBuilder();
        for (int i = 0; i < ids.size(); i++) {
            final String id = ids.get(i);
            final String exp = exps.get(i);
            s.append(M.declValor(id, exp));
        }
        this.setValue(ctx, s.toString());
        verificarDuplicados(ids);
    }

    @Override
    public void exitValor_simples(final Valor_simplesContext ctx) {
        final String id = this.getValue(ctx.id1());
        final String exp = this.getValue(ctx.expr());
        final List<String> ids = M.string2List(id);
        final String s = M.declValor(id, exp);
        this.setValue(ctx, s);
        verificarDuplicados(ids);
    }

    @Override
    public void exitBooleano(final BooleanoContext ctx) {
        final String bool = ctx.BOOLEANO().getText();
        final String s = M.booleano(bool);
        this.setValue(ctx, s);
    }

    @Override
    public void visitTerminal(final TerminalNode node) {
        final String s;
        switch (node.getSymbol().getType()) {
            case potigolLexer.ID:
                s = M.escapeID(node.getText());
                break;
            default:
                s = node.getText();
                break;
        }
        this.setValue(node, s);
    }

    public String getSaida() {
        return saida.replaceAll(K.NL2, K.NEWLINE).replaceAll(K.NL2, K.NEWLINE);
    }

    private void verificarDuplicados(final List<String> ids) {
        for (final String i : ids) {
            if (this.valores().contains(i)) {
                this.warnings.add("Valor " + i + " declarado duas vezes.");
            }
        }
        this.declaracoes.peek().addAll(ids);
    }

    private List<String> valores() {
        final List<String> a = new ArrayList<String>();
        for (final List<String> s : this.declaracoes) {
            a.addAll(s);
        }
        return a;
    }
}
