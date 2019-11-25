package exercicios15;

import java.util.Scanner;

/*Faça um programa que pergunte o preço de três produtos e 
informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato*/
public class Exercicio08 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Entre com primeiro preço");
    double preco1=ler.nextInt();
    
    System.out.println("Entre com segundo preço");
    double preco2 =ler.nextInt();
    
    System.out.println("Entre com terceiro preco");
    double preco3=ler.nextInt();
    
    if (preco1<= preco2 && preco1 <=preco3) {
      System.out.println("Compre o produto 1");
    }else if (preco2<= preco1 && preco2<= preco3) {
      System.out.println("Compre o produto 2");
    }else if (preco3<= preco1 && preco3<= preco2) {
      System.out.println("Compre o produto 3");
    }
    

  }

}
