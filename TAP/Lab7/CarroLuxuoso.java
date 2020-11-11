import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel {
    public CarroLuxuoso(String placa) {
        super(placa);
    }

    @Override
    public Posicao getPosicao() {
        Random r = new Random();
        double lat = -3.160000 + ((-2.960000) - (-3.160000)) * r.nextDouble();
        double lon = -60.120000 + ((-59.820000) - (-60.120000)) * r.nextDouble();
        double alt = 15.0 + (100.0 - 15.0) * r.nextDouble();
        Posicao pos = new Posicao(lat, lon, alt);

        return pos;
    }

    @Override
    public double getErroLocalizacao() {
        return 15.0;
    }
}
