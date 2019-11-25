package exercicios15;

import java.util.Scanner;

/*Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.*/ 
public class Exercicio10 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Qual o turno que voce estuda?");
    System.out.println("Digite M para matutino, V- Vespertino ou N- Noturno");
    String turno=ler.next();
    switch(turno) {
      case "m":
      case "M":System.out.println("Bom Dia");break;
      case "v":
      case "V":System.out.println("Boa Tarde!");break;
      case "n":
      case "N":System.out.println("Boa Noite");break;
      default:System.out.println("Voce digitou letra invalida");
      
    }
    

  }

}
