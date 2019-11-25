package exercicios16e17;

import java.util.Scanner;

public class Exercicio01 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite uma nota entra 0 e 10");
    int nota=ler.nextInt();
    
    while (nota<0 || nota >10) {
      
      System.out.println("Nota invalida");
      System.out.println("Digite uma nota entra 0 e 10");
      nota=ler.nextInt();
    }System.out.println("Nota valida");
      
    }
}
