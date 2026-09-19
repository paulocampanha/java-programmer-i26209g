/**
 * Uma escola deseja criar um pequeno sistema para calcular a média dos
 * alunos. Crie um programa que recebe o nome do aluno e três notas.
 * Crie um método sem retorno e com parâmetro para receber o nome do
 * aluno e imprimir a mensagem: "Fulano localizado no sistema"
 * Crie um método com retorno e com parâmentro para receber as três
 * notas, calcular a média e retonar essa média para o método
 * chamador (main). Imprima a média do aluno.
 */


package exercicio05a;

import javax.swing.JOptionPane;

public class Exercicio05a {

  // Método sem retorno e com parâmetro
  public static void localizarAluno(String nome) {

    JOptionPane.showMessageDialog(null,
            nome + " localizado no sistema.");
  }

// Método com retorno e com parâmetros
  public static double calcularMedia(double nota1, double nota2, double nota3) {

    double media = (nota1 + nota2 + nota3) / 3;
    return media;
  }

  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");

    double nota1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a 1ª nota:"));

    double nota2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a 2ª nota:"));

    double nota3 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a 3ª nota:"));

    // Chamada do método sem retorno
    localizarAluno(nome);

    // Chamada do método com retorno
    double media = calcularMedia(nota1, nota2, nota3);

    JOptionPane.showMessageDialog(null,
            "Média do aluno: " + media);
  }
}
