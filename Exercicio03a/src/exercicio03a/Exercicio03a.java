/*
 */
package exercicio03a;

import javax.swing.JOptionPane;

public class Exercicio03a {

  public static void main(String[] args) {

    String titulo = "Lojas Fantomas";
    // Entrada dos dados
    String cliente = JOptionPane.showInputDialog(null,
            "Digite o nome do cliente:", titulo, 3
    );

    String produto = JOptionPane.showInputDialog(null,
            "Digite o nome do produto:", titulo, 3
    );

    String valorStr = JOptionPane.showInputDialog(null,
            "Digite o valor do produto:", titulo, 3
    );

    valorStr = valorStr.replace(",", ".");
    double valor = Double.parseDouble(valorStr);

    String numeroStr = JOptionPane.showInputDialog(null,
            "Digite o número de parcelas (1 a 10):", titulo, 3
    );

    int parcelas = Integer.parseInt(numeroStr);

    Object[] diaVenc = {5, 10, 15, 25, 25};
    int escolha = JOptionPane.showOptionDialog(null,
            "Escolha o dia de pagamento", titulo,
            JOptionPane.YES_NO_CANCEL_OPTION, 3,
            null, diaVenc, diaVenc[0]
    );
    int dia = 0;

    switch (escolha) {
      case 0:
        dia = 5;
        break;
      case 1:
        dia = 10;
        break;
      case 2:
        dia = 15;
        break;
      case 3:
        dia = 20;
        break;
      case 4:
        dia = 25;
        break;
    }

    int mes = 9;

    // Calcula o desconto
    double desconto = 0;

    if (parcelas == 1) {

      desconto = valor * 0.10;
    }

    // Calcula o valor final
    double valorFinal = valor - desconto;

    // Calcula o valor de cada parcela
    double valorParcela = valorFinal / parcelas;

    // Relatório
    System.out.println("===============================================");
    System.out.println("                 Lojas Fantomas");
    System.out.println("===============================================");

    System.out.println("Cliente: " + cliente);
    System.out.println("Produto: " + produto);

    System.out.printf(
            "Valor: R$ %.2f%n",
            valorFinal
    );

    System.out.println("Parcelas: " + parcelas);

    System.out.println("===============================================");

    // Contador das parcelas
    int parcela = 1;

    int mesAtual = mes;

    // Gera as parcelas
    while (parcela <= parcelas) {

      System.out.printf(
              "Parcela %d: %02d/%02d/2026 - R$ %.2f%n",
              parcela,
              dia,
              mesAtual,
              valorParcela
      );

      parcela++;

      mesAtual++;

      // Se passar de dezembro, volta para janeiro
      if (mesAtual > 12) {
        mesAtual = 1;
      }

      System.out.println("===============================================");
      System.out.println("             Sistema de Loja SENAI");
      System.out.println("===============================================");
    }
  }
}
