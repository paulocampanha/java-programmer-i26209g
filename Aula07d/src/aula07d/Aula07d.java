/**
 * Nesse classe vamos criar os objetos das classes ContaCorrente
 * e ComntaPoupanca
 */
package aula07d;

import javax.swing.JOptionPane;

public class Aula07d {

  public static void main(String[] args) {
    
    String titular = JOptionPane.showInputDialog(null,
            "Digite o nome do cliente:");
    double saldo = 0;
    
    ContaCorrente corrente = new ContaCorrente(titular, saldo);
    
    corrente.exibirSaldo();
    
    double deposito = Double.parseDouble(
      JOptionPane.showInputDialog(null, 
      "Digite o valor do deposito:"));
    
    corrente.depositar(deposito);
    
    corrente.exibirSaldo();
    
    double saque = Double.parseDouble(
      JOptionPane.showInputDialog(null,
              "Digite o valor do saque:"));
    
    corrente.sacar(saque);
    
    corrente.exibirSaldo();
    
    
    
    
  }
  
}
