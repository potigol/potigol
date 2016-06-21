/*
 *  Copyright (C) 2015-2016  Leonardo Lucena
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

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import br.edu.ifrn.potigol.parser.potigolLexer;
import br.edu.ifrn.potigol.parser.potigolParser;

public class Principal {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out
					.println("Potigol versão 0.9.7 Copyright (C) 2016 Leonardo Lucena\n\nUso: potigol [arquivo.poti]\n");
			return;
		}

		String arq = args[args.length - 1];
		List<String> argList = Arrays.asList(args);
		boolean debug = argument(argList, "-d");
		boolean wait = argument(argList, "-w");
		boolean color = argument(argList, "-c");
		try {
			if (wait) {
				System.out.print("Aguarde...");
			}

			final Listener listener = getListner(arq);
			final String saida = listener.getSaida();

			if (saida.trim().length() > 40) {
				Compilador c = new Compilador(debug, wait);
				c.executar(saida, lerArquivo(arq), color);
			}
		} catch (IOException e) {
			System.out.println("Erro: Arquivo " + arq + " não encontrado.");
		}
	}

	public static Listener getListner(final String arq) throws IOException {
		String r = lerArquivo(arq);
		final ANTLRInputStream input = new ANTLRInputStream(r);
		final potigolLexer lexer = new potigolLexer(input);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final potigolParser parser = new potigolParser(tokens);
		final ParseTree tree = parser.prog();
		final ParseTreeWalker walker = new ParseTreeWalker();
		final Listener listener = new Listener();
		walker.walk(listener, tree);
		return listener;
	}

	public static String lerArquivo(String arq) throws IOException {
		Path path = Paths.get(arq);
		List<String> linhas = Files.readAllLines(path, StandardCharsets.UTF_8);
		StringBuffer s = new StringBuffer();
		for (String linha : linhas) {
			s.append(linha);
			s.append('\n');
		}
		return s.toString();
	}

	private static boolean argument(final List<String> list, final String value) {
		for (String a : list) {
			if (a.startsWith(value))
				return true;
		}
		return false;
	}
}
