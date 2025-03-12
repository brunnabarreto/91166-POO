package heranca_revisao;

public abstract class Funcionario  implements SalarioFinal {
    protected String nome;
    protected String dataNascimento;
    protected double cpf;
    private double salarioBase;
    
    public Funcionario(String nome, String dataNascimento, double cpf, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cpf=" + cpf +
                ", salarioBase=" + salarioBase +
                '}';
    }
}