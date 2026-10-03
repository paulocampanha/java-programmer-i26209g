/**
 * Uma classe abstrata possui métodos abstratos (contratos) 
 * que as classes filhas devem implementar. 
 * Uma classe abstrata pode posuir métodos concretos que serão
 * herdados pelas classe filhas * 
 */
package aula07d;

import javax.swing.JOptionPane;

public abstract class Conta {
  
  private String titular;
  private double saldo;
  
  // Construtor
  public Conta (String titular, double saldo) {
    this.titular = titular;
    this.saldo = saldo;
  }

  // Métodos concretos
  /**
   * @return the titular
   */
  public String getTitular() {
    return titular;
  }

  /**
   * @return the saldo
   */
  public double getSaldo() {
    return saldo;
  }
  
  public void depositar(double valor) {
    if (valor > 0) {
      this.saldo += valor;
    } else {
      JOptionPane.showMessageDialog(null, 
              "Valor do deposito inválido");
    }
  }
  
  public void setSaldo(double valor){
    this.saldo -= valor;
  }
  
  public void exibirSaldo(){
    JOptionPane.showMessageDialog(null,
            "Titular: " + titular + "\nSaldo: " + saldo);
  }
  
  // Métodos abstratos
  public abstract void sacar(double valor);
    
  public abstract double calcularRendimento();
  
}
