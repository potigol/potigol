# Lista 6 - Tipos Abstratos de Dados (TADs) genéricos

Esta lista mostra como declarar **tipos genéricos** em Potigol e usá-los para
implementar estruturas de dados clássicas com **nós encadeados**.

## Tipos genéricos

Um tipo genérico recebe **parâmetros de tipo** entre colchetes, logo após o nome:

```
tipo Caixa[T]
  conteudo: T
fim

c1: Caixa[Inteiro] = Caixa(42)
c2 = Caixa("olá")            # o tipo Caixa[Texto] é deduzido
```

Funções e métodos também podem ser genéricos:

```
primeiro[T](lista: Lista[T]): T = lista.cabeça

tipo Par[A, B]
  a: A
  b: B
  invertido() = Par(b, a)
  transforme[C](f: A => C) = Par(f(a), b)
fim
```

Também valem para `tipo abstrato`, para os supertipos e para apelidos:

```
tipo abstrato Forma[T]
  area(): T
fim

tipo Quadrado[T]: Forma[T]
  ...
fim

tipo Dupla[A] = (A, A)
```

Quando o valor não indica o `T` (por exemplo, uma estrutura vazia), declare o
tipo da variável: `p: Pilha[Inteiro] = pilha_vazia()`.

## Nós e `nulo`

Cada estrutura é formada por **nós**. Cada nó guarda um valor e aponta para
outro nó. O valor `nulo` indica que não há nó ("fim da corrente"):

```
tipo Nó[T]
  valor: T
  var próximo: Nó[T]
fim

último = Nó(3, nulo)
primeiro = Nó(1, Nó(2, último))
se último.próximo == nulo então escreva "fim da corrente" fim
```

`nulo` só pode ser usado em tipos como `Texto`, `Lista` ou os criados com
`tipo`. Valores `Inteiro`, `Real`, `Lógico` e `Caractere` nunca são `nulo`.

As estruturas desta lista são **mutáveis**: `p.empilhe(10)` altera a própria
pilha. Para mostrar o conteúdo, use o método `lista()`.

## Exemplos

| Arquivo | Estrutura | Encadeamento | Aplicação |
|---|---|---|---|
| [pilha.poti](pilha.poti) | Pilha (LIFO) | simples, guarda o topo | parênteses e colchetes balanceados |
| [fila.poti](fila.poti) | Fila (FIFO) | simples, guarda o primeiro e o último nó | simulação de atendimento; método genérico `mapeie` |
| [deque.poti](deque.poti) | Deque | duplo, guarda o primeiro e o último nó | verificar palíndromos |

Todas as operações de inserção, remoção e consulta são **O(1)**. Só `lista()`
(e `mapeie`, na fila) percorre a estrutura, em O(n).

Para executar:

```
java -jar potigol.jar pilha.poti
```

## Exercícios

### 1. Árvore binária de busca

Implemente uma `Arvore[T]` com as operações `insira(x)`, `contém(x)`,
`em_ordem()` (lista com os elementos em ordem crescente), `tamanho()` e
`altura()`.

Dicas:
- Cada nó aponta para os filhos da esquerda e da direita (`nulo` quando não há
  filho):
  ```
  tipo Nó[T]
    valor: T
    var esq: Nó[T]
    var dir: Nó[T]
  fim
  ```
- Um `T` qualquer não sabe se comparar com `<`. Guarde a função de comparação
  como um campo da árvore:
  ```
  tipo Arvore[T]
    var raiz: Nó[T]
    menor: (T, T) => Lógico
    ...
  fim

  a: Arvore[Inteiro] = Arvore(nulo, (x, y) => x < y)
  ```
- Funções recursivas sobre os nós ficam curtas:
  ```
  tamanho[T](n: Nó[T]): Inteiro =
    se n == nulo então 0 senão 1 + tamanho(n.esq) + tamanho(n.dir) fim
  ```

### 2. Fila de prioridade (Heap)

Implemente um tipo `FilaDePrioridade[T]` com as operações `insira(x)`,
`mínimo()`, `remova_mínimo()`, `vazia()` e `tamanho()`, com `insira` e
`remova_mínimo` em O(log n) e `mínimo` em O(1).

Dicas:
- Use a mesma ideia da árvore: nós com filhos `esq` e `dir` e um campo
  `menor: (T, T) => Lógico`.
- Pesquise sobre *heap de esquerda* (leftist heap): uma árvore em que cada nó
  é menor que seus filhos e em que a operação principal é **unir** duas heaps.
  `insira` e `remova_mínimo` são feitas com essa união.
