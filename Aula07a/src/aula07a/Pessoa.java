/**
 * Nesse classe vamos criar os atributos e métodos 
 * genéricos que serão herdados pelas classes filhas
 */
package aula07a;

import javax.swing.JOptionPane;

public class Pessoa {
  
  // Atributos privados: Encapsulamento
  private String nome;
  private int idade;
  
  // Construtor
  public Pessoa(String nome, int idade){
    setNome(nome);
    setIdade(idade);
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    if (nome == null || nome.isEmpty()) {
      JOptionPane.showMessageDialog(null, 
              "Nome inválido");
    } else {
      this.nome = nome.trim();
    }
  }

  /**
   * @return the idade
   */
  public int getIdade() {
    return idade;
  }

  /**
   * @param idade the idade to set
   */
  public void setIdade(int idade) {
    if (idade < 0 || idade > 120) {
      JOptionPane.showMessageDialog(null, 
              "Idade inválida");
    } else {
      this.idade = idade;
    }
  }
  
  public void exibirDados(){
    if (nome == null || idade < 0 || idade > 120) {
      JOptionPane.showMessageDialog(null,
              "Valores informados inválido!");
    } else {
      String msg = "Nome: " + this.nome + "\n";
      msg += "Idade: " + this.idade;
      JOptionPane.showMessageDialog(null, 
              msg);
    }
  }
  
}
