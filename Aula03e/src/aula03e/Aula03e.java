/**
 * Nesse programa vamos estudar a estrutura de repetição while e 
 * o comando break para interromper o loop
 */
package aula03e;

import javax.swing.JOptionPane;

public class Aula03e {

  public static void main(String[] args) {
    
    String titulo = "Escola Senai";
    String nome = JOptionPane.showInputDialog(null,
            "Digite o nome do aluno:", titulo, 3);
    String disciplina = JOptionPane.showInputDialog(null,
            "Digite a disciplina avaliada: ", titulo, 3);
    double media = 0;
    //double nota = 0;
    double somaNotas = 0;
    int numeroNotas = 0;
    
    while (true) {
      String notaStr = JOptionPane.showInputDialog(null, 
              "Digite a nota do aluno:", titulo, 3);
      numeroNotas++;
      somaNotas += Double.parseDouble(notaStr);
      int resposta = JOptionPane.showConfirmDialog(null, 
              "Deseja lançar outra nota?", titulo, 
              JOptionPane.YES_NO_OPTION, 3);
      if (resposta == 1) {
        break;
      }
    }
    media = somaNotas / numeroNotas;
    String msg;
    if (media >= 6) {
      msg = "A aluno " + nome + " foi APROVADO ";
      msg += "\nna disciplina " + disciplina;
      msg += "\ncom a média " + String.format("%.1f", media);
    } else {
      msg = "A aluno " + nome + " foi REPROVADO ";
      msg += "\nna disciplina " + disciplina;
      msg += "\ncom a média " + String.format("%.1f", media);
    }
    JOptionPane.showMessageDialog(null, msg, titulo, 1);
  }
  
}
