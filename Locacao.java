import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.ArrayList;

// Classe Locacao
class Locacao {
    private Cliente cliente;
    private ArrayList<Carro> carrosAlugados;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

    public Locacao(Cliente cliente, ArrayList<Carro> carrosAlugados, LocalDate dataInicio, LocalDate dataTermino) {
        this.cliente = cliente;
        this.carrosAlugados = carrosAlugados;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Carro> getCarrosAlugados() {
        return carrosAlugados;
    }

    public void setCarrosAlugados(ArrayList<Carro> carrosAlugados) {
        this.carrosAlugados = carrosAlugados;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    // Funções adicionais
    public double calcularPrecoTotal() {
        // Lógica para calcular o preço total da locação baseado nos carros alugados e período
        double precoTotal = 0.0;
        for (Carro carro : carrosAlugados) {
            precoTotal += carro.calcularCustoAluguel((int) dataInicio.until(dataTermino).getDays());
        }
        return precoTotal;
    }

    public void gerenciarStatusPagamento() {
        // Lógica para gerenciar o status de pagamento da locação
        Pagamento pagamento = new Pagamento("Cartão", calcularPrecoTotal(), LocalDate.now());
        pagamento.processarPagamento();
    }
}