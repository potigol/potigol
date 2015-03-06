/*
 *  Potigol
 *  Copyright (C) 2015 by Leonardo Lucena
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
 * @author Leonardo Lucena (leonardo.lucena@escolar.ifrn.edu.br)
 */

package br.edu.ifrn.potigol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
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
import br.edu.ifrn.potigol.parser.potigolParser.TipoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_funcaoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_genericoContext;
import br.edu.ifrn.potigol.parser.potigolParser.Tipo_tuplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.TuplaContext;
import br.edu.ifrn.potigol.parser.potigolParser.Valor_multiploContext;
import br.edu.ifrn.potigol.parser.potigolParser.Valor_simplesContext;

public class Listener extends potigolBaseListener {
	private int num = 0;
	private final ParseTreeProperty<String> values = new ParseTreeProperty<String>();
	private String saida = "";

	private String nextVar() {
		num++;
		return "$a" + num;
	}

	private void setValue(ParseTree node, String value) {
		values.put(node, value);
	}

	private String getValue(ParseTree node) {
		return values.get(node);
	}

	static private List<String> scalawords = Arrays.asList("type", "yield",
			"lazy", "override", "def", "with", "val", "var", "false", "true",
			"sealed", "abstract", "private", "trait", "object", "null", "if",
			"for", "while", "throw", "finally", "protected", "extends",
			"import", "final", "return", "else", "break", "new", "catch",
			"super", "class", "case", "package", "default", "try", "this",
			"match", "continue", "throws");

	private String escapeID(String id) {
		if (scalawords.contains(id)) {
			return "`" + id + "`";
		}
		return id;
	}

	private String stripString(String s) {
		return s.replace("\"", "");
	}

	@Override
	public void exitChar(CharContext ctx) {
		String s = ctx.CHAR().getText();
		setValue(ctx, s);
	}

	@Override
	public void exitGet_vetor(Get_vetorContext ctx) {
		String id = getValue(ctx.expr(0));
		String indice = getValue(ctx.expr(1));
		String s = id + ".get(" + indice + ")";
		setValue(ctx, s);
	}

	@Override
	public void exitDcl1(Dcl1Context ctx) {
		final ParseTree p;
		if (ctx.ID() != null)
			p = ctx.ID();
		else if (ctx.expr2() != null)
			p = ctx.expr2();
		else
			p = ctx.dcls();
		setValue(ctx, getValue(p));
	}

	@Override
	public void exitSet_vetor(Set_vetorContext ctx) {
		String id = ctx.ID().getText();
		int dim = ctx.expr().size() - 1;
		String[] indices = new String[dim];
		for (int i = 0; i < dim; i++)
			indices[i] = getValue(ctx.expr(i));
		String exp = getValue(ctx.expr(dim));
		String s = id;
		for (String ind : indices)
			s = s + "(" + ind + " -1)";
		s = s + "=" + exp;
		setValue(ctx, s);
	}

	@Override
	public void exitLambda(LambdaContext ctx) {
		String param = getValue(ctx.dcl1());

		String corpo = "";
		for (InstContext i : ctx.inst()) {
			corpo += getValue(i) + "\n";
		}
		String s = " (" + param + ") => {" + corpo + " }";
		setValue(ctx, s);
	}

	@Override
	public void exitTipo_generico(Tipo_genericoContext ctx) {
		String id = getValue(ctx.ID());
		String tipo = getValue(ctx.tipo());
		String s = id + "[" + tipo + "]";
		setValue(ctx, s);
	}

	@Override
	public void exitTipo_funcao(Tipo_funcaoContext ctx) {
		String esq = getValue(ctx.tipo(0));
		String dir = getValue(ctx.tipo(1));
		String s = "(" + esq + " => " + dir + ")";
		setValue(ctx, s);
	}

	@Override
	public void exitTipo2(Tipo2Context ctx) {
		String s = "";
		for (TipoContext tipo : ctx.tipo()) {
			s += ", " + getValue(tipo);
		}
		s = s.replaceFirst(", ", " ");
		setValue(ctx, s);
	}

	@Override
	public void exitTipo_tupla(Tipo_tuplaContext ctx) {
		String s = "(" + getValue(ctx.tipo2()) + ")";
		setValue(ctx, s);
	}

	@Override
	public void exitCons(ConsContext ctx) {
		String a = getValue(ctx.expr(0));
		String as = getValue(ctx.expr(1));
		final String s;
		if (ctx.getParent().getRuleIndex() == potigolParser.RULE_caso)
			s = "Lista(collection.immutable.::( " + a + ", a$" + as + "$))";

		else
			s = "{" + a + "::" + as + "}";
		setValue(ctx, s);
	}

	@Override
	public void exitExpoente(ExpoenteContext ctx) {
		String base = getValue(ctx.expr(0));
		String exp = getValue(ctx.expr(1));
		String s = "( Math.pow(" + base + ", " + exp + ") )";
		setValue(ctx, s);
	}

	@Override
	public void exitCaso(CasoContext ctx) {
		final String exp = getValue(ctx.expr(0));
		final String cond;
		if (ctx.expr().size() > 1) {
			cond = "if " + getValue(ctx.expr(1));
		} else
			cond = "";
		String exps = getValue(ctx.exprlist());
		int p = exp.indexOf("a$");
		if (p >= 0) {
			String s = exp.substring(p + 2);
			p = s.indexOf("$");
			s = s.substring(0, p);
			// String s = exp.split("if")[0].split("::")[1].replaceAll(" ",
			// "").substring(2);
			exps = "val " + s + " = Lista(a$" + s + "$);\n" + exps.substring(1);
		}
		String s = "case " + exp + " " + cond + " =>" + exps;
		setValue(ctx, s);
	}

	@Override
	public void exitEscolha(EscolhaContext ctx) {
		String exp = getValue(ctx.expr());
		String s = "(" + exp + ") match {\n";
		for (CasoContext caso : ctx.caso()) {
			s += "  " + getValue(caso) + "\n";
		}
		s += "}";
		setValue(ctx, s);
	}

	@Override
	public void exitFormato(FormatoContext ctx) {
		String exp1 = getValue(ctx.expr(0));
		String exp2 = getValue(ctx.expr(1));
		String s = "(" + exp1 + ").formato(" + exp2 + ")";
		setValue(ctx, s);
	}

	@Override
	public void exitAlias(AliasContext ctx) {
		String id = ctx.ID().getText();
		String tipo = getValue(ctx.tipo());
		String s = "type " + escapeID(id) + " = " + tipo;
		setValue(ctx, s);
	}

	@Override
	public void exitClasse(ClasseContext ctx) {
		String id = ctx.ID().getText();
		String s = "case class " + escapeID(id) + " {\n";
		for (int i = 2; i < ctx.children.size() - 1; i++) {
			ParseTree d = ctx.children.get(i);
			s += "  " + getValue(d) + "\n";
		}
		s += "}";
		setValue(ctx, s);
	}

	@Override
	public void enterProg(ProgContext ctx) {
		saida += "import br.edu.ifrn.potigol.potigolutil._\nimport br.edu.ifrn.potigol.Matematica._\n";
	}

	@Override
	public void exitAtrib_multipla(Atrib_multiplaContext ctx) {
		String id = getValue(ctx.id2());
		String[] ids = id.split(", ");
		String exp = getValue(ctx.expr2());
		String[] exps = exp.split(", ");
		String[] aux = new String[ids.length];
		String s = "";
		for (int i = 0; i < ids.length; i++) {
			aux[i] = nextVar();
			s += "val " + aux[i] + " = " + exps[i] + ";\n";
		}
		for (int i = 0; i < ids.length; i++) {
			s += ids[i] + " = " + aux[i] + ";\n";
		}
		setValue(ctx, s);
	}

	@Override
	public void exitAtrib_simples(Atrib_simplesContext ctx) {
		String id = getValue(ctx.id1());
		String[] ids = id.split(", ");
		String exp = getValue(ctx.expr());
		String var = nextVar();
		String s = "def " + var + " = " + exp + ";\n";
		for (String i : ids) {
			s += i + " = " + var + " ;\n";
		}
		setValue(ctx, s);
	}

	@Override
	public void exitChamada_funcao(Chamada_funcaoContext ctx) {
		setValue(ctx, getValue(ctx.expr()) + "(" + getValue(ctx.expr1()) + ")");
	}

	@Override
	public void exitChamada_metodo(Chamada_metodoContext ctx) {
		String exp = getValue(ctx.expr());
		String id = getValue(ctx.ID());
		String exp1 = getValue(ctx.expr1());
		String s = exp + "." + id;
		if (exp1 != null)
			s += "(" + exp1 + ")";
		setValue(ctx, s);
	}

	@Override
	public void exitComparacao(ComparacaoContext ctx) {
		String exp1 = getValue(ctx.expr(0));
		String exp2 = getValue(ctx.expr(1));
		String op = ctx.getChild(1).getText();
		if ("<>".equals(op)) {
			op = "!=";
		}
		setValue(ctx, "{" + exp1 + op + exp2 + "}");
	}

	@Override
	public void exitDcl(DclContext ctx) {
		String id = getValue(ctx.id1());
		String tipo = getValue(ctx.tipo());
		String s = id.replaceAll(", ", ": " + tipo + ", ") + ": " + tipo;
		if (ctx.parent.getRuleIndex() == potigolParser.RULE_decl_tipo) {
			s = "var " + s;
		}
		setValue(ctx, s);
	}

	@Override
	public void exitDcls(DclsContext ctx) {
		List<String> a = new ArrayList<String>();
		for (DclContext dcl : ctx.dcl()) {
			a.add(getValue(dcl));
		}
		ids2String(ctx, a);
	}

	@Override
	public void exitDecl(DeclContext ctx) {
		String s = "";
		for (ParseTree i : ctx.children) {
			s += "\n" + getValue(i);
		}
		setValue(ctx, s);
	}

	@Override
	public void exitDecl_var_multipla(Decl_var_multiplaContext ctx) {
		String id = getValue(ctx.id2());
		String[] ids = id.split(", ");
		String exp = getValue(ctx.expr2());
		String[] exps = exp.split(", ");
		String s = "";
		for (int i = 0; i < ids.length; i++) {
			s += "var " + ids[i] + " = " + exps[i] + "\n";
		}
		setValue(ctx, s);
	}

	@Override
	public void exitDecl_var_simples(Decl_var_simplesContext ctx) {
		String id = getValue(ctx.id1());
		String exp = getValue(ctx.expr());
		setValue(ctx, "var " + id + " = " + exp);
	}

	@Override
	public void exitDef_funcao(Def_funcaoContext ctx) {
		String s = "def " + getValue(ctx.ID()) + "(" + getValue(ctx.dcls())
				+ ")";
		String tipo = getValue(ctx.tipo());
		if (tipo != null)
			s += ": " + tipo;
		s += " = {" + getValue(ctx.expr()) + "}";
		setValue(ctx, s);
	}

	@Override
	public void exitDef_funcao_corpo(Def_funcao_corpoContext ctx) {
		String s = "def " + getValue(ctx.ID()) + "(" + getValue(ctx.dcls())
				+ ")";
		String tipo = getValue(ctx.tipo());
		if (tipo != null)
			s += ": " + tipo;
		s += "= {" + getValue(ctx.exprlist()) + "}\n";
		setValue(ctx, s);
	}

	@Override
	public void exitE_logico(E_logicoContext ctx) {
		String exp1 = getValue(ctx.expr(0));
		String exp2 = getValue(ctx.expr(1));
		setValue(ctx, "(" + exp1 + " && " + exp2 + ")");
	}

	@Override
	public void exitEnquanto(EnquantoContext ctx) {
		String exp = getValue(ctx.expr());
		String bloco = getValue(ctx.bloco());
		String s = "while (" + exp + ") " + bloco;
		setValue(ctx, s);
	}

	@Override
	public void exitBloco(BlocoContext ctx) {
		String exp = getValue(ctx.exprlist());
		String s = "{\n" + exp + "\n}";
		setValue(ctx, s);
	}

	@Override
	public void exitEscreva(EscrevaContext ctx) {
		setValue(ctx, "escreva(" + getValue(ctx.expr()) + ")");
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		if (getValue(ctx) == null)
			setValue(ctx, getValue(ctx.getChild(0)));
	}

	@Override
	public void exitExpr1(Expr1Context ctx) {
		List<String> a = new ArrayList<String>();
		for (ExprContext exp : ctx.expr()) {
			a.add(getValue(exp));
		}
		ids2String(ctx, a);
	}

	@Override
	public void exitExpr2(Expr2Context ctx) {
		List<String> a = new ArrayList<String>();
		for (ExprContext exp : ctx.expr()) {
			a.add(getValue(exp));
		}
		ids2String(ctx, a);
	}

	@Override
	public void exitExprlist(ExprlistContext ctx) {
		String s = "\n";
		for (InstContext i : ctx.inst()) {
			s += "  " + getValue(i) + "\n";
		}
		setValue(ctx, s);
	}

	@Override
	public void exitFaixa(FaixaContext ctx) {
		final String s;
		String id = getValue(ctx.ID());
		switch (ctx.expr().size()) {
		case 1:
			s = getValue(ctx.expr(0));
			break;
		case 2:
			s = getValue(ctx.expr(0)) + " to " + getValue(ctx.expr(1));
			break;
		default:
			s = getValue(ctx.expr(0)) + " to " + getValue(ctx.expr(1)) + " by "
					+ getValue(ctx.expr(2));
			break;
		}
		setValue(ctx, id + " <- " + s);
	}

	@Override
	public void exitFaixas(FaixasContext ctx) {
		String s = "";
		for (FaixaContext f : ctx.faixa()) {
			if (f != ctx.faixa(0))
				s += "; " + getValue(f);
			else
				s += getValue(f);
		}
		setValue(ctx, s);
	}

	@Override
	public void exitId(IdContext ctx) {
		setValue(ctx, escapeID(ctx.getText()));
	}

	@Override
	public void exitId1(Id1Context ctx) {
		List<String> a = new ArrayList<String>();
		for (TerminalNode id : ctx.ID()) {
			a.add(getValue(id));
		}
		ids2String(ctx, a);
	}

	@Override
	public void exitId2(Id2Context ctx) {
		List<String> a = new ArrayList<String>();
		for (TerminalNode id : ctx.ID()) {
			a.add(getValue(id));
		}
		ids2String(ctx, a);
	}

	@Override
	public void exitImprima(ImprimaContext ctx) {
		setValue(ctx, "imprima(" + getValue(ctx.expr()) + ")");
	}

	@Override
	public void exitInst(InstContext ctx) {
		String s = "";
		String codigo = ctx.start.getText();
		codigo = ctx.getSourceInterval().a + " .. " + ctx.getSourceInterval().b;
		for (ParseTree i : ctx.children) {
			s += "/*Codigo: " + codigo + " */\n";
			s += getValue(i) + "\n";
		}
		setValue(ctx, s);
	}

	@Override
	public void exitInteiro(InteiroContext ctx) {
		setValue(ctx, ctx.getText());
	}

	@Override
	public void exitLista(ListaContext ctx) {
		String exp = getValue(ctx.expr1());
		if (exp == null)
			exp = "";
		setValue(ctx, "Lista(List(" + exp + "))");
	}

	@Override
	public void exitMais_menos_unario(Mais_menos_unarioContext ctx) {
		String exp1 = getValue(ctx.expr());
		String op = ctx.getChild(0).getText();
		setValue(ctx, "{" + op + exp1 + "}");
	}

	@Override
	public void exitMult_div(Mult_divContext ctx) {
		String exp1 = getValue(ctx.expr(0));
		String exp2 = getValue(ctx.expr(1));
		String op = ctx.getChild(1).getText();
		if (op.equals("mod"))
			op = "%";
		if (op.equals("/"))
			exp1 = "(" + exp1 + ").toDouble";
		if (op.equals("div")) {
			op = "/";
		}
		setValue(ctx, "{" + exp1 + " " + op + " " + exp2 + "}");
	}

	@Override
	public void exitNao_logico(Nao_logicoContext ctx) {
		String exp = getValue(ctx.expr());
		setValue(ctx, "{!" + exp + "}");
	}

	@Override
	public void exitOu_logico(Ou_logicoContext ctx) {
		String exp1 = getValue(ctx.expr(0));
		String exp2 = getValue(ctx.expr(1));
		setValue(ctx, "{" + exp1 + " || " + exp2 + "}");
	}

	@Override
	public void exitPara_faca(Para_facaContext ctx) {
		String faixas = getValue(ctx.faixas());
		String se = getValue(ctx.expr());
		String bloco = getValue(ctx.bloco());
		String s = "for(" + faixas;
		if (se != null)
			s += " if " + se;
		s += ") " + bloco;
		setValue(ctx, s);
	}

	@Override
	public void exitPara_gere(Para_gereContext ctx) {
		String faixas = getValue(ctx.faixas());
		String se = getValue(ctx.expr());
		String faca = getValue(ctx.exprlist());
		String s = "Lista((for(" + faixas;
		if (se != null)
			s += " if " + se;
		s += ")  yield {" + faca + "}).toList)";
		setValue(ctx, s);

	}

	@Override
	public void exitParen(ParenContext ctx) {
		String exp = getValue(ctx.expr());
		setValue(ctx, "(" + exp + ")");
	}

	@Override
	public void exitProg(ProgContext ctx) {
		for (InstContext i : ctx.inst()) {
			saida += getValue(i);
		}
		saida += "\n()\n";
		setValue(ctx, saida);
	}

	@Override
	public void exitReal(RealContext ctx) {
		setValue(ctx, ctx.getText());
	}

	@Override
	public void exitSe(SeContext ctx) {
		String s = "1 match {\n";
		s += "case _ if (" + getValue(ctx.expr()) + ") => "
				+ getValue(ctx.entao()) + "\n";
		for (SenaoseContext c : ctx.senaose()) {
			s += getValue(c) + "\n";
		}

		if (ctx.senao() == null) {
			s += "case _ =>";
		} else {
			s += "case _ => " + getValue(ctx.senao());
		}
		s += "\n}";
		setValue(ctx, s);
	}

	@Override
	public void exitEntao(EntaoContext ctx) {
		setValue(ctx, getValue(ctx.exprlist()));
	}

	@Override
	public void exitSenao(SenaoContext ctx) {
		setValue(ctx, getValue(ctx.exprlist()));
	}

	@Override
	public void exitSenaose(SenaoseContext ctx) {
		String s = "case _ if (" + getValue(ctx.expr()) + ") => "
				+ getValue(ctx.entao()) + "\n";
		setValue(ctx, s);
	}

	@Override
	public void exitSoma_sub(Soma_subContext ctx) {
		String exp1 = getValue(ctx.expr(0));
		String exp2 = getValue(ctx.expr(1));
		String op = ctx.getChild(1).getText();
		setValue(ctx, "{" + exp1 + op + exp2 + "}");
	}

	@Override
	public void exitTexto(TextoContext ctx) {
		String s = ctx.getText().replace("{", "${");
		if (s.contains("\n")) {
			s = "\"\"" + s + "\"\".stripMargin('|')";
		}
		if (s.contains("{")) {
			s = "s" + s;
		}
		setValue(ctx, s);
	}

	public void exitTexto_interpolacao(Texto_interpolacaoContext ctx) {
		String s = ctx.BS().getText().replace("{", "${");
		s = s + getValue(ctx.expr(0));
		int i = 1;
		for (TerminalNode x : ctx.MS()) {
			s = s + x.getText().replace("{", "${");
			s = s + getValue(ctx.expr(i));
			i++;
		}
		s = s + ctx.ES().getText();
		if (s.contains("\n")) {
			s = "\"\"" + s + "\"\".stripMargin('|')";
		}
		s = "s" + s;
		setValue(ctx, s);

	}

	@Override
	public void exitDecl_uso(Decl_usoContext ctx) {
		String s = "import " + stripString(getValue(ctx.STRING())) + "._";
		setValue(ctx, s);
	}

	@Override
	public void exitTupla(TuplaContext ctx) {
		String exp = getValue(ctx.expr2());
		setValue(ctx, "(" + exp + ")");
	}

	@Override
	public void exitValor_multiplo(Valor_multiploContext ctx) {
		String id = getValue(ctx.id2());
		String[] ids = id.split(", ");
		String exp = getValue(ctx.expr2());
		String[] exps = exp.split(", ");
		String s = "";
		for (int i = 0; i < ids.length; i++) {
			s += "val " + ids[i] + " = " + exps[i] + ";\n";
		}
		setValue(ctx, s);
	}

	@Override
	public void exitValor_simples(Valor_simplesContext ctx) {
		final String id = getValue(ctx.id1());
		final String exp = getValue(ctx.expr());
		setValue(ctx, "val " + id + " = " + exp + ";\n");
	}

	@Override
	public void exitBooleano(BooleanoContext ctx) {
		final String valor;
		if (ctx.BOOLEANO().getText().equals("verdadeiro"))
			valor = "true";
		else
			valor = "false";
		setValue(ctx, valor);
	}

	private void ids2String(RuleContext ctx, List<String> a) {
		String s = "";
		if (a.size() > 0) {
			s = a.get(0);
		}
		for (int i = 1; i < a.size(); i++) {
			s += ", " + a.get(i);
		}
		setValue(ctx, s);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		final String s;
		switch (node.getSymbol().getType()) {
		case potigolLexer.ID:
			s = escapeID(node.getText());
			break;
		default:
			s = node.getText();
		}
		setValue(node, s);
	}

	public String getSaida() {
		return saida.replaceAll("\n\n", "\n").replaceAll("\n\n", "\n");
	}
}
