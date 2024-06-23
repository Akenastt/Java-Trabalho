import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.ArrayList;

// Classe Reserva
class Reserva {
    private Cliente cliente;
    private Carro carroDesejado;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

    public Reserva(Cliente cliente, Carro carroDesejado, LocalDate dataInicio, LocalDate dataTermino) {
        this.cliente = cliente;
        this.carroDesejado = carroDesejado;
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

    public Carro getCarroDesejado() {
        return carroDesejado;
    }

    public void setCarroDesejado(Carro carroDesejado) {
        this.carroDesejado = carroDesejado;
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
    public boolean verificarDisponibilidade() {
        // Lógica para verificar se o carro desejado está disponível para o período solicitado
        return carroDesejado.isDisponivel();
    }

    public void confirmarReserva() {
        // Lógica para confirmar a reserva do carro solicitado pelo cliente
        if (verificarDisponibilidade()) {
            carroDesejado.setDisponibilidade(false);
            System.out.println("Reserva confirmada para o carro " + carroDesejado.getModelo());
        } else {
            System.out.println("Carro não disponível para reserva.");
        }
    }
}
