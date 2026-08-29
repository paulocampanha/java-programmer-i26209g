/**
 * Você foi contratado poara cria um programa que verifica o Índice de 
 * Massa Corporal de uma pessoa(IMC). Seu programa deve solicitar o 
 * peso e a altura do cliente, calcular o IMC e informar a classificação
 * de acordo com a tabela:
 * Para encontraar o IMC utilize a fórmula: 
 * imc = peso / (altura * altura)
 * Veja a interpretação do IMC
  IMC                 Classificação       
  Menor que 18,5      Magreza             
  Entre 18,5 e 24,9   Normal               
  Entre 25,0 e 29,9   Sobrepeso
  Entre 30,0 e 34,9   Obesidade Grau I
  Entre 35,0 e 39,9   Obesidade Grau II
  Maior que 40,0      Obesidade Grau III
 * 
 * Utilize JOptionPane para solicitar o peso e a altura e para informar 
 * a classificação,
 */
package aula02c;
  import javax.swing.JOptionPane;
public class Exercicio02c {

    public static void main(String[] args) {

        String pesoStr = JOptionPane.showInputDialog(null,
                "Digite seu peso (kg):");

        String alturaStr = JOptionPane.showInputDialog(null,
                "Digite sua altura (m):");

        double peso = Double.parseDouble(pesoStr);

        double altura = Double.parseDouble(alturaStr);
        
        double imc = peso / (altura * altura);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc <= 24.9) {
            classificacao = "Normal";
        } else if (imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Grau III";
        }

        JOptionPane.showMessageDialog(
                null,
                "Sua classificação de IMC é " + classificacao);
    }
}

