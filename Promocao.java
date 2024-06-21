public class Promocao {

    private String idPromocao;
    private String descricao;
    private double descontoPercentual;
    private String dataInicio;
    private String dataFim;

    public Promocao(String idPromocao, String descricao, double descontoPercentual, String dataInicio, String dataFim) {

        this.idPromocao = idPromocao;
        this.descricao = descricao;
        this.descontoPercentual = descontoPercentual;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

    }

    public String getIdPromocao() {
        return idPromocao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getDescontoPercentual() {
        return descontoPercentual;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setIdPromocao(String idPromocao) {
        this.idPromocao = idPromocao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDescontoPercentual(double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Promocao{" + "idPromocao=" + idPromocao + ", descricao=" + descricao + ", descontoPercentual=" + descontoPercentual + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "}";
    }
}
