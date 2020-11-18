import java.util.Scanner;

public class Numero {
    public int num;

    public Numero() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void ehPar() {
        if (getNum() % 2 == 0) {
            System.out.println("O numero verificado eh par...");
        } else {
            System.out.println("O numero verficado nao eh par!!!");

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Numero n = new Numero();
        int num = scan.nextInt();
        scan.close();
        n.setNum(num);
        n.ehPar();

    }
}
