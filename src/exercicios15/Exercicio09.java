package exercicios15;

import java.util.Scanner;

public class Exercicio09 {
/*Faça um Programa que leia três 
números e mostre-os em ordem decrescente.*/
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
      System.out.println("Entre com primeiro numero");
      int num1 =ler.nextInt();
      
      System.out.println("Entre com segundo numero");
      int num2 =ler.nextInt();
      
      System.out.println("Entre com terceiro numero");
      int num3 =ler.nextInt();
      
      if(num1<= num2 && num1<=num3  && num2 <=num3   ) {
        System.out.println(num3+"--"+num2+"--"+num1 );
        
      }else if(num1<= num2 && num1<=num3  && num3 <=num2   ) {
       System.out.println(num2+"--"+num3+"--"+num1 );
       
      }else if(num2<= num1 && num2<=num3  && num3 <=num1   ) {
      System.out.println(num3+"--"+num1+"--"+num2 );
      
      }else if(num3<= num1 && num3<=num2 &&  num1 <=num2   ) {
        System.out.println(num3+"--"+num1+"--"+num2 );
      }

    }

  }
