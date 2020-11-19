import java.util.Scanner;

public class Numero {
    public int numero;

    public Numero() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int maior(Numero num1, Numero num2) {
        int m = getNumero();

        if (num1.getNumero() > m) {
            m = num1.getNumero();
        }

        if (num2.getNumero() > m) {
            m = num2.getNumero();
        }

        return m;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Numero a = new Numero();
        Numero b = new Numero();
        Numero c = new Numero();

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();

        a.setNumero(x);
        b.setNumero(y);
        c.setNumero(z);

        System.out.printf("%d", a.maior(b, c));

    }
}
