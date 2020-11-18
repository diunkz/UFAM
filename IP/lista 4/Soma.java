import java.util.Scanner;

public class Soma {
    public int numero;

    Soma() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int somatorio() {
        String a = String.valueOf(getNumero());
        int r = 0;
        for (int x = 0; x < a.length(); x++) {
            r += Integer.valueOf(a.charAt(x)) - 48;
        }
        return r;
    }

    public void mensagem() {
        if (getNumero() > 0) {
            System.out.printf("A soma dos algarismos eh: %d\n", somatorio());
        } else {
            System.out.println("Numero invalido");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Soma n = new Soma();
        int numero = scan.nextInt();
        scan.close();

        n.setNumero(numero);
        n.mensagem();
    }

}
