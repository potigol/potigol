@echo off
doskey potigol=@echo off $T java -cp %POTI%/potigol.jar;%POTI%/antlr-runtime-4.1.jar MyPotigol $1 $g $1.scala $Tscala -cp %POTI%/potigol.jar;%POTI%/antlr-runtime-4.1.jar $1.scala $T @echo on
@echo on
@echo Potigol configurado!