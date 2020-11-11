//package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
    private int posX, posY, digito;

    public Coordenada(int posX, int posY, int digito)
            throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
        if (posX < 0 || posY < 0) {
            throw new CoordenadaNegativaException();
        }

        else if (posX > 30000 || posY > 30000) {
            throw new CoordenadaForaDosLimitesException();
        } else if ((((posX + posY) % 10) != digito) || (digito < 0 || digito > 10)) {
            throw new DigitoInvalidoException();
        }

        else {
            this.posX = posX;
            this.posY = posY;
            this.digito = digito;

        }
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public double distancia(Coordenada coordenada) {
        double a = Math.pow(coordenada.getPosX() - getPosX(), 2);
        double b = Math.pow(coordenada.getPosY() - getPosY(), 2);
        return Math.sqrt(a + b);
    }

    public String toString() {
        return String.format("%d, %d", getPosX(), getPosY());
    }
}
