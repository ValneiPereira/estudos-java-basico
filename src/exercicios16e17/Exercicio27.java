package exercicios16e17;

import java.util.Scanner;

public class Exercicio27 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Entre com  quantidade de temperatura");
    int qtdTemperatura=ler.nextInt();
    double temperatura;
    double soma=0;
    double menor= Double.MAX_VALUE;
    double maior= Double.MIN_VALUE;
    
    for (int i = 1; i <=qtdTemperatura; i++) {
      System.out.println("Temperatura"+i);
      temperatura=ler.nextDouble();
      soma +=temperatura;
      if(temperatura> maior) {
        maior=temperatura;
      }
      if(temperatura<menor) {
        menor=temperatura;
      }
      
    }
    System.out.println("Media"+(soma/qtdTemperatura));
    System.out.println("Menor temperatura:"+menor);
    System.out.println("Maior temperatura:"+maior);
    
  }

}
