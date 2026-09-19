/**
 * Crie uma array de números inteiros com 5 elementos. Usando o for
 * e a biblioteca Random, atribuia um número aleatorio entre 1 e 100
 * a cada item da array. Imprima todos os elentos da array.
 */
package exercicio04b;
import java.util.Random;

public class Exercicio04b {

  public static void main(String[] args) {
    
    Random rd = new Random();
    
    int[] numeros = new int[5];
    
    for (int i = 0; i< numeros.length; i++) {
      int numero = rd.nextInt(100) + 1;
      numeros[i] = numero;      
    }
    
    for (int i = 0; i< numeros.length; i++) {
      int numero = 0;
      System.out.print(numeros[i] + " ");
    }
    
    System.out.println();
    
    
    
      
    
    
  }
  
}
