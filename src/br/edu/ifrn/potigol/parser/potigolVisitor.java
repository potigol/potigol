// Generated from potigol.g4 by ANTLR 4.5.2
package br.edu.ifrn.potigol.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link potigolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface potigolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link potigolParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(potigolParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(potigolParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreva(potigolParser.EscrevaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprima}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprima(potigolParser.ImprimaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrib_simples}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib_simples(potigolParser.Atrib_simplesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrib_multipla}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib_multipla(potigolParser.Atrib_multiplaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code set_vetor}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_vetor(potigolParser.Set_vetorContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(potigolParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valor_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_simples(potigolParser.Valor_simplesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valor_multiplo}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_multiplo(potigolParser.Valor_multiploContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decl_var_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var_simples(potigolParser.Decl_var_simplesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decl_var_multipla}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var_multipla(potigolParser.Decl_var_multiplaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_funcao}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_funcao(potigolParser.Def_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_funcao_corpo}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_funcao_corpo(potigolParser.Def_funcao_corpoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alias}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(potigolParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classe}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(potigolParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#decl_uso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_uso(potigolParser.Decl_usoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(potigolParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#dcl_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl_var(potigolParser.Dcl_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#dcls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcls(potigolParser.DclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#dcl1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl1(potigolParser.Dcl1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_simples}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_simples(potigolParser.Tipo_simplesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_funcao}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_funcao(potigolParser.Tipo_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_generico}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_generico(potigolParser.Tipo_genericoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_tupla}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_tupla(potigolParser.Tipo_tuplaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lista}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(potigolParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expoente}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpoente(potigolParser.ExpoenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code get_vetor}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_vetor(potigolParser.Get_vetorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formato}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormato(potigolParser.FormatoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code soma_sub}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma_sub(potigolParser.Soma_subContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult_div}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_div(potigolParser.Mult_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(potigolParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(potigolParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nao_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNao_logico(potigolParser.Nao_logicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code laco}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaco(potigolParser.LacoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_logico(potigolParser.E_logicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lit}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(potigolParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chamada_metodo}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_metodo(potigolParser.Chamada_metodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparacao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacao(potigolParser.ComparacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ou_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOu_logico(potigolParser.Ou_logicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chamada_funcao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_funcao(potigolParser.Chamada_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code curinga}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuringa(potigolParser.CuringaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mais_menos_unario}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_menos_unario(potigolParser.Mais_menos_unarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decis}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecis(potigolParser.DecisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupla}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupla(potigolParser.TuplaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cons}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(potigolParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(potigolParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(potigolParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texto_interpolacao}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto_interpolacao(potigolParser.Texto_interpolacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texto}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(potigolParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(potigolParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(potigolParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(potigolParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#decisao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecisao(potigolParser.DecisaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#se}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(potigolParser.SeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#entao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntao(potigolParser.EntaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#senaose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenaose(potigolParser.SenaoseContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao(potigolParser.SenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#escolha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscolha(potigolParser.EscolhaContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(potigolParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code padrao_cons}
	 * labeled alternative in {@link potigolParser#padrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadrao_cons(potigolParser.Padrao_consContext ctx);
	/**
	 * Visit a parse tree produced by the {@code padrao_default}
	 * labeled alternative in {@link potigolParser#padrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadrao_default(potigolParser.Padrao_defaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code padrao_literal}
	 * labeled alternative in {@link potigolParser#padrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadrao_literal(potigolParser.Padrao_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code padrao_objeto}
	 * labeled alternative in {@link potigolParser#padrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadrao_objeto(potigolParser.Padrao_objetoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code padrao_tupla}
	 * labeled alternative in {@link potigolParser#padrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadrao_tupla(potigolParser.Padrao_tuplaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code padrao_id}
	 * labeled alternative in {@link potigolParser#padrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadrao_id(potigolParser.Padrao_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code padrao_ou}
	 * labeled alternative in {@link potigolParser#padrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadrao_ou(potigolParser.Padrao_ouContext ctx);
	/**
	 * Visit a parse tree produced by the {@code padrao_virgula}
	 * labeled alternative in {@link potigolParser#padrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadrao_virgula(potigolParser.Padrao_virgulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code padrao_lista}
	 * labeled alternative in {@link potigolParser#padrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadrao_lista(potigolParser.Padrao_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao(potigolParser.RepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#para_faca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_faca(potigolParser.Para_facaContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#para_gere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_gere(potigolParser.Para_gereContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(potigolParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#faixa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaixa(potigolParser.FaixaContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#faixas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaixas(potigolParser.FaixasContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(potigolParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(potigolParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(potigolParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#id1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId1(potigolParser.Id1Context ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#id2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId2(potigolParser.Id2Context ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#tipo2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo2(potigolParser.Tipo2Context ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(potigolParser.ExprlistContext ctx);
}