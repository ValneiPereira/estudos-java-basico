package exercicios13e14;

import java.util.Scanner;

public class Exercicio06 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a area do Circulo em metros");
    double r = ler.nextDouble();
    double pi = 3.14;
    double a = pi*(r*r);
    
    System.out.println("Valor da ara é  " +a+ " m²");

  }

}
