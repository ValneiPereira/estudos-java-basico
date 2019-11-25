package exercicios16e17;

import java.util.Scanner;

public class Exercicio30 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a tabuada quer ver:");
    int n=ler.nextInt();
    int inicio,fim;
    boolean valido =true;
    do {
      
      System.out.println("Entre com o inicio");
      inicio=ler.nextInt();
      
      System.out.println("Entre com o final da tabuada");
      fim=ler.nextInt();
      
      if (fim>inicio) {
        valido = false;
      }
    } while (valido);
    System.out.println("Tabuada "+n+":");
    System.out.println("Comecar por "+inicio);
    System.out.println("Terminar em: "+fim);
    System.out.println();
    
      for (int i = inicio; i <=fim ; i++) {
      System.out.println(n+"X"+i+"="+(n*i));
      
    }
    
  }

}
