/**
 * Nesse programa vamos fazer uma revisão de if, else if, else
 * e operador ternário
 */
package aula03a;

import javax.swing.JOptionPane;

public class Aula03a {

  public static void main(String[] args) {
    
    // Operador ternário
    int idade = 20;
    
    String resultado = idade >= 18 ? "Maior de idade" 
            : "Menor de idade";
    
    System.out.println("Aluno: " + resultado);
    
    boolean ehAluno = false;
    System.out.println( (ehAluno) ? "Aluno ativo" : "Aluno ausente");
    
    // Desvio condicional
    
    String horaStr = JOptionPane.showInputDialog(null,
            "Digite a hora de entrada no formato 'HH': ",
            "Senai Guarulhos Dutra", 3);
    
    int hora = Integer.parseInt(horaStr);
    String msg;
    if (hora >= 7 && hora <= 12){
       msg = "Turno: Manhã";
    } else if (hora >= 13 && hora <= 17) {
       msg = "Turno: Tarde";
    } else if (hora >= 18 && hora <= 23) {
       msg = "Turno: Noite";
    } else {
       msg = "Hora inválida";
    }
    
    JOptionPane.showMessageDialog(null, msg, "Senai", 1);
    
    int resposta = JOptionPane.showConfirmDialog(null,
            "Deseja continuar? ",
            "Senai Guarulhos Dutra",
            JOptionPane.YES_NO_CANCEL_OPTION, 3);
    
    if (resposta == 0) {
      JOptionPane.showMessageDialog(null, "Continuando...");
    } else if (resposta == 1) {
      JOptionPane.showMessageDialog(null, "Finalizando...");
    } else if (resposta == 2) {
      JOptionPane.showMessageDialog(null, "Cancelando...");
    } else {
      JOptionPane.showMessageDialog(null, 
              "Nenhum botão pressionado.");
    }
    
    Object[] cursos = {"Java", "Python", "C#", "C++"};
    int opt = JOptionPane.showOptionDialog(null, 
            "Qual curso deseja fazer? ",
            "Senai Guarulhos Dutra",
            JOptionPane.YES_NO_OPTION,
            3,
            null,
            cursos,
            cursos[0]);
    
    if (opt == 0) {
      msg = "Você escolheu o curso Java";
    } else if (opt == 1){
      msg = "Você escolheu o curso Python";
    } else if (opt == 2) {
      msg = "Você escolheu o curso C#";
    } else if (opt == 3) {
      msg = "Você escolheu o curso C++";
    } else {
      msg = "Você não escolheu nenhum curso";
    }
    
    JOptionPane.showMessageDialog(null, msg);
    
    
    
    
    
    
    
    
  }
  
}
