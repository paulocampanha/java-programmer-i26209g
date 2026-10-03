/**
 * Nesse classe vamos herdar os atribus e métodos da classe Funcionario e
 * implementar os atributos e métodos específicos da classe Professor
 */
package aula06c;

import javax.swing.JOptionPane;

public class Professor extends Funcionario {
  
  // Atributos específicos
  String disciplina;
  String periodo;
  
  // Construtor
  public Professor(String nome, double salario, String disciplina, String periodo){
    
    // Chama o construtor da super classe
    super(nome, salario);
    this.disciplina = disciplina;
    this.periodo = periodo;
  }
  
  // Método específico
  public void ensinar() {
    JOptionPane.showMessageDialog(null, 
        "O professor " + nome + " leciona a matéria de " + disciplina);
  }
  
  // Método sobreposto da classe funcionário
  @Override
  public void exibirDados(){
    super.exibirDados();
    System.out.println("Disciplina: " + disciplina);
    System.out.println("Periodo: " + periodo);
    
  }  
}
