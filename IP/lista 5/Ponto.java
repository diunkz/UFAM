import java.util.Scanner;

public class Ponto {
    int x, y;

    Ponto() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void leitura() {
        if (2 * getX() + getY() == 3) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Ponto p = new Ponto();

        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();

        p.setX(x);
        p.setY(y);

        p.leitura();
    }

}