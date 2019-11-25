package exercicios15;

import java.util.Scanner;
//Faça um Programa que peça dois números e imprima o maior deles.
public class Exercicio01 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Entre com o primeiro numero");
    int num1= ler.nextInt();
    System.out.println("Entre com o segundo numero");
    int num2= ler.nextInt();
    
    if(num1> num2) {
      System.out.println("O num1 é maior:"+ num1);
    }else {
      System.out.println("O num2 é maior:"+ num2);
    }
  }

}
