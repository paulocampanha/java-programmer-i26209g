/**
 * Nessa classe vamos implementar a cobrecarga de construtores (constructor
 * overloading)
 */
package aula06a;

import javax.swing.JOptionPane;

public class Aluno {

  // Atributos
  String nome;
  int idade;
  String curso;
  
  // Construtor 1: sem parametros
  public Aluno(){
    this.nome = "Não informado";
    this.idade = 0;
    this.curso = "Não informado";
  }
  
  // Construor 2: recebe 1 parêmetro - nome
  public Aluno(String nome){
    this.nome = nome;
    this.idade = 0;
    this.curso = "Não informado";
  }
  
  // Construtor 3: recebe 2 parâmetros - nome e idade
  public Aluno(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    this.curso = "Não informado";
  }
  
  // Construtor 4: recebe 3 parâmetros - nome, idade e curso
  public Aluno(String nome, int idade, String curso){
    this.nome = nome;
    this.idade = idade;
    this.curso = curso;
  }
  
  public void exibirDados() {
    String msg = "Nome: " + this.nome;
    msg += "\nIdade: " + this.idade;
    msg += "\nCurso: " + this.curso;
    JOptionPane.showMessageDialog(null, msg, "Cadastro de Alunos", 1);
  }
}
