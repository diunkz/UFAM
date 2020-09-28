public class Memoria {
    String marca;
    String tipo;
    double tamanho;
    double velocidade;
    int numPentes;

    Memoria() {
        marca = "";
        tipo = "";
        tamanho = 0.0;
        velocidade = 0.0;
        numPentes = 0;
    }

    Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.numPentes = numPentes;
    }

    double getTamanhoTotal() {
        return this.numPentes * this.tamanho;
    }

    double getVelocidadeParalela() {
        return this.numPentes * this.velocidade;
    }

    String getDescricao() {
        return String.format(
                "Memoria: marca=%s, tipo=%s, tamanho=%.1fGB, velocidade=%.1fGHz, numPentes=%d, tamanhoTotal=%.1fGB, velocidadeParalela=%.1fGHz.",
                this.marca, this.tipo, this.tamanho, this.velocidade, this.numPentes, this.getTamanhoTotal(),
                this.getVelocidadeParalela());
    }
}
