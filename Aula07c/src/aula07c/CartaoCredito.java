/**
 * Nessa classe vamos implementar o contrato para um 
 * cartão de crédito
 */
package aula07c;

import javax.swing.JOptionPane;

public class CartaoCredito implements ProcessadorPagamento {
  
  private String titular;
  private boolean aprovado = false;
  
  // Construtor
  public CartaoCredito(String titular) {
    this.titular = titular;
  }
  
  @Override
  public void processarPagamento(double valor) {
    
    String msg;
    // Simulando uma lógica da aprovação de um cartão de crédito    
    if (Math.random() < 0.5) {
      this.aprovado = false;
      msg = "Transação negada pela operadora";
    } else {
      this.aprovado = true;
      msg = "Transação aprovada pela operadora";
    }
    JOptionPane.showMessageDialog(null, msg);
  }
  
  @Override
  public String verificarStatus(){
    return aprovado ? "CONFIRMADO IMEDIATAMENTE" : 
            "AGUARDANDO PAGAMENTO";
  }
  
}
