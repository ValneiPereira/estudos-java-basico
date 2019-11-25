package exercicios19;

import java.util.Scanner;

public class Exercicios04 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetorA = new int[5];
    double[] vetorB = new double[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + (i + 1));
      vetorA[i] = ler.nextInt();
      vetorB[i] =  Math.sqrt(vetorA[i]);

    }
    System.out.println("Raiz quadrada vetor A=");
    for (int vetor : vetorA) {
      System.out.println(vetor + "");
    }

    System.out.println();

    System.out.println("Raiz quadrada vetor B=");
    for (double vetor : vetorB) {
    System.out.println(vetor + "");
    }

    System.out.println();

  }
    
 }



