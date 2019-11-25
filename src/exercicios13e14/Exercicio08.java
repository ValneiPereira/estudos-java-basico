package exercicios13e14;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio08 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Quanto voce ganha por hora");
    BigDecimal valorHora = ler.nextBigDecimal();
    System.out.println("Quantas horas voce trabalha por mes");
    BigDecimal hTrabalhadas= ler.nextBigDecimal();
    
    BigDecimal salario = valorHora.multiply(hTrabalhadas); 
    
    System.out.println("Seu salario é "+ salario);

  }

}
