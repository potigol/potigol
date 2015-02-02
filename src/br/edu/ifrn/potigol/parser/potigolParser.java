// Generated from potigol.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__53=1, T__52=2, T__51=3, T__50=4, T__49=5, T__48=6, T__47=7, T__46=8, 
		T__45=9, T__44=10, T__43=11, T__42=12, T__41=13, T__40=14, T__39=15, T__38=16, 
		T__37=17, T__36=18, T__35=19, T__34=20, T__33=21, T__32=22, T__31=23, 
		T__30=24, T__29=25, T__28=26, T__27=27, T__26=28, T__25=29, T__24=30, 
		T__23=31, T__22=32, T__21=33, T__20=34, T__19=35, T__18=36, T__17=37, 
		T__16=38, T__15=39, T__14=40, T__13=41, T__12=42, T__11=43, T__10=44, 
		T__9=45, T__8=46, T__7=47, T__6=48, T__5=49, T__4=50, T__3=51, T__2=52, 
		T__1=53, T__0=54, ID=55, INT=56, FLOAT=57, STRING=58, CHAR=59, BOOLEANO=60, 
		COMMENT=61, WS=62, NL=63;
	public static final String[] tokenNames = {
		"<INVALID>", "'ent\\u00e3o'", "'n\\u00e3o'", "'use'", "'::'", "'='", "'faca'", 
		"'^'", "'passo'", "'em'", "'nao'", "'ou'", "'('", "'para'", "'entao'", 
		"','", "'senaose'", "'var'", "'formato'", "'senao'", "'mod'", "'>='", 
		"'<'", "'fim'", "']'", "'escolha'", "'<>'", "'caso'", "'e'", "'enquanto'", 
		"'+'", "'/'", "'fa\\u00e7a'", "'sen\\u00e3o'", "'imprima'", "'ate'", "':='", 
		"'<='", "'de'", "'at\\u00e9'", "'*'", "'.'", "'se'", "':'", "'['", "'=='", 
		"'>'", "'=>'", "'tipo'", "'escreva'", "'sen\\u00e3ose'", "'div'", "'gere'", 
		"')'", "'-'", "ID", "INT", "FLOAT", "STRING", "CHAR", "BOOLEANO", "COMMENT", 
		"WS", "NL"
	};
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

	@Override
	public String getGrammarFileName() { return "potigol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__51) | (1L << T__48) | (1L << T__44) | (1L << T__42) | (1L << T__41) | (1L << T__37) | (1L << T__29) | (1L << T__25) | (1L << T__24) | (1L << T__22) | (1L << T__20) | (1L << T__12) | (1L << T__10) | (1L << T__6) | (1L << T__5) | (1L << T__0) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEANO))) != 0)) {
				{
				{
				setState(68); inst();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
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
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77); cmd();
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
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80); match(T__5);
				setState(81); expr(0);
				}
				break;
			case 2:
				_localctx = new ImprimaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(T__20);
				setState(83); expr(0);
				}
				break;
			case 3:
				_localctx = new Atrib_simplesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84); id1();
				setState(85); match(T__18);
				setState(86); expr(0);
				}
				break;
			case 4:
				_localctx = new Atrib_multiplaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88); id2();
				setState(89); match(T__18);
				setState(90); expr2();
				}
				break;
			case 5:
				_localctx = new Set_vetorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92); expr(0);
				setState(93); match(T__10);
				setState(94); expr(0);
				setState(95); match(T__30);
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==T__49 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(97); expr(0);
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
		public Decl_tipoContext decl_tipo() {
			return getRuleContext(Decl_tipoContext.class,0);
		}
		public Decl_usoContext decl_uso() {
			return getRuleContext(Decl_usoContext.class,0);
		}
		public Decl_valorContext decl_valor() {
			return getRuleContext(Decl_valorContext.class,0);
		}
		public Decl_funcaoContext decl_funcao() {
			return getRuleContext(Decl_funcaoContext.class,0);
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
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); decl_valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); decl_funcao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); decl_tipo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104); decl_uso();
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
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Valor_simplesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107); id1();
				setState(108); match(T__49);
				setState(109); expr(0);
				}
				break;
			case 2:
				_localctx = new Valor_multiploContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111); id2();
				setState(112); match(T__49);
				setState(113); expr2();
				}
				break;
			case 3:
				_localctx = new Decl_var_simplesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115); match(T__37);
				setState(116); id1();
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==T__49 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(118); expr(0);
				}
				break;
			case 4:
				_localctx = new Decl_var_multiplaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120); match(T__37);
				setState(121); id2();
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==T__49 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(123); expr2();
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
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
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Def_funcaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127); match(ID);
				setState(128); match(T__42);
				setState(129); dcls();
				setState(130); match(T__1);
				setState(133);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(131); match(T__11);
					setState(132); tipo(0);
					}
				}

				setState(135); match(T__49);
				setState(136); expr(0);
				}
				break;
			case 2:
				_localctx = new Def_funcao_corpoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(ID);
				setState(139); match(T__42);
				setState(140); dcls();
				setState(141); match(T__1);
				setState(144);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(142); match(T__11);
					setState(143); tipo(0);
					}
				}

				setState(146); exprlist();
				setState(147); match(T__31);
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
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public Decl_funcaoContext decl_funcao(int i) {
			return getRuleContext(Decl_funcaoContext.class,i);
		}
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public List<Decl_funcaoContext> decl_funcao() {
			return getRuleContexts(Decl_funcaoContext.class);
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
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151); match(T__6);
				setState(152); match(ID);
				setState(153); match(T__49);
				setState(154); tipo(0);
				}
				break;
			case 2:
				_localctx = new ClasseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(T__6);
				setState(156); match(ID);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					setState(159);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(157); dcl();
						}
						break;
					case 2:
						{
						setState(158); decl_funcao();
						}
						break;
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164); match(T__31);
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
			setState(167); match(T__51);
			setState(168); match(STRING);
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
			setState(170); id1();
			setState(171); match(T__11);
			setState(172); tipo(0);
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
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
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
			setState(182);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(174); dcl();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__39) {
					{
					{
					setState(175); match(T__39);
					setState(176); dcl();
					}
					}
					setState(181);
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
		public DclsContext dcls() {
			return getRuleContext(DclsContext.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
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
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); match(T__42);
				setState(186); expr2();
				setState(187); match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); match(T__42);
				setState(190); dcls();
				setState(191); match(T__1);
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
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new Tipo_simplesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196); match(ID);
				}
				break;
			case 2:
				{
				_localctx = new Tipo_tuplaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197); match(T__42);
				setState(198); tipo2();
				setState(199); match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new Tipo_genericoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); match(ID);
				setState(202); match(T__10);
				setState(203); tipo(0);
				setState(204); match(T__30);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tipo_funcaoContext(new TipoContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tipo);
					setState(208);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(209); match(T__7);
					setState(210); tipo(2);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
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
		public TerminalNode ID() { return getToken(potigolParser.ID, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new Mais_menos_unarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(217);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(218); expr(13);
				}
				break;
			case 2:
				{
				_localctx = new Nao_logicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==T__52 || _la==T__44) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(220); expr(9);
				}
				break;
			case 3:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221); literal();
				}
				break;
			case 4:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222); dcl1();
				setState(223); match(T__7);
				setState(225); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(224); inst();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(227); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				{
				_localctx = new DecisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229); decisao();
				}
				break;
			case 6:
				{
				_localctx = new LacoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230); repeticao();
				}
				break;
			case 7:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231); match(T__42);
				setState(232); expr(0);
				setState(233); match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new TuplaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235); match(T__42);
				setState(236); expr2();
				setState(237); match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new ListaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239); match(T__10);
				setState(241);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__44) | (1L << T__42) | (1L << T__41) | (1L << T__29) | (1L << T__25) | (1L << T__24) | (1L << T__12) | (1L << T__10) | (1L << T__0) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEANO))) != 0)) {
					{
					setState(240); expr1();
					}
				}

				setState(243); match(T__30);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpoenteContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(247); match(T__47);
						setState(248); expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ConsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(250); match(T__50);
						setState(251); expr(15);
						}
						break;
					case 3:
						{
						_localctx = new FormatoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(253); match(T__36);
						setState(254); expr(15);
						}
						break;
					case 4:
						{
						_localctx = new Mult_divContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(256);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__23) | (1L << T__14) | (1L << T__3))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(257); expr(13);
						}
						break;
					case 5:
						{
						_localctx = new Soma_subContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(259);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(260); expr(12);
						}
						break;
					case 6:
						{
						_localctx = new ComparacaoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(262);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__32) | (1L << T__28) | (1L << T__17) | (1L << T__9) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(263); expr(11);
						}
						break;
					case 7:
						{
						_localctx = new E_logicoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(265); match(T__26);
						setState(266); expr(9);
						}
						break;
					case 8:
						{
						_localctx = new Ou_logicoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(268); match(T__43);
						setState(269); expr(8);
						}
						break;
					case 9:
						{
						_localctx = new Chamada_metodoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(271); match(T__13);
						setState(272); match(ID);
						setState(277);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(273); match(T__42);
							setState(274); expr1();
							setState(275); match(T__1);
							}
							break;
						}
						}
						break;
					case 10:
						{
						_localctx = new Chamada_funcaoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(280); match(T__42);
						setState(282);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__44) | (1L << T__42) | (1L << T__41) | (1L << T__29) | (1L << T__25) | (1L << T__24) | (1L << T__12) | (1L << T__10) | (1L << T__0) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEANO))) != 0)) {
							{
							setState(281); expr1();
							}
						}

						setState(284); match(T__1);
						}
						break;
					case 11:
						{
						_localctx = new Get_vetorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(286); match(T__10);
						setState(287); expr(0);
						setState(288); match(T__30);
						}
						break;
					}
					} 
				}
				setState(294);
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
		try {
			setState(301);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295); match(ID);
				}
				break;
			case STRING:
				_localctx = new TextoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296); match(STRING);
				}
				break;
			case INT:
				_localctx = new InteiroContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(297); match(INT);
				}
				break;
			case FLOAT:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(298); match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(299); match(CHAR);
				}
				break;
			case BOOLEANO:
				_localctx = new BooleanoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(300); match(BOOLEANO);
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
			setState(305);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(303); se();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); escolha();
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
		public SenaoseContext senaose(int i) {
			return getRuleContext(SenaoseContext.class,i);
		}
		public List<SenaoseContext> senaose() {
			return getRuleContexts(SenaoseContext.class);
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
			setState(307); match(T__12);
			setState(308); expr(0);
			setState(309); entao();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38 || _la==T__4) {
				{
				{
				setState(310); senaose();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			_la = _input.LA(1);
			if (_la==T__35 || _la==T__21) {
				{
				setState(316); senao();
				}
			}

			setState(319); match(T__31);
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
			setState(322);
			_la = _input.LA(1);
			if (_la==T__53 || _la==T__40) {
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==T__53 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(324); exprlist();
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
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(327); expr(0);
			setState(328); entao();
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
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(331); exprlist();
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
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
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
			setState(333); match(T__29);
			setState(334); expr(0);
			setState(336); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(335); caso();
				}
				}
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__27 );
			setState(340); match(T__31);
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
			setState(342); match(T__27);
			setState(343); expr(0);
			setState(346);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(344); match(T__12);
				setState(345); expr(0);
				}
			}

			setState(348); match(T__7);
			setState(349); exprlist();
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
		public Para_gereContext para_gere() {
			return getRuleContext(Para_gereContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public Para_facaContext para_faca() {
			return getRuleContext(Para_facaContext.class,0);
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
			setState(354);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351); para_faca();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352); para_gere();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353); enquanto();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FaixasContext faixas() {
			return getRuleContext(FaixasContext.class,0);
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
			setState(356); match(T__41);
			setState(357); faixas();
			setState(360);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(358); match(T__12);
				setState(359); expr(0);
				}
			}

			setState(362); bloco();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public FaixasContext faixas() {
			return getRuleContext(FaixasContext.class,0);
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
			setState(364); match(T__41);
			setState(365); faixas();
			setState(368);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(366); match(T__12);
				setState(367); expr(0);
				}
			}

			setState(370); match(T__2);
			setState(371); exprlist();
			setState(372); match(T__31);
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
			setState(374); match(T__25);
			setState(375); expr(0);
			setState(376); bloco();
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
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378); match(ID);
				setState(379); match(T__45);
				setState(380); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); match(ID);
				setState(382); match(T__16);
				setState(383); expr(0);
				setState(384);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(385); expr(0);
				setState(388);
				_la = _input.LA(1);
				if (_la==T__46) {
					{
					setState(386); match(T__46);
					setState(387); expr(0);
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
		public FaixaContext faixa(int i) {
			return getRuleContext(FaixaContext.class,i);
		}
		public List<FaixaContext> faixa() {
			return getRuleContexts(FaixaContext.class);
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
			setState(392); faixa();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(393); match(T__39);
				setState(394); faixa();
				}
				}
				setState(399);
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
			setState(400);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(401); exprlist();
			setState(402); match(T__31);
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
			setState(404); expr(0);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(405); match(T__39);
				setState(406); expr(0);
				}
				}
				setState(411);
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
			setState(412); expr(0);
			setState(415); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(413); match(T__39);
					setState(414); expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(417); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
			setState(419); match(ID);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(420); match(T__39);
				setState(421); match(ID);
				}
				}
				setState(426);
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
			setState(427); match(ID);
			setState(430); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(428); match(T__39);
				setState(429); match(ID);
				}
				}
				setState(432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__39 );
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
			setState(434); tipo(0);
			setState(437); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(435); match(T__39);
				setState(436); tipo(0);
				}
				}
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__39 );
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
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
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
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__51) | (1L << T__48) | (1L << T__44) | (1L << T__42) | (1L << T__41) | (1L << T__37) | (1L << T__29) | (1L << T__25) | (1L << T__24) | (1L << T__22) | (1L << T__20) | (1L << T__12) | (1L << T__10) | (1L << T__6) | (1L << T__5) | (1L << T__0) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEANO))) != 0)) {
				{
				{
				setState(441); inst();
				}
				}
				setState(446);
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
		case 11: return tipo_sempred((TipoContext)_localctx, predIndex);
		case 12: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tipo_sempred(TipoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 16);
		case 2: return precpred(_ctx, 15);
		case 3: return precpred(_ctx, 14);
		case 4: return precpred(_ctx, 12);
		case 5: return precpred(_ctx, 11);
		case 6: return precpred(_ctx, 10);
		case 7: return precpred(_ctx, 8);
		case 8: return precpred(_ctx, 7);
		case 9: return precpred(_ctx, 19);
		case 10: return precpred(_ctx, 18);
		case 11: return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u01c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\5\3Q\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4f\n\4\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0088\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0093"+
		"\n\7\3\7\3\7\3\7\5\7\u0098\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a2"+
		"\n\b\f\b\16\b\u00a5\13\b\3\b\5\b\u00a8\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13\13\5\13\u00b9\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d1\n\r\3\r\3\r\3\r\7\r\u00d6\n\r\f\r\16"+
		"\r\u00d9\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00e4"+
		"\n\16\r\16\16\16\u00e5\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00f4\n\16\3\16\5\16\u00f7\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0118\n\16\3\16\3\16\3\16\5\16\u011d\n\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u0125\n\16\f\16\16\16\u0128\13\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0130\n\17\3\20\3\20\5\20\u0134\n\20\3\21\3\21\3\21\3\21\7\21"+
		"\u013a\n\21\f\21\16\21\u013d\13\21\3\21\5\21\u0140\n\21\3\21\3\21\3\22"+
		"\5\22\u0145\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\6\25\u0153\n\25\r\25\16\25\u0154\3\25\3\25\3\26\3\26\3\26\3\26\5"+
		"\26\u015d\n\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0165\n\27\3\30\3\30"+
		"\3\30\3\30\5\30\u016b\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0173\n"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0187\n\33\5\33\u0189\n\33\3\34\3\34\3\34"+
		"\7\34\u018e\n\34\f\34\16\34\u0191\13\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\7\36\u019a\n\36\f\36\16\36\u019d\13\36\3\37\3\37\3\37\6\37\u01a2"+
		"\n\37\r\37\16\37\u01a3\3 \3 \3 \7 \u01a9\n \f \16 \u01ac\13 \3!\3!\3!"+
		"\6!\u01b1\n!\r!\16!\u01b2\3\"\3\"\3\"\6\"\u01b8\n\"\r\"\16\"\u01b9\3#"+
		"\7#\u01bd\n#\f#\16#\u01c0\13#\3#\2\4\30\32$\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\f\4\2\7\7&&\4\2  88\4\2\4\4"+
		"\f\f\6\2\26\26!!**\65\65\6\2\27\30\34\34\'\'/\60\4\2\3\3\20\20\4\2\22"+
		"\22\64\64\4\2\25\25##\4\2%%))\4\2\b\b\"\"\u01e9\2I\3\2\2\2\4P\3\2\2\2"+
		"\6e\3\2\2\2\bk\3\2\2\2\n\177\3\2\2\2\f\u0097\3\2\2\2\16\u00a7\3\2\2\2"+
		"\20\u00a9\3\2\2\2\22\u00ac\3\2\2\2\24\u00b8\3\2\2\2\26\u00c3\3\2\2\2\30"+
		"\u00d0\3\2\2\2\32\u00f6\3\2\2\2\34\u012f\3\2\2\2\36\u0133\3\2\2\2 \u0135"+
		"\3\2\2\2\"\u0144\3\2\2\2$\u0148\3\2\2\2&\u014c\3\2\2\2(\u014f\3\2\2\2"+
		"*\u0158\3\2\2\2,\u0164\3\2\2\2.\u0166\3\2\2\2\60\u016e\3\2\2\2\62\u0178"+
		"\3\2\2\2\64\u0188\3\2\2\2\66\u018a\3\2\2\28\u0192\3\2\2\2:\u0196\3\2\2"+
		"\2<\u019e\3\2\2\2>\u01a5\3\2\2\2@\u01ad\3\2\2\2B\u01b4\3\2\2\2D\u01be"+
		"\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2"+
		"KI\3\2\2\2LQ\5\b\5\2MQ\5\32\16\2NQ\58\35\2OQ\5\6\4\2PL\3\2\2\2PM\3\2\2"+
		"\2PN\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2RS\7\63\2\2Sf\5\32\16\2TU\7$\2\2Uf\5"+
		"\32\16\2VW\5> \2WX\7&\2\2XY\5\32\16\2Yf\3\2\2\2Z[\5@!\2[\\\7&\2\2\\]\5"+
		"<\37\2]f\3\2\2\2^_\5\32\16\2_`\7.\2\2`a\5\32\16\2ab\7\32\2\2bc\t\2\2\2"+
		"cd\5\32\16\2df\3\2\2\2eR\3\2\2\2eT\3\2\2\2eV\3\2\2\2eZ\3\2\2\2e^\3\2\2"+
		"\2f\7\3\2\2\2gl\5\n\6\2hl\5\f\7\2il\5\16\b\2jl\5\20\t\2kg\3\2\2\2kh\3"+
		"\2\2\2ki\3\2\2\2kj\3\2\2\2l\t\3\2\2\2mn\5> \2no\7\7\2\2op\5\32\16\2p\u0080"+
		"\3\2\2\2qr\5@!\2rs\7\7\2\2st\5<\37\2t\u0080\3\2\2\2uv\7\23\2\2vw\5> \2"+
		"wx\t\2\2\2xy\5\32\16\2y\u0080\3\2\2\2z{\7\23\2\2{|\5@!\2|}\t\2\2\2}~\5"+
		"<\37\2~\u0080\3\2\2\2\177m\3\2\2\2\177q\3\2\2\2\177u\3\2\2\2\177z\3\2"+
		"\2\2\u0080\13\3\2\2\2\u0081\u0082\79\2\2\u0082\u0083\7\16\2\2\u0083\u0084"+
		"\5\24\13\2\u0084\u0087\7\67\2\2\u0085\u0086\7-\2\2\u0086\u0088\5\30\r"+
		"\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\7\7\2\2\u008a\u008b\5\32\16\2\u008b\u0098\3\2\2\2\u008c\u008d\79\2\2"+
		"\u008d\u008e\7\16\2\2\u008e\u008f\5\24\13\2\u008f\u0092\7\67\2\2\u0090"+
		"\u0091\7-\2\2\u0091\u0093\5\30\r\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5D#\2\u0095\u0096\7\31\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0081\3\2\2\2\u0097\u008c\3\2\2\2\u0098\r\3\2\2\2"+
		"\u0099\u009a\7\62\2\2\u009a\u009b\79\2\2\u009b\u009c\7\7\2\2\u009c\u00a8"+
		"\5\30\r\2\u009d\u009e\7\62\2\2\u009e\u00a3\79\2\2\u009f\u00a2\5\22\n\2"+
		"\u00a0\u00a2\5\f\7\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a8\7\31\2\2\u00a7\u0099\3\2\2\2\u00a7\u009d\3"+
		"\2\2\2\u00a8\17\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\7<\2\2\u00ab\21"+
		"\3\2\2\2\u00ac\u00ad\5> \2\u00ad\u00ae\7-\2\2\u00ae\u00af\5\30\r\2\u00af"+
		"\23\3\2\2\2\u00b0\u00b5\5\22\n\2\u00b1\u00b2\7\21\2\2\u00b2\u00b4\5\22"+
		"\n\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b0\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00c4\79\2\2\u00bb\u00bc"+
		"\7\16\2\2\u00bc\u00bd\5<\37\2\u00bd\u00be\7\67\2\2\u00be\u00c4\3\2\2\2"+
		"\u00bf\u00c0\7\16\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2\7\67\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bf\3\2"+
		"\2\2\u00c4\27\3\2\2\2\u00c5\u00c6\b\r\1\2\u00c6\u00d1\79\2\2\u00c7\u00c8"+
		"\7\16\2\2\u00c8\u00c9\5B\"\2\u00c9\u00ca\7\67\2\2\u00ca\u00d1\3\2\2\2"+
		"\u00cb\u00cc\79\2\2\u00cc\u00cd\7.\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf"+
		"\7\32\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c5\3\2\2\2\u00d0\u00c7\3\2\2\2"+
		"\u00d0\u00cb\3\2\2\2\u00d1\u00d7\3\2\2\2\u00d2\u00d3\f\3\2\2\u00d3\u00d4"+
		"\7\61\2\2\u00d4\u00d6\5\30\r\4\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\31\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00db\b\16\1\2\u00db\u00dc\t\3\2\2\u00dc\u00f7\5\32\16"+
		"\17\u00dd\u00de\t\4\2\2\u00de\u00f7\5\32\16\13\u00df\u00f7\5\34\17\2\u00e0"+
		"\u00e1\5\26\f\2\u00e1\u00e3\7\61\2\2\u00e2\u00e4\5\4\3\2\u00e3\u00e2\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00f7\3\2\2\2\u00e7\u00f7\5\36\20\2\u00e8\u00f7\5,\27\2\u00e9\u00ea\7"+
		"\16\2\2\u00ea\u00eb\5\32\16\2\u00eb\u00ec\7\67\2\2\u00ec\u00f7\3\2\2\2"+
		"\u00ed\u00ee\7\16\2\2\u00ee\u00ef\5<\37\2\u00ef\u00f0\7\67\2\2\u00f0\u00f7"+
		"\3\2\2\2\u00f1\u00f3\7.\2\2\u00f2\u00f4\5:\36\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7\32\2\2\u00f6\u00da\3"+
		"\2\2\2\u00f6\u00dd\3\2\2\2\u00f6\u00df\3\2\2\2\u00f6\u00e0\3\2\2\2\u00f6"+
		"\u00e7\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ed\3\2"+
		"\2\2\u00f6\u00f1\3\2\2\2\u00f7\u0126\3\2\2\2\u00f8\u00f9\f\22\2\2\u00f9"+
		"\u00fa\7\t\2\2\u00fa\u0125\5\32\16\22\u00fb\u00fc\f\21\2\2\u00fc\u00fd"+
		"\7\6\2\2\u00fd\u0125\5\32\16\21\u00fe\u00ff\f\20\2\2\u00ff\u0100\7\24"+
		"\2\2\u0100\u0125\5\32\16\21\u0101\u0102\f\16\2\2\u0102\u0103\t\5\2\2\u0103"+
		"\u0125\5\32\16\17\u0104\u0105\f\r\2\2\u0105\u0106\t\3\2\2\u0106\u0125"+
		"\5\32\16\16\u0107\u0108\f\f\2\2\u0108\u0109\t\6\2\2\u0109\u0125\5\32\16"+
		"\r\u010a\u010b\f\n\2\2\u010b\u010c\7\36\2\2\u010c\u0125\5\32\16\13\u010d"+
		"\u010e\f\t\2\2\u010e\u010f\7\r\2\2\u010f\u0125\5\32\16\n\u0110\u0111\f"+
		"\25\2\2\u0111\u0112\7+\2\2\u0112\u0117\79\2\2\u0113\u0114\7\16\2\2\u0114"+
		"\u0115\5:\36\2\u0115\u0116\7\67\2\2\u0116\u0118\3\2\2\2\u0117\u0113\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u0125\3\2\2\2\u0119\u011a\f\24\2\2\u011a"+
		"\u011c\7\16\2\2\u011b\u011d\5:\36\2\u011c\u011b\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u0125\7\67\2\2\u011f\u0120\f\23\2\2\u0120"+
		"\u0121\7.\2\2\u0121\u0122\5\32\16\2\u0122\u0123\7\32\2\2\u0123\u0125\3"+
		"\2\2\2\u0124\u00f8\3\2\2\2\u0124\u00fb\3\2\2\2\u0124\u00fe\3\2\2\2\u0124"+
		"\u0101\3\2\2\2\u0124\u0104\3\2\2\2\u0124\u0107\3\2\2\2\u0124\u010a\3\2"+
		"\2\2\u0124\u010d\3\2\2\2\u0124\u0110\3\2\2\2\u0124\u0119\3\2\2\2\u0124"+
		"\u011f\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\33\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u0130\79\2\2\u012a\u0130"+
		"\7<\2\2\u012b\u0130\7:\2\2\u012c\u0130\7;\2\2\u012d\u0130\7=\2\2\u012e"+
		"\u0130\7>\2\2\u012f\u0129\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2"+
		"\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\35\3\2\2\2\u0131\u0134\5 \21\2\u0132\u0134\5(\25\2\u0133\u0131\3\2\2"+
		"\2\u0133\u0132\3\2\2\2\u0134\37\3\2\2\2\u0135\u0136\7,\2\2\u0136\u0137"+
		"\5\32\16\2\u0137\u013b\5\"\22\2\u0138\u013a\5$\23\2\u0139\u0138\3\2\2"+
		"\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140\5&\24\2\u013f\u013e\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\31\2\2\u0142!\3\2\2\2"+
		"\u0143\u0145\t\7\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\5D#\2\u0147#\3\2\2\2\u0148\u0149\t\b\2\2\u0149\u014a"+
		"\5\32\16\2\u014a\u014b\5\"\22\2\u014b%\3\2\2\2\u014c\u014d\t\t\2\2\u014d"+
		"\u014e\5D#\2\u014e\'\3\2\2\2\u014f\u0150\7\33\2\2\u0150\u0152\5\32\16"+
		"\2\u0151\u0153\5*\26\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\31\2\2"+
		"\u0157)\3\2\2\2\u0158\u0159\7\35\2\2\u0159\u015c\5\32\16\2\u015a\u015b"+
		"\7,\2\2\u015b\u015d\5\32\16\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2"+
		"\u015d\u015e\3\2\2\2\u015e\u015f\7\61\2\2\u015f\u0160\5D#\2\u0160+\3\2"+
		"\2\2\u0161\u0165\5.\30\2\u0162\u0165\5\60\31\2\u0163\u0165\5\62\32\2\u0164"+
		"\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165-\3\2\2\2"+
		"\u0166\u0167\7\17\2\2\u0167\u016a\5\66\34\2\u0168\u0169\7,\2\2\u0169\u016b"+
		"\5\32\16\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2"+
		"\u016c\u016d\58\35\2\u016d/\3\2\2\2\u016e\u016f\7\17\2\2\u016f\u0172\5"+
		"\66\34\2\u0170\u0171\7,\2\2\u0171\u0173\5\32\16\2\u0172\u0170\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\66\2\2\u0175\u0176"+
		"\5D#\2\u0176\u0177\7\31\2\2\u0177\61\3\2\2\2\u0178\u0179\7\37\2\2\u0179"+
		"\u017a\5\32\16\2\u017a\u017b\58\35\2\u017b\63\3\2\2\2\u017c\u017d\79\2"+
		"\2\u017d\u017e\7\13\2\2\u017e\u0189\5\32\16\2\u017f\u0180\79\2\2\u0180"+
		"\u0181\7(\2\2\u0181\u0182\5\32\16\2\u0182\u0183\t\n\2\2\u0183\u0186\5"+
		"\32\16\2\u0184\u0185\7\n\2\2\u0185\u0187\5\32\16\2\u0186\u0184\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u017c\3\2\2\2\u0188\u017f"+
		"\3\2\2\2\u0189\65\3\2\2\2\u018a\u018f\5\64\33\2\u018b\u018c\7\21\2\2\u018c"+
		"\u018e\5\64\33\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3"+
		"\2\2\2\u018f\u0190\3\2\2\2\u0190\67\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0193\t\13\2\2\u0193\u0194\5D#\2\u0194\u0195\7\31\2\2\u01959\3\2\2\2"+
		"\u0196\u019b\5\32\16\2\u0197\u0198\7\21\2\2\u0198\u019a\5\32\16\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c;\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a1\5\32\16\2\u019f\u01a0"+
		"\7\21\2\2\u01a0\u01a2\5\32\16\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\3\2\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4=\3\2\2\2\u01a5\u01aa"+
		"\79\2\2\u01a6\u01a7\7\21\2\2\u01a7\u01a9\79\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab?\3\2\2\2"+
		"\u01ac\u01aa\3\2\2\2\u01ad\u01b0\79\2\2\u01ae\u01af\7\21\2\2\u01af\u01b1"+
		"\79\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3A\3\2\2\2\u01b4\u01b7\5\30\r\2\u01b5\u01b6\7\21\2"+
		"\2\u01b6\u01b8\5\30\r\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01baC\3\2\2\2\u01bb\u01bd\5\4\3\2"+
		"\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bfE\3\2\2\2\u01c0\u01be\3\2\2\2,IPek\177\u0087\u0092\u0097"+
		"\u00a1\u00a3\u00a7\u00b5\u00b8\u00c3\u00d0\u00d7\u00e5\u00f3\u00f6\u0117"+
		"\u011c\u0124\u0126\u012f\u0133\u013b\u013f\u0144\u0154\u015c\u0164\u016a"+
		"\u0172\u0186\u0188\u018f\u019b\u01a3\u01aa\u01b2\u01b9\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}