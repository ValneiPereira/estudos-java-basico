package exercicios19;

import java.util.Scanner;

public class Exercicios13 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int []vetorA=new int[5];
    int cont=0;
    int soma =0;
    
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: "+(i+1));
      vetorA[i]=ler.nextInt();
      if(vetorA[i] %5 ==0) {
        soma += vetorA[i] ;
        cont++;
      }
    }
    System.out.println("Soma é:  "+ soma);
    System.out.println(cont+" numeros multiplo de 5");
  }
}


