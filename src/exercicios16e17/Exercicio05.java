package exercicios16e17;

import java.util.Scanner;

public class Exercicio05 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int cont=0;
    
    System.out.println("Informe populaçao 'A'");
    int poA=ler.nextInt();
    while (poA<=0) {
      System.out.println("Populacao precisa ser maior que ZERO");
      poA=ler.nextInt();
    }
    System.out.println("Informe a taxa de crescimento A");
    double taxA=ler.nextDouble();
    while (taxA<=0) {
      System.out.println("Taxa precisa ser maior que ZERO");
      taxA=ler.nextDouble();
    }
    
    System.out.println("Informe populaçaoo 'B'");
    int poB=ler.nextInt();
    while (poB<=0) {
      System.out.println("Populaçao precisa ser maior que ZERO");
      poB=ler.nextInt();
    }
    System.out.println("Informe a taxa de crescimento B");
    double taxB=ler.nextDouble();
    while (taxB<=0) {
      System.out.println("Taxa precisa ser maior que ZERO");
      taxB=ler.nextDouble();
    }
    while (poA<poB) {
      poA +=(poA/100)*taxA;
      poB +=(poB/100)*taxB;
      cont++;
    }
    System.out.println("Populacao A: "+poA);
    System.out.println("Populacao B: "+poB);
    System.out.println("Anos:" +cont);
    
  }
}