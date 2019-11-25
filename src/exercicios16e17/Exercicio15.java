package exercicios16e17;

import java.util.Scanner;

public class Exercicio15 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Dgite com o nesimo termo");
    int n=ler.nextInt();
    
    int primeiro=1;
    int segundo=1;
    int proximo;
    
    
    for (int i = 3; i < n; i++) {
      proximo =primeiro+segundo;
      primeiro= segundo;
      segundo=proximo;
      
      System.out.println(proximo);
    }
    
    
  }

}
