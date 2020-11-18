import java.util.Scanner;

public class Recebe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int ano;

        nome = scan.nextLine();
        ano = scan.nextInt();
        scan.close();

        System.out.printf("Nome: %s\nIdade: %d", nome, 2020 - ano);
    }
}

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        numero = scan.nextInt();
        scan.close();

        System.out.printf("Numero: %d\nAntecessor: %d\nSucessor: %d", numero, numero - 1, numero + 1);
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

class Operações {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        double valordois = scan.nextDouble();
        scan.close();

        System.out.printf("soma =%.1f\nsubtracao =%.1f\ndivisao =%.1f\nmultiplicacao =%.1f",valor+valordois, valor-valordois,valor*valordois;
    }
}

class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        scan.close();

        System.out.printf("a soma eh: %d", valor1 + valor2);
    }
}

class Medias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeum = scan.next();
        Float valorum = scan.nextFloat();
        Float valordois = scan.nextFloat();
        String nomedois = scan.next();
        Float nota1 = scan.nextFloat();
        Float nota2 = scan.nextFloat();
        scan.close();

        System.out.printf("media do %s = %.1f\nmedia do %s = %.1f", nomeum, (valorum + valordois) / 2.0, nomedois,
                (nota1 + nota2) / 2.0);
    }
}