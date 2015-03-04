// Generated from potigol.g4 by ANTLR 4.4
package br.edu.ifrn.potigol.parser;
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by the {@code tipo_simples}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_simples(@NotNull potigolParser.Tipo_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(@NotNull potigolParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(@NotNull potigolParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao(@NotNull potigolParser.SenaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code soma_sub}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma_sub(@NotNull potigolParser.Soma_subContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrib_simples}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib_simples(@NotNull potigolParser.Atrib_simplesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(@NotNull potigolParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code laco}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaco(@NotNull potigolParser.LacoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decl_var_multipla}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var_multipla(@NotNull potigolParser.Decl_var_multiplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(@NotNull potigolParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lit}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(@NotNull potigolParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprima}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprima(@NotNull potigolParser.ImprimaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code set_vetor}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_vetor(@NotNull potigolParser.Set_vetorContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#entao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntao(@NotNull potigolParser.EntaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(@NotNull potigolParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull potigolParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(@NotNull potigolParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code decis}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecis(@NotNull potigolParser.DecisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_tupla}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_tupla(@NotNull potigolParser.Tipo_tuplaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cons}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(@NotNull potigolParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lista}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(@NotNull potigolParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao(@NotNull potigolParser.RepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#decl_uso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_uso(@NotNull potigolParser.Decl_usoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreva(@NotNull potigolParser.EscrevaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_funcao}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_funcao(@NotNull potigolParser.Tipo_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#dcl1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl1(@NotNull potigolParser.Dcl1Context ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#para_gere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_gere(@NotNull potigolParser.Para_gereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(@NotNull potigolParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#escolha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscolha(@NotNull potigolParser.EscolhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_logico(@NotNull potigolParser.E_logicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_funcao_corpo}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_funcao_corpo(@NotNull potigolParser.Def_funcao_corpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#decisao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecisao(@NotNull potigolParser.DecisaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valor_multiplo}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_multiplo(@NotNull potigolParser.Valor_multiploContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#faixa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaixa(@NotNull potigolParser.FaixaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrib_multipla}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib_multipla(@NotNull potigolParser.Atrib_multiplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(@NotNull potigolParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formato}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormato(@NotNull potigolParser.FormatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(@NotNull potigolParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#faixas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaixas(@NotNull potigolParser.FaixasContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(@NotNull potigolParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_generico}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_generico(@NotNull potigolParser.Tipo_genericoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decl_var_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var_simples(@NotNull potigolParser.Decl_var_simplesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(@NotNull potigolParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#se}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(@NotNull potigolParser.SeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(@NotNull potigolParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ou_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOu_logico(@NotNull potigolParser.Ou_logicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valor_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_simples(@NotNull potigolParser.Valor_simplesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alias}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(@NotNull potigolParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texto_interpolacao}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto_interpolacao(@NotNull potigolParser.Texto_interpolacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mais_menos_unario}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_menos_unario(@NotNull potigolParser.Mais_menos_unarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupla}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupla(@NotNull potigolParser.TuplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#senaose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenaose(@NotNull potigolParser.SenaoseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expoente}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpoente(@NotNull potigolParser.ExpoenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#para_faca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_faca(@NotNull potigolParser.Para_facaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classe}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(@NotNull potigolParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code get_vetor}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_vetor(@NotNull potigolParser.Get_vetorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(@NotNull potigolParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_funcao}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_funcao(@NotNull potigolParser.Def_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#dcls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcls(@NotNull potigolParser.DclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#tipo2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo2(@NotNull potigolParser.Tipo2Context ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull potigolParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texto}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(@NotNull potigolParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult_div}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_div(@NotNull potigolParser.Mult_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nao_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNao_logico(@NotNull potigolParser.Nao_logicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chamada_metodo}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_metodo(@NotNull potigolParser.Chamada_metodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#id2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId2(@NotNull potigolParser.Id2Context ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(@NotNull potigolParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparacao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacao(@NotNull potigolParser.ComparacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chamada_funcao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_funcao(@NotNull potigolParser.Chamada_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link potigolParser#id1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId1(@NotNull potigolParser.Id1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(@NotNull potigolParser.CharContext ctx);
}