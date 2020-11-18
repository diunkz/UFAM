import java.util.Scanner;

public class Positivo {
    public int numero;

    public Positivo() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void ehPositivo() {
        if (numero > 0) {
            System.out.printf("O quadrado de: %d eh: %d\nA raiz de: %d eh: %.2f", getNumero(),
                    getNumero() * getNumero(), getNumero(), Math.sqrt(getNumero()));
        } else if (numero < 0) {
            System.out.printf("O numero: %d eh negativo", getNumero());
        } else {
            System.out.println("O numero eh neutro!!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Positivo pos = new Positivo();
        int num = scan.nextInt();
        scan.close();
        pos.setNumero(num);
        pos.ehPositivo();
    }
}
