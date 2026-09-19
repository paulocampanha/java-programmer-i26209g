/**
 * Nesse programa vamos estudar os métodos (funções) em Java, usando 
 * métodos sem retorno e com parâmetro
 * 
 */

package aula05b;

import javax.swing.JOptionPane;

public class Aula05b {

  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog(null,
            "Digite o nome do aluno");
    String idadeStr = JOptionPane.showInputDialog(null, 
            "Digite a idade do aluno");
    int idade = Integer.parseInt(idadeStr);    
    // Criando o objeto 'aluno' do tipo Aula05b
    // Fiz uma instância da classe Aula05b
    Aula05b aluno = new Aula05b();
    Aula05b aluno2 = new Aula05b();
    
    aluno.exibirDados(nome, idade);
    aluno2.exibirDados("Gaspar", 20);

    mensagem(nome);
    mensagem("Anabela");
  }
  
  // Método de instância
  public void exibirDados(String nomeAluno, int idadeAluno) {
    String msg = "Aluno: " + nomeAluno;
    msg += "\nIdade: " + idadeAluno;
    JOptionPane.showMessageDialog(null, msg);
  }
  
  // Método estático (static)
  public static void mensagem(String nome){
    JOptionPane.showMessageDialog(null, 
            nome + ", seja bem-vindo ao sistema de alunos");
  }
  
}
