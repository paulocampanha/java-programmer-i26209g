/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03revisao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sn1085640
 */

public class SistemaLoja {

    String nome;
    String produto;
    double preco;
    int numParcelas;
    double valorParcela;
    int vencimentos;
    double desconto;
    

    public double precoParcela(){
        this.valorParcela = preco / numParcelas;
        return valorParcela;
    }

    public double aplicarDesconto(){
        desconto = (preco - (preco * 0.10));
        return desconto;
    }
    
    public void imprimirCupon(){
      System.out.println("=".repeat(40));
        System.out.println("          Lojas Fantomas        ");
        System.out.println("=".repeat(40));
        System.out.println("Cliente: " + this.nome);
        System.out.println("Produto: " + this.produto);
        System.out.println("Valor: R$ " + String.format("%.2f", this.preco));
        System.out.println("Parcelas: " + this.numParcelas);
        System.out.print("Valor da parcela: " + String.format("%.2f", this.precoParcela()) + " em " + this.numParcelas + " vezes.\n");
        System.out.println("=".repeat(40));

        LocalDate data = LocalDate.of(2026, 8, this.vencimentos);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        double valorParcela = this.precoParcela();
        if(this.numParcelas == 1){
            valorParcela = valorParcela * 0.90;
            System.out.println("Parcela Única com desconto de 10% a vista: "
                    + data.format(formato) + " - R$ "
                    + String.format("%.2f", valorParcela));
        }

        int parcela = 1;
        while(parcela <= this.numParcelas){


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
    }
}
