package exercicio02;

public class Funcionario extends Pessoa {
    String departamento;
    double salario;
    String dataEntradaBanco;
    String rg;
    boolean estaNaEmpresa;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntradaBanco, String rg) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntradaBanco = dataEntradaBanco;
        this.rg = rg;
        this.estaNaEmpresa = true;
    }
    public void bonificar(double aumento) {
        salario += aumento;
    }

    public void demitir() {
        estaNaEmpresa = false;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Entrada no Banco: " + dataEntradaBanco);
        System.out.println("RG: " + rg);
        System.out.println("Está na Empresa: " + (estaNaEmpresa ? "Sim" : "Não"));
        System.out.println();
    }
}