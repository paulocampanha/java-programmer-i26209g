/**
 * Nesse programa vamos estudar a estrutura de repetição for
 */
package aula04d;

public class Aula04d {

  public static void main(String[] args) {
    
    //int i = 1;
    //while (i <= 10) {
    //  System.out.println(i);
    //  i++;
    //}
    
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);      
    }
    
    for (int i = 2; i <= 40; i += 2) {
      System.out.print(i + " ");
    }
    
    System.out.println();
    
    for (int i = 10; i > 0; i--) {
      System.out.print(i + "...");
    }
    System.out.println("F O G O ! ! !");
    
    // Tabuada usando while
    /*
    int numero = 8;
    int i = 1;
    while (i <= 10){
      int total = i * numero;
      System.out.println(i + " X " + numero + " = " + total);
      i++;
    }
    */
    // Tabuada usando for
    int numero = 6;
    for (int i = 1; i <= 10; i++){
      int total = i * numero;
      System.out.println(i + " X " + numero + " = " + total);
    }
    
  }
  
}
