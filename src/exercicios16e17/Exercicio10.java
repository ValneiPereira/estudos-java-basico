package exercicios16e17;

import java.util.Scanner;

public class Exercicio10 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite 1º numero");
    int n1=ler.nextInt();
    
    System.out.println("Digite 2º numero");
    int n2=ler.nextInt();
    
    for (int i = n1; i <=n2 ; i++) {
      System.out.println(i);
    }
    
  }

}
