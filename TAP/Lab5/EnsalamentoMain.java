public class EnsalamentoMain {
    public static void main(String[] args) {
        Sala sala = new Sala(6, 101, 50, true);
        Turma turma = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, true);
        TurmaEmSala xd = new TurmaEmSala(turma, sala);
        Ensalamento ensalamento = new Ensalamento();
        ensalamento.addSala(sala);
        ensalamento.addTurma(turma);
        ensalamento.getSala(turma);

        Ensalamento e1 = new Ensalamento();
        Sala s1 = new Sala(2, 102, 80, true);
        e1.addSala(s1);
        Turma t1 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 70, true);
        t1.addHorario(7);
        t1.addHorario(21);
        t1.addHorario(35);
        e1.addTurma(t1);
        System.out.println(e1.getTotalTurmasAlocadas());
    }
}
