//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Douglas");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cliente.adicionarConta(cc);
        cliente.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(90, poupanca);

        cc.imprimirExtrato();
        System.out.println("============================");
        poupanca.imprimirExtrato();
    }
}