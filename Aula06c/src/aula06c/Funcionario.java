/**
 * Nessa classe vamos declarar os atributos e métodos que podem ser
 * herdados pelas sub classe
 */
package aula06c;

public class Funcionario {
  
  // Atributo da classe pai
  String nome;
  double salario;
  
  // Construtor
  public Funcionario(String nome, double salario){
    this.nome = nome;
    this.salario = salario;
  }
  
  public void aumentarSalario(double percentual) {
    double reajuste = salario * percentual / 100;
    this.salario += reajuste;
  }
  
  public void exibirDados(){
    System.out.println("Nome: " + nome);
    System.out.println("Salario: R$ " + salario);    
  }
  
  
}
