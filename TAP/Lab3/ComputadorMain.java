public class ComputadorMain {
    public static void main(String[] args) {
        Processador proc = new Processador();
        Memoria memo = new Memoria();
        Disco disc = new Disco();
        Computador teste = new Computador("intel", proc, memo, disc);
    }
}
