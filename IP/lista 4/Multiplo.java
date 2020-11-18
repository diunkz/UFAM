import java.util.Scanner;

public class Multiplo {
    public int num1;
    public int num2;

    Multiplo() {

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void verificacao() {
        if (getNum1() % getNum2() == 0) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Multiplo m = new Multiplo();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        m.setNum1(num1);
        m.setNum2(num2);
        m.verificacao();

    }
}
