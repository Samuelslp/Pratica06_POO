package exercicio02;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Samuel", "Samuel@email.com", "123456789", "TI", 5000.0, "01/01/2020", "12345");
        Funcionario funcionario2 = new Funcionario("Michelle", "Michelle@email.com", "987654321", "RH", 6000.0, "02/01/2021", "54321");
        Funcionario funcionario3 = new Funcionario("Pedro", "pedro@email.com", "111111111", "Vendas", 5500.0, "03/01/2019", "98765");
        Funcionario funcionario4 = new Funcionario("Ana", "ana@email.com", "999999999", "Contabilidade", 7000.0, "04/01/2018", "22222");
        Funcionario funcionario5 = new Funcionario("Carlos", "carlos@email.com", "888888888", "TI", 5200.0, "05/01/2022", "77777");

        Empresa minhaEmpresa = new Empresa("SamuelTech", "39483043243", 100);
        minhaEmpresa.adicionarFuncionario(funcionario1, 0);
        minhaEmpresa.adicionarFuncionario(funcionario2, 1);
        minhaEmpresa.adicionarFuncionario(funcionario3, 2);
        minhaEmpresa.adicionarFuncionario(funcionario4, 3);
        minhaEmpresa.adicionarFuncionario(funcionario5, 4);

        for (int i = 0; i < minhaEmpresa.funcionarios.length; i++) {
            if (minhaEmpresa.funcionarios[i] != null) {
                minhaEmpresa.funcionarios[i].mostrarDados();
            }
        }
    }
}
