import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.ArrayList;

// Classe Promocao
class Promocao {
    private String nome;
    private String descricao;
    private double descontoPercentual;
    private LocalDate dataValidade;

    public Promocao(String nome, String descricao, double descontoPercentual, LocalDate dataValidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.descontoPercentual = descontoPercentual;
        this.dataValidade = dataValidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDescontoPercentual() {
        return descontoPercentual;
    }



    public void setDescontoPercentual(double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Funções adicionais
    public void aplicarDesconto(Aluguel aluguel) {
        // Lógica para aplicar o desconto percentual ao valor total do aluguel
        double valorDesconto = aluguel.getValorTotal() * (descontoPercentual / 100);
        double novoValorTotal = aluguel.getValorTotal() - valorDesconto;
        aluguel.setValorTotal(novoValorTotal);
    }

    public boolean verificarElegibilidade(Aluguel aluguel) {
        // Lógica para verificar se um aluguel é elegível para aplicação da promoção
        return aluguel.getDataInicio().isBefore(dataValidade);
    }
}