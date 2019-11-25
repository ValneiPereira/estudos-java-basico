package exercicios15;

import java.util.Scanner;

public class Exercicio16 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Entre com o valor de a");
    int a = ler.nextInt();
    if (a == 0) {
      System.out.println("Não é equação de sugundo grau");
    }

    System.out.println("Entre com o valor de b");
    int b = ler.nextInt();

    System.out.println("Entre com o valor de c");
    int c = ler.nextInt();

    double delta = (b * b) - (4 * a * c);
    if (delta < 0) {
      System.out.println("delta negativo");
    } else {

      System.out.println("delta" + delta);
      double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
      double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
      System.out.println("x1=" + x1);
      System.out.println("x2=" + x2);

  }

}
}