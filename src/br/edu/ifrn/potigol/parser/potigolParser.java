// Generated from potigol.g4 by ANTLR 4.5.2
package br.edu.ifrn.potigol.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class potigolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, ID=59, INT=60, 
		FLOAT=61, STRING=62, BS=63, MS=64, ES=65, CHAR=66, BOOLEANO=67, WS=68, 
		COMMENT=69, NL=70;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_cmd = 2, RULE_decl = 3, RULE_decl_valor = 4, 
		RULE_decl_funcao = 5, RULE_decl_tipo = 6, RULE_decl_uso = 7, RULE_dcl = 8, 
		RULE_dcl_var = 9, RULE_dcls = 10, RULE_dcl1 = 11, RULE_tipo = 12, RULE_expr = 13, 
		RULE_literal = 14, RULE_decisao = 15, RULE_se = 16, RULE_entao = 17, RULE_senaose = 18, 
		RULE_senao = 19, RULE_escolha = 20, RULE_caso = 21, RULE_padrao = 22, 
		RULE_repeticao = 23, RULE_para_faca = 24, RULE_para_gere = 25, RULE_enquanto = 26, 
		RULE_faixa = 27, RULE_faixas = 28, RULE_bloco = 29, RULE_expr1 = 30, RULE_expr2 = 31, 
		RULE_id1 = 32, RULE_id2 = 33, RULE_qualid = 34, RULE_qualid1 = 35, RULE_qualid2 = 36, 
		RULE_tipo2 = 37, RULE_exprlist = 38;
	public static final String[] ruleNames = {
		"prog", "inst", "cmd", "decl", "decl_valor", "decl_funcao", "decl_tipo", 
		"decl_uso", "dcl", "dcl_var", "dcls", "dcl1", "tipo", "expr", "literal", 
		"decisao", "se", "entao", "senaose", "senao", "escolha", "caso", "padrao", 
		"repeticao", "para_faca", "para_gere", "enquanto", "faixa", "faixas", 
		"bloco", "expr1", "expr2", "id1", "id2", "qualid", "qualid1", "qualid2", 
		"tipo2", "exprlist"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'escreva'", "'imprima'", "':='", "'['", "']'", "'retorne'", "'='", 
		"'var'", "'('", "')'", "':'", "'fim'", "'tipo'", "'use'", "','", "'Tupla('", 
		"'=>'", "'.'", "'^'", "'::'", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", 
		"'formato'", "'>'", "'>='", "'<'", "'<='", "'=='", "'<>'", "'nao'", "'n\\u00e3o'", 
		"'e'", "'ou'", "'_'", "'se'", "'entao'", "'ent\\u00e3o'", "'senaose'", 
		"'sen\\u00e3ose'", "'senao'", "'sen\\u00e3o'", "'escolha'", "'caso'", 
		"'|'", "'para'", "'gere'", "'enquanto'", "'em'", "'de'", "'ate'", "'at\\u00e9'", 
		"'passo'", "'faca'", "'fa\\u00e7a'", null, null, null, null, null, null, 
		null, null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "ID", 
		"INT", "FLOAT", "STRING", "BS", "MS", "ES", "CHAR", "BOOLEANO", "WS", 
		"COMMENT", "NL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "potigol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public potigolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__45) | (1L << T__48) | (1L << T__50) | (1L << T__56) | (1L << T__57) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BS))) != 0) || _la==CHAR || _la==BOOLEANO) {
				{
				{
				setState(78);
				inst();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inst);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				cmd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Atrib_simplesContext extends CmdContext {
		public Qualid1Context qualid1() {
			return getRuleContext(Qualid1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Atrib_simplesContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterAtrib_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitAtrib_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitAtrib_simples(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EscrevaContext extends CmdContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EscrevaContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitEscreva(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImprimaContext extends CmdContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImprimaContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterImprima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitImprima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitImprima(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Set_vetorContext extends CmdContext {
		public QualidContext qualid() {
			return getRuleContext(QualidContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Set_vetorContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterSet_vetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitSet_vetor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitSet_vetor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetorneContext extends CmdContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetorneContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitRetorne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atrib_multiplaContext extends CmdContext {
		public Qualid2Context qualid2() {
			return getRuleContext(Qualid2Context.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Atrib_multiplaContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterAtrib_multipla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitAtrib_multipla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitAtrib_multipla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(T__0);
				setState(91);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ImprimaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__1);
				setState(93);
				expr(0);
				}
				break;
			case 3:
				_localctx = new Atrib_simplesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				qualid1();
				setState(95);
				match(T__2);
				setState(96);
				expr(0);
				}
				break;
			case 4:
				_localctx = new Atrib_multiplaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				qualid2();
				setState(99);
				match(T__2);
				setState(100);
				expr2();
				}
				break;
			case 5:
				_localctx = new Set_vetorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				qualid();
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					match(T__3);
					setState(104);
					expr(0);
					setState(105);
					match(T__4);
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(111);
				match(T__2);
				setState(112);
				expr(0);
				}
				break;
			case 6:
				_localctx = new RetorneContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(T__5);
				setState(115);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Decl_valorContext decl_valor() {
			return getRuleContext(Decl_valorContext.class,0);
		}
		public Decl_funcaoContext decl_funcao() {
			return getRuleContext(Decl_funcaoContext.class,0);
		}
		public Decl_tipoContext decl_tipo() {
			return getRuleContext(Decl_tipoContext.class,0);
		}
		public Decl_usoContext decl_uso() {
			return getRuleContext(Decl_usoContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				decl_valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				decl_funcao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				decl_tipo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				decl_uso();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_valorContext extends ParserRuleContext {
		public Decl_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_valor; }
	 
		public Decl_valorContext() { }
		public void copyFrom(Decl_valorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Decl_var_multiplaContext extends Decl_valorContext {
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Decl_var_multiplaContext(Decl_valorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDecl_var_multipla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDecl_var_multipla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDecl_var_multipla(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Valor_multiploContext extends Decl_valorContext {
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Valor_multiploContext(Decl_valorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterValor_multiplo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitValor_multiplo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitValor_multiplo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Valor_simplesContext extends Decl_valorContext {
		public Id1Context id1() {
			return getRuleContext(Id1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Valor_simplesContext(Decl_valorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterValor_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitValor_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitValor_simples(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Decl_var_simplesContext extends Decl_valorContext {
		public Id1Context id1() {
			return getRuleContext(Id1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Decl_var_simplesContext(Decl_valorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDecl_var_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDecl_var_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDecl_var_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_valorContext decl_valor() throws RecognitionException {
		Decl_valorContext _localctx = new Decl_valorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl_valor);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Valor_simplesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				id1();
				setState(125);
				match(T__6);
				setState(126);
				expr(0);
				}
				break;
			case 2:
				_localctx = new Valor_multiploContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				id2();
				setState(129);
				match(T__6);
				setState(130);
				expr2();
				}
				break;
			case 3:
				_localctx = new Decl_var_simplesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__7);
				setState(133);
				id1();
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(135);
				expr(0);
				}
				break;
			case 4:
				_localctx = new Decl_var_multiplaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(T__7);
				setState(138);
				id2();
				setState(139);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(140);
				expr2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_funcaoContext extends ParserRuleContext {
		public Decl_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_funcao; }
	 
		public Decl_funcaoContext() { }
		public void copyFrom(Decl_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Def_funcaoContext extends Decl_funcaoContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public DclsContext dcls() {
			return getRuleContext(DclsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Def_funcaoContext(Decl_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDef_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDef_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDef_funcao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Def_funcao_corpoContext extends Decl_funcaoContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public DclsContext dcls() {
			return getRuleContext(DclsContext.class,0);
		}
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Def_funcao_corpoContext(Decl_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDef_funcao_corpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDef_funcao_corpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDef_funcao_corpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_funcaoContext decl_funcao() throws RecognitionException {
		Decl_funcaoContext _localctx = new Decl_funcaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decl_funcao);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Def_funcaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(ID);
				setState(145);
				match(T__8);
				setState(146);
				dcls();
				setState(147);
				match(T__9);
				setState(150);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(148);
					match(T__10);
					setState(149);
					tipo(0);
					}
				}

				setState(152);
				match(T__6);
				setState(153);
				expr(0);
				}
				break;
			case 2:
				_localctx = new Def_funcao_corpoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ID);
				setState(156);
				match(T__8);
				setState(157);
				dcls();
				setState(158);
				match(T__9);
				setState(161);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(159);
					match(T__10);
					setState(160);
					tipo(0);
					}
				}

				setState(163);
				exprlist();
				setState(164);
				match(T__11);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_tipoContext extends ParserRuleContext {
		public Decl_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_tipo; }
	 
		public Decl_tipoContext() { }
		public void copyFrom(Decl_tipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClasseContext extends Decl_tipoContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public List<Dcl_varContext> dcl_var() {
			return getRuleContexts(Dcl_varContext.class);
		}
		public Dcl_varContext dcl_var(int i) {
			return getRuleContext(Dcl_varContext.class,i);
		}
		public List<Decl_funcaoContext> decl_funcao() {
			return getRuleContexts(Decl_funcaoContext.class);
		}
		public Decl_funcaoContext decl_funcao(int i) {
			return getRuleContext(Decl_funcaoContext.class,i);
		}
		public List<Decl_valorContext> decl_valor() {
			return getRuleContexts(Decl_valorContext.class);
		}
		public Decl_valorContext decl_valor(int i) {
			return getRuleContext(Decl_valorContext.class,i);
		}
		public ClasseContext(Decl_tipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitClasse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasContext extends Decl_tipoContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public AliasContext(Decl_tipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_tipoContext decl_tipo() throws RecognitionException {
		Decl_tipoContext _localctx = new Decl_tipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl_tipo);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__12);
				setState(169);
				match(ID);
				setState(170);
				match(T__6);
				setState(171);
				tipo(0);
				}
				break;
			case 2:
				_localctx = new ClasseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__12);
				setState(173);
				match(ID);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==ID) {
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(174);
						dcl();
						}
						break;
					case 2:
						{
						setState(175);
						dcl_var();
						}
						break;
					case 3:
						{
						setState(176);
						decl_funcao();
						}
						break;
					case 4:
						{
						setState(177);
						decl_valor();
						}
						break;
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__11);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_usoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(potigolParser.STRING, 0); }
		public Decl_usoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_uso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDecl_uso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDecl_uso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDecl_uso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_usoContext decl_uso() throws RecognitionException {
		Decl_usoContext _localctx = new Decl_usoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl_uso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__13);
			setState(187);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclContext extends ParserRuleContext {
		public Id1Context id1() {
			return getRuleContext(Id1Context.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			id1();
			setState(190);
			match(T__10);
			setState(191);
			tipo(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dcl_varContext extends ParserRuleContext {
		public Id1Context id1() {
			return getRuleContext(Id1Context.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dcl_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDcl_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDcl_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDcl_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl_varContext dcl_var() throws RecognitionException {
		Dcl_varContext _localctx = new Dcl_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dcl_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__7);
			setState(194);
			id1();
			setState(195);
			match(T__10);
			setState(196);
			tipo(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclsContext extends ParserRuleContext {
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public DclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDcls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDcls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDcls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclsContext dcls() throws RecognitionException {
		DclsContext _localctx = new DclsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dcls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(198);
				dcl();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(199);
					match(T__14);
					setState(200);
					dcl();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dcl1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public DclsContext dcls() {
			return getRuleContext(DclsContext.class,0);
		}
		public Dcl1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDcl1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDcl1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDcl1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl1Context dcl1() throws RecognitionException {
		Dcl1Context _localctx = new Dcl1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_dcl1);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__8);
				setState(210);
				expr2();
				setState(211);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__8);
				setState(214);
				dcls();
				setState(215);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Tipo_simplesContext extends TipoContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public Tipo_simplesContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterTipo_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitTipo_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitTipo_simples(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tipo_funcaoContext extends TipoContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public Tipo_funcaoContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterTipo_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitTipo_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitTipo_funcao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tipo_genericoContext extends TipoContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Tipo_genericoContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterTipo_generico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitTipo_generico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitTipo_generico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tipo_tuplaContext extends TipoContext {
		public Tipo2Context tipo2() {
			return getRuleContext(Tipo2Context.class,0);
		}
		public Tipo_tuplaContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterTipo_tupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitTipo_tupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitTipo_tupla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		return tipo(0);
	}

	private TipoContext tipo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TipoContext _localctx = new TipoContext(_ctx, _parentState);
		TipoContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_tipo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new Tipo_simplesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(220);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new Tipo_tuplaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(T__15);
				setState(222);
				tipo2();
				setState(223);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new Tipo_genericoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(ID);
				setState(226);
				match(T__3);
				setState(227);
				tipo(0);
				setState(228);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tipo_funcaoContext(new TipoContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tipo);
					setState(232);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(233);
					match(T__16);
					setState(234);
					tipo(2);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListaContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ListaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpoenteContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpoenteContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterExpoente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitExpoente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitExpoente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Get_vetorContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Get_vetorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterGet_vetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitGet_vetor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitGet_vetor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormatoContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FormatoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterFormato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitFormato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitFormato(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Soma_subContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Soma_subContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterSoma_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitSoma_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitSoma_sub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mult_divContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Mult_divContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterMult_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitMult_div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitMult_div(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends ExprContext {
		public Dcl1Context dcl1() {
			return getRuleContext(Dcl1Context.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public LambdaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nao_logicoContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Nao_logicoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterNao_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitNao_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitNao_logico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LacoContext extends ExprContext {
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public LacoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterLaco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitLaco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitLaco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_logicoContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public E_logicoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterE_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitE_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitE_logico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LitContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Chamada_metodoContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Chamada_metodoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterChamada_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitChamada_metodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitChamada_metodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparacaoContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparacaoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitComparacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitComparacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ou_logicoContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Ou_logicoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterOu_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitOu_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitOu_logico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Chamada_funcaoContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Chamada_funcaoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitChamada_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitChamada_funcao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CuringaContext extends ExprContext {
		public CuringaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterCuringa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitCuringa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitCuringa(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mais_menos_unarioContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Mais_menos_unarioContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterMais_menos_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitMais_menos_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitMais_menos_unario(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecisContext extends ExprContext {
		public DecisaoContext decisao() {
			return getRuleContext(DecisaoContext.class,0);
		}
		public DecisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDecis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDecis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDecis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TuplaContext extends ExprContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TuplaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterTupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitTupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitTupla(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterCons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitCons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitCons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new Mais_menos_unarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(242);
				expr(15);
				}
				break;
			case 2:
				{
				_localctx = new Nao_logicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==T__33 || _la==T__34) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(244);
				expr(10);
				}
				break;
			case 3:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				dcl1();
				setState(247);
				match(T__16);
				setState(248);
				inst();
				}
				break;
			case 5:
				{
				_localctx = new DecisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				decisao();
				}
				break;
			case 6:
				{
				_localctx = new LacoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				repeticao();
				}
				break;
			case 7:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(T__8);
				setState(253);
				expr(0);
				setState(254);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new TuplaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(T__15);
				setState(257);
				expr2();
				setState(258);
				match(T__9);
				}
				break;
			case 9:
				{
				_localctx = new ListaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(T__3);
				setState(262);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__8 - 4)) | (1L << (T__15 - 4)) | (1L << (T__20 - 4)) | (1L << (T__21 - 4)) | (1L << (T__33 - 4)) | (1L << (T__34 - 4)) | (1L << (T__37 - 4)) | (1L << (T__38 - 4)) | (1L << (T__45 - 4)) | (1L << (T__48 - 4)) | (1L << (T__50 - 4)) | (1L << (ID - 4)) | (1L << (INT - 4)) | (1L << (FLOAT - 4)) | (1L << (STRING - 4)) | (1L << (BS - 4)) | (1L << (CHAR - 4)) | (1L << (BOOLEANO - 4)))) != 0)) {
					{
					setState(261);
					expr1();
					}
				}

				setState(264);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new CuringaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(T__37);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpoenteContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(269);
						match(T__18);
						setState(270);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ConsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(272);
						match(T__19);
						setState(273);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new Mult_divContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(275);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(276);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new Soma_subContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(278);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(279);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new FormatoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(281);
						match(T__26);
						setState(282);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ComparacaoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(284);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(285);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new E_logicoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(287);
						match(T__35);
						setState(288);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new Ou_logicoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(290);
						match(T__36);
						setState(291);
						expr(9);
						}
						break;
					case 9:
						{
						_localctx = new Chamada_metodoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(293);
						match(T__17);
						setState(294);
						match(ID);
						setState(299);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(295);
							match(T__8);
							setState(296);
							expr1();
							setState(297);
							match(T__9);
							}
							break;
						}
						}
						break;
					case 10:
						{
						_localctx = new Chamada_funcaoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(302);
						match(T__8);
						setState(304);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__8 - 4)) | (1L << (T__15 - 4)) | (1L << (T__20 - 4)) | (1L << (T__21 - 4)) | (1L << (T__33 - 4)) | (1L << (T__34 - 4)) | (1L << (T__37 - 4)) | (1L << (T__38 - 4)) | (1L << (T__45 - 4)) | (1L << (T__48 - 4)) | (1L << (T__50 - 4)) | (1L << (ID - 4)) | (1L << (INT - 4)) | (1L << (FLOAT - 4)) | (1L << (STRING - 4)) | (1L << (BS - 4)) | (1L << (CHAR - 4)) | (1L << (BOOLEANO - 4)))) != 0)) {
							{
							setState(303);
							expr1();
							}
						}

						setState(306);
						match(T__9);
						}
						break;
					case 11:
						{
						_localctx = new Get_vetorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(308);
						match(T__3);
						setState(309);
						expr(0);
						setState(310);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TextoContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(potigolParser.STRING, 0); }
		public TextoContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanoContext extends LiteralContext {
		public TerminalNode BOOLEANO() { return getToken(potigolParser.BOOLEANO, 0); }
		public BooleanoContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InteiroContext extends LiteralContext {
		public TerminalNode INT() { return getToken(potigolParser.INT, 0); }
		public InteiroContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends LiteralContext {
		public TerminalNode CHAR() { return getToken(potigolParser.CHAR, 0); }
		public CharContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Texto_interpolacaoContext extends LiteralContext {
		public TerminalNode BS() { return getToken(potigolParser.BS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ES() { return getToken(potigolParser.ES, 0); }
		public List<TerminalNode> MS() { return getTokens(potigolParser.MS); }
		public TerminalNode MS(int i) {
			return getToken(potigolParser.MS, i);
		}
		public Texto_interpolacaoContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterTexto_interpolacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitTexto_interpolacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitTexto_interpolacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends LiteralContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public IdContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealContext extends LiteralContext {
		public TerminalNode FLOAT() { return getToken(potigolParser.FLOAT, 0); }
		public RealContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		int _la;
		try {
			setState(334);
			switch (_input.LA(1)) {
			case BOOLEANO:
				_localctx = new BooleanoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(BOOLEANO);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(ID);
				}
				break;
			case BS:
				_localctx = new Texto_interpolacaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(BS);
				setState(320);
				expr(0);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MS) {
					{
					{
					setState(321);
					match(MS);
					setState(322);
					expr(0);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(ES);
				}
				break;
			case STRING:
				_localctx = new TextoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new InteiroContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(333);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecisaoContext extends ParserRuleContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public EscolhaContext escolha() {
			return getRuleContext(EscolhaContext.class,0);
		}
		public DecisaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterDecisao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitDecisao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitDecisao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecisaoContext decisao() throws RecognitionException {
		DecisaoContext _localctx = new DecisaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decisao);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				se();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				escolha();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EntaoContext entao() {
			return getRuleContext(EntaoContext.class,0);
		}
		public List<SenaoseContext> senaose() {
			return getRuleContexts(SenaoseContext.class);
		}
		public SenaoseContext senaose(int i) {
			return getRuleContext(SenaoseContext.class,i);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__38);
			setState(341);
			expr(0);
			setState(342);
			entao();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41 || _la==T__42) {
				{
				{
				setState(343);
				senaose();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			_la = _input.LA(1);
			if (_la==T__43 || _la==T__44) {
				{
				setState(349);
				senao();
				}
			}

			setState(352);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntaoContext extends ParserRuleContext {
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public EntaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterEntao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitEntao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitEntao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntaoContext entao() throws RecognitionException {
		EntaoContext _localctx = new EntaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_entao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if (_la==T__39 || _la==T__40) {
				{
				setState(354);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(357);
			exprlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenaoseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EntaoContext entao() {
			return getRuleContext(EntaoContext.class,0);
		}
		public SenaoseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senaose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterSenaose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitSenaose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitSenaose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoseContext senaose() throws RecognitionException {
		SenaoseContext _localctx = new SenaoseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_senaose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(360);
			expr(0);
			setState(361);
			entao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenaoContext extends ParserRuleContext {
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitSenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_senao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(364);
			exprlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscolhaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public EscolhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escolha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitEscolha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitEscolha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscolhaContext escolha() throws RecognitionException {
		EscolhaContext _localctx = new EscolhaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_escolha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__45);
			setState(367);
			expr(0);
			setState(369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				caso();
				}
				}
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__46 );
			setState(373);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__46);
			setState(376);
			expr(0);
			setState(379);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(377);
				match(T__38);
				setState(378);
				expr(0);
				}
			}

			setState(381);
			match(T__16);
			setState(382);
			exprlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PadraoContext extends ParserRuleContext {
		public PadraoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padrao; }
	 
		public PadraoContext() { }
		public void copyFrom(PadraoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Padrao_consContext extends PadraoContext {
		public List<PadraoContext> padrao() {
			return getRuleContexts(PadraoContext.class);
		}
		public PadraoContext padrao(int i) {
			return getRuleContext(PadraoContext.class,i);
		}
		public Padrao_consContext(PadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPadrao_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPadrao_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPadrao_cons(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Padrao_defaultContext extends PadraoContext {
		public Padrao_defaultContext(PadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPadrao_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPadrao_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPadrao_default(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Padrao_literalContext extends PadraoContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Padrao_literalContext(PadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPadrao_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPadrao_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPadrao_literal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Padrao_objetoContext extends PadraoContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public PadraoContext padrao() {
			return getRuleContext(PadraoContext.class,0);
		}
		public Padrao_objetoContext(PadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPadrao_objeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPadrao_objeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPadrao_objeto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Padrao_tuplaContext extends PadraoContext {
		public List<PadraoContext> padrao() {
			return getRuleContexts(PadraoContext.class);
		}
		public PadraoContext padrao(int i) {
			return getRuleContext(PadraoContext.class,i);
		}
		public Padrao_tuplaContext(PadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPadrao_tupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPadrao_tupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPadrao_tupla(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Padrao_idContext extends PadraoContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public Padrao_idContext(PadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPadrao_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPadrao_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPadrao_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Padrao_ouContext extends PadraoContext {
		public List<PadraoContext> padrao() {
			return getRuleContexts(PadraoContext.class);
		}
		public PadraoContext padrao(int i) {
			return getRuleContext(PadraoContext.class,i);
		}
		public Padrao_ouContext(PadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPadrao_ou(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPadrao_ou(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPadrao_ou(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Padrao_virgulaContext extends PadraoContext {
		public List<PadraoContext> padrao() {
			return getRuleContexts(PadraoContext.class);
		}
		public PadraoContext padrao(int i) {
			return getRuleContext(PadraoContext.class,i);
		}
		public Padrao_virgulaContext(PadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPadrao_virgula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPadrao_virgula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPadrao_virgula(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Padrao_listaContext extends PadraoContext {
		public PadraoContext padrao() {
			return getRuleContext(PadraoContext.class,0);
		}
		public Padrao_listaContext(PadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPadrao_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPadrao_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPadrao_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PadraoContext padrao() throws RecognitionException {
		return padrao(0);
	}

	private PadraoContext padrao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PadraoContext _localctx = new PadraoContext(_ctx, _parentState);
		PadraoContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_padrao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new Padrao_defaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(385);
				match(T__37);
				}
				break;
			case 2:
				{
				_localctx = new Padrao_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(386);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new Padrao_literalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new Padrao_objetoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(388);
				match(ID);
				setState(389);
				match(T__8);
				setState(390);
				padrao(0);
				setState(391);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new Padrao_tuplaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				match(T__8);
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(394);
					padrao(0);
					}
					}
					setState(397); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__8 - 4)) | (1L << (T__37 - 4)) | (1L << (ID - 4)) | (1L << (INT - 4)) | (1L << (FLOAT - 4)) | (1L << (STRING - 4)) | (1L << (BS - 4)) | (1L << (CHAR - 4)) | (1L << (BOOLEANO - 4)))) != 0) );
				setState(399);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new Padrao_listaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401);
				match(T__3);
				setState(403);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__8 - 4)) | (1L << (T__37 - 4)) | (1L << (ID - 4)) | (1L << (INT - 4)) | (1L << (FLOAT - 4)) | (1L << (STRING - 4)) | (1L << (BS - 4)) | (1L << (CHAR - 4)) | (1L << (BOOLEANO - 4)))) != 0)) {
					{
					setState(402);
					padrao(0);
					}
				}

				setState(405);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new Padrao_consContext(new PadraoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_padrao);
						setState(408);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(411); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(409);
								match(T__19);
								setState(410);
								padrao(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(413); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new Padrao_ouContext(new PadraoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_padrao);
						setState(415);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(418); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(416);
								match(T__47);
								setState(417);
								padrao(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(420); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new Padrao_virgulaContext(new PadraoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_padrao);
						setState(422);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(425); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(423);
								match(T__14);
								setState(424);
								padrao(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(427); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RepeticaoContext extends ParserRuleContext {
		public Para_facaContext para_faca() {
			return getRuleContext(Para_facaContext.class,0);
		}
		public Para_gereContext para_gere() {
			return getRuleContext(Para_gereContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_repeticao);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				para_faca();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				para_gere();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				enquanto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Para_facaContext extends ParserRuleContext {
		public FaixasContext faixas() {
			return getRuleContext(FaixasContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Para_facaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_faca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPara_faca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPara_faca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPara_faca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_facaContext para_faca() throws RecognitionException {
		Para_facaContext _localctx = new Para_facaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_para_faca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__48);
			setState(440);
			faixas();
			setState(443);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(441);
				match(T__38);
				setState(442);
				expr(0);
				}
			}

			setState(445);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Para_gereContext extends ParserRuleContext {
		public FaixasContext faixas() {
			return getRuleContext(FaixasContext.class,0);
		}
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Para_gereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_gere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterPara_gere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitPara_gere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitPara_gere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_gereContext para_gere() throws RecognitionException {
		Para_gereContext _localctx = new Para_gereContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_para_gere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__48);
			setState(448);
			faixas();
			setState(451);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(449);
				match(T__38);
				setState(450);
				expr(0);
				}
			}

			setState(453);
			match(T__49);
			setState(454);
			exprlist();
			setState(455);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnquantoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T__50);
			setState(458);
			expr(0);
			setState(459);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaixaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FaixaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faixa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterFaixa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitFaixa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitFaixa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaixaContext faixa() throws RecognitionException {
		FaixaContext _localctx = new FaixaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_faixa);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(ID);
				setState(462);
				match(T__51);
				setState(463);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(ID);
				setState(465);
				match(T__52);
				setState(466);
				expr(0);
				setState(467);
				_la = _input.LA(1);
				if ( !(_la==T__53 || _la==T__54) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(468);
				expr(0);
				setState(471);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(469);
					match(T__55);
					setState(470);
					expr(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaixasContext extends ParserRuleContext {
		public List<FaixaContext> faixa() {
			return getRuleContexts(FaixaContext.class);
		}
		public FaixaContext faixa(int i) {
			return getRuleContext(FaixaContext.class,i);
		}
		public FaixasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faixas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterFaixas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitFaixas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitFaixas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaixasContext faixas() throws RecognitionException {
		FaixasContext _localctx = new FaixasContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_faixas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			faixa();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(476);
				match(T__14);
				setState(477);
				faixa();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !(_la==T__56 || _la==T__57) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(484);
			exprlist();
			setState(485);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			expr(0);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(488);
				match(T__14);
				setState(489);
				expr(0);
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr2Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			expr(0);
			setState(498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(496);
					match(T__14);
					setState(497);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id1Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(potigolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(potigolParser.ID, i);
		}
		public Id1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterId1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitId1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitId1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id1Context id1() throws RecognitionException {
		Id1Context _localctx = new Id1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_id1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(ID);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(503);
				match(T__14);
				setState(504);
				match(ID);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id2Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(potigolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(potigolParser.ID, i);
		}
		public Id2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterId2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitId2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitId2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id2Context id2() throws RecognitionException {
		Id2Context _localctx = new Id2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_id2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(ID);
			setState(513); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(511);
				match(T__14);
				setState(512);
				match(ID);
				}
				}
				setState(515); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualidContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(potigolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(potigolParser.ID, i);
		}
		public QualidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterQualid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitQualid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitQualid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualidContext qualid() throws RecognitionException {
		QualidContext _localctx = new QualidContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_qualid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(517);
					match(ID);
					setState(518);
					match(T__17);
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(524);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualid1Context extends ParserRuleContext {
		public List<QualidContext> qualid() {
			return getRuleContexts(QualidContext.class);
		}
		public QualidContext qualid(int i) {
			return getRuleContext(QualidContext.class,i);
		}
		public Qualid1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualid1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterQualid1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitQualid1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitQualid1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualid1Context qualid1() throws RecognitionException {
		Qualid1Context _localctx = new Qualid1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_qualid1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			qualid();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(527);
				match(T__14);
				setState(528);
				qualid();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualid2Context extends ParserRuleContext {
		public List<QualidContext> qualid() {
			return getRuleContexts(QualidContext.class);
		}
		public QualidContext qualid(int i) {
			return getRuleContext(QualidContext.class,i);
		}
		public Qualid2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualid2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterQualid2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitQualid2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitQualid2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualid2Context qualid2() throws RecognitionException {
		Qualid2Context _localctx = new Qualid2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_qualid2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			qualid();
			setState(537); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(535);
				match(T__14);
				setState(536);
				qualid();
				}
				}
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo2Context extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public Tipo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterTipo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitTipo2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitTipo2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo2Context tipo2() throws RecognitionException {
		Tipo2Context _localctx = new Tipo2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_tipo2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			tipo(0);
			setState(544); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(542);
				match(T__14);
				setState(543);
				tipo(0);
				}
				}
				setState(546); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprlistContext extends ParserRuleContext {
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof potigolListener ) ((potigolListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof potigolVisitor ) return ((potigolVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__45) | (1L << T__48) | (1L << T__50) | (1L << T__56) | (1L << T__57) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BS))) != 0) || _la==CHAR || _la==BOOLEANO) {
				{
				{
				setState(548);
				inst();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return tipo_sempred((TipoContext)_localctx, predIndex);
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 22:
			return padrao_sempred((PadraoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tipo_sempred(TipoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 20);
		case 10:
			return precpred(_ctx, 19);
		case 11:
			return precpred(_ctx, 18);
		}
		return true;
	}
	private boolean padrao_sempred(PadraoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u022d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4n\n\4\r\4\16\4o\3\4\3\4\3\4\3\4\3"+
		"\4\5\4w\n\4\3\5\3\5\3\5\3\5\5\5}\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0091\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0099\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a4\n\7"+
		"\3\7\3\7\3\7\5\7\u00a9\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00b5\n\b\f\b\16\b\u00b8\13\b\3\b\5\b\u00bb\n\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00cc\n\f\f\f\16\f\u00cf"+
		"\13\f\5\f\u00d1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dc\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e9\n\16"+
		"\3\16\3\16\3\16\7\16\u00ee\n\16\f\16\16\16\u00f1\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0109\n\17\3\17\3\17\5\17\u010d\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u012e\n\17\3\17\3\17\3\17\5\17\u0133\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u013b\n\17\f\17\16\17\u013e\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0146\n\20\f\20\16\20\u0149\13\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0151\n\20\3\21\3\21\5\21\u0155\n\21\3\22\3"+
		"\22\3\22\3\22\7\22\u015b\n\22\f\22\16\22\u015e\13\22\3\22\5\22\u0161\n"+
		"\22\3\22\3\22\3\23\5\23\u0166\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\6\26\u0174\n\26\r\26\16\26\u0175\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\5\27\u017e\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u018e\n\30\r\30\16\30\u018f\3"+
		"\30\3\30\3\30\3\30\5\30\u0196\n\30\3\30\5\30\u0199\n\30\3\30\3\30\3\30"+
		"\6\30\u019e\n\30\r\30\16\30\u019f\3\30\3\30\3\30\6\30\u01a5\n\30\r\30"+
		"\16\30\u01a6\3\30\3\30\3\30\6\30\u01ac\n\30\r\30\16\30\u01ad\7\30\u01b0"+
		"\n\30\f\30\16\30\u01b3\13\30\3\31\3\31\3\31\5\31\u01b8\n\31\3\32\3\32"+
		"\3\32\3\32\5\32\u01be\n\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u01c6\n"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\5\35\u01da\n\35\5\35\u01dc\n\35\3\36\3\36\3\36"+
		"\7\36\u01e1\n\36\f\36\16\36\u01e4\13\36\3\37\3\37\3\37\3\37\3 \3 \3 \7"+
		" \u01ed\n \f \16 \u01f0\13 \3!\3!\3!\6!\u01f5\n!\r!\16!\u01f6\3\"\3\""+
		"\3\"\7\"\u01fc\n\"\f\"\16\"\u01ff\13\"\3#\3#\3#\6#\u0204\n#\r#\16#\u0205"+
		"\3$\3$\7$\u020a\n$\f$\16$\u020d\13$\3$\3$\3%\3%\3%\7%\u0214\n%\f%\16%"+
		"\u0217\13%\3&\3&\3&\6&\u021c\n&\r&\16&\u021d\3\'\3\'\3\'\6\'\u0223\n\'"+
		"\r\'\16\'\u0224\3(\7(\u0228\n(\f(\16(\u022b\13(\3(\2\5\32\34.)\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\f\4"+
		"\2\5\5\t\t\3\2\27\30\3\2$%\3\2\31\34\3\2\36#\3\2*+\3\2,-\3\2./\3\289\3"+
		"\2;<\u0265\2S\3\2\2\2\4Z\3\2\2\2\6v\3\2\2\2\b|\3\2\2\2\n\u0090\3\2\2\2"+
		"\f\u00a8\3\2\2\2\16\u00ba\3\2\2\2\20\u00bc\3\2\2\2\22\u00bf\3\2\2\2\24"+
		"\u00c3\3\2\2\2\26\u00d0\3\2\2\2\30\u00db\3\2\2\2\32\u00e8\3\2\2\2\34\u010c"+
		"\3\2\2\2\36\u0150\3\2\2\2 \u0154\3\2\2\2\"\u0156\3\2\2\2$\u0165\3\2\2"+
		"\2&\u0169\3\2\2\2(\u016d\3\2\2\2*\u0170\3\2\2\2,\u0179\3\2\2\2.\u0198"+
		"\3\2\2\2\60\u01b7\3\2\2\2\62\u01b9\3\2\2\2\64\u01c1\3\2\2\2\66\u01cb\3"+
		"\2\2\28\u01db\3\2\2\2:\u01dd\3\2\2\2<\u01e5\3\2\2\2>\u01e9\3\2\2\2@\u01f1"+
		"\3\2\2\2B\u01f8\3\2\2\2D\u0200\3\2\2\2F\u020b\3\2\2\2H\u0210\3\2\2\2J"+
		"\u0218\3\2\2\2L\u021f\3\2\2\2N\u0229\3\2\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2T\3\3\2\2\2US\3\2\2\2V[\5\b\5\2W[\5\34\17\2X["+
		"\5<\37\2Y[\5\6\4\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\5\3\2\2\2"+
		"\\]\7\3\2\2]w\5\34\17\2^_\7\4\2\2_w\5\34\17\2`a\5H%\2ab\7\5\2\2bc\5\34"+
		"\17\2cw\3\2\2\2de\5J&\2ef\7\5\2\2fg\5@!\2gw\3\2\2\2hm\5F$\2ij\7\6\2\2"+
		"jk\5\34\17\2kl\7\7\2\2ln\3\2\2\2mi\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2pq\3\2\2\2qr\7\5\2\2rs\5\34\17\2sw\3\2\2\2tu\7\b\2\2uw\5\34\17\2v\\"+
		"\3\2\2\2v^\3\2\2\2v`\3\2\2\2vd\3\2\2\2vh\3\2\2\2vt\3\2\2\2w\7\3\2\2\2"+
		"x}\5\n\6\2y}\5\f\7\2z}\5\16\b\2{}\5\20\t\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2"+
		"\2|{\3\2\2\2}\t\3\2\2\2~\177\5B\"\2\177\u0080\7\t\2\2\u0080\u0081\5\34"+
		"\17\2\u0081\u0091\3\2\2\2\u0082\u0083\5D#\2\u0083\u0084\7\t\2\2\u0084"+
		"\u0085\5@!\2\u0085\u0091\3\2\2\2\u0086\u0087\7\n\2\2\u0087\u0088\5B\""+
		"\2\u0088\u0089\t\2\2\2\u0089\u008a\5\34\17\2\u008a\u0091\3\2\2\2\u008b"+
		"\u008c\7\n\2\2\u008c\u008d\5D#\2\u008d\u008e\t\2\2\2\u008e\u008f\5@!\2"+
		"\u008f\u0091\3\2\2\2\u0090~\3\2\2\2\u0090\u0082\3\2\2\2\u0090\u0086\3"+
		"\2\2\2\u0090\u008b\3\2\2\2\u0091\13\3\2\2\2\u0092\u0093\7=\2\2\u0093\u0094"+
		"\7\13\2\2\u0094\u0095\5\26\f\2\u0095\u0098\7\f\2\2\u0096\u0097\7\r\2\2"+
		"\u0097\u0099\5\32\16\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\7\t\2\2\u009b\u009c\5\34\17\2\u009c\u00a9\3\2\2\2"+
		"\u009d\u009e\7=\2\2\u009e\u009f\7\13\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a3"+
		"\7\f\2\2\u00a1\u00a2\7\r\2\2\u00a2\u00a4\5\32\16\2\u00a3\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5N(\2\u00a6\u00a7"+
		"\7\16\2\2\u00a7\u00a9\3\2\2\2\u00a8\u0092\3\2\2\2\u00a8\u009d\3\2\2\2"+
		"\u00a9\r\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00ac\7=\2\2\u00ac\u00ad\7"+
		"\t\2\2\u00ad\u00bb\5\32\16\2\u00ae\u00af\7\17\2\2\u00af\u00b6\7=\2\2\u00b0"+
		"\u00b5\5\22\n\2\u00b1\u00b5\5\24\13\2\u00b2\u00b5\5\f\7\2\u00b3\u00b5"+
		"\5\n\6\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7\16\2\2\u00ba"+
		"\u00aa\3\2\2\2\u00ba\u00ae\3\2\2\2\u00bb\17\3\2\2\2\u00bc\u00bd\7\20\2"+
		"\2\u00bd\u00be\7@\2\2\u00be\21\3\2\2\2\u00bf\u00c0\5B\"\2\u00c0\u00c1"+
		"\7\r\2\2\u00c1\u00c2\5\32\16\2\u00c2\23\3\2\2\2\u00c3\u00c4\7\n\2\2\u00c4"+
		"\u00c5\5B\"\2\u00c5\u00c6\7\r\2\2\u00c6\u00c7\5\32\16\2\u00c7\25\3\2\2"+
		"\2\u00c8\u00cd\5\22\n\2\u00c9\u00ca\7\21\2\2\u00ca\u00cc\5\22\n\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\27\3\2\2\2\u00d2\u00dc\7=\2\2\u00d3\u00d4\7\13\2"+
		"\2\u00d4\u00d5\5@!\2\u00d5\u00d6\7\f\2\2\u00d6\u00dc\3\2\2\2\u00d7\u00d8"+
		"\7\13\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00da\7\f\2\2\u00da\u00dc\3\2\2\2"+
		"\u00db\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc\31"+
		"\3\2\2\2\u00dd\u00de\b\16\1\2\u00de\u00e9\7=\2\2\u00df\u00e0\7\22\2\2"+
		"\u00e0\u00e1\5L\'\2\u00e1\u00e2\7\f\2\2\u00e2\u00e9\3\2\2\2\u00e3\u00e4"+
		"\7=\2\2\u00e4\u00e5\7\6\2\2\u00e5\u00e6\5\32\16\2\u00e6\u00e7\7\7\2\2"+
		"\u00e7\u00e9\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e3"+
		"\3\2\2\2\u00e9\u00ef\3\2\2\2\u00ea\u00eb\f\3\2\2\u00eb\u00ec\7\23\2\2"+
		"\u00ec\u00ee\5\32\16\4\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\b\17\1\2\u00f3\u00f4\t\3\2\2\u00f4\u010d\5\34\17\21\u00f5\u00f6"+
		"\t\4\2\2\u00f6\u010d\5\34\17\f\u00f7\u010d\5\36\20\2\u00f8\u00f9\5\30"+
		"\r\2\u00f9\u00fa\7\23\2\2\u00fa\u00fb\5\4\3\2\u00fb\u010d\3\2\2\2\u00fc"+
		"\u010d\5 \21\2\u00fd\u010d\5\60\31\2\u00fe\u00ff\7\13\2\2\u00ff\u0100"+
		"\5\34\17\2\u0100\u0101\7\f\2\2\u0101\u010d\3\2\2\2\u0102\u0103\7\22\2"+
		"\2\u0103\u0104\5@!\2\u0104\u0105\7\f\2\2\u0105\u010d\3\2\2\2\u0106\u0108"+
		"\7\6\2\2\u0107\u0109\5> \2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010d\7\7\2\2\u010b\u010d\7(\2\2\u010c\u00f2\3\2"+
		"\2\2\u010c\u00f5\3\2\2\2\u010c\u00f7\3\2\2\2\u010c\u00f8\3\2\2\2\u010c"+
		"\u00fc\3\2\2\2\u010c\u00fd\3\2\2\2\u010c\u00fe\3\2\2\2\u010c\u0102\3\2"+
		"\2\2\u010c\u0106\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u013c\3\2\2\2\u010e"+
		"\u010f\f\23\2\2\u010f\u0110\7\25\2\2\u0110\u013b\5\34\17\23\u0111\u0112"+
		"\f\22\2\2\u0112\u0113\7\26\2\2\u0113\u013b\5\34\17\22\u0114\u0115\f\20"+
		"\2\2\u0115\u0116\t\5\2\2\u0116\u013b\5\34\17\21\u0117\u0118\f\17\2\2\u0118"+
		"\u0119\t\3\2\2\u0119\u013b\5\34\17\20\u011a\u011b\f\16\2\2\u011b\u011c"+
		"\7\35\2\2\u011c\u013b\5\34\17\17\u011d\u011e\f\r\2\2\u011e\u011f\t\6\2"+
		"\2\u011f\u013b\5\34\17\16\u0120\u0121\f\13\2\2\u0121\u0122\7&\2\2\u0122"+
		"\u013b\5\34\17\f\u0123\u0124\f\n\2\2\u0124\u0125\7\'\2\2\u0125\u013b\5"+
		"\34\17\13\u0126\u0127\f\26\2\2\u0127\u0128\7\24\2\2\u0128\u012d\7=\2\2"+
		"\u0129\u012a\7\13\2\2\u012a\u012b\5> \2\u012b\u012c\7\f\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u013b\3\2\2\2\u012f"+
		"\u0130\f\25\2\2\u0130\u0132\7\13\2\2\u0131\u0133\5> \2\u0132\u0131\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013b\7\f\2\2\u0135"+
		"\u0136\f\24\2\2\u0136\u0137\7\6\2\2\u0137\u0138\5\34\17\2\u0138\u0139"+
		"\7\7\2\2\u0139\u013b\3\2\2\2\u013a\u010e\3\2\2\2\u013a\u0111\3\2\2\2\u013a"+
		"\u0114\3\2\2\2\u013a\u0117\3\2\2\2\u013a\u011a\3\2\2\2\u013a\u011d\3\2"+
		"\2\2\u013a\u0120\3\2\2\2\u013a\u0123\3\2\2\2\u013a\u0126\3\2\2\2\u013a"+
		"\u012f\3\2\2\2\u013a\u0135\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\35\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0151"+
		"\7E\2\2\u0140\u0151\7=\2\2\u0141\u0142\7A\2\2\u0142\u0147\5\34\17\2\u0143"+
		"\u0144\7B\2\2\u0144\u0146\5\34\17\2\u0145\u0143\3\2\2\2\u0146\u0149\3"+
		"\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014b\7C\2\2\u014b\u0151\3\2\2\2\u014c\u0151\7@\2"+
		"\2\u014d\u0151\7>\2\2\u014e\u0151\7?\2\2\u014f\u0151\7D\2\2\u0150\u013f"+
		"\3\2\2\2\u0150\u0140\3\2\2\2\u0150\u0141\3\2\2\2\u0150\u014c\3\2\2\2\u0150"+
		"\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\37\3\2\2"+
		"\2\u0152\u0155\5\"\22\2\u0153\u0155\5*\26\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155!\3\2\2\2\u0156\u0157\7)\2\2\u0157\u0158\5\34\17\2"+
		"\u0158\u015c\5$\23\2\u0159\u015b\5&\24\2\u015a\u0159\3\2\2\2\u015b\u015e"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015f\u0161\5(\25\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7\16\2\2\u0163#\3\2\2\2\u0164\u0166"+
		"\t\7\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\5N(\2\u0168%\3\2\2\2\u0169\u016a\t\b\2\2\u016a\u016b\5\34\17\2"+
		"\u016b\u016c\5$\23\2\u016c\'\3\2\2\2\u016d\u016e\t\t\2\2\u016e\u016f\5"+
		"N(\2\u016f)\3\2\2\2\u0170\u0171\7\60\2\2\u0171\u0173\5\34\17\2\u0172\u0174"+
		"\5,\27\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\16\2\2\u0178+\3\2\2\2"+
		"\u0179\u017a\7\61\2\2\u017a\u017d\5\34\17\2\u017b\u017c\7)\2\2\u017c\u017e"+
		"\5\34\17\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2"+
		"\u017f\u0180\7\23\2\2\u0180\u0181\5N(\2\u0181-\3\2\2\2\u0182\u0183\b\30"+
		"\1\2\u0183\u0199\7(\2\2\u0184\u0199\7=\2\2\u0185\u0199\5\36\20\2\u0186"+
		"\u0187\7=\2\2\u0187\u0188\7\13\2\2\u0188\u0189\5.\30\2\u0189\u018a\7\f"+
		"\2\2\u018a\u0199\3\2\2\2\u018b\u018d\7\13\2\2\u018c\u018e\5.\30\2\u018d"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\f\2\2\u0192\u0199\3\2\2\2\u0193"+
		"\u0195\7\6\2\2\u0194\u0196\5.\30\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0199\7\7\2\2\u0198\u0182\3\2\2\2\u0198"+
		"\u0184\3\2\2\2\u0198\u0185\3\2\2\2\u0198\u0186\3\2\2\2\u0198\u018b\3\2"+
		"\2\2\u0198\u0193\3\2\2\2\u0199\u01b1\3\2\2\2\u019a\u019d\f\7\2\2\u019b"+
		"\u019c\7\26\2\2\u019c\u019e\5.\30\2\u019d\u019b\3\2\2\2\u019e\u019f\3"+
		"\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01b0\3\2\2\2\u01a1"+
		"\u01a4\f\4\2\2\u01a2\u01a3\7\62\2\2\u01a3\u01a5\5.\30\2\u01a4\u01a2\3"+
		"\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01b0\3\2\2\2\u01a8\u01ab\f\3\2\2\u01a9\u01aa\7\21\2\2\u01aa\u01ac\5"+
		".\30\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u019a\3\2\2\2\u01af\u01a1\3\2"+
		"\2\2\u01af\u01a8\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2/\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b8\5\62\32"+
		"\2\u01b5\u01b8\5\64\33\2\u01b6\u01b8\5\66\34\2\u01b7\u01b4\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\61\3\2\2\2\u01b9\u01ba\7\63\2"+
		"\2\u01ba\u01bd\5:\36\2\u01bb\u01bc\7)\2\2\u01bc\u01be\5\34\17\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\5<"+
		"\37\2\u01c0\63\3\2\2\2\u01c1\u01c2\7\63\2\2\u01c2\u01c5\5:\36\2\u01c3"+
		"\u01c4\7)\2\2\u01c4\u01c6\5\34\17\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3"+
		"\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\64\2\2\u01c8\u01c9\5N(\2\u01c9"+
		"\u01ca\7\16\2\2\u01ca\65\3\2\2\2\u01cb\u01cc\7\65\2\2\u01cc\u01cd\5\34"+
		"\17\2\u01cd\u01ce\5<\37\2\u01ce\67\3\2\2\2\u01cf\u01d0\7=\2\2\u01d0\u01d1"+
		"\7\66\2\2\u01d1\u01dc\5\34\17\2\u01d2\u01d3\7=\2\2\u01d3\u01d4\7\67\2"+
		"\2\u01d4\u01d5\5\34\17\2\u01d5\u01d6\t\n\2\2\u01d6\u01d9\5\34\17\2\u01d7"+
		"\u01d8\7:\2\2\u01d8\u01da\5\34\17\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3"+
		"\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01cf\3\2\2\2\u01db\u01d2\3\2\2\2\u01dc"+
		"9\3\2\2\2\u01dd\u01e2\58\35\2\u01de\u01df\7\21\2\2\u01df\u01e1\58\35\2"+
		"\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3;\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\t\13\2\2\u01e6"+
		"\u01e7\5N(\2\u01e7\u01e8\7\16\2\2\u01e8=\3\2\2\2\u01e9\u01ee\5\34\17\2"+
		"\u01ea\u01eb\7\21\2\2\u01eb\u01ed\5\34\17\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef?\3\2\2\2"+
		"\u01f0\u01ee\3\2\2\2\u01f1\u01f4\5\34\17\2\u01f2\u01f3\7\21\2\2\u01f3"+
		"\u01f5\5\34\17\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7A\3\2\2\2\u01f8\u01fd\7=\2\2\u01f9\u01fa"+
		"\7\21\2\2\u01fa\u01fc\7=\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01feC\3\2\2\2\u01ff\u01fd\3\2\2\2"+
		"\u0200\u0203\7=\2\2\u0201\u0202\7\21\2\2\u0202\u0204\7=\2\2\u0203\u0201"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"E\3\2\2\2\u0207\u0208\7=\2\2\u0208\u020a\7\24\2\2\u0209\u0207\3\2\2\2"+
		"\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e"+
		"\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7=\2\2\u020fG\3\2\2\2\u0210\u0215"+
		"\5F$\2\u0211\u0212\7\21\2\2\u0212\u0214\5F$\2\u0213\u0211\3\2\2\2\u0214"+
		"\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216I\3\2\2\2"+
		"\u0217\u0215\3\2\2\2\u0218\u021b\5F$\2\u0219\u021a\7\21\2\2\u021a\u021c"+
		"\5F$\2\u021b\u0219\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021eK\3\2\2\2\u021f\u0222\5\32\16\2\u0220\u0221\7\21\2"+
		"\2\u0221\u0223\5\32\16\2\u0222\u0220\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225M\3\2\2\2\u0226\u0228\5\4\3\2"+
		"\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022aO\3\2\2\2\u022b\u0229\3\2\2\28SZov|\u0090\u0098\u00a3\u00a8"+
		"\u00b4\u00b6\u00ba\u00cd\u00d0\u00db\u00e8\u00ef\u0108\u010c\u012d\u0132"+
		"\u013a\u013c\u0147\u0150\u0154\u015c\u0160\u0165\u0175\u017d\u018f\u0195"+
		"\u0198\u019f\u01a6\u01ad\u01af\u01b1\u01b7\u01bd\u01c5\u01d9\u01db\u01e2"+
		"\u01ee\u01f6\u01fd\u0205\u020b\u0215\u021d\u0224\u0229";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}