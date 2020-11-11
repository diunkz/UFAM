import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
    private Hashtable<String, LinkedList<String>> tabela;

    public ListaInvertida() {
        tabela = new Hashtable<String, LinkedList<String>>();
    }

    public boolean insere(String palavra, String documento) {
        if (tabela.get(palavra) != null) {
            if (tabela.get(palavra).contains(documento) == false) {
                tabela.get(palavra).add(documento);
                return true;
            }
        } else {
            LinkedList<String> a = new LinkedList<String>();
            a.add(documento);
            tabela.put(palavra, a);
            return true;
        }
        return false;
    }

    public LinkedList<String> busca(String palavra) {
        return tabela.get(palavra);
    }

    public String toString() {
        return tabela.toString();
    }

}