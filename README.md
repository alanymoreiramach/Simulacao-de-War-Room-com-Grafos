# Simulacao-de-War-Room-com-Grafos
# Simulacao-de-War-Room-com-Grafos

Trabalho sobre Teoria e Modelos de Grafos - Uma abordagem conceitual para Engenharia de Software

Exercício Prático: Simulação de War Room com Grafos

## Objetivo

O objetivo deste projeto é implementar uma solução para o problema Vertex Cover utilizando grafos.

No contexto do trabalho:

- os vértices representam dispositivos da rede;
- as arestas representam conexões entre dispositivos;
- o sistema deve encontrar um conjunto de vértices capaz de cobrir todas as arestas do grafo.

---

## Problema Vertex Cover

O problema Vertex Cover consiste em encontrar um conjunto de vértices onde cada aresta do grafo possui pelo menos uma extremidade pertencente ao conjunto selecionado.

Exemplo:

```text
A ----- B
 \     /
   \ /
    C
```

Uma possível cobertura seria:

```text
A e C
```

pois todas as arestas ficam cobertas.

O problema Vertex Cover pertence à classe dos problemas NP-Completos na Teoria da Complexidade Computacional.

---

## Funcionalidades

- Representação de grafos
- Entrada dinâmica de vértices
- Entrada dinâmica de arestas
- Implementação do algoritmo Vertex Cover
- Exibição dos vértices escolhidos
- Exibição do tamanho da cobertura
- Análise de complexidade

---

## Estruturas Utilizadas

O projeto utiliza:

- `ArrayList` para armazenamento dos vértices
- Classe `Aresta` para representação das conexões
- Algoritmo Guloso (Greedy)

---

## Algoritmo Utilizado

Foi utilizada uma abordagem gulosa (Greedy) para resolver o problema Vertex Cover.

O algoritmo funciona da seguinte forma:

1. Calcula a frequência dos vértices nas arestas
2. Seleciona o vértice com maior incidência
3. Adiciona o vértice à cobertura
4. Remove as arestas cobertas
5. Repete o processo até que todas as arestas sejam removidas

Essa abordagem não garante a solução ótima em todos os casos, mas produz uma solução eficiente e adequada para o problema proposto.

---

## Complexidade

A complexidade aproximada da implementação atual é:

```text
O(V² * E)

---

Onde:

- `V` = quantidade de vértices
- `E` = quantidade de arestas

---

## Estrutura do Projeto

```text
vertex-cover-war-room/
└── src/
    └── Main.java
├── README.md
```

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Estruturas de Dados
- Grafos

---

## Como Executar

### Compilar

```bash
javac Main.java
```

### Executar

```bash
java Main
```

---

## Exemplo de Entrada

```text
Quantidade de vértices: 4

Vértice 1: a
Vértice 2: b
Vértice 3: c
Vértice 4: d

Quantidade de arestas: 4

Aresta 1
Origem: a
Destino: b

Aresta 2
Origem: a
Destino: c

Aresta 3
Origem: b
Destino: d

Aresta 4
Origem: c
Destino: d
```

---

## Exemplo de Saída

```text
=== Vertex Cover ===
Vértices escolhidos:
- a
- d

Tamanho da cobertura: 2

Complexidade aproximada da implementação: O(V^2 * E)
(Implementação baseada em heurística gulosa de aproximação)

---

## Resultado Esperado

O programa deve:

- ler os vértices e arestas do grafo;
- identificar uma cobertura de vértices;
- exibir os vértices selecionados;
- informar o tamanho da cobertura;
- apresentar a complexidade do algoritmo.

---
