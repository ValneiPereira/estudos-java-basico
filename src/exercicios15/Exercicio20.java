package exercicios15;

import java.util.Scanner;

public class Exercicio20 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Responda somente S para SIM ou N para NÃO");
    System.out.println("Telefonou para a vitma?");
    String a =ler.next();
    
    System.out.println("Esteve no local do crime?");
    String b =ler.next();
    
    System.out.println("Mora perto da vitma?");
    String c =ler.next();
    
    System.out.println("Devia para a vitma?");
    String d =ler.next();
    
    System.out.println("Ja trabalhou vitma?");
    String e =ler.next();
    int cont=0;
        
     if(a.equalsIgnoreCase("S")) {
       cont++;
     }if(b.equalsIgnoreCase("S")) {
       cont++;
     }if(c.equalsIgnoreCase("S")) {
       cont++;
     }if(d.equalsIgnoreCase("S")) {
       cont++;
     }if(e.equalsIgnoreCase("S")) {
       cont++;
     }
     
     if(cont ==2) {
       System.out.println("Suspeita");
     } if(cont == 3 && cont ==4) {
       System.out.println("Cumplice");
     }if(cont== 5) {
       System.out.println("Assasino");
     }else {
       System.out.println("Inocente");
     }
     System.out.println(cont);

  }

}
