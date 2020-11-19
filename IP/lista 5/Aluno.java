import java.util.Scanner;

public class Aluno {
    public float valordisponivel;
    public int qtdtickets;
    public float valortickets;
    public int qtdpasses;
    public float valorpasses;

    Aluno() {

    }

    public float getValordisponivel() {
        return valordisponivel;
    }

    public void setValordisponivel(float valordisponivel) {
        this.valordisponivel = valordisponivel;
    }

    public int getQtdtickets() {
        return qtdtickets;
    }

    public void setQtdtickets(int qtdtickets) {
        this.qtdtickets = qtdtickets;
    }

    public float getValortickets() {
        return valortickets;
    }

    public void setValortickets(float valortickets) {
        this.valortickets = valortickets;
    }

    public int getQtdpasses() {
        return qtdpasses;
    }

    public void setQtdpasses(int qtdpasses) {
        this.qtdpasses = qtdpasses;
    }

    public float getValorpasses() {
        return valorpasses;
    }

    public void setValorpasses(float valorpasses) {
        this.valorpasses = valorpasses;
    }

    public void verificacao() {
        float total = getValortickets() * getQtdtickets();
        total += getValorpasses() * getQtdpasses();

        if (getValordisponivel() >= total) {
            System.out.println("SUFICIENTE");
        } else {
            System.out.println("INSUFICIENTE");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno a = new Aluno();

        float valordisponivel = scan.nextFloat();
        int qtdtickets = scan.nextInt();
        float valortickets = scan.nextFloat();
        int qtdpasses = scan.nextInt();
        float valorpasses = scan.nextFloat();
        scan.close();

        a.setValordisponivel(valordisponivel);
        a.setQtdtickets(qtdtickets);
        a.setValortickets(valortickets);
        a.setQtdpasses(qtdpasses);
        a.setValorpasses(valorpasses);
        a.verificacao();
    }
}
