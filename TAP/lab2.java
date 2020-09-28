import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

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
        scan.close();

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
        scan.close();
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

class SomaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        int resultado = 0;

        while (numero != 0) {
            resultado += numero % 10;
            numero /= 10;
        }

        System.out.println(resultado);

    }
}

class AreaVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        scan.close();

        double areacirculo = Math.PI * Math.pow(raio, 2);
        double volumeesfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.", raio,
                areacirculo);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", raio,
                volumeesfera);

    }
}

class RotaOrtodromica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double t1 = scan.nextDouble();
        double g1 = scan.nextDouble();
        double t2 = scan.nextDouble();
        double g2 = scan.nextDouble();
        scan.close();
        double r = 6371.0;
        double d = r
                * Math.acos(Math.sin(Math.toRadians(t1)) * Math.sin(Math.toRadians(t2)) + Math.cos(Math.toRadians(t1))
                        * Math.cos(Math.toRadians(t2)) * Math.cos(Math.toRadians(g1) - Math.toRadians(g2)));

        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km", t1, g1, t2, g2, d);

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

class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double entrada = scan.nextDouble();
        scan.close();

        if (entrada >= 200.00) {
            entrada *= 0.95;
        }

        System.out.printf("%.2f", entrada);
    }
}

class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double x = scan.nextDouble();
        double opcao = scan.nextDouble();
        double v = (Math.PI / 3.0) * Math.pow(x, 2) * (3 * r - x);
        scan.close();

        if (opcao == 2) {
            v = ((4.0 / 3.0) * Math.PI * Math.pow(r, 3)) - v;
        }

        System.out.printf("%.4f", v);

    }
}

class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int medidaum = scan.nextInt();
        int medidadois = scan.nextInt();
        int medidatres = scan.nextInt();

        if (medidatres >= medidaum + medidadois) {
            System.out.println("invalido");
        } else {
            if (medidaum == medidadois && medidadois == medidatres) {
                System.out.println("equilatero");
            } else if (medidaum == medidadois || medidaum == medidatres || medidadois == medidatres) {
                System.out.println("isosceles");
            } else {
                System.out.println("escaleno");
            }
        }

    }
}

class AnimaisCedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cedula = scan.nextInt();
        scan.close();

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
    }
}

class ContaEnergia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double consumo = scan.nextDouble();
        String tipo = scan.next();
        scan.close();

        if (consumo > 0) {
            if (tipo.equals("R")) {
                if (consumo <= 500) {
                    consumo *= 0.40;
                } else {
                    consumo *= 0.65;
                }
            } else if (tipo.equals("C")) {
                if (consumo <= 1000) {
                    consumo *= 0.55;
                } else {
                    consumo *= 0.60;
                }
            } else if (tipo.equals("I")) {
                if (consumo <= 5000) {
                    consumo *= 0.55;
                } else {
                    consumo *= 0.60;
                }
            } else {
                consumo = -1.0;
            }
        } else {
            consumo = -1.0;
        }

        System.out.printf("%.2f", consumo);

    }
}

/*
 * class VolumeCombustivel { public static void main(String[] args) { Scanner
 * scan = new Scanner(System.in); int H = scan.nextInt(); int h =
 * scan.nextInt(); int r = scan.nextInt(); scan.close(); if (H <= 0 || h <= 0 ||
 * r <= 0) { double volumeesfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
 * double volumecalota = (Math.PI / 3.0) * Math.pow(x, 2) * (3 * r - x); double
 * volumecilindro = Math.PI * Math.pow(r, 2) * x;
 * 
 * } else { System.out.println("-1.00"); }
 * 
 * } }
 */
class SomaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = 0;
        int total = 0;

        while (entrada != -1) {
            total += entrada;
            entrada = scan.nextInt();
        }
        scan.close();
        System.out.println(total);
    }
}

class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int atual = 0;
        int total = 0;
        int contador = 0;
        boolean executar = true;

        while (executar == true) {
            atual = scan.nextInt();
            if (atual != -1) {
                total += atual;
                contador = 0;
            } else if (atual == -1) {
                contador += 1;
                if (contador == 1) {
                    System.out.println(total);
                } else if (contador == 2) {
                    executar = false;
                }
                total = 0;
            }
        }
        scan.close();
    }
}

class MediaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = 0;
        double media = 0.0;
        int numerodevezes = -1;

        while (entrada != -1) {
            numerodevezes += 1;
            media += entrada;
            entrada = scan.nextInt();
        }
        scan.close();
        System.out.printf("%.2f", media / numerodevezes);
    }
}

class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double entrada = scan.nextDouble();
        scan.close();
        double aproximacao = 0.0;
        int i = 1;
        int pulo = 0;

        if (entrada == 0) {
            System.out.printf("%.6f\n", aproximacao);
        } else {
            while (i <= entrada) {
                if (i == 1) {
                    aproximacao += 3.0;
                } else {
                    if (i % 2 != 0) {
                        aproximacao -= 4.0 / (pulo * (pulo + 1) * (pulo + 2));
                    } else {
                        aproximacao += 4.0 / (pulo * (pulo + 1) * (pulo + 2));
                    }
                }

                System.out.printf("%.6f\n", aproximacao);
                i++;
                pulo += 2;
            }
        }
    }
}

class NumeroNeperiano {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int fatorial = 1;
        double resultado = 0.0;
        double entrada = scan.nextDouble();
        scan.close();

        for (int i = 0; i < entrada; i++) {
            x = i;
            for (x = i; x > 1; x--) {
                fatorial *= x;
            }
            resultado += 1.0 / fatorial;
            fatorial = 1;
        }

        System.out.printf("%.6f", resultado);

    }

}

class AproximacaoSeno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double angulo = Math.toRadians(scan.nextDouble());
        double k = scan.nextDouble();
        double cont = 1;
        double fatorial = 1;
        double resultado = 0.0;
        scan.close();

        for (double i = 0; i < k; i++) {
            for (double x = cont; x > 1; x--) {
                fatorial *= x;
            }
            if (i % 2 == 0) {
                resultado += (Math.pow(angulo, cont) / fatorial);
            } else {
                resultado -= (Math.pow(angulo, cont) / fatorial);
            }
            System.out.printf("%.10f\n", resultado);
            cont += 2;
            fatorial = 1;
        }
    }
}

class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> prova = new ArrayList<Integer>();
        ArrayList<Integer> gabarito = new ArrayList<Integer>();
        double resultado = 0.0;
        int entrada = scan.nextInt();

        while (entrada != -1) {
            gabarito.add(entrada);
            entrada = scan.nextInt();
        }

        entrada = scan.nextInt();

        while (entrada != -1) {
            prova.add(entrada);
            entrada = scan.nextInt();
        }

        scan.close();

        for (int a = 0; a < prova.size(); a++) {
            if (prova.get(a) == gabarito.get(a)) {
                resultado++;
            }
        }

        System.out.printf("%.2f", (resultado / prova.size()) * 100);

    }
}
/*
 * class AreaPoligono { public static void main(String[] args) {
 * 
 * } }
 */

class DataExtenso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        scan.close();
        String messtring = "";
        int dia, mes, ano;

        ano = entrada % 10000;
        entrada /= 10000;
        mes = entrada % 100;
        entrada /= 100;
        dia = entrada;

        switch (mes) {
            case 1:
                messtring = "janeiro";
                break;
            case 2:
                messtring = "fevereiro";
                break;
            case 3:
                messtring = "março";
                break;
            case 4:
                messtring = "abril";
                break;
            case 5:
                messtring = "maio";
                break;
            case 6:
                messtring = "junho";
                break;
            case 7:
                messtring = "julho";
                break;
            case 8:
                messtring = "agosto";
                break;
            case 9:
                messtring = "setembro";
                break;
            case 10:
                messtring = "outubro";
                break;
            case 11:
                messtring = "novembro";
                break;
            case 12:
                messtring = "dezembro";
                break;
        }

        System.out.printf("%d de %s de %d", dia, messtring, ano);

    }
}
/*
 * class CifraCesar { public static void main(String[] args) { Scanner scan =
 * new Scanner(System.in); int deslocamento = scan.nextInt(); String texto =
 * scan.nextLine(); scan.close();
 * 
 * } }
 */

class Palindromos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        scan.close();
        entrada = entrada.replaceAll(" ", "");
        String contrario = "";

        for (int i = (entrada.length() - 1); i >= 0; i--) {
            contrario = contrario + entrada.charAt(i);
        }

        if (contrario.toLowerCase().equals(entrada.toLowerCase())) {
            System.out.printf("%s 1", contrario.toUpperCase());
        } else {
            System.out.printf("%s 0", entrada.toUpperCase());
        }
    }
}

class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        int contadorpares = 0;
        int contadorimpares = 0;
        int soma = 0;
        float media = 0.00f;
        int maior = 0;
        int menor = 0;

        ArrayList<Integer> vetor = new ArrayList<Integer>();
        boolean condicao = true;
        while (condicao == true) {
            while (entrada != -1) {
                vetor.add(entrada);
                entrada = scan.nextInt();
            }
            for (int i = 0; i < vetor.size(); i++) {
                if (vetor.get(i) % 2 == 0) {
                    contadorpares++;
                } else {
                    contadorimpares++;
                }
                soma += vetor.get(i);
            }

            media = soma / (float) vetor.size();
            maior = Collections.max(vetor);
            menor = Collections.min(vetor);

            System.out.println(vetor.size());
            System.out.println(contadorpares);
            System.out.println(contadorimpares);
            System.out.println(soma);
            System.out.printf("%.2f\n", media);
            System.out.println(maior);
            System.out.println(menor);

            contadorpares = 0;
            contadorimpares = 0;
            soma = 0;
            media = 0.00f;
            maior = 0;
            menor = 0;
            vetor = new ArrayList<Integer>();

            entrada = scan.nextInt();
            if (entrada == -1) {
                condicao = false;
            }
        }
    }
}

class Mediana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<Integer>();
        int entrada = 0;
        double mediana = 0.0;

        do {
            entrada = scan.nextInt();
            if (entrada != -1) {
                valores.add(entrada);
            }
        } while (entrada != -1);

        if (valores.size() % 2 != 0) {
            mediana = valores.get(valores.size() / 2);
        } else {
            mediana = valores.get(valores.size() / 2);
            mediana += valores.get(valores.size() / 2 - 1);
            mediana /= 2.0;
        }
        System.out.println(mediana);
    }
}