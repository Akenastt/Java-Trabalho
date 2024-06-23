// Classe CategoriaCarro
class CategoriaCarro {
    private String nome;
    private double precoBaseDiaria;
    private String tipoSeguro;

    public CategoriaCarro(String nome, double precoBaseDiaria, String tipoSeguro) {
        this.nome = nome;
        this.precoBaseDiaria = precoBaseDiaria;
        this.tipoSeguro = tipoSeguro;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBaseDiaria() {
        return precoBaseDiaria;
    }

    public void setPrecoBaseDiaria(double precoBaseDiaria) {
        this.precoBaseDiaria = precoBaseDiaria;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    // Funções adicionais
    public double calcularPrecoTotal(int dias) {
        // Lógica para calcular o preço total do aluguel incluindo seguro para o período especificado
        double precoSeguro = 0.0; // Lógica para calcular o preço do seguro
        return (precoBaseDiaria * dias) + precoSeguro;
    }
}