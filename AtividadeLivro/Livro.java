package AtividadeLivro;

public class Livro {
private String titulo;
private String Autor;
private int paginas;
private int preco;


public Livro() {
}


public Livro(String titulo, String autor, int paginas, int preco) {
    this.titulo = titulo;
    Autor = autor;
    this.paginas = paginas;
    this.preco = preco;
}


public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getAutor() {
    return Autor;
}
public void setAutor(String autor) {
    Autor = autor;
}
public int getPaginas() {
    return paginas;
}
public void setPaginas(int paginas) {
    this.paginas = paginas;
}
public int getPreco() {
    return preco;
}
public void setPreco(int preco) {
    this.preco = preco;
}

  
}
