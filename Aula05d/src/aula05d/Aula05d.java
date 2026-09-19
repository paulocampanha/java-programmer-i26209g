/**
 * Nesse programa vamos estudar os métodos (funções) em Java, usando 
 * métodos com retorno e com parâmetro
 * 
 */

package aula05d;

import javax.swing.JOptionPane;

public class Aula05d {

  public static void main(String[] args) {
    
    double preco = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Digite o preço do produto:"));
    double percentual = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Digite o percentual de desconto:"));
    Aula05d valor = new Aula05d();
    double precoComDesconto = valor.calcularDesconto(preco, percentual);
    JOptionPane.showMessageDialog(null, "Preço com desconto: R$ " + 
            String.format("%,.2f", precoComDesconto));
    
    System.out.println("Valor da Comissao: R$ " + 
            String.format("%,.2f", calcularComissao(preco)));
    }
  // Método de instância
  public double calcularDesconto(double preco, double percentual){
    double desconto = preco * percentual / 100;    
    return preco - desconto;    
  }
  // Método estático (static)
  public static double calcularComissao(double preco) {
    double comissao = preco * 0.05; // 5% de comissão
    return comissao;
  }  
}
