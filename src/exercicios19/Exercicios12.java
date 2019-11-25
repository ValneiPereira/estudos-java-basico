package exercicios19;

import java.util.Scanner;

public class Exercicios12 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int []vetorA=new int[5];
    
    int soma =0;
    
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: "+(i+1));
      vetorA[i]=ler.nextInt();
      soma += vetorA[i] ;
    }
    System.out.println("Soma é:  "+ soma);
  }
}
    
    
    

