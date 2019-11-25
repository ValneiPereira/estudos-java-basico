package exercicios19;

import java.util.Scanner;

public class Exercicios17 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetorA = new int[10];
    int superior35 = 0;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite a sua idade: " + (i + 1));
      vetorA[i] = ler.nextInt();
    }
    for (int i = 0; i < vetorA.length; i++) {
      if (vetorA[i] > 35) {
        superior35++;
      }
    }
    System.out.println("Nº de pessoas acima dos 35 anos :" + superior35);
  }

}
