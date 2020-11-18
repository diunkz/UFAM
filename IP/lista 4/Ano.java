import java.util.Scanner;

public class Ano {
    public int ano;

    Ano() {
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void ehBissexto() {
        if ((getAno() % 400 == 0) || ((getAno() % 4 == 0) && (getAno() % 100 != 0))) {
            System.out.println("EH BISSEXTO");
        } else {
            System.out.println("NAO EH BISSEXTO");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ano a = new Ano();
        int ano = scan.nextInt();
        a.setAno(ano);
        a.ehBissexto();

    }
}
