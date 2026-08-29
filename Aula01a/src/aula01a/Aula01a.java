/**
 * Nesse programa vamos estudar as variáveis do tipo 
 * primitivo
 */
package aula01a;

public class Aula01a {

    public static void main(String[] args) {
        System.out.println("Paulo Campanha");
        System.out.println("==============");
        System.out.println("--- Tipos Primitivos ---");
        //Tipo byte: -128 até 127
        byte idadeAluno;
        byte temperaturaAtual;
        idadeAluno = 16;
        temperaturaAtual = 23;
        System.out.println("Idade do aluno: " + 
                idadeAluno);
        System.out.println("Temperatura atual: " + 
                temperaturaAtual + " graus.");
        
        //Tipo short: -32.768 até 32.767
        short populacaoGuara = 18606;
        short anoInicial = 2026;
        System.out.println(
          "Populacao de Guara: " + 
          populacaoGuara);
        System.out.println("Ano inicial: "
          + anoInicial);
        
        //Tipo int: -2 bilhões at´é 2 bilhões
        int impostoSaoPaulo = 1200000000;
        int premioMegaSena = 89456000;
        System.out.println(
          "Imposto Arrecadado no Estado de " +
          "Sao Paulo por dia: " + 
          impostoSaoPaulo);
        System.out.println("Premio da Megasena: "
        + premioMegaSena);
        
        //Tipo long: 9 quintilhões
        long impostoBrasil = 2_886_000_000_000L;
        long populacaoMundial = 7_800_000_000L;
        System.out.println("Arrecadacao de " + 
          "imposto no Brasil: " + impostoBrasil);
        System.out.println("Populacao mundial: " +
                populacaoMundial);
        
        //Tipo float: números com 7 casas decimais
        float altura = 1.75f;
        float microValor = 12345.1234567f;
        System.out.println("Altura: " + altura);
        System.out.println("Micro valor: " + 
                microValor);
        
        //Tipo double: números com 15 casas decimais
        double pi = 3.14159226535978463;  // 17 casas decimais
        double indice = 12345.456789012345678; // 15 casas decimais
        double premio = 55_000_000_000.00;
        System.out.printf("Numero PI: %.10f %n", pi);
        System.out.printf("Indice: %,.15f %n", indice);
        System.out.printf("Premio: R$ %,.2f %n", premio);
        
    }
    
}
