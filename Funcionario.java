// Classe Funcionario
class Funcionario {
    private String nome;
    private String cargo;
    private String CPF;
    private double salario;

    public Funcionario(String nome, String cargo, String CPF, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.CPF = CPF;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Funções adicionais
    public void gerenciarClientes() {
        // Lógica para gerenciar as interações e informações dos clientes
        System.out.println("Gerenciando clientes...");
    }

    public void gerenciarReservas() {
        // Lógica para gerenciar as reservas de carros na filial
        System.out.println("Gerenciando reservas...");
    }

    public double calcularBonus() {
        // Lógica para calcular o bônus baseado no desempenho do funcionário
        return salario * 0.1; // Exemplo simples: 10% do salário como bônus
    }
}

