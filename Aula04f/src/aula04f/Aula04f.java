/**
 * Nesse programa vampos estudar o uso do foreach com Array
 */
package aula04f;

public class Aula04f {

  public static void main(String[] args) {
    
    int[] numeros = {10, 20, 30, 40, 50};
    
    // Foreach
    for (int numero : numeros ) {
      System.out.println(numero);
    }
    
    String[] alunos = {"Gaspar", "Anabela", "Jorge", "Luiza"};
    
    for (String aluno : alunos) {
      System.out.println("Aluno: " + aluno);
    }
  }
  
}
