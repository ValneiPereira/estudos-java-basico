package exercicios19;

import java.util.Scanner;

public class Exercicios19 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double[] notas1= new double[10];
    double[] notas2= new double[notas1.length];
    double[] resultados=new double[notas1.length];
    
    for (int i = 0; i < notas1.length; i++) {
      System.out.println("Entre notas 1 do aluno"+(i+1));
      notas1[i]=ler.nextDouble();
      
      System.out.println("Entre notas 2 do aluno"+(i+1));
      notas2[i]=ler.nextDouble();
      
      resultados[i]= (notas1[i]+notas2[i])/2;
      
    }
    System.out.print("Notas 1=");
    for (int i = 0; i < notas1.length; i++) {
      System.out.print(notas1[i]+"");
      
    }
    System.out.println();
    
    System.out.print("Notas 2=");
    for (int i = 0; i < notas2.length; i++) {
      System.out.print(notas2 [i]+"");
      
    }
    System.out.println();
    System.out.println("====_R_e_s_u_l_t_a_d_o====");
    for (int i = 0; i < resultados.length; i++) {
      if(resultados[i]>=7) {
        System.out.println("| "+(i)+" º aluno notas :"+resultados[i]+"-- Aprovado");
      }else {
        System.out.println("| "+(i)+" º aluno notas :"+resultados[i]+"-- Reprovado!!!");
      }
      
    }
    
  }
  

}
