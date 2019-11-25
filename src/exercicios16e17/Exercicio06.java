package exercicios16e17;

import java.util.Scanner;

public class Exercicio06 {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String cont="";
    do {
      System.out.println("Escola a sua impressao V ou H");
      String letra=ler.next();
      
      while (!(letra.equalsIgnoreCase("V")|| letra.equalsIgnoreCase("H"))) {
        System.out.println("Use as letras V para vertical ou H para horizontal");
        letra=ler.next();
      }     
      if(letra.equalsIgnoreCase("H")) {
        for(int i=1; i<=20; i++) {
          System.out.print(i+" ");
        }
      }
      if(letra.equalsIgnoreCase("V")) {
        for(int i=1; i<=20; i++) {
          System.out.println(i+" ");
        }
      }
      System.out.println("Deseja continuar? S ou N");
      cont=ler.next();
    } while (cont.equalsIgnoreCase("S"));
    System.out.println("FIM");    
  }
}
