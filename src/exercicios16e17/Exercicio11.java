package exercicios16e17;

import java.util.Scanner;

public class Exercicio11 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite 1� numero");
    int n1=ler.nextInt();
    
    System.out.println("Digite 2� numero");
    int n2=ler.nextInt();
    
    int soma=0;
    
    for (int i = n1; i <=n2 ; i++) {
      soma +=i;
    }
    System.out.println("Soma: "+soma);
  }

}
