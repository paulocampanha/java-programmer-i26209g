/**
 * Nesse programa vamos estudar de desvio condicional if ... else
 */
package aula02c;

import javax.swing.JOptionPane;

public class Aula02c2 {
  
  public static void main(String args[]) {
    
    String titulo = "Senai Guarulhos-Dutra";
    String nomeAluno = JOptionPane.showInputDialog(null,
            "Digite o nome do aluno", titulo, 3);
    String notaFinalStr = JOptionPane.showInputDialog(null,
            "Digite a nota final do aluno:", titulo, 3);
    notaFinalStr = notaFinalStr.replace(",", ".");
    double notaFinal = Double.parseDouble(notaFinalStr);
    String conceito = "";
    
    if (notaFinal >= 50) {
      conceito = "APROVADO";
    } else {
      conceito = "REPROVADO";
    }
    
    String msg = "O aluno " + nomeAluno + " foi " + conceito + ".";
    
    JOptionPane.showMessageDialog(null, msg, titulo, 1);
    
  }
}
