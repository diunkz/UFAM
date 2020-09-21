import java.util.Scanner; //para as classes ParImpar, AnimaisCedulas, PontoReta e AngryBirds
//import java.util.Locale; // para a classe AngryBirds ler ponto ao invés de vírgula

class TheForce {
    public static void main(String[] args) {
        System.out.println("The Force");
    }
}

class Macaco {
    public static void main(String[] args) {
        System.out.println("  *****");
        System.out.println("(* o o *)");
        System.out.println(" *  ^  *");
        System.out.println(" * --- *");
        System.out.println("  *****");
    }
}

class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();

        do {
            if (valor % 2 == 0) {
                System.out.println("PAR");

            } else {
                System.out.println("IMPAR");
            }
            valor = scan.nextInt();
        } while (valor != -1);

        scan.close();
    }
}

class AnimaisCedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cedula = scan.nextInt();

        switch (cedula) {
            case 2:
                System.out.println("Tartaruga");
                break;

            case 5:
                System.out.println("Garça");
                break;

            case 10:
                System.out.println("Arara");
                break;

            case 20:
                System.out.println("Mico-leão-dourado");
                break;

            case 50:
                System.out.println("Onça-pintada");
                break;

            case 100:
                System.out.println("Garoupa");
                break;

            default:
                System.out.println("erro");
        }
        scan.close();
    }
}

class PontoReta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        scan.close();

        if (2 * x + y == 3) {
            System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.", x, y);
        } else {
            System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.", x, y);
        }
    }
}

class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // scan.useLocale(Locale.US); // setar o locale

        float vo = scan.nextFloat();
        float alpha = scan.nextFloat();
        float distancia = scan.nextFloat();

        double r = Math.pow(Math.abs(vo), 2) * Math.sin(2 * Math.toRadians(alpha)) / 9.8;

        if (r <= distancia + 0.1 && r >= distancia - 0.1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
