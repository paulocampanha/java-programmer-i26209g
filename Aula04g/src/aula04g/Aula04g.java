/**
 * Nesse programa tudar o uso de array multidensional
 */
package aula04g;

public class Aula04g {

  public static void main(String[] args) {
    
    String[] alunos = {"Camila", "Carol", "Gabi", "Gael"};
    
    int[][] valores = new int[4][3];
    
    valores[0][0] = 13;
    valores[0][1] = 29;
    valores[0][2] = 42;
    
    valores[1][0] = 5;
    valores[1][1] = 25;
    valores[1][2] = 12;
    
    valores[2][0] = 18;
    valores[2][1] = 23;
    valores[2][2] = 26;
    
    valores[3][0] = 29;
    valores[3][1] = 14;
    valores[3][2] = 19;
    
    for (int i = 0; i < valores.length; i++){
      System.out.println("Aluno: " + alunos[i]);
      for (int j = 0; j < valores[0].length; j++) {
        System.out.println(" - " + valores[i][j]);
      }
      
    }
    
  }
  
}
