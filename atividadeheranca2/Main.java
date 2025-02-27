package atividadeheranca2;

import atividade1heranca.PlacaMae;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD"    , "ryzen", 330);
        PlacaMae PlacaMae1 = new PlacaMae("AMD", "XVM", "bbb");

        System.out.println(processador1.toString());
        System.out.println(PlacaMae1.toString());
    }
}
