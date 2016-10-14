@echo off
title Potigol
:loop
java -jar %~dp0potigol.jar -w %*
set novamente=n
set /p novamente=Executar novamente [s/n]?:
IF /I NOT %novamente%==s goto exitloop
goto loop
:exitloop
exit
@echo on
