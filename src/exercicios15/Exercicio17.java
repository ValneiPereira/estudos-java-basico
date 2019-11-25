package exercicios15;

import java.util.Scanner;

public class Exercicio17 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe a verificacao do seu ano");
    int ano=ler.nextInt();
    if((ano % 400==0 )||((ano%4==0))&&(ano% 100 !=0)){
      System.out.println("é bissexto!");
    }else {
      System.out.println("Não é");
    }
  }
}