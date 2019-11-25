package exercicios19;

import java.util.Scanner;

public class Exercicios11 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int []vetorA=new int[5];
    int []vetorB=new int[vetorA.length];
    int cont =0;
    
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
        cont++;
        System.out.println(vetorA[i]+" é par");
      }else {
        System.out.println(vetorA[i]+" é impar");
      }
    }
    System.out.println();
    
    System.out.println("Quantidade de par:  "+ cont);
  }

}
