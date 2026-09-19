/**
 * Nesse programa vamos estudar os métodos (funções) em Java, usando 
 * métodos com retorno e sem parâmetro
 * 
 */

package aula05c;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Aula05c {

  public static void main(String[] args) {
    // TODO code application logic here
    
    Aula05c pessoa = new Aula05c();
    
    String nome = pessoa.receberNome();
    int idade = calcularIdade();
    
    JOptionPane.showMessageDialog(null, nome + " cadastrado com sucesso.");
    JOptionPane.showMessageDialog(null, "O aluno tem " + idade + " anos.");
  }
  
  public String receberNome() {
    
    String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno:");
    return nome;
  }
  
  public static int calcularIdade(){
    LocalDate dataAtual = LocalDate.now();
    int anoAtual = dataAtual.getYear();
 
    String anoNascimento = JOptionPane.showInputDialog(null, 
            "Digite o ano de nascimento do aluno: ");
    int idade = anoAtual - Integer.parseInt(anoNascimento);
 
    return idade;
  }
  
  
  
}
