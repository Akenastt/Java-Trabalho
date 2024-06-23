import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.ArrayList;
// Exemplo de uso:
public class Main {
    public static void main(String[] args) {
        // Criando alguns objetos para teste
        Carro carro1 = new Carro("Ford Ka", "ABC1234", 2020, 50000);
        Carro carro2 = new Carro("Chevrolet Onix", "DEF5678", 2021, 40000);

        Cliente cliente1 = new Cliente("João", "123.456.789-00", "(99) 99999-9999", "joao@email.com");
        Cliente cliente2 =

 new Cliente("Maria", "987.654.321-00", "(88) 88888-8888", "maria@email.com");

        Reserva reserva1 = new Reserva(cliente1, carro1, LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 5));
        Reserva reserva2 = new Reserva(cliente2, carro2, LocalDate.of(2024, 6, 10), LocalDate.of(2024, 6, 15));

        Filial filial = new Filial("Av. Paulista, 1234", new Localizacao(-23.5678, -46.1234, "São Paulo - SP"));
        filial.adicionarCarro(carro1);
        filial.adicionarCarro(carro2);

        Locadora locadora = new Locadora();
        locadora.adicionarFilial(filial);
        locadora.gerenciarClientes();
    }
}
