package heranca_revisao;

public class Motoboy extends Funcionario {
 private String placaMoto;

    public Motoboy(String nome, String dataNascimento, double cpf, double salarioBase, String placaMoto) {
        super(nome, dataNascimento, cpf, salarioBase);
        this.placaMoto = placaMoto;
    }
    public String getPlacaMoto() {
        return placaMoto;
    }
    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }
    public double obterSalarioFinal() {
        return super.getSalarioBase();
    }
public String toString(){
    return super.toString()+
    "\nPlaca da moto: " + placaMoto;
}

}
