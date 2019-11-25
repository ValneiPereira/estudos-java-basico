package exercicios25_3;

public class Aluno {
  String nome;
  String matricula;
  String curso;
  String [] disciplina =new String[3];
  double[] [] notas = new double[3][4];
  boolean situacao;
  double media;
  
  void mostrarInfo() {
    System.out.println("Nome: "+nome);
    System.out.println("Matriculo: "+matricula);
    System.out.println("Nome do curso: "+nome);
    for (int i = 0; i < notas.length; i++) {
      System.out.println("Notas das disciplinas: "+ disciplina[i]);
      for (int j = 0; j < notas[i].length; j++) {
        System.out.print(notas[i][j]+" ");
      }
      System.out.println();
    }
  }
   
  
  boolean isAprovado(int n1, int n2, int n3) {
    
    media= (n1+n2+n3)/3;
    if(media>=7) {
      situacao=true;
      System.out.println("Aprovado");
    }else {
      situacao=false;
      System.out.println("Reprovado");
    }
    return situacao;
  }

}
