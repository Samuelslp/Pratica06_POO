package exercicio02;

public class Empresa {
    String nome;
    String cnpj;
    int qtdeDeFuncionario;
    Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtdeDeFuncionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionario = qtdeDeFuncionario;
        this.funcionarios = new Funcionario[qtdeDeFuncionario];
    }

    public void adicionarFuncionario(Funcionario funcionario, int posicao) {
        if (posicao >= 0 && posicao < qtdeDeFuncionario) {
            funcionarios[posicao] = funcionario;
        }
    }
}