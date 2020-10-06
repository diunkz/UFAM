import java.lang.Math;

public class Circulo extends FormaGeometrica {
    public double raio;

    public Circulo(int posX, int posY, double raio) {
        super(posX, posY);
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public String toString() {
        return String.format("Círculo na %s com raio de %.1fcm (área=%.14fcm2, perímetro=%.14fcm)", getPosString(),
                this.raio, getArea(), getPerimetro());
    }

}
