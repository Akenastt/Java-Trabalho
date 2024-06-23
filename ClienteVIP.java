
// Classe ClienteVIP
class ClienteVIP extends Cliente {
    private boolean statusFidelidade;
    private double descontosAdicionais;

    public ClienteVIP(String nome, String CPF, String telefone, String email, boolean statusFidelidade) {
        super(nome, CPF, telefone, email);
        this.statusFidelidade = statusFidelidade;
        this.descontosAdicionais = 0.0;
    }

    // Getters e Setters
    public boolean isStatusFidelidade() {
        return statusFidelidade;
    }

    public void setStatusFidelidade(boolean statusFidelidade) {
        this.statusFidelidade = statusFidelidade;
    }

    public double getDescontosAdicionais() {
        return descontosAdicionais;
    }

    public void setDescontosAdicionais(double descontosAdicionais) {
        this.descontosAdicionais = descontosAdicionais;
    }

    // Funções adicionais
    public void aplicarDescontosEspeciais() {
        // Lógica para aplicar descontos adicionais ou benefícios especiais ao cliente VIP
        descontosAdicionais = 0.15; // Exemplo: 15% de desconto adicional
    }

    public void gerenciarBeneficios() {
        // Lógica para gerenciar os benefícios oferecidos aos clientes VIP
        System.out.println("Gerenciando benefícios para cliente VIP.");
    }
}

