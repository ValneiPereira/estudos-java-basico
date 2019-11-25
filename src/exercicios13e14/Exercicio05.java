package exercicios13e14;

import java.util.Scanner;

public class Exercicio05 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double cm;
    double conversao;
    System.out.println("Favor digite metro para ser convertido");
    double metro = ler.nextDouble();
    
    conversao = metro * 100;
    System.out.println("A conversao deu "+ conversao + "Cm");

  }

}
