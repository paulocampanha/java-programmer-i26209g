/**
 * Nesse programa vamos usar a estrutura de repetição do while
 * para verificar a senha do usuário
 */
package aula04b;
import javax.swing.JOptionPane;

public class Aula04b {

  public static void main(String[] args) {
     
    String senhaCorreta = "1234";
    String senha;
    int tentativas = 1;
    
    do {
      senha = JOptionPane.showInputDialog(null,
              "Digite sua senha: ", "Login", 3);
      
      if (senha.equals(senhaCorreta)) {
        JOptionPane.showMessageDialog(null, "Acesso permitido");
        break;
      } else {
        JOptionPane.showMessageDialog(null, "Senha incorreta");
      }
      tentativas++;
    } while (!senha.equals(senhaCorreta) && tentativas <= 3);
    
    if (tentativas > 3) {
      JOptionPane.showMessageDialog(null, 
              "Número de tentativas excedido!", "Login", 0);
    }
    
    
    
  }
  
}
