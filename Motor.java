// Classe Motor
class Motor {
    private String tipo;
    private double potencia;
    private double eficiencia;

    public Motor(String tipo, double potencia, double eficiencia) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    // Funções adicionais
    public double calcularConsumoCombustivel(double distancia) {
        // Lógica para calcular o consumo de combustível com base na distância percorrida
        return distancia / eficiencia;
    }
}
