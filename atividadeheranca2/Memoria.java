package atividadeheranca2;

public class Memoria extends Produto{
private double frequencia;
private double capadidadeDeArmazenamento;

public Memoria(String marca, String modelo, double frequencia, double capadidadeDeArmazenamento) {
    super(marca, modelo);
    this.frequencia = frequencia;
    this.capadidadeDeArmazenamento = capadidadeDeArmazenamento;
}
public void setFrequencia(double frequencia) {
    this.frequencia = frequencia;
}
public double getCapadidadeDeArmazenamento() {
    return capadidadeDeArmazenamento;
}
public void setCapadidadeDeArmazenamento(double capadidadeDeArmazenamento) {
    this.capadidadeDeArmazenamento = capadidadeDeArmazenamento;
}
@Override
public String toString() {
    return "Memoria [Marca=" + Marca + ", frequencia=" + frequencia + ", modelo=" + modelo
            + ", capadidadeDeArmazenamento=" + capadidadeDeArmazenamento + "]";
}


}
