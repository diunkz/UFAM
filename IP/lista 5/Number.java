import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Number {
    public int Number;

    public Number() {

    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public void OrdemCrescente(Number um, Number dois) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(getNumber());
        lista.add(um.getNumber());
        lista.add(dois.getNumber());
        Collections.sort(lista);

        System.out.printf("%d %d %d", lista.get(0), lista.get(1), lista.get(2));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Number a = new Number();
        Number b = new Number();
        Number c = new Number();

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();

        a.setNumber(x);
        b.setNumber(y);
        c.setNumber(z);

        a.OrdemCrescente(b, c);
    }
}
