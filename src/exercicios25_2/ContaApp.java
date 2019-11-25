package exercicios25_2;

import java.util.Scanner;

public class ContaApp {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    ContaCorrente conta = new ContaCorrente();
    conta.agencia = "0159";
    conta.numero = "76316-8 ";
    conta.saldo = 500;
    int opcao;
    conta.limite= 500;
    conta.especial=true;
    String sair = "";
    
    System.out.println("Conta corrente AG: " + conta.agencia + " numero: " + conta.numero);

    do {
      System.out.println("Escolha uma opção para sua conta:");
      System.out.println("1-saldo 2-sacar 3-deposito");
      opcao = ler.nextInt();
      
      switch (opcao) {
        case 1: conta.conultaSaldo(); break;
        case 2: System.out.println("Digite o valor para saque");
          boolean sacar = conta.realizarSaque(ler.nextDouble());
          conta.conultaSaldo();break;
          
        case 3: System.out.println("Digite o valor para deposito");
        boolean deposito = conta.depositar(ler.nextDouble());
        conta.conultaSaldo();break;  
        
        case 4: conta.conultaSaldo(); break;
          
        

        default: System.out.println("Digitou numero errado");
      }
      System.out.println("Deseja continuar? S ou N");
      sair=ler.next();
    } while (sair.equalsIgnoreCase("S"));
    System.out.println("FIM");
    
  }
}
