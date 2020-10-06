public class Retangulo extends FormaGeometrica {
    public double largura;
    public double altura;

    public Retangulo(int posX, int posY, double largura, double altura) {
        super(posX, posY);
        this.largura = largura;
        this.altura = altura;
    }

    public double getArea() {
        return this.altura * this.largura;
    }

    public double getPerimetro() {
        return 2 * (largura + altura);
    }

    public String toString() {
        return String.format(
                "Retângulo na %s com largura de %.1fcm e altura de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)",
                getPosString(), this.largura, this.altura, getArea(), getPerimetro());
    }
}
