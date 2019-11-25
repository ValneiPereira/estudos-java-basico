package exercicios16e17;

import java.util.Scanner;

public class Exercicio08 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numero;
    int soma=0;
    double media;
    
    for (int i = 0; i < 5; i++) {
      System.out.println("Digte um numero");
      numero=ler.nextInt();
      soma +=numero;
      
    }
    media=soma/5;
    System.out.println("Soma:"+soma+"|media:"+media);
  }

}
