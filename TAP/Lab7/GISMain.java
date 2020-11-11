public class GISMain {

    public static void main(String[] args) {

        Localizavel[] vetor = new Localizavel[6];

        vetor[0] = new Celular(1, 2, 3);
        vetor[1] = new Celular(4, 5, 6);
        vetor[2] = new Celular(-1, -2, -3);
        vetor[3] = new CarroLuxuoso("abc");
        vetor[4] = new CarroLuxuoso("bcd");
        vetor[5] = new CarroLuxuoso("cde");

        for (int x = 0; x < vetor.length; x++) {
            System.out.println(vetor[x]);
        }

    }
}
