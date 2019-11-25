package exercicios13e14;

import java.util.Scanner;

public class Exercicio03 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Favor digite o 1º numero");
    int numero1 = ler.nextInt();
    System.out.println("Favor digite o 2º numero");
    int numero2 = ler.nextInt();
    int soma= numero1+numero2;
    System.out.println("A soma dos numeros é:" +soma);

  }

}
