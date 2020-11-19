import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class NumeroDecrescente {
    public int NumeroDecrescente;

    public NumeroDecrescente() {

    }

    public int getNumeroDecrescente() {
        return NumeroDecrescente;
    }

    public void setNumeroDecrescente(int NumeroDecrescente) {
        this.NumeroDecrescente = NumeroDecrescente;
    }

    public void OrdemCrescente(NumeroDecrescente um, NumeroDecrescente dois) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(getNumeroDecrescente());
        lista.add(um.getNumeroDecrescente());
        lista.add(dois.getNumeroDecrescente());
        Collections.sort(lista);

        System.out.printf("%d %d %d", lista.get(2), lista.get(1), lista.get(0));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        NumeroDecrescente a = new NumeroDecrescente();
        NumeroDecrescente b = new NumeroDecrescente();
        NumeroDecrescente c = new NumeroDecrescente();

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();

        a.setNumeroDecrescente(x);
        b.setNumeroDecrescente(y);
        c.setNumeroDecrescente(z);

        a.OrdemCrescente(b, c);
    }
}
