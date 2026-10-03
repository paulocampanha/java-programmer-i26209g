/**
 * Nesse classe vamos implementar o contrato da interface 
 * ProcessadorPagamento
 */
package aula07c;

import javax.swing.JOptionPane;

public class Pix implements ProcessadorPagamento {
  
  private String chave;
  private boolean aprovado = false;
  
  // Construtor
  public Pix (String chave) {
    this.chave = chave;
  }
  
  @Override
  public void processarPagamento(double valor) {
    JOptionPane.showMessageDialog(null, 
            "Valor: " + valor + "\nChave: " + chave);
    // Simulação: Transação aceita
    this.aprovado = true;
  }
  
  @Override
  public String verificarStatus() {
    return aprovado ? "PAGAMENTO CONFIRMADO" : "AGUARDANDO PAGAMENTO";
  }
}
