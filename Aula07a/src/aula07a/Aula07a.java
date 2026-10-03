/**
 * Nessa classe vamos criar os objetos do tipo Pessoa e do tipo Aluno
 */
package aula07a;

import javax.swing.JOptionPane;

public class Aula07a {

  public static void main(String[] args) {
    
    String nome = JOptionPane.showInputDialog(null,
            "Digite o nome do visitante:");
    String idadeStr = JOptionPane.showInputDialog(null,
            "Digite a idade do visitante:");
    int idade;
    
    if (idadeStr.trim() == null) {
      idade = 0;
    } else {
      idade = Integer.parseInt(idadeStr);
    }
    
    Pessoa ps = new Pessoa(nome, idade);
    ps.exibirDados();
    
    nome = JOptionPane.showInputDialog(null,
            "Digite o nome do aluno:");
    idadeStr = JOptionPane.showInputDialog(null, 
            "Digite a idade do aluno:");
    String curso = JOptionPane.showInputDialog(null,
            "Digite o curso do aluno:");
    String periodo = JOptionPane.showInputDialog(null,
            "Digite o período do curso:");
    
    idade = Integer.parseInt(idadeStr);
    
    Aluno aluno1 = new Aluno(nome, idade, curso, periodo);

    //aluno1.exibirDados();
    
    double nota1 = 6.7;
    double nota2 = 5.8;
    double nota3 = 8.9;
    
    aluno1.calcularMedia(nota1, nota2, nota3);
    aluno1.exibirDados();
    
    
    
  }
  
}
