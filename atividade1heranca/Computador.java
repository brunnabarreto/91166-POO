package atividade1heranca;

public  abstract class Computador {
 protected String marca;
 protected String Modelo;
public Computador(String marca, String modelo) {
    this.marca = marca;
    Modelo = modelo;

    
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getModelo() {
    return Modelo;
}
public void setModelo(String modelo) {
    Modelo = modelo;
}
}

