import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Cliente (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return new ArrayList<>(contas);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
}

