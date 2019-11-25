package exercicios16e17;

import java.util.Scanner;

public class Exercicio22 {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Quandida de cds:");
    int qtdCds=ler.nextInt();
    
    while (qtdCds >6) {
      System.out.println("ALERTA MUITO CDS PARA CALCULAR!!! ");
      System.out.println("Digite novamente ate 6 unidades");
      qtdCds=ler.nextInt();
    }
    double preco;
    double soma=0;
    for (int i = 1; i <=qtdCds ; i++) {
      System.out.println("Valor do "+i+"º cd");
      preco=ler.nextDouble();
      soma +=preco;
    }
    double media = soma/qtdCds;
    System.out.println("Media gasta cada CD R$:"+media);
  }
  
}
