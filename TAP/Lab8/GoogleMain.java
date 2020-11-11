import java.util.LinkedList;

public class GoogleMain {
    public static void main(String[] args) {
        ListaInvertida l = new ListaInvertida();
        l.insere("remember", "document1.txt");
        LinkedList d = l.busca("remember");
        l.insere("the", "document1.txt");
        l.insere("the", "document2.txt");
        l.insere("the", "document3.txt");
        l.insere("the", "document3.txt");
        System.out.println(l.toString());
    }
}
