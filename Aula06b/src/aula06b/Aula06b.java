/**
 * Nessa classe vamos implementar os métofdos com sobrecarga da classe
 * Calculadora
 */
package aula06b;

import javax.swing.JOptionPane;

public class Aula06b {

  public static void main(String[] args) {
    
    Calculadora calc = new Calculadora();
    
    // Chamar somar(int, int)
    int resultado1 = calc.somar(13, 29);
    
    // Chamar somar(int, int, int)
    int resultado2 = calc.somar(15, 30, 45);
    
    // Chamar somar(double, double)
    double resultado3 = calc.somar(10.5, 20);
    
    JOptionPane.showMessageDialog(null, "Resultado 1: " + resultado1);
    JOptionPane.showMessageDialog(null, "Resultado 2: " + resultado2);
    JOptionPane.showMessageDialog(null, "Resultado 3: " + resultado3);
    
    int total = 0;
    while (true) {
      String numero = JOptionPane.showInputDialog(null,
              "Digite um número inteiro ou '=' para encerrar:",
              "Calculadora", 3);
      if (numero.equals("=")) {
        break;
      } else {
        int num = Integer.parseInt(numero);
        total = calc.somar(total, num);
      }
    }
    JOptionPane.showMessageDialog(null, "Total: " + total);
  }
  
}
