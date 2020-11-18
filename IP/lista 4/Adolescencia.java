import java.util.Scanner;

public class Adolescencia {
    public double idade;

    Adolescencia() {

    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public void verificar() {
        if (getIdade() >= 0.0 && getIdade() < 10.0) {
            System.out.println("Infância");
        } else if (getIdade() >= 10.0 && getIdade() < 15.0) {
            System.out.println("Pré-adolescência");
        } else if (getIdade() >= 15.0 && getIdade() < 20.0) {
            System.out.println("Adolescência");
        } else if (getIdade() >= 20.0 && getIdade() <= 24.0) {
            System.out.println("Juventude");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Adolescencia a = new Adolescencia();
        double idade = scan.nextDouble();
        scan.close();

        a.setIdade(idade);
        a.verificar();

    }

}
