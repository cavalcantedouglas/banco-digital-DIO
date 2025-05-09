import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return new ArrayList<>(contas);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.printf("Agencia: %d | Número: %d | Saldo: %.2f%n",
                    conta.getAgencia(), conta.getNumero(), conta.getSaldo());
        }
    }
}
