package exercicios16e17;

import java.util.Scanner;

public class Exercicio33 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor de numero");
    int n=ler.nextInt();
    double soma=0;
    for (int i = 1,j=1; i <=n; i++, j+=2 ) {
      System.out.print(i+"/"+j+"+");
      soma +=i/j;
    }
    System.out.println("Soma =" + soma);
    
  }

}
