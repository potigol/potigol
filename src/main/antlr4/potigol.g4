/*
 *  Potigol
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

grammar potigol ;

prog
    : inst* ;

inst
    : decl
    | expr
    | bloco
    | cmd ;

// Comando
cmd
    : 'escreva' expr                              # escreva
    | 'imprima' expr                              # imprima
    | qualid1 ':=' expr                           # atrib_simples
    | qualid2 ':=' expr2                          # atrib_multipla
    | qualid ('['expr']')+ ':=' expr              # set_vetor ;

// Declaracao
decl
    : decl_valor
    | decl_funcao
    | decl_tipo
    | decl_uso ;

decl_valor
    : id1 '=' expr                                # valor_simples
    | id2 '=' expr2                               # valor_multiplo
    | 'var' id1 (':='| '=') expr                  # decl_var_simples
    | 'var' id2 (':='| '=') expr2                 # decl_var_multipla ;

decl_funcao
    : ID '(' dcls ')' (':' tipo)? '=' expr        # def_funcao
    | ID '(' dcls ')' (':' tipo)? exprlist retorne? 'fim'  # def_funcao_corpo ;

decl_tipo
    : 'tipo' ID '=' tipo                          # alias
    | 'tipo' ID (dcl|dcl_var|decl_funcao|decl_valor)* 'fim' # classe ;

decl_uso
    : 'use' STRING ;

retorne
    : 'retorne' expr ;

dcl
    : id1 ':' tipo ;
    
dcl_var
    : 'var' id1 ':' tipo ;

dcls
    : (dcl (',' dcl)* )? ;

dcl1
    : ID
    | '(' expr2 ')'
    | '(' dcls ')' ;

tipo
    : ID                                          # tipo_simples
    | '(' tipo2 ')'                               # tipo_tupla
    | ID '[' tipo ']'                             # tipo_generico
    | <assoc=right> tipo '=>' tipo                # tipo_funcao ;

// Expressao 
expr
    : literal                                     # lit
    | expr '.' ID ('(' expr1 ')')?                # chamada_metodo
    | expr '(' expr1? ')'                         # chamada_funcao
    | expr '[' expr ']'                           # get_vetor
    | <assoc=right> expr '^' expr                 # expoente
    | <assoc=right> expr '::' expr                # cons
    | ('+'|'-') expr                              # mais_menos_unario
    | expr ('*'|'/'|'div'|'mod') expr             # mult_div
    | expr ('+'|'-') expr                         # soma_sub
    | expr 'formato' expr                         # formato
    | expr ('>'|'>='|'<'|'<='|'=='|'<>') expr     # comparacao
    | ('nao'|'n\u00e3o') expr                     # nao_logico
    | expr 'e' expr                               # e_logico
    | expr 'ou' expr                              # ou_logico
    | dcl1 '=>' inst                              # lambda
    | decisao                                     # decis
    | repeticao                                   # laco
    | '(' expr2 ')'                               # tupla
    | '(' expr ')'                                # paren
    | '[' expr1? ']'                              # lista
    | 'isto'                                      # isto
    | '_'                                         # curinga ;

literal
    : BOOLEANO                                    # booleano
    | ID                                          # id
    | BS expr (MS expr)* ES                       # texto_interpolacao
    | STRING                                      # texto
    | INT                                         # inteiro
    | FLOAT                                       # real
    | CHAR                                        # char ;

    
// Decisao
decisao
    : se
    | escolha ;

se
    : 'se' expr entao senaose* senao? 'fim' ;

entao
    : ('entao'  |'ent\u00e3o'  )? exprlist ;

senaose
    : ('senaose'|'sen\u00e3ose')  expr entao ;

senao
    : ('senao'  |'sen\u00e3o'  )  exprlist ;

escolha
    : 'escolha' expr caso+ 'fim' ;

caso
    : 'caso' expr ('se' expr)? '=>' exprlist ;

 // : 'caso' padrao ('se' expr)? '=>' exprlist ;

padrao
    : '_'                                         # padrao_default
    | ID                                          # padrao_id
    | literal                                     # padrao_literal
    | ID '(' padrao ')'                           # padrao_objeto
    | padrao ('::' padrao)+                       # padrao_cons
    | '(' padrao+ ')'                             # padrao_tupla
    | '[' padrao? ']'                             # padrao_lista
    | padrao ('|' padrao)+                        # padrao_ou
    | padrao (',' padrao)+                        # padrao_virgula ;

// Repeticao    
repeticao
    : para_faca
    | para_gere
    | enquanto ;

para_faca
    : 'para' faixas ('se' expr)? bloco ;

para_gere
    : 'para' faixas ('se' expr)? 'gere' exprlist 'fim' ;

enquanto
    : 'enquanto' expr bloco ;

faixa
    : ID 'em' expr
    | ID 'de' expr ('ate'|'at\u00e9') expr ('passo' expr)? ;

faixas
    : faixa (',' faixa)* ;

bloco
    : ('faca' | 'fa\u00e7a') exprlist 'fim' ;

// Outros
expr1
    : expr (',' expr)* ;

expr2
    : expr (',' expr)+ ;

id1
    : ID (',' ID)* ;

id2
    : ID (',' ID)+ ;

qualid 
	: (ID '.')* ID;

qualid1
	: qualid (',' qualid)* ;

qualid2
	: qualid (',' qualid)+ ;


tipo2
    : tipo (',' tipo)+ ;

exprlist
    : inst* ;

// Lexer
//channels { WSCHANNEL, MYHIDDEN };
	
ID
    : (ALPHA|ACENTO) (ALPHA|ACENTO|DIGIT)* ;

fragment ALPHA
    : 'a' .. 'z'
    | 'A' .. 'Z'
    | '_' ;

fragment ACENTO
    : '\u00a1' .. '\ufffc' ;

INT
    : DIGIT+ ;

FLOAT
    : DIGIT+ '.' DIGIT+
    | '.' DIGIT+ ;

fragment DIGIT
    : '0'..'9' ;

STRING
    : '"' (ESC | ~[{]) *? '"' ;

BS
    : '"' ~["]*? '{' ;

MS
    : '}' ~["]*? '{' ;

ES
    : '}' ~[{]*? '"' ;

CHAR
    : '\''.'\'' ;

BOOLEANO
    : 'verdadeiro'
    | 'falso' ;

fragment ESC
    : '\\"'
    | '\\\\' ;

WS
    : (' '|'\t'|'\r')+ -> skip ;

COMMENT
    : '#' .*? '\r'? '\n' -> channel(1) ;

NL
    : '\n' ->channel(2) ;

