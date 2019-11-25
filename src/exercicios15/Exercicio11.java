package exercicios15;

import java.util.Scanner;

public class Exercicio11 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Favor digitar o seu salario");
    double salario=ler.nextDouble();
    double aumento;
    double nSalario;
    int reajuste=0;
    if(salario <=280) {
      reajuste=20;      
    }else if(salario>280 && salario<=700) {
      reajuste=15;
    } else if(salario >700 && salario<=1500) {
      reajuste=10;
    }else if(salario >1500) {
      reajuste=5;
    }
    aumento = (salario* reajuste)/100;
    nSalario = salario+aumento;
    System.out.println("Salario antes do reajuste: "+salario);
    System.out.println("Voce recebeu um reajuste de "+reajuste + "%" +"("+aumento+")"+ " e seu novo salario é de: "+nSalario);
    
 }
}