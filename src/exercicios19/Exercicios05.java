package exercicios19;

import java.util.Scanner;

public class Exercicios05 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetorA =new int[5];
    int[] vetorB = new int[vetorA.length];
    
    
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + (i + 1));
      vetorA[i] = ler.nextInt();
      vetorB[i] =  vetorA[i] * i;

    }
    /*System.out.println("Raiz quadrada vetor A=");
    for (int vetor : vetorA) {
      System.out.println(vetor + "");
    }*/

    System.out.println();

    System.out.println("Raiz quadrada vetor B=");
    for (double vetor : vetorB) {
    System.out.println(vetor + "");
    }

    System.out.println();

  }
}


