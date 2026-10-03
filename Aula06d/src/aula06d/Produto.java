/** 
 * Nesse classe vamos específicar os atributos e métodos
 * genéricos dos Produtos de um sistema comercial proximo
 * da realidade
 */
package aula06d;

public class Produto {
  
  String codigo;
  String nome;
  double preco;
  
  public Produto(String codigo, String nome, double preco){
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }
  
  public void exibirDados(){
    System.out.println("Codigo: " + codigo);
    System.out.println("Nome: " + nome);
    System.out.println("Preco: R$ "
            + String.format("%,.2f", preco));
  }
  
  public void aplicarDesconto(double percentual){
    double desconto = preco * percentual / 100;
    preco -= desconto;
  }
  
  public void alterarPreco(double novoPreco){
    preco = novoPreco;
  }
  
}
