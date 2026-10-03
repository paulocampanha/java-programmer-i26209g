package exercicio6a;

public class Exercicio6a {

  public static void main(String[] args) {

    String nome = "Ana Souza";
    String cpf = "111.111.111-11";
    double salario = 3000.00;
    String setor = "Recursos Humanos";
    String cargo = "Auxiliar Administrativo";
    
    FuncionarioAdministrativo adm1
        = new FuncionarioAdministrativo(nome, cpf, salario, setor ,cargo);

    adm1.exibirDados();
    System.out.println("*".repeat(50));
    adm1.realizarTarefa();
    System.out.println("*".repeat(50));
    adm1.reajustarSalario(13);
    System.out.println("*".repeat(50));
    adm1.exibirDados();
    System.out.println("*".repeat(50));
    
    nome = "Carlos Santos";
    cpf = "222.222.222-22";
    salario = 2500.00;
    double totalVendas = 0;
    double percComissao  = 10;
    
    FuncionarioVendedor vend
      = new FuncionarioVendedor(nome, cpf, salario, 
              totalVendas, percComissao);

    System.out.println();
    System.out.println();
    vend.exibirDados();
    System.out.println("*".repeat(50));
    vend.realizarVenda(500.00);
    vend.realizarVenda(750.00);
    vend.realizarVenda(300.00);
    System.out.println("*".repeat(50));
    vend.exibirComissao();
    System.out.println("*".repeat(50));
    vend.exibirDados();
  }

}
