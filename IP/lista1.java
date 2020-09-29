import java.util.Scanner;

class Adicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("O resultado da adicao eh: %d", a + b);
    }
}

class Subtracao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("O resultado da subtracao eh: %d", a - b);
    }
}

class Multiplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.printf("O resultado da multiplicacao eh: %.0f", a * b);
    }
}

class Divisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.printf("O resultado da divisao eh: %.3f", a / b);
    }
}

class MultiplicacaoNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        a = a * b;
        c = c - d;
        System.out.println(a + c);
    }
}

class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grauscelsius = scan.nextDouble();
        double fahrenheit = 0.0;
        fahrenheit = (9.0 / 5.0) * grauscelsius + 32;
        System.out.printf("Temperatura em C: %.1f\n", grauscelsius);
        System.out.printf("Temperatura em F: %.1f\n", fahrenheit);
    }
}

class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double fahrenheit = scan.nextDouble();
        double grauscelsius = 0.0;
        grauscelsius = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.printf("Temperatura em F: %.1f\n", fahrenheit);
        System.out.printf("Temperatura em C: %.1f\n", grauscelsius);
    }
}

class MediaQuatroNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();

        a = (a + b + c + d) / 4.0;
        System.out.printf("A media das notas eh: %.2f\n", a);
    }
}

class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dinheiroporhora = scan.nextDouble();
        int numerodehoras = scan.nextInt();

        dinheiroporhora = dinheiroporhora * numerodehoras;
        System.out.printf("O total do salario eh: %.2f\n", dinheiroporhora);
    }
}