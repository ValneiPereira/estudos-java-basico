package exercicios19;

import java.util.Scanner;

public class Exercicios22 {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetorA = new int[20];
    int qtd0 = 0;
    int qtd1 = 0;
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = (int) Math.round(Math.random() * 1);
      if (vetorA[i] == 0) {
        qtd0++;
      } else {
        qtd1++;
      }
    }
    double percent0 = (qtd0 * 100) / vetorA.length;
    double percent1 = (qtd1 * 100) / vetorA.length;
    System.out.println("Vetor A=");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println(vetorA[i] + " ");
    }
    System.out.println();
    System.out.println("Porcentagem 0 =" + percent0);
    System.out.println("Porcentagem 1 =" + percent1);
  }
  
}
