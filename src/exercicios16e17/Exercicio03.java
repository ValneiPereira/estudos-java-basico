package exercicios16e17;

import java.util.Scanner;

public class Exercicio03 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite seu nome");
    String nome=ler.next();
    while ((nome.length()<=3)) {
      System.out.println("Nome invalido, digite novamente");
      nome=ler.next();
    }    
    System.out.println("Digite sua idade");
    int idade=ler.nextInt();
    while(idade < 0 ||idade> 150) {
      System.out.println("Idade invalida, digite novamente");
      idade=ler.nextInt();
    }    
    System.out.println("Digite seu salario");
    double salario=ler.nextDouble();
    while(salario<=0) {
      System.out.println("Salario invalido, digite novamente");
      salario=ler.nextDouble();
    }
    System.out.println("Digite seu sexo");
    String sexo=ler.next();
    while(!(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M"))) {
      System.out.println("Sexo invalido, digite novamente");
      sexo=ler.next();
    }
    System.out.println("Estado civil");
    String estadoCivil=ler.next();
    while(!(((estadoCivil.equalsIgnoreCase("S") || 
              estadoCivil.equalsIgnoreCase("C"))|| 
              estadoCivil.equalsIgnoreCase("V"))|| 
              estadoCivil.equalsIgnoreCase("D"))){
    System.out.println("Estado civil invalido, favor digitar novamente");
    estadoCivil=ler.next();
    }
    System.out.println("Nome : "+nome +" |"+idade+"anos |"+ " salario: R$"+salario+ "| sexo: "+sexo+"| estado civil: "+estadoCivil);
    
   }

}
