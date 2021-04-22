package mc322.lab04;

public class AppRestaUm {
    static public void executaJogo(String caminhoArquivoCSV) {
        CSVReader csv = new CSVReader();
        Tabuleiro tabuleiro = new Tabuleiro();

        csv.setDataSource(caminhoArquivoCSV);

        tabuleiro.adicionaPecas();

        System.out.println("Tabuleiro inicial");
        tabuleiro.imprime();

        String[] commands = csv.requestCommands();
        for(int i = 0; i < commands.length; i++) {
            tabuleiro.movimentaPeca(commands[i]);
            tabuleiro.imprimeJogada(commands[i]);
            tabuleiro.imprime();
        }
    }

    static public void main(String[] args) {
        String csvFile = "src/db/arq001.csv";
        AppRestaUm app = new AppRestaUm();
        app.executaJogo(csvFile);
    }
}
