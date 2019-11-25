package exercicios13e14;

import java.util.Scanner;

public class Exercicio13 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Quanto voce ganha por hora");
    double valorHora = ler.nextDouble();
    System.out.println("Quantas horas voce trabalha por mes");
    
    double hTrabalhadas= ler.nextDouble();
    double salarioBT = valorHora*hTrabalhadas;
    double inss= (salarioBT*8)/100; 
    double sindicato= (salarioBT*5)/100;
    double ir= (salarioBT*11)/100;
    double desc= inss+sindicato+ir;
    double saloqid= salarioBT - desc;
    
    
    System.out.println("Seu salario bruto é :"+ salarioBT);
    System.out.println("Seu imposto de redenda é:"+ir);
    System.out.println("Seu inss é :" +inss);
    System.out.println("Seu sindicato é:" +sindicato);
    System.out.println("Seu salario liquido é :"+ saloqid);
    
    

  }
  }


