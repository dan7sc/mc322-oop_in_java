package mc322.lab03;

public class Animacao {
    String animacao;
    AquarioLombriga aquarioLombriga;
    int passoAtual;

    public Animacao(String animacao) {
        this.animacao = animacao;
        this.aquarioLombriga = new AquarioLombriga(Integer.parseInt(animacao.substring(0, 2)),
                                                   Integer.parseInt(animacao.substring(2, 4)),
                                                   Integer.parseInt(animacao.substring(4, 6)));
        this.passoAtual = 6;
    }

    public void passo() {
        char ch = animacao.charAt(passoAtual);
        passoAtual += 1;
        if(ch == 'M') {
            aquarioLombriga.mover();
        } else if (ch == 'C') {
            aquarioLombriga.crescer();
        } else if (ch == 'V') {
            aquarioLombriga.virar();
        }
    }

    public void apresenta() {
        aquarioLombriga.apresenta();
    }
}
