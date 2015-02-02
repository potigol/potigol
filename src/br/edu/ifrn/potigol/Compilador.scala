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

class Compilador {
  def executar(code: String) = {
    avaliar(code) match {
      case Success(_) => print("\b\b\b\b\b\b\b\b\b\b          \b\b\b\b\b\b\b\b\b\b");(new Eval).apply[Unit](code)
      case Failure(f) => println(codigoErro(code,f.getMessage))
      case _ => println("erro")
    }
  }
  def avaliar(code: String) = {
    Try {
      (new Eval).check(code)
    }
  }

  def codigoErro(code: String, erro: String) = {
    val partes = erro.split(": ")
    val err = partes(2)
    val linha = partes(1).split(" ")(1).toInt
    val msg = err match {
      case "not found" => "Valor não encontrado"
      case _ => "Erro desconhecido"
    }
    msg+"\nlinha: "+linha
  }
}

object Comp extends App {
  (new Compilador()).executar("println(1+2)\nval a = readInt\nprintln(b)")
}