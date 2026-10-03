/**
 * Nesse classe vamos herdar os atributos  métodos da classe 
 * Produto e implementar seu prórpios atributus e métodos
 */
package aula06d;

public class ProdutoFisico extends Produto{
  
  double peso;
  double frete;
  
  public ProdutoFisico(String codigo, String nome, 
          double preco, double peso, double frete){
    super(codigo, nome, preco);
    this.peso = peso;
    this.frete = frete;            
  }
  
  public void descontarFrete(double percentual) {
    double desconto = frete * percentual / 100;
    frete -= desconto;
  }
  
  @Override   
  public void exibirDados(){
    super.exibirDados();
    System.out.println("Peso: " + String.format("%.2f", peso));
    System.out.println("Frete: R$ " 
            + String.format("%.2f", frete));
  }
  
}
