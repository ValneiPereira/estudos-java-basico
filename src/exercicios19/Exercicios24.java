package exercicios19;

import java.util.Scanner;

public class Exercicios24 {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetorA = new int[10];
    
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com numero na posicao" + i);
      vetorA[i] = ler.nextInt();
    }
    boolean palindromo = true;
    for (int i = 0; i < vetorA.length; i++) {
      if(vetorA[i] != vetorA[vetorA.length-1-i]) {
        palindromo=false;
        break;
      }
    }
    System.out.print("Vetor A =");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i]+" ");
    }
    System.out.println();
    if(palindromo) {
      System.out.println("Palindromo");
    }else {
      System.out.println("Não é");
    }
  }
  
}
