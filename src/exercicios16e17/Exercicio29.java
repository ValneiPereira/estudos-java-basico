package exercicios16e17;

import java.util.Scanner;

public class Exercicio29 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Entre com numero");
    int n=ler.nextInt();
    boolean primo=true;
    
    for (int i = 1; i <=n; i++) {
      
      for (int j = 2; j<i ; j++) {
        if(i % j==0) {
          
          primo=false;
        }
      }
      if (primo) {
        System.out.println("É primo"+i);
      }
      
    }
    
  }

}
