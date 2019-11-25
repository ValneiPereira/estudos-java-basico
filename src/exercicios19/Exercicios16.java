package exercicios19;

import java.util.Scanner;

public class Exercicios16 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetorA = new int[10];
    int somaMenor15=0;
    int igual15=0;
    int somaMaior15=0;
    int qtdMaior15=0;
    
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + (i + 1));
      vetorA[i] = ler.nextInt();
      somaMenor15=0;
    }
    for (int i = 0; i < vetorA.length; i++) {
      if(vetorA[i]==15) {
        igual15++;
      }else if(vetorA[i]<15) {
        somaMenor15 +=vetorA[i];
      }else {
        qtdMaior15++;
        somaMaior15 +=vetorA[i];
      }
    }
    System.out.println("Quantida igual a 15 ="+igual15);
    System.out.println("Soma dos numeros a 15 ="+somaMenor15);
    System.out.println("Media dos elementos que sao superiores sao  ="+(double)somaMaior15/qtdMaior15);
    }
    
}
