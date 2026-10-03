/**
 * Nessa classe vamos criar os objetos do tipo ProdutoFisico e 
 * ProdutoDigital
 */
package aula06d;

public class Aula06d {

  public static void main(String[] args) {
    
    String codigo = "101";
    String nome = "Notebook Lenovo";
    double preco = 3500.00;
    double peso = 2.5;
    double frete = 45.00;
    
    ProdutoFisico pf = new ProdutoFisico(codigo, nome, preco,
          peso, frete);
    
    pf.exibirDados();
    System.out.println("=".repeat(50));
    System.out.println("Ganhou Free Gratis");
    pf.descontarFrete(100);
    pf.exibirDados();
    System.out.println("=".repeat(50));
    
    codigo = "202";
    nome = "Curso de Java";
    preco = 199.99;
    double tamanhoArquivo = 850.0;
    String formato = "MP4";
    
    ProdutoDigital pd = new ProdutoDigital(codigo, nome, preco,
        tamanhoArquivo, formato);
    pd.exibirDados();
  }
  
}
