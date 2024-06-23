// Classe Seguro
class Seguro {
    private String tipo;
    private String cobertura;
    private double precoAdicional;

    public

 Seguro(String tipo, String cobertura, double precoAdicional) {
        this.tipo = tipo;
        this.cobertura = cobertura;
        this.precoAdicional = precoAdicional;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }

    // Funções adicionais
    public double calcularCustoSeguro(int dias) {
        // Lógica para calcular o custo do seguro para o período de aluguel especificado
        return dias * precoAdicional;
    }

    public String detalhesCobertura() {
        return cobertura;
    }
}
