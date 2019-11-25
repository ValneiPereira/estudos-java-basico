package exercicios16e17;

import java.util.Scanner;

public class Exercicio20 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Quantidade para calcular:");
    int qtdidade=ler.nextInt();
    int idade;
    int soma=0;
    
    for (int i = 0; i <qtdidade; i++) {
      System.out.println("Entre com a "+(i+1)+"ª idade");
      idade=ler.nextInt();
      soma +=idade;
      
    }
    double media = soma/ qtdidade;
    System.out.println("Media: "+media);
    
    if(media>=0 && media <=25) {
      System.out.println("Jovem");
    }else if(media>=26&& media<=60){
      System.out.println("Adulto");
    }else if(media>60) {
      System.out.println("Idoso");
    }
  }
}
