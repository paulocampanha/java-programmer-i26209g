/**
 * Uma interface é um contratoque defina os métodos que uma classe
 * deve implementar. Ela contem apenas as assinaturas dos métodos
 * ou seja, nome do método, parâmetros e tipo de retorno.
 */
package aula07c;

public interface ProcessadorPagamento {
  
  // Contrato 1: Iniciar o processamento de um valor
  // Todas as formas de pagamento DEVEM implementar este método
  void processarPagamento(double valor);
  
  // Contrato 2: Verificar se a transação foi concluida
  // Todas as formas de pagamento DEVEM implementar este método
  String verificarStatus();
  
}
