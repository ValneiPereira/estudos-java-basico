package exercicios15;

import java.util.Scanner;

/*Faça um Programa que peça um valor e mostre
na tela se o valor é positivo ou negativo*/
public class Exercicio02 {

  public static void main(String[] args) {

      Scanner ler = new Scanner(System.in);
      System.out.println("Entre com um numero");
      int num= ler.nextInt();
      
      if(num>=0) {
        System.out.println("Numero informado é positivo");
      }else {
        System.out.println("Este numero é negativo");
      }
    }

  }