// Classe Carro
class Carro {
    private String modelo;
    private String placa;
    private int ano;
    private double quilometragem;
    private boolean disponibilidade;

    public Carro(String modelo, String placa, int ano, double quilometragem) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.disponibilidade = true; // inicialmente disponível
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    // Funções adicionais
    public double calcularCustoAluguel(int dias) {
        // Lógica para calcular o custo de aluguel com base nos dias e características do carro
        return dias * 100.0; // Exemplo simples: R$100,00 por dia
    }
}