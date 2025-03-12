 package heranca_revisao;

public class Gerente extends CargoDeConfianca implements Contratacao {

    public Gerente(String nome, String dataNascimento, double cpf, double salarioBase, Bonificacao bonificacao) {
        super(nome, dataNascimento, cpf, salarioBase, bonificacao.GERENTE);
    }

    
    public String toString(){
        return super.toString() + "\n"
                + "Bonificacao: " + super.getBonificacao().getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionario: " + funcionario.getNome());
    }
   
    @Override
    public double obterSalarioFinal() {
        return super.getSalarioBase() * super.getBonificacao().getValor();
    }

    
}
