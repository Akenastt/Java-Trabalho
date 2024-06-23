import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.ArrayList;

// Classe Pagamento
class Pagamento {
    private String metodo;
    private double valor;
    private LocalDate data;

    public Pagamento(String metodo, double valor, LocalDate data) {
        this.metodo = metodo;
        this.valor = valor;
        this.data = data;
    }

    // Getters e Setters
    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // Funções adicionais
    public void processarPagamento() {
        // Lógica para processar o pagamento da transação
        System.out.println("Pagamento processado com sucesso.");
    }

    public String gerarRecibo() {
        // Lógica para gerar um recibo para o pagamento realizado
        return "Recibo gerado com sucesso.";
    }
}

