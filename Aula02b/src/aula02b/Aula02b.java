/**
 * Nesse programa vamos estudar o uso do tipo de classe String. 
 */
package aula02b;

public class Aula02b {

  public static void main(String[] args) {
    String nome = new String();
    nome = "Gaspar";
    
    String sobrenome = "Galego";
    
    String nomeCompleto = nome + " " + sobrenome;
    System.out.println(nomeCompleto);
    
    // Número de caracteres da String (inclusive espaços em branco)
    int tamanho = nomeCompleto.length();
    System.out.println("O nome completo tem " + tamanho + " caracteres.");
    
    // Exibir em letras maiúsculas
    System.out.println("Maiusculo: " + nomeCompleto.toUpperCase());

    // Exibir em letras minúsculas 
    System.out.println("Minusculas: " + nomeCompleto.toLowerCase());
    
    // Verificar se existe um conteúdo na variável
    System.out.println("Existe 'Gaspar' na variavel: " + 
            nomeCompleto.contains("Gaspar"));
    
    System.out.println("Existe 'Jorge' na variavel: " +
            (nomeCompleto.contains("Jorge") ? "Sim" : "Não" ));
    
    if (nomeCompleto.contains("Jorge")) {
      System.out.println("Sim");
    } else {
      System.out.println("Não");
    }
    
    // Verificar inicio da variável
    System.out.println("Variavel começa com 'Gasp': " + 
            nomeCompleto.startsWith("Gasp"));
    
    // Verifica final da variável
    System.out.println("Variavel termina com 'lego': " +
            nomeCompleto.endsWith("lego"));
    
    // Comparar duas strings
    String nome2 = "Gaspar Galego";
    
    System.out.println("As variaveis nomeCompleto e nome sao iguais: "
            + nomeCompleto.equals(nome2));
    
    nome2 = nome2.toUpperCase();
    
    System.out.println("As variaveis nomeCompleto e nome sao iguais"
            + "\nindependente da caixa alta ou baixa: " + 
            nomeCompleto.equalsIgnoreCase(nome2));
    
    nomeCompleto = "     " + nomeCompleto + "     ";
    System.out.println("Nome Completo: " + nomeCompleto);
    
    // Retirar espaços em branco no inicio e fim do texto
    nomeCompleto = nomeCompleto.trim();
    System.out.println("Nome Completo Limpo: " + nomeCompleto);
    
    // Substituir parte do texto
    nomeCompleto = nomeCompleto.replace("G", "R");
    
    System.out.println("Nome com letra alterada: " + nomeCompleto);
            
    
    // Extrair parte do texto
    String parteNome = nomeCompleto.substring(0, 6);
    System.out.println("Parte do texto: " + parteNome);
    
    String vazia = "";
    String emBranco = "     ";
    
    // Verificar se a string está vazia
    System.out.println("Variavel vazia: " + vazia.isEmpty());
    
    // VErificar se a string está em branco
    System.out.println("Variavel em branco: " + emBranco.isBlank());
    
    String nomeCompleto2 = nomeCompleto;
    
    System.out.println("Nome completo: " + nomeCompleto);
    System.out.println("Nome completo 2: " + nomeCompleto2);
    
    nomeCompleto = "Gaspar Galego";
    
    System.out.println("Nome completo: " + nomeCompleto);
    System.out.println("Nome completo 2: " + nomeCompleto2);
    
    
    
    
    
    
    
    
  }
  
}
