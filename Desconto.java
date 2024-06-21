public class Desconto {

    private String idDesconto;
    private String descricao;
    private double percentual;
    private String dataValidade;
  
    public Desconto(String idDesconto, String descricao, double percentual, String dataValidade) {

        this.idDesconto = idDesconto;
        this.descricao = descricao;
        this.percentual = percentual;
        this.dataValidade = dataValidade;
        
    }

    public String getIdDesconto() {
        return idDesconto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPercentual() {
        return percentual;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setIdDesconto(String idDesconto) {
        this.idDesconto = idDesconto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Desconto{" + "idDesconto=" + idDesconto + ", descricao=" + descricao + ", percentual=" + percentual + ", dataValidade=" + dataValidade + "}";
    }
}
