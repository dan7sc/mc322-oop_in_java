package mc322.lab04;

public class AppRestaUm {
    public static String[] executaJogo(String caminhoArquivoCSV) {
        System.out.println(caminhoArquivoCSV);
        String[] str = new String[7];

        Tabuleiro t = new Tabuleiro();
        t.imprimeTabuleiroInicial();

        return str;
    }

    static public void main(String[] args) {
        AppRestaUm app = new AppRestaUm();
        String[] tab = app.executaJogo("src/db/arq001.csv");
        for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }
}
