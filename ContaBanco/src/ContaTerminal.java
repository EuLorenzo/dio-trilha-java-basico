import java.util.Scanner;

public class ContaTerminal {
    private int number;
    private String agency;
    private String name;
    private float cash;

    public void setNumber(Scanner s) {
        System.out.println("Digite o número da conta: ");
        this.number = s.nextInt();
    }

    public int getNumber(){
        return this.number;
    }

    public void setAgency(Scanner s) {
        System.out.println("Digite a agência: ");
        this.agency = s.nextLine();
    }

    public String getAgency() {
        return this.agency;
    }

    public void setName(Scanner s){
        System.out.println("Digite o seu nome: ");
        this.name=s.nextLine();
    }

    public String getName(){
        return this.name;
    }

    public void setCash(Scanner s){
        System.out.println("Digite o saldo: ");
        this.cash=s.nextFloat();
    }

    public float getCash(){
    
    
        return this.cash;
    }

    public void showData(){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", name, agency, number, cash);
    }
}
