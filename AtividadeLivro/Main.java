package AtividadeLivro;

public class Main {

    public static void main(String[] args) {
        
        Livro  livro = new Livro();

   livro.setTitulo("vampires");
   livro.setAutor("Brunna Barreto!");
   livro.setPaginas(366);
   livro.setPreco(45);

   System.out.println("Titulo: " + livro.getTitulo());
   System.out.println("Autor: " +  livro.getAutor());
   System.out.println("Paginas: " + livro.getPaginas());
   System.out.println("Preco: " + livro.getPreco());
   
   Livro livro2 = new Livro();

   livro2.setTitulo("O mundo das princesas");
   livro2.setAutor("Rosangela Santos!");
   livro2.setPaginas(550);
   livro2.setPreco(45);
   
   System.out.println("Titulo: " + livro.getTitulo());
   System.out.println("Autor: " +  livro.getAutor());
   System.out.println("Paginas: " + livro.getPaginas());
   System.out.println("Preco: " + livro.getPreco());
   
   }
   }



