package exercicios19;

import java.util.Scanner;

public class Exercicios08 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetorA =new int[5];
    int[] vetorB =new int[vetorA.length];
    int[] vetorC =new int[vetorA.length];
    
    
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor do vetor A " + (i + 1));
      vetorA[i] = ler.nextInt();

    }
    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Entre com o valor do vetor B " + (i + 1));
      vetorB[i] = ler.nextInt();
      
    }
    for (int i = 0; i < vetorC.length; i++) {
      System.out.println("Entre com o valor do vetor C " + (i + 1));
      vetorC[i] =  vetorA[i] * vetorB[i];
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
    
    System.out.println("Vetor C=");
    for (int vetor : vetorC) {
      System.out.println(vetor + "");
    }
  }


}