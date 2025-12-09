# Padrão Composite

## Introdução
O padrão Composite compõe objetos em estruturas de árvore, tratando objetos simples e compostos de forma igual.

## Por que foi criado
Foi criado para representar hierarquias parte-todo, como arquivos e pastas, de forma uniforme.

## Quando usar
Use quando clientes precisam tratar objetos individuais e grupos da mesma forma, como em sistemas de arquivos.

## Comparação com outros métodos
Diferente de listas simples, o Composite permite operações recursivas em estruturas aninhadas.

## Prós e Contras
**Prós:** Simplifica código cliente, fácil de adicionar novos tipos.  
**Contras:** Pode ser difícil restringir tipos em composições.