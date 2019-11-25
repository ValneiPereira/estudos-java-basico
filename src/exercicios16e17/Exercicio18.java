package exercicios16e17;

import java.util.Scanner;

public class Exercicio18 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um numero");
    int n=ler.nextInt();
    boolean primo=true;
    
    for (int i = 2; i<n ; i++) {
      if(n % i==0) {
        System.out.println("Não é, / por"+i);
        primo=false;
      }
    }
    if (primo) {
      System.out.println("É primo");
    }
    
    
  }

}
