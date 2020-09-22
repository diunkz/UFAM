import java.util.Scanner;

class HelloUfam {
    public static void main(String[] args) {
        System.out.println("Universidade Federal do Amazonas");
    }
}

class HelloGroot {
    public static void main(String[] args) {
        System.out.println("I am Groot");
    }
}

class TheForce {
    public static void main(String[] args) {
        System.out.println("May The Force be with you");
    }
}

class Coelho {
    public static void main(String[] args) {
        System.out.println("(\\ (\\");
        System.out.println("(='.')");
        System.out.println("((^)(^)");
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

class AsciiArt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        String espaco = "";
        scan.close();

        for (int a = entrada; a >= 0; a--) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            if (a != entrada && a > 0) {
                espaco += "  ";
                System.out.print(espaco);
            }

            for (int b = 0; b < a; b++) {
                System.out.print("*");
                if (b + 1 == a) {
                    System.out.println();
                }
            }
        }
    }
}

class IdadeUfam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ano = scan.nextInt();
        scan.close();
        System.out.printf("A UFAM tem %d anos de fundacao", ano - 1909);
    }
}

class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();

        System.out.printf("%.2f", Math.sqrt(numero));
    }
}

class PinturaMuro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float numero = scan.nextFloat();
        scan.close();

        System.out.printf("%.1f", ((12 * 3) * numero) + 100);
    }
}

class Xadrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();

        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                for (int a = 0; a < numero; a++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int b = 0; b < numero; b++) {
                    System.out.print(" *");
                }
                System.out.println();
            }

        }
    }
}

class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        if (numero % 2 != 0 || numero < 0) {
            System.out.println("Valor Invalido");
        } else {
            System.out.printf("%d notas de R$50, ", numero / 50);
            numero %= 50;
            System.out.printf("%d notas de R$10 ", numero / 10);
            numero %= 10;
            System.out.printf("e %d notas de R$2", numero / 2);
        }
    }
}

class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double area;
        double s = (a + b + c) / 2;
        if ((a + b) > c) {
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("%.2f", area);
        } else {
            System.out.println("Triangulo Invalido");
        }
    }
}
