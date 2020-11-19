import java.util.Scanner;

public class Carro {
    public int distanciakm;
    public int gasolina;

    public Carro() {

    }

    public int getDistanciakm() {
        return distanciakm;
    }

    public void setDistanciakm(int distanciakm) {
        this.distanciakm = distanciakm;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public void consumo() {
        if (getDistanciakm() / getGasolina() < 8) {
            System.out.println("Venda o carro!");
        } else if ((getDistanciakm() / getGasolina() >= 8) && (getDistanciakm() / getGasolina() <= 14)) {
            System.out.println("Economico!");
        } else if (getDistanciakm() / getGasolina() > 14) {
            System.out.println("Super Economico!");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro c = new Carro();
        int distanciakm = scan.nextInt();
        int gasolina = scan.nextInt();
        scan.close();
        c.setDistanciakm(distanciakm);
        c.setGasolina(gasolina);
        c.consumo();
    }
}