import java.util.Scanner;

public class Aluno {
    public String nome;
    public float nota1;
    public float nota2;
    public float nota3;
    public int matricula;

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float media() {
        return (getNota1() + getNota2() + getNota3()) / 3;
    }

    public String aprovado() {
        if (media() > 5.0) {
            return ("O aluno foi aprovado");
        } else {
            return ("O aluno foi reprovado");

        }
    }

    public void mensagem() {
        System.out.printf("Aluno: %s\nMatricula: %d\nMedia: %f\n%s", getNome(), getMatricula(), media(), aprovado());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno a = new Aluno();
        String nome = scan.nextLine();
        float notaum = scan.nextFloat();
        float notadois = scan.nextFloat();
        float notatres = scan.nextFloat();
        int matricula = scan.nextInt();
        scan.close();
        a.setNome(nome);
        a.setNota1(notaum);
        a.setNota2(notadois);
        a.setNota3(notatres);
        a.setMatricula(matricula);
        a.mensagem();
    }
}
