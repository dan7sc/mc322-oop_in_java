package mc322.lab04;

public class Tabuleiro {
    String[] colunas = { "a", "b", "c", "d", "e", "f", "g" };
    String[] linhas = { "7", "6", "5", "4", "3", "2", "1" };
    String[] inicio = {
        "  PPP  \n",
        "  PPP  \n",
        "PPPPPPP\n",
        "PPP-PPP\n",
        "PPPPPPP\n",
        "  PPP  \n",
        "  PPP  \n"
    };

    Tabuleiro() {
        this.inicio = inicio;
    }

    public void imprimeTabuleiroInicial() {
        char ch;
        int j;
        System.out.println("Tabuleiro inicial");
        System.out.println(inicio[1].charAt(1));
        for(int i = 0; i < inicio.length; i++) {
            j = 1;
            System.out.print(linhas[i]);
            ch = inicio[i].charAt(j);
            while(ch != '\n') {
                System.out.print(" " + ch);
                ch = inicio[i].charAt(j);
                j++;
            }
            System.out.println();
        }
        System.out.print(" ");
        for(int i = 0; i < inicio.length; i++) {
            System.out.print(" " + colunas[i]);
        }
        System.out.println();
    }

    public void imprimeTabuleiro() {
        for(int i = 0; i < inicio.length; i++) {
            System.out.println(inicio[i]);
        }
    }
}
