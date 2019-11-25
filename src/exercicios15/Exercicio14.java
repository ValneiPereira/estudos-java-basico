package exercicios15;

import java.util.Scanner;

public class Exercicio14 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite 1ª nota");
    double n1=ler.nextInt();
    
    System.out.println("Digite 2ª nota");
    double n2=ler.nextInt();
    
    System.out.println("Digite 3ª nota");
    double n3=ler.nextInt();
    
    System.out.println("Digite 4ª nota");
    double n4=ler.nextInt();
    
    double media= (n1+n2+n3+n4)/4;
    String conceito="";
    
    if(media >=9 && media <=10) {
      conceito ="A";      
    }else if(media >=7.9 && media<9.0) {
      conceito ="B";
    }else if(media >=6.0 && media<7.5) {
      conceito ="C";
    }else if(media >=4.0 && media<6.0) {
      conceito ="D";
    }else if(media >=0.0 && media<4.0) {
      conceito ="E";
    }
    System.out.println("Sua notas : |1ªnota:"+n1+  "|2ªnota:"+n2+"|3ªnota:"+n3+ "|4ªnota:"+n4);
    System.out.println("Voce foi:"+conceito);
    switch(conceito) {
      case "A":
      case "B":
      case "C":System.out.println("Aprovado");break;
      case "D":
      case "E":System.out.println("Reprovado");break;
    }
    
  }
}