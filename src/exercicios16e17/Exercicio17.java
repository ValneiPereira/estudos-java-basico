package exercicios16e17;

import java.util.Scanner;

public class Exercicio17 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Dgite um numero");
    int n=ler.nextInt();
    int resultado=1;
    
    System.out.print(n+"!=");
    for (int i =n; i > 0; i--) {
      resultado *=i;
      System.out.print(i+".");
    }
    System.out.print("="+resultado);
  }

}
