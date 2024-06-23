import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.ArrayList;

// Classe Manutencao
class Manutencao {
    private Carro carro;
    private String tipoServico;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

    public Manutencao(Carro carro, String tipoServico, LocalDate dataInicio, LocalDate dataTermino) {
        this.carro = carro;
        this.tipoServico = tipoServico;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    // Getters e Setters
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
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
    public void registrarManutencao() {
        // Lógica para registrar a manutenção realizada em um carro específico
        System.out.println("Manutenção registrada para o carro " + carro.getModelo());
    }

    public double calcularCustoReparo() {
        // Lógica para calcular os custos de reparo associados à manutenção
        return 500.0; // Exemplo simples: R$500,00 de custo de reparo
    }
}