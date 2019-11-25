package exercicios16e17;

import java.util.Scanner;

public class Exercicio13 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite base");
    int base=ler.nextInt();
    
    System.out.println("Digite potencia");
    int pote=ler.nextInt();
    
    int resultado=base;
    for (int i = 1; i < pote; i++) {
      resultado*=base;
    }
    System.out.println("Resultado: "+ resultado);
  }

}
