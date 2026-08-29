/**
 * Nesse prohrama vamos estudar o uso do if
 */
package aula02c;

import javax.swing.JOptionPane;

public class Aula02c {

  public static void main(String[] args) {
    String nomeCliente = JOptionPane.showInputDialog(
            null, "Digite o nome do cliente:", "Lojas Peruanas", 3);
    
    int clienteVip = JOptionPane.showConfirmDialog(
            null, "Esse cliente é VIP?", "Lojas Peruanas", 
            JOptionPane.YES_NO_OPTION, 3);
    
    String valorStr = JOptionPane.showInputDialog(null, 
            "Digite o valor da compra do cliente:", "Lojas Peruanas", 3);
    
    valorStr = valorStr.replace(".", "");
    valorStr = valorStr.replace(",", ".");
    System.out.println(valorStr);
    // Converter a string valorStr para tipo de dados double
    double valor = Double.parseDouble(valorStr);
    
    if (clienteVip == JOptionPane.YES_OPTION) {
      valor = valor - (valor * 10 / 100);
    }
    
    JOptionPane.showMessageDialog(null, 
            "Valor a pagar: " + String.format("%,.2f", valor));
    
    
    
    
    
  }
  
}
