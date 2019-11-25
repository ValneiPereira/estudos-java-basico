package exercicios16e17;

import java.util.Scanner;

public class Exercicio02 {

  public static void main(String[] args) {
    System.out.println("digite o nome do usuario e senha");
    Scanner ler = new Scanner(System.in);
    String user=ler.next();
    String senha=ler.next();
 
    while ((senha.equalsIgnoreCase(user))){
      System.out.println("usuario invalido");
      System.out.println("Voce digitou user:"+user+" e senha "+senha);
      user=ler.next();
      senha=ler.next();
    }
    System.out.println("Bem vindo");
    
  }
    
}
