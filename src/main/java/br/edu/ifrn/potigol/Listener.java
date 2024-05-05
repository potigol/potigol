/*
 *  Potigol
 *  Copyright (C) 2015-2020 by Leonardo Lucena
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

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import br.edu.ifrn.potigol.parser.potigolBaseListener;
import br.edu.ifrn.potigol.parser.potigolLexer;
import br.edu.ifrn.potigol.parser.potigolParser;
import br.edu.ifrn.potigol.parser.potigolParser.*;

public class Listener extends potigolBaseListener {

    private final ListenerData data = new ListenerData();

    public String getSaida() {
        return data.getSaida().toString();
    }

    /*
     * Programa
     */

    @Override
    public void enterProg(final ProgContext ctx) {
        data.getSaida().append(M.prologo());
        data.getDeclaracoes().push(new ArrayList<>());
    }

    @Override
    public void exitProg(final ProgContext ctx) {
        final List<String> items = data.getValues(ctx.inst());
        data.getSaida().append(M.saida(data.getWarnings(), items));
        data.setValue(ctx, data.getSaida().toString());
    }

    @Override
    public void exitInst(final InstContext ctx) {
        final int linha = ctx.getStart().getLine();
        final String inst = data.getValue(ctx.getChild(0));
        final String resposta = M.inst(linha, inst);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitEveryRule(final ParserRuleContext ctx) {
        if (data.getValue(ctx) == null) {
            data.setValue(ctx, data.getValue(ctx.getChild(0)));
        }
    }

    @Override
    public void visitTerminal(final TerminalNode node) {
        final String resposta;
        if (node.getSymbol().getType() == potigolLexer.ID) {
            resposta = M.escapeID(node.getText());
        } else {
            resposta = node.getText();
        }
        data.setValue(node, resposta);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
    //    System.out.println("Erro: "+ node.toString()+", "+node.toStringTree()+","+node.getSourceInterval().a+","+node.getSourceInterval().b);
    }

    /*
     *  Literal
     */

    @Override
    public void exitBooleano(final BooleanoContext ctx) {
        final String bool = ctx.BOOLEANO().getText();
        final String resposta = M.booleano(bool);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitId(final IdContext ctx) {
        data.setValue(ctx, M.escapeID(ctx.getText()));
    }

    @Override
    public void exitTexto_interpolacao(final Texto_interpolacaoContext ctx) {
        final List<String> string = new ArrayList<>();
        string.add(ctx.BS().getText());
        ctx.MS().stream().map(TerminalNode::getText).forEach(string::add);
        string.add(ctx.ES().getText());

        final List<String> interp = data.getValues(ctx.expr());

        final String resposta = M.interpolacao(string, interp);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitTexto(final TextoContext ctx) {
        final String texto = ctx.getText();
        final String resposta = M.texto(texto);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitInteiro(final InteiroContext ctx) {
        data.setValue(ctx, ctx.getText());
    }

    @Override
    public void exitReal(final RealContext ctx) {
        data.setValue(ctx, ctx.getText());
    }

    @Override
    public void exitChar(final CharContext ctx) {
        final String resposta = ctx.CHAR().getText();
        data.setValue(ctx, resposta);
    }

    /*
     * Decisao
     */

    @Override
    public void exitSe(final SeContext ctx) {
        final List<String> senaose = data.getValues(ctx.senaose());
        final String cond = data.getValue(ctx.expr());
        final String entao = data.getValue(ctx.entao());
        final String senao = data.getOrElse(ctx.senao());
        final String resposta = M.se(cond, entao, senaose, senao);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitEntao(final EntaoContext ctx) {
        final String resposta = data.getValue(ctx.exprlist());
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitSenao(final SenaoContext ctx) {
        final String resposta = data.getValue(ctx.exprlist());
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitSenaose(final SenaoseContext ctx) {
        final String cond = data.getValue(ctx.expr());
        final String entao = data.getValue(ctx.entao());
        final String resposta = M.senaoSe(cond, entao);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitEscolha(final EscolhaContext ctx) {
        final List<String> casos = data.getValues(ctx.caso());
        final String exp = data.getValue(ctx.expr());
        final String resposta = M.escolha(exp, casos);
        data.setValue(ctx, resposta);
    }

    @Override // TODO: Refatorar, casamento de padroes
    public void exitCaso(final CasoContext ctx) {
        final String exp = data.getValue(ctx.padrao());
        final String cond = data.getOrElse(ctx.expr());
        String exps = data.getValue(ctx.exprlist());
        final String resposta = "case " + exp + K.guarda(cond) + K.ARROW + exps;
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitPadrao_id(Padrao_idContext ctx) {
        final String id = data.getValue(ctx.getChild(0));
        final String tipo = data.getOrElse(ctx.tipo(), "");
        final String s = String.format("%s%s", id, tipo.isEmpty() ? "" : (": " + tipo));
        data.setValue(ctx, s);
    }

    @Override
    public void exitPadrao_literal(Padrao_literalContext ctx) {
        data.setValue(ctx, ctx.literal().getText());
    }

    @Override
    public void exitPadrao_objeto(Padrao_objetoContext ctx) {
        final String id = data.getValue(ctx.ID());
        final String padroes = data.getValue(ctx.padroes());
        final String s = id +"(" + padroes + ")";
        data.setValue(ctx, s);
    }

    @Override
    public void exitPadrao_cons(Padrao_consContext ctx) {
        final String ids = data.getValues(ctx.ID()).stream().reduce((a,b) -> a + "::"+b).get();
        final String s = "Lista(" + ids +")";
        data.setValue(ctx, s);
    }

    @Override
    public void exitPadrao_lista(Padrao_listaContext ctx) {
        final String padroes = data.getValue(ctx.padroes());
        final String s = "Lista(List(" + padroes + "))";
        data.setValue(ctx, s);
    }

    @Override
    public void exitPadrao_tupla(Padrao_tuplaContext ctx) {
        final String padroes = data.getValue(ctx.padroes());
        final String s = "(" + padroes + ")";
        data.setValue(ctx, s);
    }

    @Override
    public void exitPadroes(PadroesContext ctx) {
        final String s = data.getValues(ctx.padrao()).stream().reduce((a,b) -> a + ", " + b).get();
        data.setValue(ctx, s);
    }

    /*
     * Repeticao
     */
    @Override
    public void exitPara_faca(final Para_facaContext ctx) {
        final String faixas = data.getValue(ctx.faixas());
        final String guarda = data.getOrElse(ctx.expr());
        final String bloco = data.getValue(ctx.bloco());
        final String resposta = M.paraFaca(faixas, guarda, bloco);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitPara_gere(final Para_gereContext ctx) {
        final String faixas = data.getValue(ctx.faixas());
        final String se = data.getOrElse(ctx.expr());
        final String gere = data.getValue(ctx.exprlist());
        final String resposta = M.paraGere(faixas, se, gere);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitEnquanto(final EnquantoContext ctx) {
        final String exp = data.getValue(ctx.expr());
        final String bloco = data.getValue(ctx.bloco());
        final String resposta = M.enquanto(exp, bloco);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitFaixa(final FaixaContext ctx) {
        final String id = data.getValue(ctx.ID());
        final List<String> exps = data.getValues(ctx.expr());
        final String resposta = M.faixa(id, exps);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitFaixas(final FaixasContext ctx) {
        final List<String> lista = data.getValues(ctx.faixa());
        final String resposta = M.faixas(lista);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitBloco(final BlocoContext ctx) {
        final String exp = data.getValue(ctx.exprlist());
        final String resposta = M.bloco(exp);
        data.setValue(ctx, resposta);
    }

    /*
     * Comandos
     */

    @Override
    public void exitEscreva(final EscrevaContext ctx) {
        final String exp = data.getValue(ctx.expr());
        final String resposta = M.escreva(exp, true);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitImprima(final ImprimaContext ctx) {
        final String exp = data.getValue(ctx.expr());
        final String resposta = M.escreva(exp, false);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitAtrib_simples(final Atrib_simplesContext ctx) {
        final List<String> ids = M.string2List(data.getValue(ctx.qualid1()));
        final String exp = data.getValue(ctx.expr());
        final String resposta = M.atribSimples(ids, exp);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitAtrib_multipla(final Atrib_multiplaContext ctx) {
        final List<String> ids = M.string2List(data.getValue(ctx.qualid2()));
        final List<String> exps = M.string2List(data.getValue(ctx.expr2()));
        final String resposta = M.atribMultipla(ids, exps);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitSet_vetor(final Set_vetorContext ctx) {
        final int last = ctx.expr().size() - 1;
        final String id = data.getValue(ctx.qualid());
        final List<String> idx = data.getValues(ctx.expr());
        final String exp = idx.get(last);
        idx.remove(last);
        final String resposta = M.setVetor(id, idx, exp);
        data.setValue(ctx, resposta);
    }


    /*
     * Declaracao
     */

    @Override
    public void exitDecl(final DeclContext ctx) {
        final String decl = data.getValue(ctx.getChild(0));
        final String resposta = M.declaracao(decl);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitValor_simples(final Valor_simplesContext ctx) {
        final String id = data.getValue(ctx.id1());
        final String tipo = data.getOrElse(ctx.tipo());
        final String exp = data.getValue(ctx.expr());
        final List<String> ids = M.string2List(id);
        final String resposta = M.declValor(id, exp, tipo);
        data.setValue(ctx, resposta);
        data.verificarDuplicados(ids, ctx, tipo.isEmpty());
    }

    @Override
    public void exitValor_multiplo(final Valor_multiploContext ctx) {
        final List<String> ids = M.string2List(data.getValue(ctx.id2()));
        final String tipo = data.getOrElse(ctx.tipo());
        final List<String> exps = M.string2List(data.getValue(ctx.expr2()));
        final String resposta = M.valorMultiplo(ids, exps, tipo);
        data.setValue(ctx, resposta);
        data.verificarDuplicados(ids, ctx, tipo.isEmpty());
    }

    @Override
    public void exitDecl_var_simples(final Decl_var_simplesContext ctx) {
        final String id = data.getValue(ctx.id1());
        final String tipo = data.getOrElse(ctx.tipo());
        final String exp = data.getValue(ctx.expr());
        final String resposta = M.declVariavel(id, exp, tipo);
        data.setValue(ctx, resposta);
        data.verificarDuplicados(M.string2List(id), ctx, tipo.isEmpty());
    }

    @Override
    public void exitDecl_var_multipla(final Decl_var_multiplaContext ctx) {
        final String id = data.getValue(ctx.id2());
        final String[] ids = M.split(id);
        final String tipo = data.getOrElse(ctx.tipo());
        final String exp = data.getValue(ctx.expr2());
        final String[] exps = M.split(exp);
        final String resposta = M.declVariavelMult(ids, exps, tipo);
        data.setValue(ctx, resposta);
        data.verificarDuplicados(M.string2List(id), ctx, tipo.isEmpty());
    }

    @Override
    public void exitDef_funcao(final Def_funcaoContext ctx) {
        final String id = data.getValue(ctx.ID());
        final String param = data.getValue(ctx.dcls());
        final String tipo = data.getOrElse(ctx.tipo());
        final String corpo = data.getValue(ctx.expr());
        final String resposta = M.defFuncao(id, param, tipo, corpo);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitDef_funcao_corpo(final Def_funcao_corpoContext ctx) {
        final String id = data.getValue(ctx.ID());
        final String param = data.getValue(ctx.dcls());
        final String tipo = data.getOrElse(ctx.tipo());
        final String retorno = data.getOrElse(ctx.retorne());
        final String corpo = data.getValue(ctx.exprlist());
        final String resposta = M.defFuncao(id, param, tipo, corpo + retorno);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitAlias(final AliasContext ctx) {
        final String id = ctx.ID().getText();
        final String tipo = data.getValue(ctx.tipo());
        final String resposta = M.aliasTipo(id, tipo);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitClasse(final ClasseContext ctx) {
        final String id = ctx.ID().getText();
        final List<String> sup = M.string2List(data.getOrElse(ctx.id1()));
        final String membros = data.getValue(ctx.membros());
        final String resposta = M.classe(id, sup, membros);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitInterface(final InterfaceContext ctx) {
        final String id = ctx.ID().getText();
        final List<String> sup = M.string2List(data.getOrElse(ctx.id1()));
        final String membros = data.getValue(ctx.membros());
        final String resposta = M.abstrato(id, sup, membros);
        data.setValue(ctx, resposta);
    }

    @Override
    public void enterMembros(final MembrosContext ctx) {
        data.getDeclaracoes().push(new ArrayList<>());
    }

    @Override
    public void exitMembros(final MembrosContext ctx) {
        final List<ParseTree> cstr = new ArrayList<>();
        final List<ParseTree> elem = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (child.getClass().equals(DclContext.class)
                    || child.getClass().equals(Dcl_varContext.class)) {
                cstr.add(child);
            }
            if (child.getClass().equals(Decl_funcaoContext.class)
                    || child.getClass().equals(Dcl_funContext.class)
                    || child.getClass().equals(Decl_valorContext.class)
                    || child.getClass().equals(Def_funcao_corpoContext.class)
                    || child.getClass().equals(Def_funcaoContext.class)
                    || child.getClass().equals(Decl_var_simplesContext.class)
                    || child.getClass().equals(Valor_simplesContext.class)) {
                elem.add(child);
            }
        }
        final List<String> elemen = data.getValues(elem);
        final List<String> constr = data.getValues(cstr);
        final String resposta = M.membros(constr, elemen);
        data.setValue(ctx, resposta);
        data.getDeclaracoes().pop();
    }

    @Override
    public void exitRetorne(final RetorneContext ctx) {
        String resp = data.getValue(ctx.expr());
        data.setValue(ctx, resp);
    }

    @Override
    public void exitDecl_uso(final Decl_usoContext ctx) {
        final String uso = data.getValue(ctx.STRING());
        final String resposta = M.uso(uso);
        data.setValue(ctx, resposta);
    }

    @Override // TODO: Refatorar, casamento de padroes
    public void exitDcl(final DclContext ctx) {
        final String id = data.getValue(ctx.id1());
        final String tipo = data.getValue(ctx.tipo());
        final String pre;
        if (ctx.getParent().getRuleIndex() == potigolParser.RULE_membros) {
            pre = "val ";
        } else {
            pre = "";
        }
        final String resposta = pre
                + id.replaceAll(K.VIRGULA,
                K.DOISPONTOS + tipo + K.VIRGULA + pre)
                + K.DOISPONTOS + tipo;
        // if (ctx.parent.getRuleIndex() == potigolParser.RULE_decl_tipo) {
        // resposta = "" + resposta;
        // }
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitDcl_var(final Dcl_varContext ctx) {
        final String id = data.getValue(ctx.id1());
        final String tipo = data.getValue(ctx.tipo());
        final String resposta = "var "
                + id.replaceAll(K.VIRGULA,
                K.DOISPONTOS + tipo + K.VIRGULA + " var ")
                + K.DOISPONTOS + tipo;
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitDcl_fun(final Dcl_funContext ctx) {
        final String id = data.getValue(ctx.ID());
        final String param = data.getValue(ctx.dcls());
        final String tipo = data.getValue(ctx.tipo());
        final String resposta = M.dclFun(id, param, tipo);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitDcls(final DclsContext ctx) {
        final List<String> lista = data.getValues(ctx.dcl());
        final String resposta = M.list2String(lista);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitTipo_generico(final Tipo_genericoContext ctx) {
        final String id = data.getValue(ctx.ID());
        final String tipo = data.getValue(ctx.tipo());
        final String resposta = M.tipoGenerico(id, tipo);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitTipo_funcao(final Tipo_funcaoContext ctx) {
        final String esq = data.getValue(ctx.tipo(0));
        final String dir = data.getValue(ctx.tipo(1));
        final String resposta = M.tipoFuncao(esq, dir);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitTipo_tupla(final Tipo_tuplaContext ctx) {
        final int tamanho = ctx.tipo2().tipo().size();
        final String tipo = data.getValue(ctx.tipo2());
        final String resposta = M.tipoTupla(tamanho, tipo);
        data.setValue(ctx, resposta);
    }

    /*
     * Expressoes
     */

    @Override
    public void exitChamada_metodo(final Chamada_metodoContext ctx) {
        final String objeto = data.getValue(ctx.expr());
        final String metodo = data.getValue(ctx.ID());
        final String param = data.getOrElse(ctx.expr1());
        final String resposta = M.chamadaMetodo(objeto, metodo, param);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitChamada_funcao(final Chamada_funcaoContext ctx) {
        final String nome = data.getValue(ctx.expr());
        final String param = data.getValue(ctx.expr1());
        final String resposta = M.chamadaFuncao(nome, param);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitGet_vetor(final Get_vetorContext ctx) {
        final String id = data.getValue(ctx.expr(0));
        final String indice = data.getValue(ctx.expr(1));
        final String resposta = M.getVetor(id, indice);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitExpoente(final ExpoenteContext ctx) {
        final String base = data.getValue(ctx.expr(0));
        final String exp = data.getValue(ctx.expr(1));
        final String resposta = M.expoente(base, exp);
        data.setValue(ctx, resposta);
    }

    @Override // TODO: Refatorar, casamento de padroes
    public void exitCons(final ConsContext ctx) {
        final String head = data.getValue(ctx.expr(0));
        final String tail = data.getValue(ctx.expr(1));
        final String resposta = K.bloco(head + "::" + tail);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitMais_menos_unario(final Mais_menos_unarioContext ctx) {
        final String exp = data.getValue(ctx.expr());
        final String op = ctx.getChild(0).getText();
        final String resposta = M.operacaoUnaria(op, exp);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitMult_div(final Mult_divContext ctx) {
        final String exp1 = data.getValue(ctx.expr(0));
        final String op = ctx.getChild(1).getText();
        final String exp2 = data.getValue(ctx.expr(1));
        final String resposta = M.operacaoBin(exp1, op, exp2);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitSoma_sub(final Soma_subContext ctx) {
        final String exp1 = data.getValue(ctx.expr(0));
        final String exp2 = data.getValue(ctx.expr(1));
        final String op = ctx.getChild(1).getText();
        final String resposta = M.operacaoBin(exp1, op, exp2);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitFormato(final FormatoContext ctx) {
        final String exp1 = data.getValue(ctx.expr(0));
        final String fmt = data.getValue(ctx.expr(1));
        final String resposta = M.formato(exp1, fmt);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitComparacao(final ComparacaoContext ctx) {
        final String exp1 = data.getValue(ctx.expr(0));
        final String exp2 = data.getValue(ctx.expr(1));
        final String op = ctx.getChild(1).getText();
        final String resposta = M.operacaoBin(exp1, op, exp2);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitNao_logico(final Nao_logicoContext ctx) {
        final String exp = data.getValue(ctx.expr());
        final String resposta = M.operacaoUnariaNao(exp);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitE_logico(final E_logicoContext ctx) {
        final String exp1 = data.getValue(ctx.expr(0));
        final String exp2 = data.getValue(ctx.expr(1));
        final String resposta = M.operacaoBinE(exp1, exp2);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitOu_logico(final Ou_logicoContext ctx) {
        final String exp1 = data.getValue(ctx.expr(0));
        final String exp2 = data.getValue(ctx.expr(1));
        final String resposta = M.operacaoBinOu(exp1, exp2);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitLambda(final LambdaContext ctx) {
        final String param = data.getValue(ctx.dcl1());
        final String corpo = data.getValue(ctx.inst());
        final String resposta = M.lambda(param, corpo);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitTupla(final TuplaContext ctx) {
        final String exp = data.getValue(ctx.expr2());
        final int tamanho = ctx.expr2().expr().size();
        final String resposta = M.tupla(tamanho, exp);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitParen(final ParenContext ctx) {
        final String exp = data.getValue(ctx.expr());
        final String resposta = M.parenteses(exp);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitLista(final ListaContext ctx) {
        final String exp = data.getValue(ctx.expr1());
        final String resposta;
        if (ctx.getParent().getRuleIndex()==potigolParser.RULE_escolha){
            resposta = "List(" + exp + ")";
        } else {
             resposta = M.lista(exp);
        }
        data.setValue(ctx, resposta);
    }

    @Override
    public void enterIsto(final IstoContext ctx) {
        data.setValue(ctx, " this ");
    }

    @Override
    public void enterCuringa(final CuringaContext ctx) {
        data.setValue(ctx, "_");
    }

    /*
     * Outros
     */

    @Override
    public void exitExpr1(final Expr1Context ctx) {
        final List<String> lista = data.getValues(ctx.expr());
        final String resposta = M.list2String(lista);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitExpr2(final Expr2Context ctx) {
        final List<String> resposta = data.getValues(ctx.expr());
        data.setValue(ctx, M.list2String(resposta));
    }

    @Override
    public void exitId1(final Id1Context ctx) {
        final List<String> lista = data.getValues(ctx.ID());
        final String resposta = M.list2String(lista);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitId2(final Id2Context ctx) {
        final List<String> lista = data.getValues(ctx.ID());
        final String resposta = M.list2String(lista);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitQualid(final QualidContext ctx) {
        final List<String> lista = data.getValues(ctx.ID());
        final String resposta = M.list2Qualid(lista);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitQualid1(final Qualid1Context ctx) {
        final List<String> lista = data.getValues(ctx.qualid());
        final String resposta = M.list2String(lista);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitQualid2(final Qualid2Context ctx) {
        final List<String> lista = data.getValues(ctx.qualid());
        final String resposta = M.list2String(lista);
        data.setValue(ctx, resposta);
    }

    @Override
    public void exitTipo2(final Tipo2Context ctx) {
        final List<String> lista = data.getValues(ctx.tipo());
        final String resposta = M.list2String(lista);
        data.setValue(ctx, resposta);
    }

    @Override
    public void enterExprlist(final ExprlistContext ctx) {
        data.getDeclaracoes().push(new ArrayList<>());
    }

    @Override
    public void exitExprlist(final ExprlistContext ctx) {
        final List<String> lista = data.getValues(ctx.inst());
        final String resposta = M.exprList(lista);
        data.setValue(ctx, resposta);
        data.getDeclaracoes().pop();
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
        data.setValue(ctx, data.getValue(tree));
    }
}