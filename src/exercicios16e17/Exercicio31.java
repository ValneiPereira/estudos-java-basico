package exercicios16e17;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio31 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double salario=1000;
    double percent=1.5;
        
    salario +=(salario/100)*percent;
    
    DecimalFormat formati = new DecimalFormat("###,###.##");
    
    for (int i = 1997; i <=2019; i++) {
       percent *= 2;
       salario +=(salario/100)* percent;
       System.out.println(i+" = "+formati.format(salario)+" - "+percent+"%");
    }
    
    
  }

}
