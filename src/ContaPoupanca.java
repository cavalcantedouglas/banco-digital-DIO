public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Imprimindo Extrato Conta Poupança ====");
        super.imprimirInfosComuns();
    }
}
