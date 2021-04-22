package mc322.lab04;

public class Tabuleiro {
    char[] tipoDePeca = { ' ', 'P', '-' };
    char[] colunas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
    char[] linhas = { '7', '6', '5', '4', '3', '2', '1' };
    String[] inicio = {
        "  PPP  \n",
        "  PPP  \n",
        "PPPPPPP\n",
        "PPP-PPP\n",
        "PPPPPPP\n",
        "  PPP  \n",
        "  PPP  \n"
    };
    int numeroDePecasPorLinha = 7;
    int numeroDePecasPorColuna= 7;
    Peca[][] pecas = new Peca[numeroDePecasPorLinha][numeroDePecasPorColuna];

    public Tabuleiro() {
        this.inicio = inicio;
    }

    public void imprime() {
        char ch;
        int j;

        for(int i = 0; i < inicio.length; i++) {
            j = 1;
            // Imprime numeros das linhas do tabuleiro
            System.out.print(linhas[i]);
            // Obtem caractere j no vetor i
            ch = inicio[i].charAt(j);
            while(ch != '\n') {
                // Imprime tabuleiro
                System.out.print(" " + ch);
                ch = inicio[i].charAt(j);
                j++;
            }
            System.out.println();
        }
        System.out.print(" ");
        // Imprime letras das colunas do tabuleiro
        for(int i = 0; i < inicio.length; i++) {
            System.out.print(" " + colunas[i]);
        }
        System.out.println();
        System.out.println();
    }

    public void adicionaPecas() {
        int contador = 0;
        String posicao;
        int tipoIndice;

        for(int i = 0; i < colunas.length; i++) {
            for(int j = 0; j < linhas.length; j++) {
                posicao = "" + colunas[i] + linhas[j];
                if(colunas[i] == 'd' && linhas[j] == '4') {
                    tipoIndice= 2;
                } else if((colunas[i] == 'a' || colunas[i] == 'b' || colunas[i] == 'f' || colunas[i] == 'g') &&
                          (linhas[j] == '1' || linhas[j] == '2' || linhas[j] == '6' || linhas[j] == '7')) {
                    tipoIndice= 0;
                } else {
                    tipoIndice= 1;
                }
                pecas[i][j] = new Peca(posicao, tipoDePeca[tipoIndice]);
            }
        }
    }

    public void imprimeJogada(String movimento) {
        System.out.println("Source: " + movimento.charAt(0) + movimento.charAt(1));
        System.out.println("Target: " + movimento.charAt(3) + movimento.charAt(4));
    }

    public void movimentaPeca(String movimento) {
        Peca pecaFonte = null;
        Peca pecaAlvo = null;
        Peca pecaComida = null;
        String posicaoInicial = "" + movimento.charAt(0) + movimento.charAt(1);
        String posicaoFinal = "" + movimento.charAt(3) + movimento.charAt(4);
        String posicaoPecaComida;

        for(int i = 0; i < numeroDePecasPorLinha; i++) {
            for(int j = 0; j < numeroDePecasPorLinha; j++) {
                if(pecas[i][j].posicao.compareTo(posicaoInicial) == 0) {
                    pecaFonte = pecas[i][j];
                }
                if(pecas[i][j].posicao.compareTo(posicaoFinal) == 0) {
                    pecaAlvo = pecas[i][j];
                }
            }
        }
        posicaoPecaComida = pecaFonte.obtemPosicaoPecaComida(pecaAlvo);
        for(int i = 0; i < numeroDePecasPorLinha; i++) {
            for(int j = 0; j < numeroDePecasPorLinha; j++) {
                if(pecas[i][j].posicao.compareTo(posicaoPecaComida) == 0) {
                    pecaComida = pecas[i][j];
                }
            }
        }

        if(pecaAlvo.tipo == '-') {
            pecaFonte.move(pecaAlvo, pecaComida);
        } else {
            System.out.println("Movimento não permitido.");
        }
        // System.out.println(pecaFonte.posicao + " " + pecaAlvo.posicao);
        // System.out.println(pecaFonte.tipo + " " + pecaAlvo.tipo);

        // for(int i = 0; i < numeroDePecasPorLinha; i++) {
        //     for(int j = 0; j < numeroDePecasPorLinha; j++) {
        //         System.out.print(pecas[j][i].tipo + " ");
        //     }
        //     System.out.println();
        // }
    }
}
