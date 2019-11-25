package exercicios15;

import java.util.Scanner;

/*Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar: 
O A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 
O a mensagem "Reprovado", se a média for menor do que sete; 
O A mensagem "Aprovado com Distinção", se a média for igual a dez.*/ 
public class Exercicio05 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Entre com primeira nota");
    double nota1=ler.nextDouble(); 
    
    System.out.println("Entre com segunda nota");
    double nota2=ler.nextDouble();
    
    double media =(nota1+nota2)/2;
    
    if(media==10){
      System.out.println("Aprovado com distinção");
    } else if(media>=7){
      System.out.println("Aprovado");
    }else {
     System.out.println("Reprovado");
    }

  }

}
