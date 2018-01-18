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

import java.io.File;
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
    private static final String versao = "0.9.15";

    private static final int saidaMinima = -1;

    public static String test(final String code, final String input) {
        final Listener listener = getListnerFromString(code);
        final String saida = listener.getSaida();
        if (saida.trim().length() > saidaMinima) {
            final Compilador compilador = new Compilador(false, false);
            return compilador.executar(saida, code, false,
                    "val $output = new java.io.ByteArrayOutputStream;\n"
                            + "val $input = new java.io.ByteArrayInputStream(\"\"\""
                            + input + "\"\"\".getBytes(\"UTF-8\"));\n"
                            + "Console.setOut($output);\n"
                            + "Console.setIn($input);\n",
                    "$output.toString()");
        }
        return "";
    }

    public static void main(final String... args) {
        if (args.length == 0) {
            System.out.println("Potigol versão " + versao
                    + " Copyright (C) 2015-2018 Leonardo Lucena" + "\n\n"
                    + "Uso: potigol [-c] [-w] [arquivo.poti]\n");
        } else {
            final String arq = args[args.length - 1];
            final List<String> argList = Arrays.asList(args);
            try {
                final boolean wait = argument(argList, "-w");
                if (wait) {
                    System.out.print("Aguarde...");
                }

                final Listener listener = getListner(arq);
                final String saida = listener.getSaida();

                if (saida.trim().length() > saidaMinima) {
                    final boolean debug = argument(argList, "-d");
                    final Compilador compilador = new Compilador(debug, wait);
                    final boolean color = argument(argList, "-c");
                    compilador.executar(saida, lerArquivo(arq), color, "", "");
                }
            } catch (IOException e) {
                System.err.println("Erro: Arquivo " + arq + " não encontrado.");
            }
        }
    }

    public static Listener getListner(final String arq) throws IOException {
        final String file = lerArquivo(arq);
        return getListnerFromString(file);
    }

    private static Listener getListnerFromString(final String file) {
        final ANTLRInputStream input = new ANTLRInputStream(file);
        final potigolLexer lexer = new potigolLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final potigolParser parser = new potigolParser(tokens);
        final ParseTree tree = parser.prog();
        final ParseTreeWalker walker = new ParseTreeWalker();
        final Listener listener = new Listener();
        walker.walk(listener, tree);
        return listener;
    }

    public static String lerArquivo(final String arq) throws IOException {
        final Path path = Paths.get(arq);
        final List<String> linhas = Files.readAllLines(path,
                StandardCharsets.UTF_8);
        final StringBuffer conteudo = new StringBuffer();
        for (final String linha : linhas) {
            if (linha.trim().startsWith("use")) {
                String s = linha.substring(3).replaceAll("\"", "").trim();
                File uso = new File(s);
                if (uso.exists() && uso.isFile()) {
                    conteudo.append(lerArquivo(s)).append('\n');
                } else {
                    conteudo.append(linha).append('\n');
                }
            } else {
                conteudo.append(linha).append('\n');
            }
        }
        return conteudo.toString();
    }

    private Principal() {
    }

    private static boolean argument(final List<String> list,
            final String value) {
        boolean resposta = false;
        for (final String a : list) {
            if (a.startsWith(value)) {
                resposta = true;
            }
        }
        return resposta;
    }
}
