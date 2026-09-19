package exercicio03revisao;


import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio03Revisao{
    public static void main(String args[]){

        String titulo = "Lojas Fantomas";
        SistemaLoja loja = new SistemaLoja();
        loja.nome = JOptionPane.showInputDialog(null,"Digite seu nome: ", titulo, 3 );
        loja.produto = JOptionPane.showInputDialog(null, "Digite o produto: ", titulo, 3);
        loja.preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço: ", titulo, 3));
        loja.numParcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de parcelas: ", titulo, 3));
        loja.vencimentos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite dia de vencimento (5, 10, 15, 20 ou 25): ", titulo, 3));
        loja.imprimirCupon();
        /*
        System.out.println("=".repeat(40));
        System.out.println("          Lojas Fantomas        ");
        System.out.println("=".repeat(40));
        System.out.println("Cliente: " + loja.nome);
        System.out.println("Produto: " + loja.produto);
        System.out.println("Valor: R$ " + String.format("%.2f", loja.preco));
        System.out.println("Parcelas: " + loja.numParcelas);
        System.out.print("Valor da parcela: " + String.format("%.2f", loja.precoParcela()) + " em " + loja.numParcelas + " vezes.\n");
        System.out.println("=".repeat(40));

        LocalDate data = LocalDate.of(2026, 8, loja.vencimentos);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        double valorParcela = loja.precoParcela();
        if(loja.numParcelas == 1){
            valorParcela = valorParcela * 0.90;
            System.out.println("Parcela Única com desconto de 10% a vista: "
                    + data.format(formato) + " - R$ "
                    + String.format("%.2f", valorParcela));
        }

        int parcela = 1;
        while(parcela <= loja.numParcelas){


            System.out.println("Parcela " + parcela + ": "
                    + data.format(formato) + " - R$ "
                    + String.format("%.2f", valorParcela));

            data = data.plusMonths(1);
            parcela++;


        }



        System.out.println("=".repeat(40));
        System.out.println("Sistema de Loja SENAI GUARULHOS DUTRA");
        System.out.println("=".repeat(40));
        System.out.println("Muito Obrigado pela Compra!");
        System.out.println("    Volte Sempre!    ");
        System.out.println("=".repeat(40));
*/
    }
}
