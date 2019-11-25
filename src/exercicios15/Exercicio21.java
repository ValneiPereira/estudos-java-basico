package exercicios15;

import java.util.Scanner;

public class Exercicio21 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o tipo de combustivel: A-álcool, G- gasolina");
    String combustivel = ler.next();
    if (combustivel.equalsIgnoreCase("A")|| combustivel.equalsIgnoreCase("G") ) {
     
    System.out.println("Quantidade de litros");
    double litros = ler.nextDouble();
    double precoTotal=0;
    double precoDesc = 0;
    double desconto = 0;
    double precoGas = 2.50;
    double precoAl = 1.90;
    

    if (combustivel.equalsIgnoreCase("A")) {
        combustivel = "Alcool";
        precoTotal = precoAl * litros;
        if (litros <= 20) {
            desconto = ((precoAl * litros) * 3) / 100;
            precoDesc = precoTotal - desconto;
        } else if (litros > 20) {
            desconto = ((precoAl * litros) * 5) / 100;
            precoDesc = precoTotal - desconto;
      }       
    }
    if (combustivel.equalsIgnoreCase("G")) {
      combustivel = "Gasolina";
      precoTotal = precoGas * litros;
      if (litros <= 20) {
          desconto = ((precoGas * litros) * 4) / 100;
          precoDesc = precoTotal - desconto;
         } else if (litros > 20) {
           desconto = ((precoGas * litros) * 6) / 100;
           precoDesc = precoTotal - desconto;
         }
    }
    System.out.println("Combustivel: " + combustivel + "|valor é: R$" + precoTotal +" |com desconto: R$"+precoDesc+ " |Qtd litros: " + litros + "L" + " |Desconto de: R$" + desconto);
  }else {
    System.out.println("Combustivel errado");
  }
}
}