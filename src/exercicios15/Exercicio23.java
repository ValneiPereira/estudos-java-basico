package exercicios15;

import java.util.Scanner;

public class Exercicio23 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Entre com o tipo da carne");
    System.out.println("1 - file duplo");
    System.out.println("2 - alcatra");
    System.out.println("3 - picanha");
    int tipo = ler.nextInt();
    
    System.out.println("Entre com qtd kg:");
    double qtd=ler.nextDouble();
    double precoKG=0;
    
    if(tipo==1) {
      System.out.println(qtd+"Kg - file duplo ");
      if( qtd<5) {
        precoKG =4.9;
      }else {
        precoKG =5.8;
      }
       
    } else if(tipo==2) {
      System.out.println(qtd+"Kg - alcatra ");
      if( qtd<5) {
        precoKG =5.9;
      }else {
        precoKG =6.8;
      } 
    } else if(tipo==3) {
      System.out.println(qtd+"Kg - picanha ");
      if( qtd<5) {
        precoKG =6.9;
      }else {
         precoKG =7.8;
      }
   
    }
    double total= qtd * precoKG;
    System.out.println(qtd+"Kg * "+precoKG+ "="+ total );
    System.out.println("Feito no cartao? 1 para sim");
    int cartao=ler.nextInt();
    if(cartao== 1) {
      double desconto=(total/100)*5;
      System.out.println("Disconto de:"+ desconto);
      System.out.println("Valor a pagar:"+ (total- desconto ));
    }else{
      System.out.println("Valor a pagar:"+ (total));
    }
  }
}