package exercicios13e14;

import java.util.Scanner;

public class Exercicio07 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a altura do quadrado em metros");
    double altura = ler.nextDouble();
    
    System.out.println("Digite a largura do quadrado em metros");
    double largura = ler.nextDouble();
    
    double area = (altura*largura)*2;
    
    
    System.out.println("O dobro da area é  " +area+ " m²");


  }

}
