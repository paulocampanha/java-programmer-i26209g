/**
 * Nesse programa vamos estudar a estrutura de repetição while para 
 * criar uma tabuada.
 */
package aula03d;

import javax.swing.JOptionPane;

public class Aula03d {

  public static void main(String[] args) {
    String numeroStr = JOptionPane.showInputDialog(null,
            "Digite o número para a tabuada: ",
            "Sistema de Tabuada", 3);
    int numero = Integer.parseInt(numeroStr);
    int contador = 1;
    String msg = "";
    
    while (contador <= 10) {
      int total = numero * contador;
      msg += numero + " X " + contador + " = " + total + "\n"; //5 X 1 = 1
      contador++;
    }
    JOptionPane.showMessageDialog(null, msg, "Sistema de Tabuada", 1);

  }
  
}
