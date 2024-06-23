import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.ArrayList;
// Classe Locadora
class Locadora {
    private ArrayList<Filial> filiais;
    private ArrayList<Cliente> clientes;
    private ArrayList<Carro> carros;

    public Locadora() {
        this.filiais = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.carros = new ArrayList<>();
    }

    // Getters e Setters
    public ArrayList<Filial> getFiliais() {
        return filiais;
    }

    public void setFiliais(ArrayList<Filial> filiais) {
        this.filiais = filiais;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    // Funções adicionais
    public void adicionarFilial(Filial filial) {
        filiais.add(filial);
    }

    public void removerFilial(Filial filial) {
        filiais.remove(filial);
    }

    public void gerenciarClientes() {
        // Lógica para gerenciar o cadastro e informações dos clientes da locadora
        System.out.println("Gerenciando clientes da locadora.");
    }
}
