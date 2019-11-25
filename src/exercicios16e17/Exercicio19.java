package exercicios16e17;

import java.util.Scanner;

public class Exercicio19 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite quantidades de notas");
    int notas=ler.nextInt();
    
    double soma=0;
    double media;
    double nota;
    
    for (int i = 0; i <notas; i++) {
      System.out.println("digite a "+(i+1)+"ª nota" );
      nota=ler.nextDouble();
      
      soma +=nota;
    }
    media=soma/notas;
    System.out.println("Soma: "+soma);
    System.out.println("Media: "+media);
    
    
  }

}
