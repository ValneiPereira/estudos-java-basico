package exercicios15;

import java.util.Scanner;

public class Exercicio12 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor da sua hora");
    int valHora=ler.nextInt();
    System.out.println("Digite a quantidade de horas trabalhadas");
    int qtdHora=ler.nextInt();
    double salBruto= valHora*qtdHora;
    
    int percentualIR=0;
    
    if(salBruto <=900) {
      percentualIR=0;      
    }else if(salBruto>900 && salBruto<=1500) {
      percentualIR =5;
    } else if(salBruto >1500 && salBruto<=2500) {
      percentualIR=10;
    }else if(salBruto >2500) {
      percentualIR=20;
    }
    
    double ir = (salBruto /100)* percentualIR;
    double inss= (salBruto /100)*10;
    double fgts= (salBruto /100)*11;
    double totalDescontos = ir+inss;
    double saLiquido= salBruto-totalDescontos;
    
    System.out.println("Salario bruto: "+"(" +valHora + " * " +qtdHora+")"+": R$ "+salBruto);
    System.out.println("               "+"(-)" +"IR" +"("+percentualIR+"%"+")"+": R$ "+ir);
    System.out.println("               "+"(-)" +"INSS" +"("+"10%"+")"+": R$ "+inss);
    System.out.println("               "+"(-)" +"FGTS" +"("+"11%"+")"+": R$ "+fgts);
    System.out.println("               "+"Total de descontos: R$"+totalDescontos);
    System.out.println("               "+"Total de descontos: R$"+saLiquido);
    
    

  }

}
