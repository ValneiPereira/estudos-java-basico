package exercicios16e17;

import java.util.Scanner;

public class Exercicio12 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a tabuada quer ver:");
    int n=ler.nextInt();
    System.out.println("Tabuada "+n+":");
    
    for (int i = 1; i <=10 ; i++) {
      System.out.println(n+"X"+i+"="+(n*i));
      
    }
    
    
  }

}
