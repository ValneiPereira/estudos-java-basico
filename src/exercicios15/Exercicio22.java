package exercicios15;

import java.util.Scanner;

public class Exercicio22 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Entre com a quantidade de kg de morando");
    double qtdMorango = ler.nextDouble();
    
    System.out.println("Entre com a quantidade de kg de maça");
    double qtdMaca = ler.nextDouble();
    
    double precoKgMor=0;
    double precoKgMac=0;
    
    if(qtdMorango<=5) {
      precoKgMor= 2.5;
    }else {
      precoKgMor=2.2;
    }
    if(qtdMaca<=5) {
      precoKgMac= 1.8;
    }  else {
      precoKgMac= 1.5;
    }
    double precoTotalMorango = qtdMorango*precoKgMor;
    double precoTotalMaca= qtdMaca*precoKgMac;
    double parcial= precoKgMac+precoKgMor;
    double precoTotal= parcial; 
    if((qtdMorango+qtdMaca>8) ||parcial>25){
        precoTotal= parcial-((parcial/100)*10);
    } 
    System.out.println("Preco total "+ precoTotal); 
    System.out.println("Preco total morango R$:"+ precoTotalMorango+" preco total maca R$:"+precoTotalMaca);
   }

 }

