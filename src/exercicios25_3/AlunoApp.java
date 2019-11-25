package exercicios25_3;

import java.util.Scanner;

public class AlunoApp {

  public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
    System.out.println("Sistema Enem procergs");
    Aluno aluno = new Aluno();
    
    System.out.println("Entre com nome do aluno");
    aluno.nome=ler.next();
    
    System.out.println("Entre com a matricula");
    aluno.matricula=ler.next();
    
    System.out.println("Entre com o nome do curso");
    aluno.curso=ler.next();
    
    for (int i = 0; i < aluno.disciplina.length; i++) {
      System.out.println("Entre com o nome da disciplina: "+i);
      aluno.disciplina[i]= ler.next();
    }
    
    for (int i = 0; i <aluno.notas.length; i++) {
      System.out.println("Entrando com notas das disciplinas: "+ aluno.disciplina[i]);
      for (int j = 0; j < aluno.notas[i].length; j++) {
        System.out.println("Entre com a nota: "+(j+1));
        aluno.notas[i][j]=ler.nextDouble();
      }
      
    }
    aluno.mostrarInfo();
  }

}
