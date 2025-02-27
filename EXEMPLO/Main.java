package EXEMPLO;

public class Main {
public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Brunna", 17, "19/05/2007", "PIX");
    Funcionario funcionario1 = new Funcionario("Arthur", 19, "99555", "programador", "1.500");

    System.out.println(cliente1.toString());
    System.out.println(funcionario1.toString());
  
}
}
