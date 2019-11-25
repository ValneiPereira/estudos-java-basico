package exercicios16e17;

import java.util.Scanner;

public class Exercicio07 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num;
    int maior= -1;
    for (int i = 0; i < 5; i++) {
      System.out.println("Entre com numero");
      num=ler.nextInt();
      if(num>maior) {
        maior=num;
        System.out.println("Numero mudou: "+maior);
      }
    }
    System.out.println("Maior: "+maior);
  }

}
