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
		T__52=53, T__53=54, T__54=55, ID=56, INT=57, FLOAT=58, STRING=59, BS=60, 
		MS=61, ES=62, CHAR=63, BOOLEANO=64, WS=65, COMMENT=66, NL=67;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_cmd = 2, RULE_decl = 3, RULE_decl_valor = 4, 
		RULE_decl_funcao = 5, RULE_decl_tipo = 6, RULE_decl_uso = 7, RULE_dcl = 8, 
		RULE_dcls = 9, RULE_dcl1 = 10, RULE_tipo = 11, RULE_expr = 12, RULE_literal = 13, 
		RULE_decisao = 14, RULE_se = 15, RULE_entao = 16, RULE_senaose = 17, RULE_senao = 18, 
		RULE_escolha = 19, RULE_caso = 20, RULE_repeticao = 21, RULE_para_faca = 22, 
		RULE_para_gere = 23, RULE_enquanto = 24, RULE_faixa = 25, RULE_faixas = 26, 
		RULE_bloco = 27, RULE_expr1 = 28, RULE_expr2 = 29, RULE_id1 = 30, RULE_id2 = 31, 
		RULE_tipo2 = 32, RULE_exprlist = 33;
	public static final String[] ruleNames = {
		"prog", "inst", "cmd", "decl", "decl_valor", "decl_funcao", "decl_tipo", 
		"decl_uso", "dcl", "dcls", "dcl1", "tipo", "expr", "literal", "decisao", 
		"se", "entao", "senaose", "senao", "escolha", "caso", "repeticao", "para_faca", 
		"para_gere", "enquanto", "faixa", "faixas", "bloco", "expr1", "expr2", 
		"id1", "id2", "tipo2", "exprlist"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'escreva'", "'imprima'", "':='", "'['", "']'", "'='", "'var'", 
		"'('", "')'", "':'", "'fim'", "'tipo'", "'use'", "','", "'Tupla('", "'=>'", 
		"'.'", "'^'", "'::'", "'formato'", "'+'", "'-'", "'*'", "'/'", "'div'", 
		"'mod'", "'>'", "'>='", "'<'", "'<='", "'=='", "'<>'", "'nao'", "'n\\u00e3o'", 
		"'e'", "'ou'", "'se'", "'entao'", "'ent\\u00e3o'", "'senaose'", "'sen\\u00e3ose'", 
		"'senao'", "'sen\\u00e3o'", "'escolha'", "'caso'", "'para'", "'gere'", 
		"'enquanto'", "'em'", "'de'", "'ate'", "'at\\u00e9'", "'passo'", "'faca'", 
		"'fa\\u00e7a'", null, null, null, null, null, null, null, null, null, 
		null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID", "INT", "FLOAT", 
		"STRING", "BS", "MS", "ES", "CHAR", "BOOLEANO", "WS", "COMMENT", "NL"
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__1 - 1)) | (1L << (T__3 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__11 - 1)) | (1L << (T__12 - 1)) | (1L << (T__14 - 1)) | (1L << (T__20 - 1)) | (1L << (T__21 - 1)) | (1L << (T__32 - 1)) | (1L << (T__33 - 1)) | (1L << (T__36 - 1)) | (1L << (T__43 - 1)) | (1L << (T__45 - 1)) | (1L << (T__47 - 1)) | (1L << (T__53 - 1)) | (1L << (T__54 - 1)) | (1L << (ID - 1)) | (1L << (INT - 1)) | (1L << (FLOAT - 1)) | (1L << (STRING - 1)) | (1L << (BS - 1)) | (1L << (CHAR - 1)) | (1L << (BOOLEANO - 1)))) != 0)) {
				{
				{
				setState(68);
				inst();
				}
				}
				setState(73);
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
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
		public Id1Context id1() {
			return getRuleContext(Id1Context.class,0);
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
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
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
	public static class Atrib_multiplaContext extends CmdContext {
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__0);
				setState(81);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ImprimaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__1);
				setState(83);
				expr(0);
				}
				break;
			case 3:
				_localctx = new Atrib_simplesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				id1();
				setState(85);
				match(T__2);
				setState(86);
				expr(0);
				}
				break;
			case 4:
				_localctx = new Atrib_multiplaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				id2();
				setState(89);
				match(T__2);
				setState(90);
				expr2();
				}
				break;
			case 5:
				_localctx = new Set_vetorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(ID);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					match(T__3);
					setState(94);
					expr(0);
					setState(95);
					match(T__4);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(101);
				match(T__2);
				setState(102);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				decl_valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				decl_funcao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				decl_tipo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Valor_simplesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				id1();
				setState(113);
				match(T__5);
				setState(114);
				expr(0);
				}
				break;
			case 2:
				_localctx = new Valor_multiploContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				id2();
				setState(117);
				match(T__5);
				setState(118);
				expr2();
				}
				break;
			case 3:
				_localctx = new Decl_var_simplesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(T__6);
				setState(121);
				id1();
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(123);
				expr(0);
				}
				break;
			case 4:
				_localctx = new Decl_var_multiplaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(T__6);
				setState(126);
				id2();
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(128);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Def_funcaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(ID);
				setState(133);
				match(T__7);
				setState(134);
				dcls();
				setState(135);
				match(T__8);
				setState(138);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(136);
					match(T__9);
					setState(137);
					tipo(0);
					}
				}

				setState(140);
				match(T__5);
				setState(141);
				expr(0);
				}
				break;
			case 2:
				_localctx = new Def_funcao_corpoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(ID);
				setState(144);
				match(T__7);
				setState(145);
				dcls();
				setState(146);
				match(T__8);
				setState(149);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(147);
					match(T__9);
					setState(148);
					tipo(0);
					}
				}

				setState(151);
				exprlist();
				setState(152);
				match(T__10);
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
		public List<Decl_funcaoContext> decl_funcao() {
			return getRuleContexts(Decl_funcaoContext.class);
		}
		public Decl_funcaoContext decl_funcao(int i) {
			return getRuleContext(Decl_funcaoContext.class,i);
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
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__11);
				setState(157);
				match(ID);
				setState(158);
				match(T__5);
				setState(159);
				tipo(0);
				}
				break;
			case 2:
				_localctx = new ClasseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__11);
				setState(161);
				match(ID);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(162);
						dcl();
						}
						break;
					case 2:
						{
						setState(163);
						decl_funcao();
						}
						break;
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(T__10);
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
			setState(172);
			match(T__12);
			setState(173);
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
			setState(175);
			id1();
			setState(176);
			match(T__9);
			setState(177);
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
		enterRule(_localctx, 18, RULE_dcls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(179);
				dcl();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(180);
					match(T__13);
					setState(181);
					dcl();
					}
					}
					setState(186);
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
		enterRule(_localctx, 20, RULE_dcl1);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__7);
				setState(191);
				expr2();
				setState(192);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(T__7);
				setState(195);
				dcls();
				setState(196);
				match(T__8);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_tipo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new Tipo_simplesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(201);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new Tipo_tuplaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(T__14);
				setState(203);
				tipo2();
				setState(204);
				match(T__8);
				}
				break;
			case 3:
				{
				_localctx = new Tipo_genericoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(ID);
				setState(207);
				match(T__3);
				setState(208);
				tipo(0);
				setState(209);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
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
					setState(213);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(214);
					match(T__15);
					setState(215);
					tipo(2);
					}
					} 
				}
				setState(220);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new Mais_menos_unarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(223);
				expr(13);
				}
				break;
			case 2:
				{
				_localctx = new Nao_logicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(225);
				expr(9);
				}
				break;
			case 3:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				dcl1();
				setState(228);
				match(T__15);
				setState(229);
				inst();
				}
				break;
			case 5:
				{
				_localctx = new DecisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				decisao();
				}
				break;
			case 6:
				{
				_localctx = new LacoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				repeticao();
				}
				break;
			case 7:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(T__7);
				setState(234);
				expr(0);
				setState(235);
				match(T__8);
				}
				break;
			case 8:
				{
				_localctx = new TuplaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(T__14);
				setState(238);
				expr2();
				setState(239);
				match(T__8);
				}
				break;
			case 9:
				{
				_localctx = new ListaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(T__3);
				setState(243);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__7 - 4)) | (1L << (T__14 - 4)) | (1L << (T__20 - 4)) | (1L << (T__21 - 4)) | (1L << (T__32 - 4)) | (1L << (T__33 - 4)) | (1L << (T__36 - 4)) | (1L << (T__43 - 4)) | (1L << (T__45 - 4)) | (1L << (T__47 - 4)) | (1L << (ID - 4)) | (1L << (INT - 4)) | (1L << (FLOAT - 4)) | (1L << (STRING - 4)) | (1L << (BS - 4)) | (1L << (CHAR - 4)) | (1L << (BOOLEANO - 4)))) != 0)) {
					{
					setState(242);
					expr1();
					}
				}

				setState(245);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpoenteContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(249);
						match(T__17);
						setState(250);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ConsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(252);
						match(T__18);
						setState(253);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new FormatoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(255);
						match(T__19);
						setState(256);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new Mult_divContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(258);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(259);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new Soma_subContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(261);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(262);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new ComparacaoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(264);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(265);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new E_logicoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(267);
						match(T__34);
						setState(268);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new Ou_logicoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(270);
						match(T__35);
						setState(271);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new Chamada_metodoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(273);
						match(T__16);
						setState(274);
						match(ID);
						setState(279);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(275);
							match(T__7);
							setState(276);
							expr1();
							setState(277);
							match(T__8);
							}
							break;
						}
						}
						break;
					case 10:
						{
						_localctx = new Chamada_funcaoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(282);
						match(T__7);
						setState(284);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__7 - 4)) | (1L << (T__14 - 4)) | (1L << (T__20 - 4)) | (1L << (T__21 - 4)) | (1L << (T__32 - 4)) | (1L << (T__33 - 4)) | (1L << (T__36 - 4)) | (1L << (T__43 - 4)) | (1L << (T__45 - 4)) | (1L << (T__47 - 4)) | (1L << (ID - 4)) | (1L << (INT - 4)) | (1L << (FLOAT - 4)) | (1L << (STRING - 4)) | (1L << (BS - 4)) | (1L << (CHAR - 4)) | (1L << (BOOLEANO - 4)))) != 0)) {
							{
							setState(283);
							expr1();
							}
						}

						setState(286);
						match(T__8);
						}
						break;
					case 11:
						{
						_localctx = new Get_vetorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(288);
						match(T__3);
						setState(289);
						expr(0);
						setState(290);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(296);
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
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			setState(314);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(ID);
				}
				break;
			case BS:
				_localctx = new Texto_interpolacaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(BS);
				setState(299);
				expr(0);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MS) {
					{
					{
					setState(300);
					match(MS);
					setState(301);
					expr(0);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				match(ES);
				}
				break;
			case STRING:
				_localctx = new TextoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new InteiroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				match(CHAR);
				}
				break;
			case BOOLEANO:
				_localctx = new BooleanoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				match(BOOLEANO);
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
		enterRule(_localctx, 28, RULE_decisao);
		try {
			setState(318);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				se();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
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
		enterRule(_localctx, 30, RULE_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__36);
			setState(321);
			expr(0);
			setState(322);
			entao();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(323);
				senaose();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			_la = _input.LA(1);
			if (_la==T__41 || _la==T__42) {
				{
				setState(329);
				senao();
				}
			}

			setState(332);
			match(T__10);
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
		enterRule(_localctx, 32, RULE_entao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if (_la==T__37 || _la==T__38) {
				{
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(337);
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
		enterRule(_localctx, 34, RULE_senaose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(340);
			expr(0);
			setState(341);
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
		enterRule(_localctx, 36, RULE_senao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(344);
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
		enterRule(_localctx, 38, RULE_escolha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__43);
			setState(347);
			expr(0);
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				caso();
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__44 );
			setState(353);
			match(T__10);
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
		enterRule(_localctx, 40, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__44);
			setState(356);
			expr(0);
			setState(359);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(357);
				match(T__36);
				setState(358);
				expr(0);
				}
			}

			setState(361);
			match(T__15);
			setState(362);
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
		enterRule(_localctx, 42, RULE_repeticao);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				para_faca();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				para_gere();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
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
		enterRule(_localctx, 44, RULE_para_faca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__45);
			setState(370);
			faixas();
			setState(373);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(371);
				match(T__36);
				setState(372);
				expr(0);
				}
			}

			setState(375);
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
		enterRule(_localctx, 46, RULE_para_gere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__45);
			setState(378);
			faixas();
			setState(381);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(379);
				match(T__36);
				setState(380);
				expr(0);
				}
			}

			setState(383);
			match(T__46);
			setState(384);
			exprlist();
			setState(385);
			match(T__10);
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
		enterRule(_localctx, 48, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__47);
			setState(388);
			expr(0);
			setState(389);
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
		enterRule(_localctx, 50, RULE_faixa);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(ID);
				setState(392);
				match(T__48);
				setState(393);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(ID);
				setState(395);
				match(T__49);
				setState(396);
				expr(0);
				setState(397);
				_la = _input.LA(1);
				if ( !(_la==T__50 || _la==T__51) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(398);
				expr(0);
				setState(401);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(399);
					match(T__52);
					setState(400);
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
		enterRule(_localctx, 52, RULE_faixas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			faixa();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(406);
				match(T__13);
				setState(407);
				faixa();
				}
				}
				setState(412);
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
		enterRule(_localctx, 54, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(414);
			exprlist();
			setState(415);
			match(T__10);
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
		enterRule(_localctx, 56, RULE_expr1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			expr(0);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(418);
				match(T__13);
				setState(419);
				expr(0);
				}
				}
				setState(424);
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
		enterRule(_localctx, 58, RULE_expr2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			expr(0);
			setState(428); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(426);
					match(T__13);
					setState(427);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(430); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 60, RULE_id1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(ID);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(433);
				match(T__13);
				setState(434);
				match(ID);
				}
				}
				setState(439);
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
		enterRule(_localctx, 62, RULE_id2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(ID);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(441);
				match(T__13);
				setState(442);
				match(ID);
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
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
		enterRule(_localctx, 64, RULE_tipo2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			tipo(0);
			setState(450); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(448);
				match(T__13);
				setState(449);
				tipo(0);
				}
				}
				setState(452); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
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
		enterRule(_localctx, 66, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__1 - 1)) | (1L << (T__3 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__11 - 1)) | (1L << (T__12 - 1)) | (1L << (T__14 - 1)) | (1L << (T__20 - 1)) | (1L << (T__21 - 1)) | (1L << (T__32 - 1)) | (1L << (T__33 - 1)) | (1L << (T__36 - 1)) | (1L << (T__43 - 1)) | (1L << (T__45 - 1)) | (1L << (T__47 - 1)) | (1L << (T__53 - 1)) | (1L << (T__54 - 1)) | (1L << (ID - 1)) | (1L << (INT - 1)) | (1L << (FLOAT - 1)) | (1L << (STRING - 1)) | (1L << (BS - 1)) | (1L << (CHAR - 1)) | (1L << (BOOLEANO - 1)))) != 0)) {
				{
				{
				setState(454);
				inst();
				}
				}
				setState(459);
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
		case 11:
			return tipo_sempred((TipoContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
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
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 19);
		case 10:
			return precpred(_ctx, 18);
		case 11:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u01cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\5\3Q\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6"+
		"\4d\n\4\r\4\16\4e\3\4\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\5\5q\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0085\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008d\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u0098\n\7\3\7\3\7\3\7\5\7\u009d\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\b\5\b\u00ad\n\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00b9\n\13\f\13\16\13\u00bc"+
		"\13\13\5\13\u00be\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c9\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d6\n\r\3\r\3\r\3"+
		"\r\7\r\u00db\n\r\f\r\16\r\u00de\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00f6\n\16\3\16\5\16\u00f9\n\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011a"+
		"\n\16\3\16\3\16\3\16\5\16\u011f\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u0127\n\16\f\16\16\16\u012a\13\16\3\17\3\17\3\17\3\17\3\17\7\17\u0131"+
		"\n\17\f\17\16\17\u0134\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013d"+
		"\n\17\3\20\3\20\5\20\u0141\n\20\3\21\3\21\3\21\3\21\7\21\u0147\n\21\f"+
		"\21\16\21\u014a\13\21\3\21\5\21\u014d\n\21\3\21\3\21\3\22\5\22\u0152\n"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\6\25\u0160"+
		"\n\25\r\25\16\25\u0161\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u016a\n\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\5\27\u0172\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u0178\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0180\n\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u0194\n\33\5\33\u0196\n\33\3\34\3\34\3\34\7\34\u019b\n\34"+
		"\f\34\16\34\u019e\13\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u01a7"+
		"\n\36\f\36\16\36\u01aa\13\36\3\37\3\37\3\37\6\37\u01af\n\37\r\37\16\37"+
		"\u01b0\3 \3 \3 \7 \u01b6\n \f \16 \u01b9\13 \3!\3!\3!\6!\u01be\n!\r!\16"+
		"!\u01bf\3\"\3\"\3\"\6\"\u01c5\n\"\r\"\16\"\u01c6\3#\7#\u01ca\n#\f#\16"+
		"#\u01cd\13#\3#\2\4\30\32$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BD\2\f\4\2\5\5\b\b\3\2\27\30\3\2#$\3\2\31\34\3\2"+
		"\35\"\3\2()\3\2*+\3\2,-\3\2\65\66\3\289\u01f8\2I\3\2\2\2\4P\3\2\2\2\6"+
		"j\3\2\2\2\bp\3\2\2\2\n\u0084\3\2\2\2\f\u009c\3\2\2\2\16\u00ac\3\2\2\2"+
		"\20\u00ae\3\2\2\2\22\u00b1\3\2\2\2\24\u00bd\3\2\2\2\26\u00c8\3\2\2\2\30"+
		"\u00d5\3\2\2\2\32\u00f8\3\2\2\2\34\u013c\3\2\2\2\36\u0140\3\2\2\2 \u0142"+
		"\3\2\2\2\"\u0151\3\2\2\2$\u0155\3\2\2\2&\u0159\3\2\2\2(\u015c\3\2\2\2"+
		"*\u0165\3\2\2\2,\u0171\3\2\2\2.\u0173\3\2\2\2\60\u017b\3\2\2\2\62\u0185"+
		"\3\2\2\2\64\u0195\3\2\2\2\66\u0197\3\2\2\28\u019f\3\2\2\2:\u01a3\3\2\2"+
		"\2<\u01ab\3\2\2\2>\u01b2\3\2\2\2@\u01ba\3\2\2\2B\u01c1\3\2\2\2D\u01cb"+
		"\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2"+
		"KI\3\2\2\2LQ\5\b\5\2MQ\5\32\16\2NQ\58\35\2OQ\5\6\4\2PL\3\2\2\2PM\3\2\2"+
		"\2PN\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2RS\7\3\2\2Sk\5\32\16\2TU\7\4\2\2Uk\5"+
		"\32\16\2VW\5> \2WX\7\5\2\2XY\5\32\16\2Yk\3\2\2\2Z[\5@!\2[\\\7\5\2\2\\"+
		"]\5<\37\2]k\3\2\2\2^c\7:\2\2_`\7\6\2\2`a\5\32\16\2ab\7\7\2\2bd\3\2\2\2"+
		"c_\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\5\2\2hi\5\32\16"+
		"\2ik\3\2\2\2jR\3\2\2\2jT\3\2\2\2jV\3\2\2\2jZ\3\2\2\2j^\3\2\2\2k\7\3\2"+
		"\2\2lq\5\n\6\2mq\5\f\7\2nq\5\16\b\2oq\5\20\t\2pl\3\2\2\2pm\3\2\2\2pn\3"+
		"\2\2\2po\3\2\2\2q\t\3\2\2\2rs\5> \2st\7\b\2\2tu\5\32\16\2u\u0085\3\2\2"+
		"\2vw\5@!\2wx\7\b\2\2xy\5<\37\2y\u0085\3\2\2\2z{\7\t\2\2{|\5> \2|}\t\2"+
		"\2\2}~\5\32\16\2~\u0085\3\2\2\2\177\u0080\7\t\2\2\u0080\u0081\5@!\2\u0081"+
		"\u0082\t\2\2\2\u0082\u0083\5<\37\2\u0083\u0085\3\2\2\2\u0084r\3\2\2\2"+
		"\u0084v\3\2\2\2\u0084z\3\2\2\2\u0084\177\3\2\2\2\u0085\13\3\2\2\2\u0086"+
		"\u0087\7:\2\2\u0087\u0088\7\n\2\2\u0088\u0089\5\24\13\2\u0089\u008c\7"+
		"\13\2\2\u008a\u008b\7\f\2\2\u008b\u008d\5\30\r\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\b\2\2\u008f\u0090\5\32"+
		"\16\2\u0090\u009d\3\2\2\2\u0091\u0092\7:\2\2\u0092\u0093\7\n\2\2\u0093"+
		"\u0094\5\24\13\2\u0094\u0097\7\13\2\2\u0095\u0096\7\f\2\2\u0096\u0098"+
		"\5\30\r\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2"+
		"\u0099\u009a\5D#\2\u009a\u009b\7\r\2\2\u009b\u009d\3\2\2\2\u009c\u0086"+
		"\3\2\2\2\u009c\u0091\3\2\2\2\u009d\r\3\2\2\2\u009e\u009f\7\16\2\2\u009f"+
		"\u00a0\7:\2\2\u00a0\u00a1\7\b\2\2\u00a1\u00ad\5\30\r\2\u00a2\u00a3\7\16"+
		"\2\2\u00a3\u00a8\7:\2\2\u00a4\u00a7\5\22\n\2\u00a5\u00a7\5\f\7\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ad\7\r\2\2\u00ac\u009e\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ad\17\3\2\2"+
		"\2\u00ae\u00af\7\17\2\2\u00af\u00b0\7=\2\2\u00b0\21\3\2\2\2\u00b1\u00b2"+
		"\5> \2\u00b2\u00b3\7\f\2\2\u00b3\u00b4\5\30\r\2\u00b4\23\3\2\2\2\u00b5"+
		"\u00ba\5\22\n\2\u00b6\u00b7\7\20\2\2\u00b7\u00b9\5\22\n\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\25\3\2\2\2\u00bf\u00c9\7:\2\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2"+
		"\5<\37\2\u00c2\u00c3\7\13\2\2\u00c3\u00c9\3\2\2\2\u00c4\u00c5\7\n\2\2"+
		"\u00c5\u00c6\5\24\13\2\u00c6\u00c7\7\13\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00bf\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\27\3\2\2"+
		"\2\u00ca\u00cb\b\r\1\2\u00cb\u00d6\7:\2\2\u00cc\u00cd\7\21\2\2\u00cd\u00ce"+
		"\5B\"\2\u00ce\u00cf\7\13\2\2\u00cf\u00d6\3\2\2\2\u00d0\u00d1\7:\2\2\u00d1"+
		"\u00d2\7\6\2\2\u00d2\u00d3\5\30\r\2\u00d3\u00d4\7\7\2\2\u00d4\u00d6\3"+
		"\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6"+
		"\u00dc\3\2\2\2\u00d7\u00d8\f\3\2\2\u00d8\u00d9\7\22\2\2\u00d9\u00db\5"+
		"\30\r\4\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\31\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\b\16\1"+
		"\2\u00e0\u00e1\t\3\2\2\u00e1\u00f9\5\32\16\17\u00e2\u00e3\t\4\2\2\u00e3"+
		"\u00f9\5\32\16\13\u00e4\u00f9\5\34\17\2\u00e5\u00e6\5\26\f\2\u00e6\u00e7"+
		"\7\22\2\2\u00e7\u00e8\5\4\3\2\u00e8\u00f9\3\2\2\2\u00e9\u00f9\5\36\20"+
		"\2\u00ea\u00f9\5,\27\2\u00eb\u00ec\7\n\2\2\u00ec\u00ed\5\32\16\2\u00ed"+
		"\u00ee\7\13\2\2\u00ee\u00f9\3\2\2\2\u00ef\u00f0\7\21\2\2\u00f0\u00f1\5"+
		"<\37\2\u00f1\u00f2\7\13\2\2\u00f2\u00f9\3\2\2\2\u00f3\u00f5\7\6\2\2\u00f4"+
		"\u00f6\5:\36\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\7\7\2\2\u00f8\u00df\3\2\2\2\u00f8\u00e2\3\2\2\2\u00f8"+
		"\u00e4\3\2\2\2\u00f8\u00e5\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00ea\3\2"+
		"\2\2\u00f8\u00eb\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9"+
		"\u0128\3\2\2\2\u00fa\u00fb\f\22\2\2\u00fb\u00fc\7\24\2\2\u00fc\u0127\5"+
		"\32\16\22\u00fd\u00fe\f\21\2\2\u00fe\u00ff\7\25\2\2\u00ff\u0127\5\32\16"+
		"\21\u0100\u0101\f\20\2\2\u0101\u0102\7\26\2\2\u0102\u0127\5\32\16\21\u0103"+
		"\u0104\f\16\2\2\u0104\u0105\t\5\2\2\u0105\u0127\5\32\16\17\u0106\u0107"+
		"\f\r\2\2\u0107\u0108\t\3\2\2\u0108\u0127\5\32\16\16\u0109\u010a\f\f\2"+
		"\2\u010a\u010b\t\6\2\2\u010b\u0127\5\32\16\r\u010c\u010d\f\n\2\2\u010d"+
		"\u010e\7%\2\2\u010e\u0127\5\32\16\13\u010f\u0110\f\t\2\2\u0110\u0111\7"+
		"&\2\2\u0111\u0127\5\32\16\n\u0112\u0113\f\25\2\2\u0113\u0114\7\23\2\2"+
		"\u0114\u0119\7:\2\2\u0115\u0116\7\n\2\2\u0116\u0117\5:\36\2\u0117\u0118"+
		"\7\13\2\2\u0118\u011a\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u011a\3\2\2\2"+
		"\u011a\u0127\3\2\2\2\u011b\u011c\f\24\2\2\u011c\u011e\7\n\2\2\u011d\u011f"+
		"\5:\36\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0127\7\13\2\2\u0121\u0122\f\23\2\2\u0122\u0123\7\6\2\2\u0123\u0124\5"+
		"\32\16\2\u0124\u0125\7\7\2\2\u0125\u0127\3\2\2\2\u0126\u00fa\3\2\2\2\u0126"+
		"\u00fd\3\2\2\2\u0126\u0100\3\2\2\2\u0126\u0103\3\2\2\2\u0126\u0106\3\2"+
		"\2\2\u0126\u0109\3\2\2\2\u0126\u010c\3\2\2\2\u0126\u010f\3\2\2\2\u0126"+
		"\u0112\3\2\2\2\u0126\u011b\3\2\2\2\u0126\u0121\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\33\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012b\u013d\7:\2\2\u012c\u012d\7>\2\2\u012d\u0132\5\32\16\2\u012e"+
		"\u012f\7?\2\2\u012f\u0131\5\32\16\2\u0130\u012e\3\2\2\2\u0131\u0134\3"+
		"\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0136\7@\2\2\u0136\u013d\3\2\2\2\u0137\u013d\7=\2"+
		"\2\u0138\u013d\7;\2\2\u0139\u013d\7<\2\2\u013a\u013d\7A\2\2\u013b\u013d"+
		"\7B\2\2\u013c\u012b\3\2\2\2\u013c\u012c\3\2\2\2\u013c\u0137\3\2\2\2\u013c"+
		"\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2"+
		"\2\2\u013d\35\3\2\2\2\u013e\u0141\5 \21\2\u013f\u0141\5(\25\2\u0140\u013e"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0141\37\3\2\2\2\u0142\u0143\7\'\2\2\u0143"+
		"\u0144\5\32\16\2\u0144\u0148\5\"\22\2\u0145\u0147\5$\23\2\u0146\u0145"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\5&\24\2\u014c\u014b\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\r\2\2\u014f"+
		"!\3\2\2\2\u0150\u0152\t\7\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2"+
		"\u0152\u0153\3\2\2\2\u0153\u0154\5D#\2\u0154#\3\2\2\2\u0155\u0156\t\b"+
		"\2\2\u0156\u0157\5\32\16\2\u0157\u0158\5\"\22\2\u0158%\3\2\2\2\u0159\u015a"+
		"\t\t\2\2\u015a\u015b\5D#\2\u015b\'\3\2\2\2\u015c\u015d\7.\2\2\u015d\u015f"+
		"\5\32\16\2\u015e\u0160\5*\26\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\7\r\2\2\u0164)\3\2\2\2\u0165\u0166\7/\2\2\u0166\u0169\5\32\16\2\u0167"+
		"\u0168\7\'\2\2\u0168\u016a\5\32\16\2\u0169\u0167\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7\22\2\2\u016c\u016d\5D#\2\u016d"+
		"+\3\2\2\2\u016e\u0172\5.\30\2\u016f\u0172\5\60\31\2\u0170\u0172\5\62\32"+
		"\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172-"+
		"\3\2\2\2\u0173\u0174\7\60\2\2\u0174\u0177\5\66\34\2\u0175\u0176\7\'\2"+
		"\2\u0176\u0178\5\32\16\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\58\35\2\u017a/\3\2\2\2\u017b\u017c\7\60\2\2"+
		"\u017c\u017f\5\66\34\2\u017d\u017e\7\'\2\2\u017e\u0180\5\32\16\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\61"+
		"\2\2\u0182\u0183\5D#\2\u0183\u0184\7\r\2\2\u0184\61\3\2\2\2\u0185\u0186"+
		"\7\62\2\2\u0186\u0187\5\32\16\2\u0187\u0188\58\35\2\u0188\63\3\2\2\2\u0189"+
		"\u018a\7:\2\2\u018a\u018b\7\63\2\2\u018b\u0196\5\32\16\2\u018c\u018d\7"+
		":\2\2\u018d\u018e\7\64\2\2\u018e\u018f\5\32\16\2\u018f\u0190\t\n\2\2\u0190"+
		"\u0193\5\32\16\2\u0191\u0192\7\67\2\2\u0192\u0194\5\32\16\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0189\3\2\2\2\u0195"+
		"\u018c\3\2\2\2\u0196\65\3\2\2\2\u0197\u019c\5\64\33\2\u0198\u0199\7\20"+
		"\2\2\u0199\u019b\5\64\33\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\67\3\2\2\2\u019e\u019c\3\2\2"+
		"\2\u019f\u01a0\t\13\2\2\u01a0\u01a1\5D#\2\u01a1\u01a2\7\r\2\2\u01a29\3"+
		"\2\2\2\u01a3\u01a8\5\32\16\2\u01a4\u01a5\7\20\2\2\u01a5\u01a7\5\32\16"+
		"\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9;\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae\5\32\16\2\u01ac"+
		"\u01ad\7\20\2\2\u01ad\u01af\5\32\16\2\u01ae\u01ac\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1=\3\2\2\2\u01b2"+
		"\u01b7\7:\2\2\u01b3\u01b4\7\20\2\2\u01b4\u01b6\7:\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"?\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\7:\2\2\u01bb\u01bc\7\20\2\2"+
		"\u01bc\u01be\7:\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0A\3\2\2\2\u01c1\u01c4\5\30\r\2\u01c2"+
		"\u01c3\7\20\2\2\u01c3\u01c5\5\30\r\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\3"+
		"\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7C\3\2\2\2\u01c8\u01ca"+
		"\5\4\3\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01ccE\3\2\2\2\u01cd\u01cb\3\2\2\2-IPejp\u0084\u008c\u0097"+
		"\u009c\u00a6\u00a8\u00ac\u00ba\u00bd\u00c8\u00d5\u00dc\u00f5\u00f8\u0119"+
		"\u011e\u0126\u0128\u0132\u013c\u0140\u0148\u014c\u0151\u0161\u0169\u0171"+
		"\u0177\u017f\u0193\u0195\u019c\u01a8\u01b0\u01b7\u01bf\u01c6\u01cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}