package exercicios16e17;

import java.util.Scanner;

public class Exercicio23 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Tabelas de precos");
    for (int i = 1; i <=50; i++) {
      System.out.println(i+"- R$"+(1.99*i));
      
    }
    
  }

}
