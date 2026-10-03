/**
 * Nessa classe vamos implementar os métodos abstratos da
 * classe Conta e herdar os métodos concretos
 */
package aula07d;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {
  
  // Construtor
  public ContaPoupanca(String titular, double saldo) {
    super(titular, saldo);
  }
  
  @Override
  public void sacar(double valor) {
    
    if (valor > getSaldo()) {
      JOptionPane.showMessageDialog(null, 
              "Saldo insuficiente para o saque.");
    } else {
      setSaldo(valor);
      JOptionPane.showMessageDialog(null, 
          "Saldo atual: " + getSaldo());
    }
  }
  
  @Override
  public double calcularRendimento() {
    return getSaldo() * 0.005; 
  }
}
