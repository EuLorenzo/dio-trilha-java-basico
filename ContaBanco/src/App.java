import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        ContaTerminal conta1 = new ContaTerminal();
        System.out.println("--------- Cadastro de conta ---------");
        conta1.setNumber(s);
        conta1.setAgency(s);
        conta1.setName(s);
        conta1.setCash(s);
        conta1.showData();
        s.close();
    }
}
