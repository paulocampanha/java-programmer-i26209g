/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6a;

/**
 *
 * @author sn1085640
 */
public class FuncionarioVendedor extends Funcionario {

  double totalVendas;
  double percentualComissao;

  // Construtor
  public FuncionarioVendedor(
          String nome,
          String cpf,
          double salario,
          double totalVendas,
          double percentualComissao) {

    // Chama o construtor da classe pai
    super(nome, cpf, salario);

    this.totalVendas = totalVendas;
    this.percentualComissao = percentualComissao;
  }

  // Registra uma venda
  public void realizarVenda(double valor) {

    totalVendas = totalVendas + valor;

    System.out.println("Venda realizada: R$ " + valor);
  }

  // Calcula e exibe a comissão
  public void exibirComissao() {

    double comissao;

    comissao = totalVendas * percentualComissao / 100;

    System.out.println("Total de vendas: R$ " + totalVendas);
    System.out.println("Valor da Comissao: R$ " + comissao );
  }

  // Sobreposição do método da classe pai
  @Override
  public void exibirDados() {

    double comissao;

    comissao = totalVendas * percentualComissao / 100;

    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Salario: R$ " + salario);
    System.out.println("Total de vendas: R$ " + totalVendas);
    System.out.println("Comissao: " + comissao + "%");
  }
}
