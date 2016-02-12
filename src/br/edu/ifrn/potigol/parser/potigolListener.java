// Generated from potigol.g4 by ANTLR 4.5.2
package br.edu.ifrn.potigol.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link potigolParser}.
 */
public interface potigolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link potigolParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(potigolParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(potigolParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(potigolParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(potigolParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(potigolParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(potigolParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imprima}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterImprima(potigolParser.ImprimaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imprima}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitImprima(potigolParser.ImprimaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrib_simples}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAtrib_simples(potigolParser.Atrib_simplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrib_simples}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAtrib_simples(potigolParser.Atrib_simplesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrib_multipla}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAtrib_multipla(potigolParser.Atrib_multiplaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrib_multipla}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAtrib_multipla(potigolParser.Atrib_multiplaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code set_vetor}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterSet_vetor(potigolParser.Set_vetorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code set_vetor}
	 * labeled alternative in {@link potigolParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitSet_vetor(potigolParser.Set_vetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(potigolParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(potigolParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valor_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void enterValor_simples(potigolParser.Valor_simplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valor_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void exitValor_simples(potigolParser.Valor_simplesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valor_multiplo}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void enterValor_multiplo(potigolParser.Valor_multiploContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valor_multiplo}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void exitValor_multiplo(potigolParser.Valor_multiploContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl_var_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var_simples(potigolParser.Decl_var_simplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl_var_simples}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var_simples(potigolParser.Decl_var_simplesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl_var_multipla}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var_multipla(potigolParser.Decl_var_multiplaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl_var_multipla}
	 * labeled alternative in {@link potigolParser#decl_valor}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var_multipla(potigolParser.Decl_var_multiplaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_funcao}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDef_funcao(potigolParser.Def_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_funcao}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDef_funcao(potigolParser.Def_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_funcao_corpo}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDef_funcao_corpo(potigolParser.Def_funcao_corpoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_funcao_corpo}
	 * labeled alternative in {@link potigolParser#decl_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDef_funcao_corpo(potigolParser.Def_funcao_corpoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alias}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void enterAlias(potigolParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alias}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void exitAlias(potigolParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classe}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void enterClasse(potigolParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classe}
	 * labeled alternative in {@link potigolParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void exitClasse(potigolParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#decl_uso}.
	 * @param ctx the parse tree
	 */
	void enterDecl_uso(potigolParser.Decl_usoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#decl_uso}.
	 * @param ctx the parse tree
	 */
	void exitDecl_uso(potigolParser.Decl_usoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(potigolParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(potigolParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#dcls}.
	 * @param ctx the parse tree
	 */
	void enterDcls(potigolParser.DclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#dcls}.
	 * @param ctx the parse tree
	 */
	void exitDcls(potigolParser.DclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#dcl1}.
	 * @param ctx the parse tree
	 */
	void enterDcl1(potigolParser.Dcl1Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#dcl1}.
	 * @param ctx the parse tree
	 */
	void exitDcl1(potigolParser.Dcl1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_simples}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_simples(potigolParser.Tipo_simplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_simples}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_simples(potigolParser.Tipo_simplesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_funcao}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_funcao(potigolParser.Tipo_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_funcao}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_funcao(potigolParser.Tipo_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_generico}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_generico(potigolParser.Tipo_genericoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_generico}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_generico(potigolParser.Tipo_genericoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_tupla}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_tupla(potigolParser.Tipo_tuplaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_tupla}
	 * labeled alternative in {@link potigolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_tupla(potigolParser.Tipo_tuplaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lista}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLista(potigolParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lista}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLista(potigolParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expoente}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpoente(potigolParser.ExpoenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expoente}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpoente(potigolParser.ExpoenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code get_vetor}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGet_vetor(potigolParser.Get_vetorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code get_vetor}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGet_vetor(potigolParser.Get_vetorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formato}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFormato(potigolParser.FormatoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formato}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFormato(potigolParser.FormatoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code soma_sub}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSoma_sub(potigolParser.Soma_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soma_sub}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSoma_sub(potigolParser.Soma_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult_div}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_div(potigolParser.Mult_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult_div}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_div(potigolParser.Mult_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda(potigolParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda(potigolParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(potigolParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(potigolParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nao_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNao_logico(potigolParser.Nao_logicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nao_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNao_logico(potigolParser.Nao_logicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code laco}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLaco(potigolParser.LacoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code laco}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLaco(potigolParser.LacoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterE_logico(potigolParser.E_logicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitE_logico(potigolParser.E_logicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lit}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLit(potigolParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lit}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLit(potigolParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_metodo}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChamada_metodo(potigolParser.Chamada_metodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_metodo}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChamada_metodo(potigolParser.Chamada_metodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparacao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(potigolParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparacao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(potigolParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ou_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOu_logico(potigolParser.Ou_logicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ou_logico}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOu_logico(potigolParser.Ou_logicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_funcao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(potigolParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_funcao}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(potigolParser.Chamada_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mais_menos_unario}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMais_menos_unario(potigolParser.Mais_menos_unarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mais_menos_unario}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMais_menos_unario(potigolParser.Mais_menos_unarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decis}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecis(potigolParser.DecisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decis}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecis(potigolParser.DecisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupla}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTupla(potigolParser.TuplaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupla}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTupla(potigolParser.TuplaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cons}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCons(potigolParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cons}
	 * labeled alternative in {@link potigolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCons(potigolParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterId(potigolParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitId(potigolParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code texto_interpolacao}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTexto_interpolacao(potigolParser.Texto_interpolacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code texto_interpolacao}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTexto_interpolacao(potigolParser.Texto_interpolacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code texto}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTexto(potigolParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code texto}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTexto(potigolParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(potigolParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(potigolParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterReal(potigolParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitReal(potigolParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterChar(potigolParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitChar(potigolParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(potigolParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link potigolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(potigolParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#decisao}.
	 * @param ctx the parse tree
	 */
	void enterDecisao(potigolParser.DecisaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#decisao}.
	 * @param ctx the parse tree
	 */
	void exitDecisao(potigolParser.DecisaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(potigolParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(potigolParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#entao}.
	 * @param ctx the parse tree
	 */
	void enterEntao(potigolParser.EntaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#entao}.
	 * @param ctx the parse tree
	 */
	void exitEntao(potigolParser.EntaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#senaose}.
	 * @param ctx the parse tree
	 */
	void enterSenaose(potigolParser.SenaoseContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#senaose}.
	 * @param ctx the parse tree
	 */
	void exitSenaose(potigolParser.SenaoseContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(potigolParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(potigolParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#escolha}.
	 * @param ctx the parse tree
	 */
	void enterEscolha(potigolParser.EscolhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#escolha}.
	 * @param ctx the parse tree
	 */
	void exitEscolha(potigolParser.EscolhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(potigolParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(potigolParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(potigolParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(potigolParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#para_faca}.
	 * @param ctx the parse tree
	 */
	void enterPara_faca(potigolParser.Para_facaContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#para_faca}.
	 * @param ctx the parse tree
	 */
	void exitPara_faca(potigolParser.Para_facaContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#para_gere}.
	 * @param ctx the parse tree
	 */
	void enterPara_gere(potigolParser.Para_gereContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#para_gere}.
	 * @param ctx the parse tree
	 */
	void exitPara_gere(potigolParser.Para_gereContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(potigolParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(potigolParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#faixa}.
	 * @param ctx the parse tree
	 */
	void enterFaixa(potigolParser.FaixaContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#faixa}.
	 * @param ctx the parse tree
	 */
	void exitFaixa(potigolParser.FaixaContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#faixas}.
	 * @param ctx the parse tree
	 */
	void enterFaixas(potigolParser.FaixasContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#faixas}.
	 * @param ctx the parse tree
	 */
	void exitFaixas(potigolParser.FaixasContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(potigolParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(potigolParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(potigolParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(potigolParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(potigolParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(potigolParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#id1}.
	 * @param ctx the parse tree
	 */
	void enterId1(potigolParser.Id1Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#id1}.
	 * @param ctx the parse tree
	 */
	void exitId1(potigolParser.Id1Context ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#id2}.
	 * @param ctx the parse tree
	 */
	void enterId2(potigolParser.Id2Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#id2}.
	 * @param ctx the parse tree
	 */
	void exitId2(potigolParser.Id2Context ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#tipo2}.
	 * @param ctx the parse tree
	 */
	void enterTipo2(potigolParser.Tipo2Context ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#tipo2}.
	 * @param ctx the parse tree
	 */
	void exitTipo2(potigolParser.Tipo2Context ctx);
	/**
	 * Enter a parse tree produced by {@link potigolParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(potigolParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link potigolParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(potigolParser.ExprlistContext ctx);
}