//package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String[] args) {
        try {
            Caminho c = new Caminho(6);
            Coordenada r1 = new Coordenada(23, 55, 8);
            c.addCoordenada(r1);

        }

        catch (CoordenadaNegativaException e1) {
            System.out.println("Erro");
        }

        catch (TamanhoMaximoExcedidoException e2) {
            System.out.println("Erro");
        }

        catch (CoordenadaForaDosLimitesException e3) {
            System.out.println("Erro");
        }

        catch (DistanciaEntrePontosExcedidaException e4) {
            System.out.println("Erro");
        }

        catch (DigitoInvalidoException e5) {
            System.out.println("Erro");
        }
    }
}
