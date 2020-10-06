import java.util.ArrayList;

public class FormasMain {
    public static void main(String[] args) {
        ArrayList<Object> vetorDeObjetos = new ArrayList<Object>();
        Circulo c1 = new Circulo(4, 5, 8);
        Retangulo r1 = new Retangulo(4, 5, 8, 9);
        Quadrado q1 = new Quadrado(4, 5, 8);
        vetorDeObjetos.add(c1);
        vetorDeObjetos.add(r1);
        vetorDeObjetos.add(q1);
        for (int i = 0; i < vetorDeObjetos.size(); i++) {
            System.out.println(vetorDeObjetos.get(i));
        }
    }
}
