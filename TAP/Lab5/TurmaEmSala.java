public class TurmaEmSala {
    Turma turma;
    Sala sala;

    TurmaEmSala() {
        this.turma = new Turma();
        this.sala = new Sala();
    }

    TurmaEmSala(Turma turma, Sala sala) {
        this.turma = turma;
        this.sala = sala;
    }
}
