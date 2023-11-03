package exercicio01;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());

        for (Publicacao publi : publicacoes) {
            System.out.println("Data de Publicação: " + publi.getDataPublicacao());
            System.out.println("Texto da Publicação: " + publi.getTextoPublicacao());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso:
        RedeSocial minhaRedeSocial = new RedeSocial("01/01/2023", "meuUsuario", "01/01/1990", "minhaSenha");

        Publicacao publicacao1 = new Publicacao("02/01/2023", "Isso é uma publicação de teste.", "http://imagem1.com");
        Publicacao publicacao2 = new Publicacao("03/01/2023", "Outra publicação de teste.", "http://imagem2.com");

        minhaRedeSocial.inserePublicacao(publicacao1);
        minhaRedeSocial.inserePublicacao(publicacao2);

        minhaRedeSocial.imprimePublicacoes();
    }
}
