package exercicios19;

import java.util.Scanner;

public class Exercicios15 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetorA = new int[10];
    int par = 0;
    int impar = 0;
    int percentPar = 0;
    int percentImpar = 0;
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + (i + 1));
      vetorA[i] = ler.nextInt();
      if (vetorA[i] % 2 == 0) {
        par++;
        percentPar = (par * 100) / vetorA.length;
      } else {
        impar++;
        percentImpar = (impar * 100) / vetorA.length;
      }
    }
    System.out.println("Pares  :" + percentPar + "%");
    System.out.println("Impares:" + percentImpar + "%");
  }
}
