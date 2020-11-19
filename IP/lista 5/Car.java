import java.util.Scanner;

public class Car {
    public String marca;
    public double custoFabrica;

    public Car() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public void imposto() {
        double resultado = 0.0;

        if (getCustoFabrica() < 12000.00) {
            resultado += getCustoFabrica() + (getCustoFabrica() * 0.05);
        } else if (getCustoFabrica() >= 12000.00 && getCustoFabrica() <= 25000.00) {
            resultado += getCustoFabrica() + (getCustoFabrica() * 0.25);
        } else {
            resultado += getCustoFabrica() + (getCustoFabrica() * 0.35);
        }

        System.out.printf("Marca: %s\nCusto ao Consumidor: R$ %.2f", getMarca(), resultado);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car c = new Car();
        String marca = scan.nextLine();
        double custoFabrica = scan.nextDouble();
        scan.close();
        c.setMarca(marca);
        c.setCustoFabrica(custoFabrica);
        c.imposto();
    }
}
