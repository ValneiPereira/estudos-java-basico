package exercicios19;

import java.util.Scanner;

public class Exercicios10 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int []vetorA=new int[4];
    int []vetorB=new int[vetorA.length];
    
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: "+(i+1));
      vetorA[i]=ler.nextInt();
      vetorB[i]= vetorA[i] % 2;
      
    }
    System.out.println("Vetor A=");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println(vetorA[i]+"");
      
    }
    System.out.println();
    
    System.out.println("Vetor B=");
    
    for (int i = 0; i < vetorB.length; i++) {
      if(vetorB[i] == 0) {
        System.out.println(vetorA[i]+" É par");
      }else {
        System.out.println(vetorA[i]+" Não impar");
      }
      //System.out.println(+vetorB[i]+"");
      
    }
    System.out.println();

  }
}
