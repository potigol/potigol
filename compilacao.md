# Compilação

 - Fazer download do projeto no Github https://github.com/potigol/potigol
 - Fazer o download do Eclipse
 - Instalar o plugin de Scala no Eclipse http://download.scala-ide.org/sdk/lithium/e46/scala212/stable/site
 - Importar o projeto para o Eclipse usando a opção "File/Open Project from file system ..."
 - Em configuração do projeto adicione a opção "add scala nature"
 - Na pasta '/lib' adicione os arquivos 'antlr-4.5.3-complete.jar' e 'scala-compiler.jar' ao 'Build path' (use o botão direito do mouse sobre os arquivos).
 - Se quiser alterar a gramática instale o ANTLR (https://github.com/jknack/antlr4ide)
 - Executar o arquivo 'potigol.xml' para gerar uma nova versão
 - Os arquivos gerados estarão na pasta '/jar'.

## Via sbt (no linux)

- Fazer download do projeto no Github https://github.com/potigol/potigol
- Executar o comando abaixo na raiz do projeto:
  ```sh
  ./sbt clean assembly
  ```
 - Os arquivos gerados estarão na pasta '/jar'.

### Gerando projeto para o Eclipse

- Executar o comando abaixo na raiz do projeto:
  ```sh
  ./sbt clean assembly eclipse
  ```
- O projeto estará pronto para ser importado no eclipse.
