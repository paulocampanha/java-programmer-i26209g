/**
 * Nesse classe vamos criar métodos com sobrecarga de método
 */
package aula06b;

public class Calculadora {

  // Método para somar dois números
  public int somar(int a, int b){
    int soma = a + b;
    return soma;
  }

  // Metodo com sobrecarga para somar três números
  public int somar(int a, int b, int c){
    int soma = a + b + c;
    return soma;
  }
  
  // Método com sobrecarga para dois números decimais
  public double somar(double a, double b) {
    double soma = a + b;
    return soma;
  }
  
}
