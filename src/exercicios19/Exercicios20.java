package exercicios19;

import java.util.Scanner;

public class Exercicios20 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double[] vetorA =new double[10];
    double cotação;
    
    System.out.println("Informe valor do dolar");
    cotação=ler.nextDouble();
    
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i]=cotação+(i+1);
    }
    System.out.println("Vator A=");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println(vetorA[i]+"");
    }
  }

}
