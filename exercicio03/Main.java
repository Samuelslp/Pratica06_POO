package exercicio03;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Cria objetos da classe Artigo
        ArrayList<Artigo> artigos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Artigo artigo = new Artigo("Artigo " + i, "Resumo do Artigo " + i, "Autor " + i);
            artigos.add(artigo);
        }

        // Cria um objeto Edicao e adicione todos os artigos
        Edicao edicao = new Edicao(1, 1, "01/01/2023", 1329);
        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        // Cria um objeto RevistaCientifica e adicione a Edicao
        RevistaCientifica revistaCientifica = new RevistaCientifica("Revista do Samuel", 82379232, "Mensal");
        revistaCientifica.adicionaEdicao(edicao);
    }
}
