package exercicios13e14;

import java.util.Scanner;

public class Exercicio12 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite sua altura");
    double altura = ler.nextDouble();
    double peso= (72.7 *altura)-58;
    System.out.println("Seu peso ideal é´:"+peso);

  }

}
