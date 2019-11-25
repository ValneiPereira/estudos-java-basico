package exercicios15;

import java.util.Scanner;

public class Exercicio15 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe os lados do seu triangulo");
    int l1=ler.nextInt();
    int l2=ler.nextInt();
    int l3=ler.nextInt();
    if(l1>(l2+l3) || l2>(l1+l3) || l3>(l1+l2)) {
      System.out.println("Não pode ser um triangulo"); 
    }else if(l1==l2  && l2==l3  && l1==l3) {
      System.out.println("Triangulo eqüilátero");
      
    }else if(l1==l2 || l1== l3 ||l2 ==l3) {
      System.out.println("Triangulo Isóscelos");
    }else {
      System.out.println("Triangulo Escaleno");
    }
    
  }


}
