package exercicios13e14;

import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Favor digite a 1º nota");
    int n1 = ler.nextInt();
    System.out.println("Favor digite o 2º nota");
    int n2 = ler.nextInt();
    System.out.println("Favor digite o 3º nota");
    int n3 = ler.nextInt();
    System.out.println("Favor digite o 4º nota");
    int n4 = ler.nextInt();
    
    double media= (n1+n2+n3+4) /4; 
    System.out.println("Sua media é :" +media);

  }

}
