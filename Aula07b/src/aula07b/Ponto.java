/**
 * Essa é uma classe imutável. Uma classe imutável tem seus 
 * atributos constantes, ou seja, depois de definidos os 
 * valores não podem ser alterados
 */
package aula07b;

public final class Ponto {
  
  private final int x;
  private final int y;
  
  // Construtor
  public Ponto(int x, int y){
    this.x = x;
    this.y = y;
  }
  
  public int getX() {
    return this.x;
  }
  
  public int getY() {
    return this.y;
  }
  
}
