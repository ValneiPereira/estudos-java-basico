package exercicios13e14;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio09 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite grau Fahrenheit ");
    BigDecimal celsius;
    BigDecimal entrada = ler.nextBigDecimal();
    
    final BigDecimal trintaEDois = BigDecimal.valueOf(32);
    final BigDecimal cinco = BigDecimal.valueOf(5);
    final BigDecimal nove = BigDecimal.valueOf(9);
    
//    celsius = (f-32)*5/9;
//    celsius = (f.subtract(BigDecimal.valueOf(32))).multiply(BigDecimal.valueOf(5)).divide(BigDecimal.valueOf(9));
    celsius = entrada.subtract(trintaEDois);
    celsius = celsius.multiply(cinco);
    celsius = celsius.divide(nove, 25, RoundingMode.DOWN);

    
    System.out.println("A temperaura é "+celsius+"°C" );

  }

}
