package atividade1heranca;

public  class  Memoria extends Computador {


private String capacidadeDeArmazenamento;

public Memoria(String marca, String modelo, String capacidadeDeArmazenamento) {
    super(marca, modelo);
    this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
}

public String getCapacidadeDeArmazenamento() {
    return capacidadeDeArmazenamento;
}

public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
    this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
}

@Override
public String toString() {
    return "Memoria [marca=" + marca + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + ", Modelo=" + Modelo
            + "]";
}
 

}
