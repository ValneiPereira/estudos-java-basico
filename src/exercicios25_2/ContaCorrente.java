package exercicios25_2;

public class ContaCorrente {
  String  numero;
  String  agencia;
  double  saldo;
  boolean especial;
  double  limite;

  boolean realizarSaque(double valor) {
    if (especial == true) {
      if (saldo - valor >= 0 && valor >= 0) {
        saldo = saldo - valor ;
        return true;
      }
      if(saldo - valor<=0 && valor>=0 && limite>0) {
        limite = limite -valor;
        return true;
      }
      System.out.println("====================");
      System.out.println("Limites estourado!!!");
      return false;
      
    } else if (saldo - valor >= 0 && valor >= 0) {
      saldo = saldo - valor;
      return true;
    }
    System.out.println("Não é possivel realizar saque");
    return false;
  }

  boolean depositar(double valor) {
    if (valor > 0) {
      saldo = saldo + valor;
      return true;
    }
    return false;
  }

  void conultaSaldo() {
    if (especial == true) {
      System.out.println("Seu limite é :" + limite);
    }
    System.out.println("Saldo é:" + saldo);
  }

}