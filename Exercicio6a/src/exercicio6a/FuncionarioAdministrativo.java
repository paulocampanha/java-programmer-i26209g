/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6a;

/**
 *
 * @author sn1085640
 */
public class FuncionarioAdministrativo extends Funcionario {

  String setor;
  String cargo;

  // Construtor
  public FuncionarioAdministrativo(
          String nome,
          String cpf,
          double salario,
          String setor,
          String cargo) {

    // Chama o construtor da classe pai
    super(nome, cpf, salario);

    this.setor = setor;
    this.cargo = cargo;
  }

  // Método específico da classe administrativa
  public void realizarTarefa() {

    System.out.println(
            nome + " esta realizando tarefas administrativas."
    );

    System.out.println("Setor: " + setor);
  }

  // Sobreposição do método da classe pai
  @Override
  public void exibirDados() {

    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Salario: R$ " + salario);
    System.out.println("Setor: " + setor);
    System.out.println("Cargo: " + cargo);
  }
}
