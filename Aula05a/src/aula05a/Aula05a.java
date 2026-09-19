/**
 * Nesse programa vamos estudar os métodos (funções) em Java, começando 
 * com métodos sem retorno e sem parâmetro
 * 
 */
package aula05a;

import javax.swing.JOptionPane;

public class Aula05a {

  public static void main(String[] args) {
    // Para chamar o método de instância precisamos criar um objeto
    Aula05a pessoa = new Aula05a();
    
    pessoa.apresentar();
    
    // Para chamar um método static, não precisa criar o objeto
    mensagem();
  }

  // Método de instância 
  public void apresentar() {
    JOptionPane.showMessageDialog(null, 
            "Olá. Essa mesnagem pertence a um método.");
  }
  
  // Método estático (static)
  public static void mensagem(){
    JOptionPane.showMessageDialog(null,
            "Bem-vindo ao programa feito em Java.");
  }
}
