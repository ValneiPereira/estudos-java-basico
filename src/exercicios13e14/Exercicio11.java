package exercicios13e14;

import java.util.Scanner;

public class Exercicio11 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Dgite 2 numeros inteiros na seguida");
    int n1 = ler.nextInt();
    int n2 = ler.nextInt();
    System.out.println("Dgite 1 numero real na seguida");
    double nreal= ler.nextDouble();
    double r1= n1*2*(n2/2);
    System.out.println("o produto do dobro do primeiro com metade do segundo:  "+ r1);
    double r2 = n1 * 3 + nreal;
    System.out.println("a soma do triplo do primeiro com o terceiro:" + r2);
    double r3= Math.pow(nreal, 3);
    System.out.println("o terceiro elevado ao cubo:"+ r3);
    
    
  }

}



