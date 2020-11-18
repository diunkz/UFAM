import java.util.Scanner;

public class Divisao {
    public int dividendo;
    public int divisor;

    public Divisao() {
    }

    public Divisao(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public void resultado() {
        if (getDivisor() == 0) {
            System.out.println("divisao por zero");
        } else {
            System.out.printf("Quociente = %d\nResto = %d", getDividendo() / getDivisor(),
                    getDividendo() % getDivisor());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Divisao div = new Divisao();

        int num = scan.nextInt();
        div.setDividendo(num);
        num = scan.nextInt();
        div.setDivisor(num);

        div.resultado();

        scan.close();
    }
}