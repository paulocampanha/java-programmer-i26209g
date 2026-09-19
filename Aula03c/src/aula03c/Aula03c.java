/**
 * Nesse programa vamos estudar o uso da estrutura de repetição while
 */
package aula03c;

public class Aula03c {

  public static void main(String[] args) {
    String frase = "E PIQUE! ";
    int contador = 1;
    
    while (contador <= 5) {
      System.out.print(frase);
      contador++; 
    }
    System.out.println();
    contador = 1;
    frase = "E HORA! ";
    while (contador <= 5) {
      System.out.print(frase);
      contador++;
    }
    System.out.println("\nRA-TIM-BUM!");
    
  }
  
}
