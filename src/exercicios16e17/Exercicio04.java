package exercicios16e17;

import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int poA=80000;
    int poB=200000;
    int cont=0;
    
    while (poA<poB) {
      poA +=(poA/100)*3;
      poB +=(poB/100)*1.5;
      cont++;
    }
    System.out.println("População A: "+poA);
    System.out.println("População B: "+poB);
    System.out.println("Anos:" +cont);
    
  }

}
