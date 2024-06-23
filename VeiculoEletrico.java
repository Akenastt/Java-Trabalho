// Classe VeiculoEletrico
class VeiculoEletrico extends Carro {
    private double autonomia;
    private double tempoRecarga;

    public VeiculoEletrico(String modelo, String placa, int ano, double quilometragem, double autonomia, double tempoRecarga) {
        super(modelo, placa, ano, quilometragem);
        this.autonomia = autonomia;
        this.tempoRecarga = tempoRecarga;
    }

    // Getters e Setters
    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getTempoRecarga() {
        return tempoRecarga;
    }

    public void setTempoRecarga(double tempoRecarga) {
        this.tempoRecarga = tempoRecarga;
    }

    // Funções adicionais
    public double calcularTempoRecargaRestante() {
        // Lógica para calcular o tempo restante para a recarga completa da bateria
        // Implementação fictícia para exemplo
        return 10.0; // Tempo restante em horas
    }

    public double verificarAutonomia() {
        // Lógica para retornar a autonomia restante do veículo elétrico
        // Implementação fictícia para exemplo
        return autonomia * 0.5; // Exemplo: 50% da autonomia inicial
    }
}

