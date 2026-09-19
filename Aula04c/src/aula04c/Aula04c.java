/**
 * Nesse programa vamos criar um jogo de adivinhação onde o
 * jogador deve adivinhar um número sorteado pelo sistema. O 
 * O jogador tera 3 chances de descobrir o número. A cada palpite 
 * errado, o sistema fornece uma dica dizendo se o palpite é
 * maior ou menor do que o número sorteado
 *  
 */
package aula04c;
import javax.swing.JOptionPane;
import java.util.Random;

public class Aula04c {

  public static void main(String[] args) {
    
   Random rd = new Random();
   do {
    int numeroSecreto = rd.nextInt(10) + 1;
    int tentativas = 1;
    boolean acertou = false;
    do {
      int palpite = Integer.parseInt(
              JOptionPane.showInputDialog(
                null,
                "Digite seu papite",
                "Jogo da Adivinhação", 3
              )
            );
      if (palpite == numeroSecreto) {
        acertou = true;
        break;
      } else if (palpite > numeroSecreto) {
        JOptionPane.showMessageDialog(null,
                "Seu papite é maior do que o número secreto.",
                "Jogo da Adivinhação", 1);
      } else {
        JOptionPane.showMessageDialog(null,
                "Seu papite é menor do que o número secreto.",
                "Jogo da Adivinhação", 1);
      }
      if (tentativas < 3) {
        JOptionPane.showMessageDialog(null, 
                "Tente novamente!", "Jogo da Adivinhação", 1);
      }
      tentativas++;
    } while (tentativas <= 3);
    
    if (acertou) {
      JOptionPane.showMessageDialog(null, 
              "PARABÊNS!!!\nVocê acertou o número secreto",
              "Jogo da Adivinhação", 1);
    } else {
      JOptionPane.showMessageDialog(null, 
              "PERDEU!!!\nVocê não acertou o número secreto" + 
              "\nO número secreto é " + numeroSecreto + ".",
              "Jogo da Adivinhação", 1);
    }
    int resposta = JOptionPane.showConfirmDialog(null,
           "Deseja jogar novamente?",
           "Jogo da Adivinhação", 
           JOptionPane.YES_NO_OPTION, 3);
    if (resposta == 1) {
      break;
    }
   } while (true);
  }
  
}
