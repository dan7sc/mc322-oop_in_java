# Lombriga no Aquário

A classe denominada `AquarioLombriga` cria um objeto que representa uma lombriga dentro de um aquário (ambos estarão juntos em um único objeto).

## Lombriga

A lombriga é representada por um caractere da cabeça `O` seguido por uma sequência de caracteres `@`, cujo número de total caracteres (incluindo a cabeça) é equivalente ao tamanho. Por exemplo, uma lombriga de tamanho 4 seria representada assim:

~~~
@@@O
~~~

A cabeça indica o lado para o qual a lombriga está virada. No exemplo anterior, a lombriga está virada para a direita.

## Aquário

O espaço do aquário também é representado por uma sequência de caracteres `#`. Por exemplo, um aquário de tamanho 8 é representado assim:

~~~
########
~~~

## Lombriga no Aquário

Sempre o aquário e a lombriga são representados em uma única linha. A lombriga ocupa espaços vazios do aquário. Por exemplo, uma lombriga de tamanho 4 em um aquário de tamanho 8, pode ser representado assim:

~~~
#@@@O###
~~~

## Se Movendo pelo Aquário

Note que a lombriga pode estar em qualquer posição do aquário, desde que ela caiba no espaço disponível.
A lombriga pode se mover pelo aquário sempre para a direção para a qual ela está virada. No exemplo anterior, a lombriga daria um passo assim:

~~~
##@@@O##
~~~

## Tamanho da Lombriga

A lombriga pode crescer de tamanho, sempre uma unidade de cada vez na direção oposta à cabeça. No exemplo anterior, se a lombriga crescer ela fica assim:

~~~
#@@@@O##
~~~

## Virar de Lado

Uma lombriga pode virar de lado. No exemplo anterior, se a lombriga virar de lado ela fica assim:

~~~
#O@@@@##
~~~

## Métodos

* `construtor` - no construtor é informado como parâmetro: o tamanho do aquário, o tamanho da lombriga e a posição da lombriga no aquário;
* `crescer` - a lombriga cresce uma unidade dentro do aquário somente se houver espaço para ela crescer na direção oposta à cabeça -- a lombriga só cresce se houver espaço no aquário na direção do crescimento, caso contrário, ela não crescerá, mesmo que o método seja chamado;
* `mover` - a lombriga se move uma unidade na direção para a qual está virada à cabeça; se ela estiver no limite do aquário (para o lado que ela está virada a cabeça) e for chamado este método ela vira de lado em vez de andar;
* `virar` - a lombriga vira de lado;
* `apresenta` - retorna uma String contendo a apresentação da lombriga no aquário no estado atual, conforme foi descrito anteriormente.


# Animando a Lombriga no Aquário

A classe denominada `Animacao` representa uma sequência de ações para animar uma lombriga em um aquário. A sequência de ações é representada pela string:

~~~
AALLPP$$$$$$$$$$
~~~

* `AA` - é um número (sempre ocupando dois caracteres) representando o tamanho do aquário; por exemplo, `08` representa um aquário de tamanho 8;
* `LL` - é um número (sempre ocupando dois caracteres) representando o tamanho da lombriga; por exemplo, `04` representa uma lombriga de tamanho 4;
* `PP` - é um número (sempre ocupando dois caracteres) representando a posição inicial da lombriga no aquário -- a lombriga começa sempre virada para a direita, portanto trata-se da posição da ponta da cauda; por exemplo, `03` representa uma lombriga na posição 3.

A sequência:

~~~
080403
~~~

Representa um aquário de tamanho 8, com uma lombriga de tamanho 4, na posição 3:

~~~
##@@@O##
~~~

* `$` - cada caractere subsequente (que aparece como `$`) representa um dos possíveis comandos de animação, equivalentes aos métodos da lombriga:
  * `C` - a lombriga cresce;
  * `M` - a lombriga se move;
  * `V` - a lombriga vira.

~~~
080403MCMVM
~~~

A lombriga do exemplo anterior os passos de animação são: se move, cresce, se move, vira e se move.

## Métodos

* `construtor` - no construtor é informado como parâmetro: a string de animação, conforme a descrição anterior;
* `apresenta` - retorna uma String com a lombriga no aquário no estado atual (a primeira vez que o método é chamado, apresenta o estado inicial da lombriga - sem animação);
* `passo` - executa um único passo da animação.

Por exemplo, considere a animação do exemplo anterior:
~~~
080403MCMVM
~~~

Considere que foi chamada a seguinte sequência de métodos:
* `construtor` - passa como parâmetro `080403MCMVM`;
* `apresenta` - retorna `##@@@O##`
* `passo` - executa primeira ação `M`
* `apresenta` -  retorna `###@@@O#`
* `passo` - executa próxima ação `C`
* `apresenta`- retorna `##@@@@O#`
* `passo` - executa próxima ação `M`
* `apresenta` - retorna `###@@@@O`
* `passo` - executa próxima ação `V`
* `apresenta`- retorna `###O@@@@`
* `passo` - executa próxima ação `M`
* `apresenta` - retorna `##O@@@@#`
