// Classe Localizacao
class Localizacao {
    private double latitude;
    private double longitude;
    private String endereco;

    public Localizacao(double latitude, double longitude, String endereco) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.endereco = endereco;
    }

    // Getters e Setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Funções adicionais
    public double calcularDistancia(Localizacao outraLocalizacao) {
        // Lógica para calcular a distância até outra localização geográfica
        return Math.sqrt(Math.pow(latitude - outraLocalizacao.getLatitude(), 2) +
                         Math.pow(longitude - outraLocalizacao.getLongitude(), 2));
    }

    public String obterEndereco() {
        return endereco;
    }
}