package mc322.lab03;

public class AquarioLombriga {
    int aquarioTamanho;
    int lombrigaTamanho;
    int caudaPosicao;
    int cabecaPosicao;

    public AquarioLombriga(int aquarioTamanho, int lombrigaTamanho, int caudaPosicao) {
        this.lombrigaTamanho = lombrigaTamanho < 2
            ? 2
            : lombrigaTamanho;
        this.aquarioTamanho = this.lombrigaTamanho > aquarioTamanho
            ? this.lombrigaTamanho
            : aquarioTamanho;
        this.caudaPosicao = caudaPosicao + this.lombrigaTamanho - 1 > this.aquarioTamanho || caudaPosicao < 1
            ? 0
            : caudaPosicao - 1;
        this.cabecaPosicao = this.caudaPosicao + this.lombrigaTamanho - 1;
    }

    public void crescer() {
        if((caudaPosicao > 0) && (caudaPosicao + 1 < aquarioTamanho)) {
            if(caudaPosicao < cabecaPosicao) {
                lombrigaTamanho += 1;
                caudaPosicao -=1;
            } else {
                lombrigaTamanho += 1;
                caudaPosicao += 1;
            }
        }
    }

    public void mover() {
        if(caudaPosicao < cabecaPosicao && cabecaPosicao + 1 < aquarioTamanho) {
            caudaPosicao += 1;
            cabecaPosicao += 1;
        } else if(caudaPosicao > cabecaPosicao && caudaPosicao < aquarioTamanho && cabecaPosicao > 0) {
            caudaPosicao -= 1;
            cabecaPosicao -= 1;
        } else {
            virar();
        }
    }

    public void virar() {
        int temp = 0;
        temp = caudaPosicao;
        caudaPosicao = cabecaPosicao;
        cabecaPosicao = temp;
    }

    public void apresenta() {
        String s = new String("");
        for(int i = 0; i < aquarioTamanho; i++) {
            if(caudaPosicao < cabecaPosicao && (i < caudaPosicao || i > cabecaPosicao)) {
                s = s.concat("#");
            } else if(caudaPosicao > cabecaPosicao && (i > caudaPosicao || i < cabecaPosicao)) {
                s = s.concat("#");
            } else if(i == cabecaPosicao) {
                s = s.concat("O");
            } else {
                s = s.concat("@");
            }
        }
        System.out.println(s);
    }
}
