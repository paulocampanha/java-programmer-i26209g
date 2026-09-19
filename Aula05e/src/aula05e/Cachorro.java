/**
 * Nesse classe vamos definir os atributos e métodos da classe Cachorro
 */
package aula05e;

import javax.swing.JOptionPane;

public class Cachorro {

  String nome;
  String raca;
  int idade;
  double peso;
  
  // Métodos de instância
  public void latir() {
    JOptionPane.showMessageDialog(null, 
            this.nome + " está latindo. AU! AU! AU!");
  }
  
  public void comer() {
    JOptionPane.showMessageDialog(null, 
            this.nome + " está comendo.");
  }
  
  public void exibirDados(){
    String msg = "Nome: " + this.nome;
    msg += "\nRaça: " + this.raca;
    msg += "\nIdade: " + this.idade + " anos";
    msg += "\nPeso: " + this.peso + " quilos.";
    JOptionPane.showMessageDialog(null, msg);
  }
}
