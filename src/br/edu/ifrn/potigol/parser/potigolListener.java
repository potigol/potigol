// Generated from potigol.g4 by ANTLR 4.4
package br.edu.ifrn.potigol.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link potigolParser}.
 */
public interface potigolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code tipo_simples}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_simples(@NotNull potigolParser.Tipo_simplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_simples}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_simples(@NotNull potigolParser.Tipo_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull potigolParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull potigolParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull potigolParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull potigolParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(@NotNull potigolParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(@NotNull potigolParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code soma_sub}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSoma_sub(@NotNull potigolParser.Soma_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soma_sub}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSoma_sub(@NotNull potigolParser.Soma_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrib_simples}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAtrib_simples(@NotNull potigolParser.Atrib_simplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrib_simples}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAtrib_simples(@NotNull potigolParser.Atrib_simplesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull potigolParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull potigolParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code laco}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLaco(@NotNull potigolParser.LacoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code laco}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLaco(@NotNull potigolParser.LacoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl_var_multipla}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var_multipla(@NotNull potigolParser.Decl_var_multiplaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl_var_multipla}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var_multipla(@NotNull potigolParser.Decl_var_multiplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(@NotNull potigolParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(@NotNull potigolParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lit}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLit(@NotNull potigolParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lit}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLit(@NotNull potigolParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imprima}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterImprima(@NotNull potigolParser.ImprimaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imprima}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitImprima(@NotNull potigolParser.ImprimaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code set_vetor}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterSet_vetor(@NotNull potigolParser.Set_vetorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code set_vetor}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitSet_vetor(@NotNull potigolParser.Set_vetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#entao}.
	 * @param ctx the parse tree
	 */
	void enterEntao(@NotNull potigolParser.EntaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#entao}.
	 * @param ctx the parse tree
	 */
	void exitEntao(@NotNull potigolParser.EntaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(@NotNull potigolParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(@NotNull potigolParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull potigolParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull potigolParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(@NotNull potigolParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(@NotNull potigolParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code decis}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecis(@NotNull potigolParser.DecisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decis}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecis(@NotNull potigolParser.DecisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_tupla}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_tupla(@NotNull potigolParser.Tipo_tuplaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_tupla}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_tupla(@NotNull potigolParser.Tipo_tuplaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cons}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCons(@NotNull potigolParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cons}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCons(@NotNull potigolParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lista}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLista(@NotNull potigolParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lista}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLista(@NotNull potigolParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(@NotNull potigolParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(@NotNull potigolParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#decl_uso}.
	 * @param ctx the parse tree
	 */
	void enterDecl_uso(@NotNull potigolParser.Decl_usoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#decl_uso}.
	 * @param ctx the parse tree
	 */
	void exitDecl_uso(@NotNull potigolParser.Decl_usoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(@NotNull potigolParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(@NotNull potigolParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_funcao}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_funcao(@NotNull potigolParser.Tipo_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_funcao}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_funcao(@NotNull potigolParser.Tipo_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#dcl1}.
	 * @param ctx the parse tree
	 */
	void enterDcl1(@NotNull potigolParser.Dcl1Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#dcl1}.
	 * @param ctx the parse tree
	 */
	void exitDcl1(@NotNull potigolParser.Dcl1Context ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#para_gere}.
	 * @param ctx the parse tree
	 */
	void enterPara_gere(@NotNull potigolParser.Para_gereContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#para_gere}.
	 * @param ctx the parse tree
	 */
	void exitPara_gere(@NotNull potigolParser.Para_gereContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterReal(@NotNull potigolParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitReal(@NotNull potigolParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#escolha}.
	 * @param ctx the parse tree
	 */
	void enterEscolha(@NotNull potigolParser.EscolhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#escolha}.
	 * @param ctx the parse tree
	 */
	void exitEscolha(@NotNull potigolParser.EscolhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterE_logico(@NotNull potigolParser.E_logicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitE_logico(@NotNull potigolParser.E_logicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_funcao_corpo}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDef_funcao_corpo(@NotNull potigolParser.Def_funcao_corpoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_funcao_corpo}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDef_funcao_corpo(@NotNull potigolParser.Def_funcao_corpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#decisao}.
	 * @param ctx the parse tree
	 */
	void enterDecisao(@NotNull potigolParser.DecisaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#decisao}.
	 * @param ctx the parse tree
	 */
	void exitDecisao(@NotNull potigolParser.DecisaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valor_multiplo}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void enterValor_multiplo(@NotNull potigolParser.Valor_multiploContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valor_multiplo}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void exitValor_multiplo(@NotNull potigolParser.Valor_multiploContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#faixa}.
	 * @param ctx the parse tree
	 */
	void enterFaixa(@NotNull potigolParser.FaixaContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#faixa}.
	 * @param ctx the parse tree
	 */
	void exitFaixa(@NotNull potigolParser.FaixaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrib_multipla}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAtrib_multipla(@NotNull potigolParser.Atrib_multiplaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrib_multipla}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAtrib_multipla(@NotNull potigolParser.Atrib_multiplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(@NotNull potigolParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(@NotNull potigolParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formato}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFormato(@NotNull potigolParser.FormatoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formato}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFormato(@NotNull potigolParser.FormatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(@NotNull potigolParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(@NotNull potigolParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#faixas}.
	 * @param ctx the parse tree
	 */
	void enterFaixas(@NotNull potigolParser.FaixasContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#faixas}.
	 * @param ctx the parse tree
	 */
	void exitFaixas(@NotNull potigolParser.FaixasContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(@NotNull potigolParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(@NotNull potigolParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_generico}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_generico(@NotNull potigolParser.Tipo_genericoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_generico}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_generico(@NotNull potigolParser.Tipo_genericoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl_var_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var_simples(@NotNull potigolParser.Decl_var_simplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl_var_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var_simples(@NotNull potigolParser.Decl_var_simplesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(@NotNull potigolParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(@NotNull potigolParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(@NotNull potigolParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(@NotNull potigolParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(@NotNull potigolParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(@NotNull potigolParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ou_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOu_logico(@NotNull potigolParser.Ou_logicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ou_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOu_logico(@NotNull potigolParser.Ou_logicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valor_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void enterValor_simples(@NotNull potigolParser.Valor_simplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valor_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void exitValor_simples(@NotNull potigolParser.Valor_simplesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alias}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void enterAlias(@NotNull potigolParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alias}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void exitAlias(@NotNull potigolParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code texto_interpolacao}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTexto_interpolacao(@NotNull potigolParser.Texto_interpolacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code texto_interpolacao}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTexto_interpolacao(@NotNull potigolParser.Texto_interpolacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mais_menos_unario}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMais_menos_unario(@NotNull potigolParser.Mais_menos_unarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mais_menos_unario}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMais_menos_unario(@NotNull potigolParser.Mais_menos_unarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupla}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTupla(@NotNull potigolParser.TuplaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupla}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTupla(@NotNull potigolParser.TuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#senaose}.
	 * @param ctx the parse tree
	 */
	void enterSenaose(@NotNull potigolParser.SenaoseContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#senaose}.
	 * @param ctx the parse tree
	 */
	void exitSenaose(@NotNull potigolParser.SenaoseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expoente}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpoente(@NotNull potigolParser.ExpoenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expoente}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpoente(@NotNull potigolParser.ExpoenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#para_faca}.
	 * @param ctx the parse tree
	 */
	void enterPara_faca(@NotNull potigolParser.Para_facaContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#para_faca}.
	 * @param ctx the parse tree
	 */
	void exitPara_faca(@NotNull potigolParser.Para_facaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classe}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void enterClasse(@NotNull potigolParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classe}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void exitClasse(@NotNull potigolParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code get_vetor}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGet_vetor(@NotNull potigolParser.Get_vetorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code get_vetor}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGet_vetor(@NotNull potigolParser.Get_vetorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(@NotNull potigolParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(@NotNull potigolParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_funcao}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDef_funcao(@NotNull potigolParser.Def_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_funcao}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDef_funcao(@NotNull potigolParser.Def_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#dcls}.
	 * @param ctx the parse tree
	 */
	void enterDcls(@NotNull potigolParser.DclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#dcls}.
	 * @param ctx the parse tree
	 */
	void exitDcls(@NotNull potigolParser.DclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#tipo2}.
	 * @param ctx the parse tree
	 */
	void enterTipo2(@NotNull potigolParser.Tipo2Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#tipo2}.
	 * @param ctx the parse tree
	 */
	void exitTipo2(@NotNull potigolParser.Tipo2Context ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull potigolParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull potigolParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code texto}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTexto(@NotNull potigolParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code texto}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTexto(@NotNull potigolParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult_div}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_div(@NotNull potigolParser.Mult_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult_div}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_div(@NotNull potigolParser.Mult_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nao_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNao_logico(@NotNull potigolParser.Nao_logicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nao_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNao_logico(@NotNull potigolParser.Nao_logicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_metodo}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChamada_metodo(@NotNull potigolParser.Chamada_metodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_metodo}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChamada_metodo(@NotNull potigolParser.Chamada_metodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#id2}.
	 * @param ctx the parse tree
	 */
	void enterId2(@NotNull potigolParser.Id2Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#id2}.
	 * @param ctx the parse tree
	 */
	void exitId2(@NotNull potigolParser.Id2Context ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(@NotNull potigolParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(@NotNull potigolParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparacao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(@NotNull potigolParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparacao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(@NotNull potigolParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_funcao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(@NotNull potigolParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_funcao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(@NotNull potigolParser.Chamada_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#id1}.
	 * @param ctx the parse tree
	 */
	void enterId1(@NotNull potigolParser.Id1Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#id1}.
	 * @param ctx the parse tree
	 */
	void exitId1(@NotNull potigolParser.Id1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterChar(@NotNull potigolParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitChar(@NotNull potigolParser.CharContext ctx);
}