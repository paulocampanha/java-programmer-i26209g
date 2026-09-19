/*
 */
package exercicio04a;
import javax.swing.JOptionPane;

public class Exercicio04a {

  public static void main(String[] args) {
    double media;
    double somaNotas = 0;
    int numNotas = 0;
    int resposta = 0;
    do {
      String notaStr = JOptionPane.showInputDialog(null,
              "Digite a nota do aluno: ");
      somaNotas += Double.parseDouble(notaStr);
      numNotas++;
      
      resposta = JOptionPane.showConfirmDialog(null, 
              "Deseja lançar outra nota:", "Escola", 
              JOptionPane.YES_NO_OPTION, 3);
      
    } while (resposta == 0);
    
    media = somaNotas / numNotas;
    
    if (media >= 50) {
      JOptionPane.showMessageDialog(null, "Aprovado");
    } else {
      JOptionPane.showMessageDialog(null, "Reprovado");
    }
  }
  
}
