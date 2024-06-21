public class CategoriaCarro {

    private String idCategoria;
    private String descricao;
    private double precoBase;
    
  
    public CategoriaCarro(String idCategoria, String descricao, double precoBase) {

        this.idCategoria = idCategoria;
        this.descricao = descricao;
        this.precoBase = precoBase;
        
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return "CategoriaCarro{" + "idCategoria=" + idCategoria + ", descricao=" + descricao + ", precoBase=" + precoBase + "}";
    }
}
