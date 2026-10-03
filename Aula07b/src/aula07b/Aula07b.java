/**
 * Nessa classe vamos criar os objetos imutáveis do tipo Ponto
 */
package aula07b;

public class Aula07b {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    Ponto p1 = new Ponto(x, y);
    
    System.out.println("Coordenada X: " + p1.getX());
    System.out.println("Coordenada Y: " + p1.getY());
    
  }
  
}
