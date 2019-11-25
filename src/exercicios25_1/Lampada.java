package exercicios25_1;

public class Lampada {
  String marca;
  String tipo;
  String voltagem;
  int potencia;
  double preco;
  boolean ligado =false;
  
   public boolean testeLigar(int status) {
     if( status ==1) {
       ligado = true;
       System.out.println("Lampada esta ligada !!!");
     }else if(status ==0) {
       ligado = false;
       System.out.println("Lampada esta desligada :(");
     }
    return ligado;
    
  }

}
