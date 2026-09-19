/**
 * Nesse classe vamos proteger os atributos e utilizar os
 * metodos Setters e Getters para definir e visualizar
 * seus conteúdos
 */
package aula05g;

import javax.swing.JOptionPane;

public class Pessoa {

  private String nome;
  private int idade;
  private double salario;
  
  // Métodos Setters para definir valor dos atributos
  public void setNome(String nome){
    if (nome != null && !nome.trim().isEmpty()){
      this.nome = nome;
    } else {
      JOptionPane.showMessageDialog(null, 
              "O nome não pode ser vazio.");
    }
  }
  
  public void setIdade(int idade){
    if (idade > 0 && idade < 120) {
      this.idade = idade;
    } else {
      JOptionPane.showMessageDialog(null, 
              "Idade inválida.");
    }
  }
  
  public void setSalario(double salario){
    if (salario > 0) {
      this.salario = salario;
    } else {
      JOptionPane.showMessageDialog(null, 
              "O salário não pode ser negativo.");
    }
  }
  
  // Método para exibir os dados
  public void exibirDados(){
    String msg = "Nome: " + this.nome;
    msg += "\nIdade: " + this.idade;
    msg += "\nSalário: R$ " + 
            String.format("%,.2f", this.salario);
    JOptionPane.showMessageDialog(null, msg);
  }
  
  //Métodos Getters para obter o valor do atributo
  public String getNome(){
    return this.nome;
  }
  
  public int getIdade(){
    return this.idade;
  }
  
  public double getSalario(){
    return this.salario;
  }
  
  
}
