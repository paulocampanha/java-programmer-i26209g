/**
 * Nesse classe vamos herdar os atribus e métodos da classe Funcionario e
 * implementar os atributos e métodos específicos da classe Tecnico
 */
package aula06c;

import javax.swing.JOptionPane;

public class Tecnico extends Funcionario{
  
  // Atributos específico do Técnico
  String setor;
  String cargo;
  
  // Contrutor
  public Tecnico(String nome, double salario, 
          String setor, String cargo) {
    super(nome, salario);
    this.setor = setor;
    this.cargo = cargo;
  }
  
  // Método específico da classe técnico
  public void realizarManutencao(){
    JOptionPane.showMessageDialog(null, 
        "O técnico " + nome + " trabalha no setor " + setor);
  }
  
  // Método herdado da classe Funcionario
  @Override
  public void exibirDados(){
    super.exibirDados();  
    System.out.println("Setor: " + setor);
    System.out.println("Cargo: " + cargo);
  }
}
