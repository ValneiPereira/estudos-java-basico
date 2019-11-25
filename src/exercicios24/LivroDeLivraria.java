package exercicios24;

public class LivroDeLivraria {

  public static void main(String[] args) {
    Livro livro = new Livro();
    livro.nome= "Use a cabeça Java";
    livro.editora= "AltaBooks";
    livro.autor="Kathy Sierra";
    livro.qtdPaginas= 800;
    livro.preco=120; 
    
    System.out.println("O livro que esta a venda é :"+livro.nome);
    System.out.println("Editora :"+livro.editora);
    System.out.println("Autor :"+livro.autor);
    System.out.println("Preço : R$ "+livro.preco);
    

  }

}
