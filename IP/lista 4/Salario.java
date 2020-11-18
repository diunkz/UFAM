import java.util.Scanner;

public class Salario {
    public float salario;
    public float prestacao;

    Salario() {
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getPrestacao() {
        return prestacao;
    }

    public void setPrestacao(float prestacao) {
        this.prestacao = prestacao;
    }

    public boolean emprestimo() {
        if (getPrestacao() > (getSalario() * 0.2)) {
            return true;
        } else {
            return false;
        }
    }

    void confirmacao() {
        if (emprestimo()) {
            System.out.println("Emprestimo nao concedido...");
        } else {
            System.out.println("Emprestimo concedido!!!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Salario sal = new Salario();
        float salario = scan.nextFloat();
        float prestacao = scan.nextFloat();
        scan.close();
        sal.setSalario(salario);
        sal.setPrestacao(prestacao);
        sal.confirmacao();

    }
}
