import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String um = scan.nextLine();
        String dois = scan.nextLine();
        scan.close();

        System.out.printf("%s %s", um, dois);
    }
}

class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        int idade = scan.nextInt();
        scan.close();

        System.out.printf("%s\n%d", nome, idade);
    }
}

class GastoAmigos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        scan.close();

        System.out.printf("%.2f", valor / 4.0);
    }
}

class LerNome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        scan.close();

        System.out.println(nome);
    }
}

class VariasLeituras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        int idade = scan.nextInt();
        char sexo = scan.next().charAt(0);
        double notaum = scan.nextDouble();
        double notadois = scan.nextDouble();
        double notatres = scan.nextDouble();
        scan.close();

        notaum = (notaum + notadois + notatres) / 3.0;
        System.out.printf("Nome: %s\nIdade: %d\nSexo: %c\nMedia: %.2f", nome, idade, sexo, notaum);
    }
}

class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        scan.close();

        System.out.printf("Numero: %d\nAntecessor: %d\nSucessor: %d", valor, valor - 1, valor + 1);
    }
}

class Troca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int c = b;
        b = a;
        a = c;
        System.out.printf("A: %d\nB: %d", a, b);
    }
}

class UsuarioNascimento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        int ano = scan.nextInt();
        scan.close();

        System.out.printf("Nome: %s\nIdade: %d", nome, 2020 - ano);
    }
}

class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario = scan.nextDouble();
        double reajuste = scan.nextDouble();
        scan.close();

        System.out.printf("O novo salario eh: %.2f", salario * (reajuste / 100.0) + salario);
    }
}

class DividaAtrasada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        double dias = scan.nextDouble();
        double multa = scan.nextDouble();
        scan.close();

        System.out.printf("O valor da sua divida atual eh: %.2f", valor + (dias * multa));
    }
}