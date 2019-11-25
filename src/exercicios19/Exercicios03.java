package exercicios19;

import java.util.Scanner;

public class Exercicios03 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int[] vetorA = new int[5];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + (i + 1));
      vetorA[i] = ler.nextInt();
      vetorB[i] = (int) Math.pow(vetorA[i], 2);

    }
    System.out.println("Vetor A=");
    for (int vetor : vetorA) {
      System.out.println(vetor + "");
    }

    System.out.println();

    System.out.println("Vetor B=");
    for (int vetor : vetorB) {
    System.out.println(vetor + "");
    }

    System.out.println();

  }

}
