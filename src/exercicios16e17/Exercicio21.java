package exercicios16e17;

import java.util.Scanner;

public class Exercicio21 {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Quantas turmas quer calcular:");
    
    int nTurmas=ler.nextInt();
    int nAlunos=0;
    int soma=0;
    boolean tamanhoOK=true;
    
    
    for (int i= 1; i <=nTurmas; i++) {
      tamanhoOK=true;
      do {
        System.out.println("Numeros de alunos da "+i+"ª turma");
        nAlunos = ler.nextInt();
        if(nAlunos<=40) {
          tamanhoOK=false;
          }else {
          System.out.println("Acima da capacidade, digitar novamente");
        }
      }while(tamanhoOK);
      soma += nAlunos;
    }
        double media =soma/nTurmas;
        System.out.println("Media: "+media);
  }
}
