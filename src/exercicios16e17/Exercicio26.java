package exercicios16e17;

import java.util.Scanner;

public class Exercicio26 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Dgite um numero");
    int n=ler.nextInt();
    int resultado=1;
    
    System.out.print("Fatorial de: "+n+"\n");
    for (int i =n; i > 1; i--) {
      resultado *=i;
      System.out.print(i+".");
    }
    System.out.print(" 1 ="+resultado);
  }

}
