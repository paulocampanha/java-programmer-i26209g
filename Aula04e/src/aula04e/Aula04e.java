/**
 * Nesse programa vamos estudar o uso de Array em java e a manipulação
 * de uma array usando o for
 */
package aula04e;

public class Aula04e {

  public static void main(String[] args) {

    String[] alunos = {"Gaspar", "Jorge", "Anabela", "Luiza"};

    int[] idade = new int[4];
    idade[0] = 20;
    idade[1] = 30;
    idade[2] = 16;
    idade[3] = 25;

    for (int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno " + alunos[i] + " tem " + idade[i] + " anos.");
    }
    
    
  }

}
