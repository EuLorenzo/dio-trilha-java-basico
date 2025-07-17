public class Main {
    public static void main(String[] args) {
        Cliente ronaldo = new Cliente();
        ronaldo.setNome("Venilton");

        Conta cc = new ContaCorrente(ronaldo);
        Conta poupanca = new ContaPoupanca(ronaldo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}