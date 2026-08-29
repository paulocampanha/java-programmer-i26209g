/**
 * Nesse programa vamos estudar os tipo da "cast" para conversão de 
 * tipos primitivos
 */
package aula02a;

public class Aula02a {

  public static void main(String[] args) {
    byte num1 = 100;
    short num2 = num1;
    
    System.out.println("Byte: " + num1);
    System.out.println("Sort: " + num2);
    System.out.println("-".repeat(40));
    short num3 = 100;
    byte num4 = (byte) num3;
    
    System.out.println("Short: " + num3);
    System.out.println("Byte: " + num4);
    System.out.println("-".repeat(40));
    
    int num5 = 30000;
    short num6 = (short) num5;
    
    System.out.println("Int: " + num5);
    System.out.println("Short: " + num6);
    System.out.println("-".repeat(40));
    
    long num7 = 2_000_000_000L;
    int num8 = (int) num7;
    
    System.out.println("Long: " + num7);
    System.out.println("Int: " + num8);
    System.out.println("-".repeat(40));
    
    float num9 = 123.45f;
    double num10 = num9;
    
    System.out.println("Float: " + num9);
    System.out.println("Double: " + num10);
    System.out.println("-".repeat(40));
    
    double num11 = 0.123456789;
    float num12 = (float) num11;
    
    System.out.println("Double: " + num11);
    System.out.println("Float: " + num12);
    System.out.println("-".repeat(40));
    
    double num13 = 10.99;
    int num14 = (int) num13;
    
    System.out.println("Double: " + num13);
    System.out.println("Int: " + num14);
    System.out.println("-".repeat(40));
    
    int num15 = 123;
    double num16 = num15;
    
    System.out.println("Int: " + num15);
    System.out.println("Double: " + num16);
    System.out.println("-".repeat(40));
    
    
    
    
    
    
    
  }
  
}
