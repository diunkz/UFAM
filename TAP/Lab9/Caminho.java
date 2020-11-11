package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
    private Coordenada[] caminho;
    private int tamanho;

    public Caminho(int maxTam) {
        this.tamanho = maxTam;
        caminho = new Coordenada[maxTam];
    }

    public int tamanho() {
        for (int i = 0; i < caminho.length; i++) {
            if (caminho[i] == null) {
                return i;
            }
        }
        return caminho.length;
    }

    public void addCoordenada(Coordenada coordenada)
            throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {

        if (tamanho() >= this.tamanho) {
            throw new TamanhoMaximoExcedidoException();
        } else if (tamanho() >= 1) {
            if ((Math.sqrt((Math.pow(caminho[tamanho() - 1].getPosX() - coordenada.getPosX(), 2))
                    + (Math.pow(caminho[tamanho() - 1].getPosY() - coordenada.getPosY(), 2)))) > 15.0) {

                throw new DistanciaEntrePontosExcedidaException();
            } else {
                caminho[tamanho()] = coordenada;
            }
        } else {
            caminho[tamanho()] = coordenada;

        }

    }

    public void reset() {
        for (int a = 0; a < caminho.length; a++) {
            caminho[a] = null;
        }
    }

    public String toString() {
        String a = String.format("Dados do caminho:\n-Quantidade de pontos: %d\n-Pontos: \n", tamanho());

        for (int x = 0; x < tamanho; x++) {
            if (caminho[x] == null) {
                break;
            } else {
                a += "-> ";
                a += caminho[x];
                a += "\n";
            }
        }

        return a;
    }
}
