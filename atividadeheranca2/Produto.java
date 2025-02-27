package atividadeheranca2;

public abstract class Produto {
 protected String Marca;
 protected String modelo;
public Produto(String marca, String modelo) {
    Marca = marca;
    this.modelo = modelo;
}
public String getMarca() {
    return Marca;
}
public void setMarca(String marca) {
    Marca = marca;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
@Override
public String toString() {
    return "produto [Marca=" + Marca + ", modelo=" + modelo + "]";
}

 
}
