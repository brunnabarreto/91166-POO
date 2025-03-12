package heranca_revisao;

public class Main {

    public static void main(String[] args) {
    Motoboy motoboy = new Motoboy("Joao", "01/01/2000", 123456789, 1000, "ABC1234");
    Gerente gerente = new Gerente("Maria", "01/01/1990", 987654321, 5000, Bonificacao.GERENTE);

    
    System.out.println(motoboy.toString());
    System.out.println(gerente.toString());

    gerente.admitir(motoboy);
    }

}
