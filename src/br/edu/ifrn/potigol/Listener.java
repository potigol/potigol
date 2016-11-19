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
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_funcaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_genericoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_tuplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.TuplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.Valor_multiploContext;
import br.edu.ifrn.potigol.parser.potigolParser.Valor_simplesContext;

public class Listener extends potigolBaseListener {

    private final ParseTreeProperty<String> values = new ParseTreeProperty<>();

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
        final List<String> valores = new ArrayList<String>();
        for (final ParseTree id : list) {
            valores.add(this.getValue(id));
        }
        return valores;
    }

    private String getOrElse(final ParseTree node, final String defaultValue) {
        String value = this.getValue(node);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    private String getOrElse(final ParseTree node) {
        return this.getOrElse(node, "");
    }

    @Override
    public void exitChar(final CharContext ctx) {
        final String resposta = ctx.CHAR().getText();
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitGet_vetor(final Get_vetorContext ctx) {
        final String id = this.getValue(ctx.expr(0));
        final String indice = this.getValue(ctx.expr(1));
        final String resposta = M.getVetor(id, indice);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitDcl1(final Dcl1Context ctx) {
        final ParseTree tree;
        if (ctx.ID() != null) {
            tree = ctx.ID();
        } else if (ctx.expr2() != null) {
            tree = ctx.expr2();
        } else {
            tree = ctx.dcls();
        }
        this.setValue(ctx, this.getValue(tree));
    }

    @Override
    public void exitSet_vetor(final Set_vetorContext ctx) {
        final int last = ctx.expr().size() - 1;
        final String id = ctx.ID().getText();
        final List<String> idx = this.getValues(ctx.expr());
        final String exp = idx.get(last);
        idx.remove(last);
        final String resposta = M.setVetor(id, idx, exp);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitLambda(final LambdaContext ctx) {
        final String param = this.getValue(ctx.dcl1());
        final String corpo = this.getValue(ctx.inst());
        final String resposta = M.lambda(param, corpo);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitTipo_generico(final Tipo_genericoContext ctx) {
        final String id = this.getValue(ctx.ID());
        final String tipo = this.getValue(ctx.tipo());
        final String resposta = M.tipoGenerico(id, tipo);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitTipo_funcao(final Tipo_funcaoContext ctx) {
        final String esq = this.getValue(ctx.tipo(0));
        final String dir = this.getValue(ctx.tipo(1));
        final String resposta = M.tipoFuncao(esq, dir);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitTipo2(final Tipo2Context ctx) {
        final List<String> lista = this.getValues(ctx.tipo());
        final String resposta = M.list2String(lista);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitTipo_tupla(final Tipo_tuplaContext ctx) {
        final int tamanho = ctx.tipo2().tipo().size();
        final String tipo = this.getValue(ctx.tipo2());
        final String resposta = M.tipoTupla(tamanho, tipo);
        this.setValue(ctx, resposta);
    }

    @Override // TODO: Refatorar, casamento de padroes
    public void exitCons(final ConsContext ctx) {
        final String head = this.getValue(ctx.expr(0));
        final String tail = this.getValue(ctx.expr(1));
        final String resposta;
        if (ctx.getParent().getRuleIndex() == potigolParser.RULE_caso) {
            resposta = "Lista(collection.immutable.::( " + head + ", a$" + tail
                    + "$))";
        } else {
            resposta = K.bloco(head + "::" + tail);
        }
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitExpoente(final ExpoenteContext ctx) {
        final String base = this.getValue(ctx.expr(0));
        final String exp = this.getValue(ctx.expr(1));
        final String resposta = M.expoente(base, exp);
        this.setValue(ctx, resposta);
    }

    @Override // TODO: Refatorar, casamento de padroes
    public void exitCaso(final CasoContext ctx) {
        final String exp = this.getValue(ctx.expr(0));
        String exps = this.getValue(ctx.exprlist());
        int posicao = exp.indexOf("a$", 0);
        if (posicao >= 0) {
            String resposta = exp.substring(posicao + 2);
            posicao = resposta.indexOf('$', 0);
            resposta = resposta.substring(0, posicao);
            // String resposta = exp.split("if")[0].split("::")[1].replaceAll("
            // ",
            // "").substring(2);
            exps = K.VAL + resposta + K.IGUAL + "Lista(a$" + resposta + "$)"
                    + K.SEMI + exps.substring(1);
        }
        final String cond = this.getOrElse(ctx.expr(1));
        final String resposta = "case " + exp + K.guarda(cond) + K.ARROW + exps;
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitEscolha(final EscolhaContext ctx) {
        final List<String> casos = new ArrayList<String>();
        for (final CasoContext caso : ctx.caso()) {
            casos.add(this.getValue(caso));
        }
        final String exp = this.getValue(ctx.expr());
        final String resposta = M.escolha(exp, casos);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitFormato(final FormatoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String fmt = this.getValue(ctx.expr(1));
        final String resposta = M.formato(exp1, fmt);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitAlias(final AliasContext ctx) {
        final String id = ctx.ID().getText();
        final String tipo = this.getValue(ctx.tipo());
        final String resposta = M.aliasTipo(id, tipo);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitClasse(final ClasseContext ctx) {
        final String id = ctx.ID().getText();
        final List<String> params = this.getValues(ctx.children);
        final String resposta = M.classe(id, params);
        this.setValue(ctx, resposta);
    }

    @Override
    public void enterProg(final ProgContext ctx) {
        this.saida += M.prologo();
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
        final String resposta = M.atribMultipla(ids, exps);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitAtrib_simples(final Atrib_simplesContext ctx) {
        final List<String> ids = M.string2List(this.getValue(ctx.id1()));
        final String exp = this.getValue(ctx.expr());
        final String resposta = M.atribSimples(ids, exp);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitChamada_funcao(final Chamada_funcaoContext ctx) {
        final String nome = this.getValue(ctx.expr());
        final String param = this.getValue(ctx.expr1());
        final String resposta = M.chamadaFuncao(nome, param);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitChamada_metodo(final Chamada_metodoContext ctx) {
        final String objeto = this.getValue(ctx.expr());
        final String metodo = this.getValue(ctx.ID());
        final String param = this.getOrElse(ctx.expr1());
        final String resposta = M.chamadaMetodo(objeto, metodo, param);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitComparacao(final ComparacaoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        final String op = ctx.getChild(1).getText();
        final String resposta = M.operacaoBin(exp1, op, exp2);
        this.setValue(ctx, resposta);
    }

    @Override // TODO: Refatorar, casamento de padroes
    public void exitDcl(final DclContext ctx) {
        final String id = this.getValue(ctx.id1());
        final String tipo = this.getValue(ctx.tipo());
        String resposta = id.replaceAll(K.VIRGULA, ": " + tipo + K.VIRGULA)
                + ": " + tipo;
        if (ctx.parent.getRuleIndex() == potigolParser.RULE_decl_tipo) {
            resposta = "" + resposta;
        }
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitDcls(final DclsContext ctx) {
        final List<String> lista = this.getValues(ctx.dcl());
        final String resposta = M.list2String(lista);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitDecl(final DeclContext ctx) {
        final String decl = this.getValue(ctx.getChild(0));
        final String resposta = M.declaracao(decl);
        this.setValue(ctx, resposta);
    }

    @Override // TODO: Refatorar
    public void exitDecl_var_multipla(final Decl_var_multiplaContext ctx) {
        final String id = this.getValue(ctx.id2());
        final String[] ids = id.split(K.VIRGULA);
        final String exp = this.getValue(ctx.expr2());
        final String[] exps = exp.split(K.VIRGULA);
        String resposta = "";
        for (int i = 0; i < ids.length; i++) {
            resposta += K.VAR + ids[i] + K.IGUAL + exps[i] + K.NEWLINE;
        }
        this.setValue(ctx, resposta);
        this.verificarDuplicados(M.string2List(id), ctx);
    }

    @Override
    public void exitDecl_var_simples(final Decl_var_simplesContext ctx) {
        final String id = this.getValue(ctx.id1());
        final String exp = this.getValue(ctx.expr());
        final String resposta = M.declVariavel(id, exp);
        this.setValue(ctx, resposta);
        this.verificarDuplicados(M.string2List(id), ctx);
    }

    @Override
    public void exitDef_funcao(final Def_funcaoContext ctx) {
        final String id = this.getValue(ctx.ID());
        final String param = this.getValue(ctx.dcls());
        final String tipo = this.getOrElse(ctx.tipo());
        final String corpo = this.getValue(ctx.expr());
        final String resposta = M.defFuncao(id, param, tipo, corpo);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitDef_funcao_corpo(final Def_funcao_corpoContext ctx) {
        final String id = this.getValue(ctx.ID());
        final String param = this.getValue(ctx.dcls());
        final String tipo = this.getOrElse(ctx.tipo());
        final String corpo = this.getValue(ctx.exprlist());
        final String resposta = M.defFuncao(id, param, tipo, corpo);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitE_logico(final E_logicoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        final String resposta = M.operacaoBinE(exp1, exp2);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitEnquanto(final EnquantoContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String bloco = this.getValue(ctx.bloco());
        final String resposta = M.enquanto(exp, bloco);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitBloco(final BlocoContext ctx) {
        final String exp = this.getValue(ctx.exprlist());
        final String resposta = M.bloco(exp);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitEscreva(final EscrevaContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String resposta = M.escreva(exp, true);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitEveryRule(final ParserRuleContext ctx) {
        if (this.getValue(ctx) == null) {
            this.setValue(ctx, this.getValue(ctx.getChild(0)));
        }
    }

    @Override
    public void exitExpr1(final Expr1Context ctx) {
        final List<String> lista = this.getValues(ctx.expr());
        final String resposta = M.list2String(lista);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitExpr2(final Expr2Context ctx) {
        final List<String> resposta = this.getValues(ctx.expr());
        this.setValue(ctx, M.list2String(resposta));
    }

    @Override
    public void exitExprlist(final ExprlistContext ctx) {
        final List<String> lista = this.getValues(ctx.inst());
        final String resposta = M.exprList(lista);
        this.setValue(ctx, resposta);
        this.declaracoes.pop();
    }

    @Override
    public void exitFaixa(final FaixaContext ctx) {
        final String id = this.getValue(ctx.ID());
        final List<String> exps = this.getValues(ctx.expr());
        final String resposta = M.faixa(id, exps);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitFaixas(final FaixasContext ctx) {
        final List<String> lista = this.getValues(ctx.faixa());
        final String resposta = M.faixas(lista);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitId(final IdContext ctx) {
        this.setValue(ctx, M.escapeID(ctx.getText()));
    }

    @Override
    public void exitId1(final Id1Context ctx) {
        final List<String> lista = this.getValues(ctx.ID());
        final String resposta = M.list2String(lista);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitId2(final Id2Context ctx) {
        final List<String> lista = this.getValues(ctx.ID());
        final String resposta = M.list2String(lista);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitImprima(final ImprimaContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String resposta = M.escreva(exp, false);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitInst(final InstContext ctx) {
        final int linha = ctx.getStart().getLine();
        final String inst = this.getValue(ctx.getChild(0));
        final String resposta = M.inst(linha, inst);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitInteiro(final InteiroContext ctx) {
        this.setValue(ctx, ctx.getText());
    }

    @Override
    public void exitLista(final ListaContext ctx) {
        final String exp = this.getValue(ctx.expr1());
        final String resposta = M.lista(exp);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitMais_menos_unario(final Mais_menos_unarioContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String op = ctx.getChild(0).getText();
        final String resposta = M.operacaoUnaria(op, exp);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitMult_div(final Mult_divContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String op = ctx.getChild(1).getText();
        final String exp2 = this.getValue(ctx.expr(1));
        final String resposta = M.operacaoBin(exp1, op, exp2);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitNao_logico(final Nao_logicoContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String resposta = M.operacaoUnariaNao(exp);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitOu_logico(final Ou_logicoContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        final String resposta = M.operacaoBinOu(exp1, exp2);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitPara_faca(final Para_facaContext ctx) {
        final String faixas = this.getValue(ctx.faixas());
        final String guarda = this.getOrElse(ctx.expr());
        final String bloco = this.getValue(ctx.bloco());
        final String resposta = M.paraFaca(faixas, guarda, bloco);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitPara_gere(final Para_gereContext ctx) {
        final String faixas = this.getValue(ctx.faixas());
        final String se = this.getOrElse(ctx.expr());
        final String gere = this.getValue(ctx.exprlist());
        final String resposta = M.paraGere(faixas, se, gere);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitParen(final ParenContext ctx) {
        final String exp = this.getValue(ctx.expr());
        final String resposta = M.parenteses(exp);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitProg(final ProgContext ctx) {
        final List<String> items = new ArrayList<String>();
        for (final InstContext item : ctx.inst()) {
            items.add(this.getValue(item));
        }
        this.saida += M.saida(this.warnings, items);

        this.setValue(ctx, this.saida);
        this.declaracoes.pop();
    }

    @Override
    public void exitReal(final RealContext ctx) {
        this.setValue(ctx, ctx.getText());
    }

    @Override
    public void exitSe(final SeContext ctx) {
        final List<String> senaose = new ArrayList<String>();
        for (final SenaoseContext c : ctx.senaose()) {
            senaose.add(this.getValue(c));
        }
        final String cond = this.getValue(ctx.expr());
        final String entao = this.getValue(ctx.entao());
        final String senao = this.getOrElse(ctx.senao());
        final String resposta = M.se(cond, entao, senaose, senao);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitEntao(final EntaoContext ctx) {
        final String resposta = this.getValue(ctx.exprlist());
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitSenao(final SenaoContext ctx) {
        final String resposta = this.getValue(ctx.exprlist());
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitSenaose(final SenaoseContext ctx) {
        final String cond = this.getValue(ctx.expr());
        final String entao = this.getValue(ctx.entao());
        final String resposta = M.senaoSe(cond, entao);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitSoma_sub(final Soma_subContext ctx) {
        final String exp1 = this.getValue(ctx.expr(0));
        final String exp2 = this.getValue(ctx.expr(1));
        final String op = ctx.getChild(1).getText();
        final String resposta = M.operacaoBin(exp1, op, exp2);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitTexto(final TextoContext ctx) {
        final String texto = ctx.getText();
        final String resposta = M.texto(texto);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitTexto_interpolacao(final Texto_interpolacaoContext ctx) {
        final List<String> string = new ArrayList<String>();
        string.add(ctx.BS().getText());
        for (final TerminalNode node : ctx.MS()) {
            string.add(node.getText());
        }
        string.add(ctx.ES().getText());

        final List<String> interp = new ArrayList<String>();
        for (final ExprContext exp : ctx.expr()) {
            interp.add(this.getValue(exp));
        }

        final String resposta = M.interpolacao(string, interp);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitDecl_uso(final Decl_usoContext ctx) {
        final String uso = this.getValue(ctx.STRING());
        final String resposta = M.uso(uso);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitTupla(final TuplaContext ctx) {
        final String exp = this.getValue(ctx.expr2());
        final int tamanho = ctx.expr2().expr().size();
        final String resposta = M.tupla(tamanho, exp);
        this.setValue(ctx, resposta);
    }

    @Override
    public void exitValor_multiplo(final Valor_multiploContext ctx) {
        final List<String> ids = M.string2List(this.getValue(ctx.id2()));
        final List<String> exps = M.string2List(this.getValue(ctx.expr2()));
        final String resposta = M.valorMultiplo(ids, exps);
        this.setValue(ctx, resposta);
        this.verificarDuplicados(ids, ctx);
    }

    @Override
    public void exitValor_simples(final Valor_simplesContext ctx) {
        final String id = this.getValue(ctx.id1());
        final String exp = this.getValue(ctx.expr());
        final List<String> ids = M.string2List(id);
        final String resposta = M.declValor(id, exp);
        this.setValue(ctx, resposta);
        this.verificarDuplicados(ids, ctx);
    }

    @Override
    public void exitBooleano(final BooleanoContext ctx) {
        final String bool = ctx.BOOLEANO().getText();
        final String resposta = M.booleano(bool);
        this.setValue(ctx, resposta);
    }

    @Override
    public void visitTerminal(final TerminalNode node) {
        final String resposta;
        if (node.getSymbol().getType() == potigolLexer.ID) {
            resposta = M.escapeID(node.getText());
        } else {
            resposta = node.getText();
        }
        this.setValue(node, resposta);
    }

    public String getSaida() {
        return this.saida;
    }

    // TODO: Refatorar
    private void verificarDuplicados(final List<String> ids,
            final ParserRuleContext ctx) {
        for (final String i : ids) {
            if (this.valores().contains(i)) {
                final int linha = ctx.getStart().getLine();
                this.warnings.add("Valor '" + i
                        + "' declarado pela segunda vez na linha " + linha + ".");
            }
        }
        this.declaracoes.peek().addAll(ids);
    }

    private List<String> valores() {
        final List<String> lista = new ArrayList<String>();
        for (final List<String> declaracao : this.declaracoes) {
            lista.addAll(declaracao);
        }
        return lista;
    }
}
