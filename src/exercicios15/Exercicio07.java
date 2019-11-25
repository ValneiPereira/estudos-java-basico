package exercicios15;

import java.util.Scanner;
//Faça um Programa que leia três números e mostre o maior e o menor deles
public class Exercicio07 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Entre com primeiro numero");
    int num1=ler.nextInt();
    
    System.out.println("Entre com segundo numero");
    int num2 =ler.nextInt();
    
    System.out.println("Entre com terceiro numero");
    int num3 =ler.nextInt();
    
    if(num1<=num2 && num1<= num3) {
      System.out.println("num1 é menor"+ num1);
    }else if (num2<=num1 && num2<= num3) {
      System.out.println("num2 é menor"+ num2);
    }else if (num3<=num1 && num3<= num2) {
      System.out.println("num3 é menor"+ num3);
        
    }

  }
}