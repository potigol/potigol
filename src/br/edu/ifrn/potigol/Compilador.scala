/*
 *  Potigol
 *  Copyright (C) 2005  Leonardo Lucena
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

package br.edu.ifrn.potigol

import com.twitter.util.Eval
import scala.util.{ Try, Success, Failure }

class Compilador(val debug: Boolean = false, wait: Boolean = false) {

  def executar(code: String, codigoPotigol: String, cor: Boolean = false) = {
    val c = (code.split("\n").take(2) ++ List(s"$$cor=${cor}") ++
      code.split("\n").drop(2)).mkString("\n");
    if (debug)
      imprimirCodigo(c)
    else {
      avaliar(c) match {
        case Success(_) =>
          if (wait) print("\b\b\b\b\b\b\b\b\b\b          \b\b\b\b\b\b\b\b\b\b")
          (new Eval(None)).apply[Unit](c)
        case Failure(f) =>
          if (wait) print("\b\b\b\b\b\b\b\b\b\b          \b\b\b\b\b\b\b\b\b\b")
          println(codigoErro(c, f.getMessage, codigoPotigol, cor))
        case _ =>
          if (wait) print("\b\b\b\b\b\b\b\b\b\b          \b\b\b\b\b\b\b\b\b\b")
          println("erro")
      }
    }
  }
  def avaliar(code: String) = {
    Try {
      (new Eval(None)).check(code)
    }
  }

  def linhaErro(code: String) = {
    avaliar(code) match {
      case Success(_) => 0
      case Failure(f) =>
        val linhaScala = f.getMessage.split(": ")(1).split(" ")(1).toInt
        code.split('\n').take(linhaScala).reverse.toList.dropWhile { x => !x.contains("/*Codigo") }.head.split(" ")(1).toInt;
    }
  }

  def codigoErro(code: String, erro: String, codigoPotigol: String, cor: Boolean = false) = {
    val partes = erro.split(": ")
    if (partes.size > 2) {
      val err = partes(2)
      val linha = partes(1).split(" ")(1).toInt
      val linhaPotigol = code.split("\n").take(linha - 1).reverse.head.dropWhile { x => !x.isDigit }.takeWhile { x => x.isDigit } toInt
      val msg = err match {
        case "not found" if debug => s"${code} - ${erro}"
        case "not found"          => "Valor não encontrado"
        case a if debug           => a
        case _                    => "Erro "
      }
      imprimirCodigo((codigoPotigol.split("\n").toList
        .zipWithIndex.map { case (linha, numero) => if (cor && numero == linhaPotigol - 1) "\033[31m" + linha + "\033[37m" else linha })
        .drop(linhaPotigol - 3).take(5).mkString("\n"), Math.max(linhaPotigol - 3, 0))
      msg + "\nlinha: " + linhaPotigol
    }
  }
  def imprimirCodigo(code: String, inicio: Int = 0) {
    val linhas = code.split('\n')
    println()
    for (line <- linhas.zipWithIndex) {
      println(s"${(line._2 + 1 + inicio).formatted("%4d")} | ${line._1}")
    }
  }
}

object Comp extends App {
  (new Compilador()).executar("println(1+2)\nval a = readInt\nprintln(b)", "")
}