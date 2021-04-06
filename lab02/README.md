# Laboratório em Estruturas de Programação Java

O laboratório a seguir serve para praticar estruturas de programação Java sem compromisso com a orientação a objetos.

## Desafio 1 - Empréstimo

Em um financiamento com juros compostos e número de parcelas fixas parte-se dos seguintes parâmetros:
* `S` - valor da primeira parcela
* `N` - número de parcelas
* `J` - percentual de juros mensal

A primeira parcela a ser paga do financiamento é sempre igual a `S`. A partir daí é feita uma atualização mensal da parcela, em que cada nova parcela é calculada a partir da parcela do mês anterior, conforme a fórmula:

> Parcela<sub>mês</sub> = Parcela<sub>mês-1</sub> * (1 + `J` / 100)

O financiamento encerra quando as `N` parcelas são pagas.

Exemplo:
* `S`: 200
* `N`: 5
* `J`: 1%

Parcelas do financiamento:
`200`; `202`; `204.02`; `206.06`; `208.12`

### Desafio 1 / Parte 1 - Escrevendo o programa sem módulos

Dado o problema descrito, foi feito um programa que calcula as parcelas de um empréstimo para os seguintes valores:
* S: 200
* N: 5
* J: 1%

Nesta versão não foi usado outro módulo além da função principal.

### Desafio 1 / Parte 2 - Escrevendo módulos

O código acima foi reescrito de forma que o programa faça uso de uma função que seja responsável pelo cálculo de uma parcela X do empréstimo.


## Desafio 2

Foi escrito um programa que sorteia um número inteiro entre `0` e `9999` o número é exibido, em seguida convertido para binário e a versão binária deve ser apresentada no console.


## Desafio 3

Uma molécula de DNA pode ser definida a partir de uma cadeia que representa a sequência de suas bases:
A - Adenina
C - Citosina
G - Guanina
T - Timina

Desse modo, uma string pode ser usada para representar um segmento do DNA da seguinte maneira: `ATTACGCGCAAAC`.

Uma molécula de RNA pode ser definida a partir de uma cadeia que representa a sequência de suas bases:
A - Adenina
C - Citosina
G - Guanina
U - Uracila

Desse modo, uma string pode ser usada para representar um segmento do RNA da seguinte maneira: `UAAUGCGCGUUUG`.

Foi escrito uma função (método) que codifica a cadeia de RNA produzida a partir de uma cadeia de DNA. A função é genérica o suficiente para ser aplicável a qualquer cadeia. A entrada é uma string (DNA) e o retorno é uma string (RNA).


## Desafio 4

Uma empresa precisa realizar uma estatística do salário de seus funcionários.

Para fins de teste, os salários devem ser gerados aleatoriamente com valores variando entre R$ 2.500 e R$ 15.000.

Foi escrito um programa que gera uma lista contendo os salários de 50 funcionários da empresa e exibido no console quantos funcionários ganham salário acima da média.
