/**
 * Nesse programa vamos estudar o operador ternário
 */
package aula02c;

public class Aula02c4 {

  public static void main(String args[]) {
    
    boolean ehAluno = false;
    
    System.out.println( (ehAluno ? "E aluno" : "Nao e aluno") );
    
    String nome = "Gaspar Galego Neve";
    
    System.out.println( (nome.contains("Neves") ? "Contem o nome" : "Nao contem o nome")  );
    
    int idade = 18;
    String msg = idade >= 18 ? "Maior de idade" : "Menor de idade";
    
    System.out.println(msg);
  }
}
