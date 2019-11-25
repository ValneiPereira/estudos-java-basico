package exercicios15;

import java.util.Scanner;
//Faça um Programa que verifique se uma letra digitada é vogal ou consoante
public class Exercicio04 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Entre com uma letra");
    String letra= ler.next();
    switch(letra) {
      case "a":
      case "e":
      case "i":
      case "o":
      case "u":
      case "A":
      case "E":
      case "I":
      case "O":
      case "U":System.out.println("Vogal");break;
      default: System.out.println("É uma consoante");break;
        

}
}
  }