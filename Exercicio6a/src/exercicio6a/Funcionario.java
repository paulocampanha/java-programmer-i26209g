/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6a;

/**
 *
 * @author sn1085640
 */
public class Funcionario {

  String nome;
  String cpf;
  double salario;

  // Construtor
  public Funcionario(String nome, String cpf, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
  }

  // Método que será herdado pelas classes filhas
  public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Salario: R$ " + salario);
  }

  // Método que será herdado pelas classes filhas
  public void reajustarSalario(double percentual) {

    salario = salario + (salario * percentual / 100);

    System.out.println("Salario reajustado.");
  }
}
