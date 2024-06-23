

// Classe Aluguel
class Aluguel {
    private Carro carroAlugado;
    private Cliente cliente;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorTotal;

    public Aluguel(Carro carroAlugado, Cliente cliente, LocalDate dataInicio, LocalDate dataTermino) {
        this.carroAlugado = carroAlugado;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorTotal = calcularValorAluguel();
    }

    // Getters e Setters
    public Carro getCarroAlugado() {
        return carroAlugado;
    }

    public void setCarroAlugado(Carro carroAlugado) {
        this.carroAlugado = carroAlugado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Funções adicionais
    public double calcularValorAluguel() {
        // Lógica para calcular o valor total do aluguel com base no período e características do carro
        int dias = (int) dataInicio.until(dataTermino).getDays();
        return carroAlugado.calcularCustoAluguel(dias);
    }

    public boolean verificarDisponibilidade() {
        return carroAlugado.isDisponivel();
    }
}
