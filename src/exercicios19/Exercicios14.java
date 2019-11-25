package exercicios19;

import java.util.Scanner;

public class Exercicios14 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int []vetorA=new int[5];
    double soma =0;
    int    impar=0;
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: "+(i+1));
      vetorA[i]=ler.nextInt();
      if(vetorA[i] %2 !=0) {
        soma += vetorA[i];
        impar++;
      }else {
        System.out.println("PAR");
      }
    }
    double media= soma/impar;
    System.out.println("Media:"+media);
  }
}