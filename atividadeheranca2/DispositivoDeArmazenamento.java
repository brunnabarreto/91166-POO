package atividadeheranca2;

public class DispositivoDeArmazenamento extends Produto {
private double CapacidadeDeArmazenamento;
private String tipoDeConexao;
public DispositivoDeArmazenamento(String marca, String modelo, double capacidadeDeArmazenamento, String tipoDeConexao) {
    super(marca, modelo);
    CapacidadeDeArmazenamento = capacidadeDeArmazenamento;
    this.tipoDeConexao = tipoDeConexao;
}
public double getCapacidadeDeArmazenamento() {
    return CapacidadeDeArmazenamento;
}
public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
    CapacidadeDeArmazenamento = capacidadeDeArmazenamento;
}
public String getTipoDeConexao() {
    return tipoDeConexao;
}
public void setTipoDeConexao(String tipoDeConexao) {
    this.tipoDeConexao = tipoDeConexao;
}
@Override
public String toString() {
    return "DispositivoDeArmazenamento [Marca=" + Marca + ", CapacidadeDeArmazenamento=" + CapacidadeDeArmazenamento
            + ", modelo=" + modelo + ", tipoDeConexao=" + tipoDeConexao + "]";
}

}
