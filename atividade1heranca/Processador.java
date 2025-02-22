package atividade1heranca;

public class Processador extends Computador {
private double frequencia;

public Processador(String marca, String modelo, double frequencia) {
    super(marca, modelo);
    this.frequencia = frequencia;
}

public double getFrequencia() {
    return frequencia;
}

public void setFrequencia(double frequencia) {
    this.frequencia = frequencia;
}

@Override
public String toString() {
    return "Processador [marca=" + marca + ", frequencia=" + frequencia + ", Modelo=" + Modelo + "]";
}


}
