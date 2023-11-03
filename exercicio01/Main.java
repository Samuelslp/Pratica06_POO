package exercicio01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Solicita os dados da Rede Social
        String dataCriacao = JOptionPane.showInputDialog("Data de criação da Rede Social:");
        String nomeUsuario = JOptionPane.showInputDialog("Nome de usuário:");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento:");
        String senha = JOptionPane.showInputDialog("Senha:");

        // Cria a Rede Social
        RedeSocial minhaRedeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        // Cria objetos do tipo exercicio01.Publicacao
        Publicacao publicacao1 = new Publicacao("02/01/2023", "Isso é uma publicação de teste.", "http://imagem1.com");
        Publicacao publicacao2 = new Publicacao("03/01/2023", "Outra publicação de teste.", "http://imagem2.com");

        // Insere os objetos do tipo exercicio01.Publicacao na Rede Social
        minhaRedeSocial.inserePublicacao(publicacao1);
        minhaRedeSocial.inserePublicacao(publicacao2);

        // Chama o método imprimePublicacoes para exibir as publicações
        minhaRedeSocial.imprimePublicacoes();
    }
}
