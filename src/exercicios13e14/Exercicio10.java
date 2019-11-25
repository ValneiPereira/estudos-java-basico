package exercicios13e14;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio10 {

  
      public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite grau Celsius");
        BigDecimal c = ler.nextBigDecimal();
        BigDecimal fi;
        BigDecimal nove = BigDecimal.valueOf(9);
        BigDecimal cinco = BigDecimal.valueOf(5);
        BigDecimal trintadois = BigDecimal.valueOf(32);
        
        fi= c.multiply(nove);
        fi= fi.divide(cinco,25, RoundingMode.DOWN);
        fi= fi.add(trintadois);
        
            
        
        //f= (c*9/5)+32;
        System.out.println("A temperaura é "+fi+"°C" );

      }

    

  }


