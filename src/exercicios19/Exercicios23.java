package exercicios19;

import java.util.Scanner;

public class Exercicios23 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int [] vetorA = new int[10];
    
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com numero na posicao"+i);
      vetorA[i]=ler.nextInt();
      if(vetorA[i]%2 != 0) {
        break;
      }
    }
    System.out.println("Digitou impar FIM !!!!");
    
  }

}
