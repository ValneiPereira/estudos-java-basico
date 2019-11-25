package exercicios16e17;

import java.util.Scanner;

public class Exercicio14 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n;
    int pares=0;
    int impares=0;
    for (int i = 0; i < 5; i++) {
      System.out.println("Digite o "+(i+1)+"º"+" numero: ");
      n=ler.nextInt();
      if(n %2==0) {
        pares++;
      }else {
        impares++;
      }
    }
    System.out.println("PARES   :"+pares);
    System.out.println("IMPARES :"+impares);
    
  }

}
