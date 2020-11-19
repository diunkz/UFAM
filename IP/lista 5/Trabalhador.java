import java.util.Scanner;

public class Trabalhador {
    public String nome;
    public int idade;
    public int tempoServico;

    Trabalhador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public void aposentadoria() {
        if (getIdade() >= 65 || getTempoServico() >= 35 || (getIdade() >= 60 && getTempoServico() >= 25)) {
            System.out.printf("%s pode se aposentar.", getNome());
        } else {
            System.out.printf("%s ainda nao pode se aposentar.", getNome());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Trabalhador t = new Trabalhador();
        String nome = scan.nextLine();
        int idade = scan.nextInt();
        int tempoServico = scan.nextInt();
        scan.close();
        t.setNome(nome);
        t.setIdade(idade);
        t.setTempoServico(tempoServico);
        t.aposentadoria();
    }
}
