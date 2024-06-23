import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// Classe Cliente
class Cliente {
    private String nome;
    private String CPF;
    private String telefone;
    private String email;
    private ArrayList<Aluguel> historicoAlugueis;

    public Cliente(String nome, String CPF, String telefone, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.historicoAlugueis = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Aluguel> getHistoricoAlugueis() {
        return historicoAlugueis;
    }

    // Funções adicionais
    public void adicionarAluguel(Aluguel aluguel) {
        historicoAlugueis.add(aluguel);
    }

    public double calcularDesconto() {
        // Lógica para calcular descontos aplicáveis ao cliente
        return 0.1; // Exemplo: 10% de desconto para todos os clientes
    }
}