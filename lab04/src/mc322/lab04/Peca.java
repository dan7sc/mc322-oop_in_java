package mc322.lab04;

public class Peca {
    String posicao;
    char tipo;

    public Peca(String posicao, char tipo) {
        this.posicao = posicao;
        this.tipo= tipo;
    }

    public void move(Peca alvo, Peca comida) {
        String posicao = new String(this.posicao);
        alvo.posicao = this.posicao;
        alvo.tipo = 'P';
        this.posicao = posicao;
        this.tipo = '-';
        comida.tipo = '-';
    }

    public String obtemPosicaoPecaComida(Peca pecaAlvo) {
        String posicaoPecaComida = new String();

        if(pecaAlvo.posicao.charAt(0) - this.posicao.charAt(0) > 0) {
            posicaoPecaComida = posicaoPecaComida.concat(Character.toString(this.posicao.charAt(0) + 1));
        } else if(pecaAlvo.posicao.charAt(0) - this.posicao.charAt(0) < 0) {
            posicaoPecaComida = posicaoPecaComida.concat(Character.toString(this.posicao.charAt(0) - 1));
        } else {
            posicaoPecaComida = posicaoPecaComida.concat(Character.toString(this.posicao.charAt(0)));
        }
        if(pecaAlvo.posicao.charAt(1) - this.posicao.charAt(1) > 0) {
            posicaoPecaComida = posicaoPecaComida.concat(Character.toString(this.posicao.charAt(1) + 1));
        } else if(pecaAlvo.posicao.charAt(1) - this.posicao.charAt(1) < 0) {
            posicaoPecaComida = posicaoPecaComida.concat(Character.toString(this.posicao.charAt(1) - 1));
        } else {
            posicaoPecaComida = posicaoPecaComida.concat(Character.toString(this.posicao.charAt(1)));
        }

        return posicaoPecaComida;
    }
}
