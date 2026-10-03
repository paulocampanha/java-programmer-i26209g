/**
 * Nessa classe vamos implementar os métodos abstratos da
 * classe Conta e herdar os métodos concretos
 */
package aula07d;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {
  
  // Construtor
  public ContaCorrente (String titular, double saldo) {
    super(titular, saldo);
  }
  
  @Override
  public void sacar(double valor) {
    double limite = getSaldo() + 2000;
    
    if (valor > limite) {
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
    return 0;
  }
  
}
