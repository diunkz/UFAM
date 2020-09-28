public class Processador {
    String marca;
    String modelo;
    double velocidade;
    int numNucleos;

    Processador() {
        marca = "";
        modelo = "";
        velocidade = 0.0;
        numNucleos = 0;
    }

    Processador(String marca, String modelo, double velocidade, int numNucleos) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.numNucleos = numNucleos;
    }

    double getVelocidadeParalela() {
        return this.velocidade * this.numNucleos;
    }

    String getDescricao() {
        return String.format(
                "Processador: marca=%s, modelo=%s, velocidade=%.1fGHz, numNucleos=%d, velocidadeParalela=%.1fGHz.",
                this.marca, this.modelo, this.velocidade, this.numNucleos, this.getVelocidadeParalela());
    }
}
