package exercicios15;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido*/
public class Exercicio03 {

  public static void main(String[] args) {
    
      Scanner ler = new Scanner(System.in);
      System.out.println("Entre com uma letra F ou M");
      String input = ler.next();
      if(input.equalsIgnoreCase("f")){
        System.out.println("F - feminino");
      }else if(input.equalsIgnoreCase("m")){
        System.out.println("M - masculino");
      }else {
        System.out.println("Sexo invalido");
      }
    }

}
