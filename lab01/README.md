# Laboratório 01

## Notebook 1 sobre Empréstimos

* Link para o arquivo do notebook com a resolução da primeira tarefa [![Binder](https://mybinder.org/badge_logo.svg)](https://mybinder.org/v2/gh/dan7sc/mc322-oop_in_java/main?filepath=lab01%2Fnotebook%2Femprestimo01-ra042779.ipynb)

### Exercício Parte 1 - Escrevendo um Módulo

Foi escrito um programa que calcula as parcelas de um empréstimo para os seguintes valores:
* `S`: 200
* `N`: 5
* `J`: 1%

### Exercício Parte 2 - Escrevendo um Módulo (Função)

O código acima foi reescrito de forma que o programa faça uso de uma função `calcula_proxima_parcela` que é responsável pelo cálculo de uma única parcela X do empréstimo. Procurou-se evitar dependências do módulo com o programa principal. A função calcula uma única parcela, portanto, ficará a cargo da função principal que chama `calcula_proxima_parcela` realizar o restante do processo, para que sejam apresentadas todas as parcelas do financiamento.

### Exercício Parte 3 - Mantendo o Estado

A função (módulo) `calcula_proxima_parcela` acima foi modificada de modo que ela tenha uma memória da situação em que estão as coisas, sem que o `main` precise ficar informando novamente coisas que já informou no início. Para isso ocorra foram feitas as seguintes modificações:
1. desmembrou-se a função em mais de uma, uma chamada no começo do empréstimo e outra a cada parcela;
2. foram usadas técnicas de uso de variáveis não recomendadas que geram dependência dos módulos com o programa principal.
O código foi organizado de tal maneira que o `main` informa os dados do financiamento apenas uma única vez e depois solicita o cálculo da parcela subsequente sem informar tudo novamente.

### Exercício Parte 4 - Minimizando os Parâmetros

Retomando a solução da `Parte 2`, em que a função `main` deve ter usado vários parâmetros para a comunicação com a função `calcula_proxima_parcela`, foi modificada a forma como o empréstimo é representado, de forma que a função `calcula_proxima_parcela` recebesse sempre um único parâmetro capaz de representar o estado completo do empréstimo.

### Exercício Parte 5 - Múltiplos Empréstimos

Considerando que há múltiplos empréstimos que podem ser controlados em paralelo. A função `main` deve ser capaz de apresentar no console as parcelas de mais de um empréstimo de modo paralelo, mantendo um controle para cada empréstimo separadamente.

Por exemplo, supondo os seguintes dois empréstimos em paralelo:

### Empréstimo 1
* `S`: 200
* `N`: 5
* `J`: 1%

### Empréstimo 2
* `S`: 500
* `N`: 7
* `J`: 2%

O exemplo mostra dois empréstimos, mas a estrutura deve ser genérica o suficiente para controlar N empréstimos em paralelo.

## Notebook 2 sobre Empréstimos e TAD (opcional)

O código feito no exercício 5 do notebook 1 foi modificado de modo que a estrutura (struct) possa representar um Tipo Abstrato de Dados (TAD), em que ela contenha não apenas os valores de estado, como também operações executadas sobre eles. As operações (funções em C) passam a fazer parte do struct do mesmo modo que os campos de dados.

* Link para o arquivo do notebook com a resolução da segunda tarefa [![Binder](https://mybinder.org/badge_logo.svg)](https://mybinder.org/v2/gh/dan7sc/mc322-oop_in_java/main?filepath=lab01%2Fnotebook%2Femprestimo02-tad-ra042779.ipynb)
