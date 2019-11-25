package exercicios16e17;

import java.util.Scanner;

public class Exercicio25 {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double preco;
    String continuar;
    String saida;
    int qtdProdutos;
    double total;
    double vPago;
    double troco;
    boolean sair=false;
    do {
      System.out.println("Nova compra? S/N");
      continuar=ler.next();
      if(continuar.equalsIgnoreCase("S")) {
        saida="Lojas Tabajara\n";
        
        System.out.println("Digite a quantidade de produtos:");
        qtdProdutos=ler.nextInt();
        total=0;
        
        for (int i = 1; i <=qtdProdutos; i++) {
          System.out.println("Informe preco:"+i);
          preco=ler.nextDouble();
          total +=preco;
          saida +=  "Produto"+i +": R$"+ preco +"\n";
        }
        saida +="Total: R$"+total;
        System.out.println("Total: R$"+total);
        
        System.out.println("Entre com o valor pago");
        vPago=ler.nextDouble();
        
        saida +="Dinheiro: R$"+vPago+"\n";
        troco=total-vPago;
        saida += "Troco:R$"+troco;
        System.out.println(saida);
        
        }else {
        sair=true;
      }
      
    } while (!sair);
    System.out.println("Obrigado pela preferencia");
    
  }
  
}
