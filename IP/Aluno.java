import java.util.Scanner;

public class Aluno {
    public String nome;
    public char sexo;
    public int idade;
    public float nota1;
    public float nota2;

    public Aluno() {

    }

    public Aluno(String nome, char sexo, int idade, float nota1, float nota2) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota1() {
        return this.nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void imprimirInformacoes() {
        System.out.printf("%s\n%d\n%c\n%.2f\n%.2f", getNome(), getIdade(), getSexo(), getNota1(), getNota2());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        String nome = scan.nextLine();
        int idade = scan.nextInt();
        char sexo = scan.next().charAt(0);
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();

        aluno.setNome(nome);
        aluno.setIdade(idade);
        aluno.setSexo(sexo);
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        aluno.imprimirInformacoes();
    }
}