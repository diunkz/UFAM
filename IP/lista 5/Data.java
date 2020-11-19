import java.util.Scanner;
import java.util.Vector;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    Data() {

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean bissexto() {
        if ((getAno() % 400 == 0) || ((getAno() % 4 == 0) && (getAno() % 100 != 0))) {
            return true;
        }
        return false;
    }

    public void verificacao() {
        Vector<Integer> trintaeum = new Vector<Integer>();
        trintaeum.add(1);
        trintaeum.add(3);
        trintaeum.add(5);
        trintaeum.add(7);
        trintaeum.add(8);
        trintaeum.add(10);
        trintaeum.add(12);

        Vector<Integer> trinta = new Vector<Integer>();
        trinta.add(4);
        trinta.add(6);
        trinta.add(9);
        trinta.add(11);

        int fevereiro = 0;
        boolean dataValida = false;

        if ((getDia() >= 1 && getDia() <= 31) && (getMes() >= 1 && getMes() <= 12)) {
            if (bissexto()) {
                if (mes == 2) {
                    if (getDia() > 0 && getDia() < 30) {
                        dataValida = true;
                    }
                } else {
                    if (trinta.contains(getMes())) {
                        if (getDia() > 0 && getDia() < 31) {
                            dataValida = true;
                        }
                    } else if (trintaeum.contains(getMes())) {
                        if (getDia() > 0 && getDia() < 31) {
                            dataValida = true;
                        }
                    }
                }
            } else {
                fevereiro = 28;
                if (mes == 2) {
                    if (getDia() > 0 && getDia() < 29) {
                        dataValida = true;
                    }
                } else {
                    if (trinta.contains(getMes())) {
                        if (getDia() > 0 && getDia() < 31) {
                            dataValida = true;
                        }
                    } else if (trintaeum.contains(getMes())) {
                        if (getDia() > 0 && getDia() < 31) {
                            dataValida = true;
                        }
                    }
                }
            }

        }

        if (dataValida == true) {
            System.out.println("DATA VALIDA");
        } else {
            System.out.println("DATA INVALIDA");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Data d = new Data();

        int dia = scan.nextInt();
        int mes = scan.nextInt();
        int ano = scan.nextInt();
        scan.close();
        d.setDia(dia);
        d.setMes(mes);
        d.setAno(ano);
        d.verificacao();
    }
}
