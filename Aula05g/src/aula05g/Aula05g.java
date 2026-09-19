/**
 * Nesse programa vamos instanciar objetos de outra classe e definir
 * seus atributos através dos métodos Setters (Encapsulamento)
 */
package aula05g;

import javax.swing.JOptionPane;

public class Aula05g {

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    
    String nome = JOptionPane.showInputDialog(null, 
            "Digite o nome da pessoa: ");
    int idade = Integer.parseInt(JOptionPane.showInputDialog(
            null, "Digite a idade da pessoa:"));
    double salario = Double.parseDouble(JOptionPane.showInputDialog(
            null, "Digite o salário da pessoa:"));
    
    pessoa1.setNome(nome);
    pessoa1.setIdade(idade);
    pessoa1.setSalario(salario);
    
    pessoa1.exibirDados();
    
    String msg = "Nome: " + pessoa1.getNome();
    msg += "\nIdade: " + pessoa1.getIdade();
    msg += "\nSalário: R$ " + 
          String.format("%,.2f", pessoa1.getSalario());
    JOptionPane.showMessageDialog(null, msg);
    
    
  }
  
}
