/** 
 * Nesse programa vamos estudar a estrutura de devio condicional 
 * if ... else if ... else
 */
package aula02c;

import javax.swing.JOptionPane;

public class Aula02c3 {

  public static void main(String args[]) {
    
    String idadeStr = JOptionPane.showInputDialog(null, "Digite sua idade.");
    
    int idade = Integer.parseInt(idadeStr);
    
    String msg = "";
    
    if (idade < 0) {
      msg = "Idade inválida";
    } else if (idade <= 12) {
      msg = "Você é uma criança.";
    } else if (idade <= 17) {
      msg = "Você é um adolescente.";
    } else if (idade <= 59) {
      msg = "Você é um adulto.";
    } else {
      msg = "Você é um idoso.";
    }
    
    JOptionPane.showMessageDialog(null, msg);
    
  }
}
