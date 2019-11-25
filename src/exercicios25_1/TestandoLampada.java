package exercicios25_1;

import java.util.Scanner;

public class TestandoLampada  {

  public static void main(String[] args) {
    System.out.println("Programa para testar lampada");
    Scanner ler = new Scanner(System.in);
    
    Lampada lampadinha = new Lampada();
    

    lampadinha.marca = "Meia boca";
    lampadinha.tipo = "Vagaba";
    lampadinha.voltagem = "220";
    lampadinha.preco = 10;

    System.out.println("Lampada que voce comprou: ");
    System.out.println("Marca   : " + lampadinha.marca);
    System.out.println("Tipo    : " + lampadinha.tipo);
    System.out.println("Voltagem: " + lampadinha.voltagem);
    System.out.println("Preço   : " + lampadinha.preco);

    System.out.println("========================================");

    System.out.println("Digite 1 para ligada ou 0 para desligada");
    int leitura = ler.nextInt();
     
    while (!(leitura ==0 || leitura==1)) {
      System.out.println("Errado digite novamente ZERO ou UM");
      leitura = ler.nextInt();
    }
    lampadinha.testeLigar(leitura);

  }

}
