import java.util.Scanner;

public class Pessoa {
    public float altura;
    public char sexo;

    Pessoa() {

    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void pesoIdeal() {
        double resultado = 0.0;

        if (getSexo() == 'M' || getSexo() == 'm') {
            resultado = (72.7 * getAltura()) - 58.0;
        } else if (getSexo() == 'F' || getSexo() == 'f') {
            resultado = (62.1 * getAltura()) - 44.7;
        }

        System.out.printf("Peso Ideal: %.2f kg", resultado);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa p = new Pessoa();
        float altura = scan.nextFloat();
        char sexo = scan.next().charAt(0);
        scan.close();
        p.setAltura(altura);
        p.setSexo(sexo);
        p.pesoIdeal();
    }
}
