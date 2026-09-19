/**
 * Nesse programa vamos estudar a estrutura de decisão switch case
 */
package aula03b;

import javax.swing.JOptionPane;

public class Aula03b {
  public static void main(String[] args) {
    int mes = 13;
    String msg;
    
    switch (mes) {
      case 1:
        msg = "Janeiro";
        break;
      case 2: 
        msg = "Fevereiro";
        break;
      case 3:
        msg = "Março";
        break;
      case 4:
        msg = "Abril";
        break;
      default:
        msg = "Opção inválida";
    }
    JOptionPane.showMessageDialog(null, 
            "Mês escolhido: " + msg);
    
    int diaSemana = 1;
    switch (diaSemana) {
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        msg = "Dia de trabalho";
        break;
      case 7:
        msg = "Sabado: Meio período";
        break;
      case 1: 
        msg = "Domingo: Dia de descanso";
        break;
      default:
        msg = "Opção Inválida";
    }
    JOptionPane.showMessageDialog(null, msg);
    
    boolean loginOk = true;
    String tipoUsuario = "tecnico";
    switch (loginOk){
      case false:
        msg = "O acesso não foi permitido.";
        break;
      case true:
        switch (tipoUsuario) {
          case "adm":
            msg = "Acesso Administrativo";
            break;
          case "tecnico":
            msg = "Acesso Técnico";
            break;
          case "usuario":
            msg = "Acesso Usuário";
            break;
          default:
            msg = "Acesso inválido";          
        }      
    }
    JOptionPane.showMessageDialog(null, msg);
    
  }
  
}
