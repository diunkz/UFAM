class Sala {
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    Sala() {
        this.bloco = 0;
        this.sala = 0;
        this.capacidade = 0;
        this.acessivel = false;
    }

    Sala(int bloco, int sala, int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    String getDescricao() {
        if (this.acessivel == true)
            return String.format("Bloco %d, Sala %d (%d lugares, acessível)", this.bloco, this.sala, this.capacidade);
        else
            return String.format("Bloco %d, Sala %d (%d lugares, não acessível)", this.bloco, this.sala,
                    this.capacidade);
    }
}