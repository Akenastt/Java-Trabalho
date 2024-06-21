public class Motorista {
    
    private String carteiraDeTrabalho;
    private String categoriaCarteiraDeTrabalho;
    
    
    public Motorista(String cpf, String nome, String telefone, String email, String carteiraDeTrabalho, String categoriaCarteiraDeTrabalho) {
       
        super(cpf, nome, telefone, email);
        this.carteiraDeTrabalho = carteiraDeTrabalho;
        this.categoriaCarteiraDeTrabalho = categoriaCarteiraDeTrabalho;

    }

    public String getcarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public String getcategoriaCarteiraDeTrabalho() {
        return categoriaCarteiraDeTrabalho;
    }

    public void setcarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public void setcategoriaCarteiraDeTrabalho(String categoriaCarteiraDeTrabalho) {
        this.categoriaCarteiraDeTrabalho = categoriaCarteiraDeTrabalho;
    }

    @Override
    public String toString() {
        return "Motorista{" + "carteira De Trabalho= " + carteiraDeTrabalho + " , Categoria Carteira De Trabalho= " + categoriaCarteiraDeTrabalho + ", cpf='" + getCpf() + "', nome='" + getNome() + "', telefone='" + getTelefone() + "', email='" + getEmail() + "'}";
    }
}
