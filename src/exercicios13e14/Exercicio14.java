package exercicios13e14;

import java.util.Scanner;

public class Exercicio14 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o tamanho do arquivo para download em MB");
    double tamanho = ler.nextDouble();
    System.out.println("Informe a velocidade do link en Mbps");
    double link = ler.nextDouble();
    double velocidade = tamanho*8;
    double segundos= velocidade/37.5;
    double minutos= segundos/60;
    System.out.println("O tempo é :"+ minutos+"Min");
    
  }

}
