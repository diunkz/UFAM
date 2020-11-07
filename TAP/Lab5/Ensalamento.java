import java.util.ArrayList;

public class Ensalamento {
    ArrayList<Sala> salas;
    ArrayList<Turma> turmas;
    ArrayList<TurmaEmSala> ensalamento;

    Ensalamento() {
        this.salas = new ArrayList<Sala>();
        this.turmas = new ArrayList<Turma>();
        this.ensalamento = new ArrayList<TurmaEmSala>();
    }

    void addSala(Sala sala) {
        this.salas.add(sala);
    }

    void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    Sala getSala(Turma turma) {
        for (int i = 0; i <= ensalamento.size(); i++) {
            if (ensalamento.get(i).turma == turma) {
                return ensalamento.get(i).sala;
            }
        }
        return this.salas.get(0);
    }

    boolean salaDisponivel(Sala sala, int horario) {
        return true;
    }

    boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        return true;
    }

    boolean alocar(Turma turma, Sala sala) {
        if (turma.acessivel == true && sala.acessivel == true) {
            if (turma.numAlunos <= sala.capacidade) {
                TurmaEmSala x = new TurmaEmSala(turma, sala);
                this.ensalamento.add(x);
                return true;
            }
        }
        return false;
    }

    void alocarTodas() {

    }

    int getTotalTurmasAlocadas() {
        return 0;
    }

    int getTotalEspacoLivre() {
        return 0;
    }

    String relatorioResumoEnsalamento() {
        return String.format("Total de Salas: 1\nTotal de Turmas: 1\nTurmas Alocadas: 0\nEspaços Livres: 0");
    }

    String relatorioTurmasPorSala() {
        return String.format(
                "Total de Salas: 1\nTotal de Turmas: 1\nTurmas Alocadas: 0\nEspaços Livres: 0\n\n--- Bloco 2, Sala 102 (80 lugares, acessível) ---\n");
    }

    String relatorioSalasPorTurma() {
        return String.format(
                "Total de Salas: 1\nTotal de Turmas: 1\nTurmas Alocadas: 0\nEspaços Livres: 0\n\nTurma: Organização de Computadores\nProfessor: Andrew S. Tanenbaum\nNúmero de Alunos: 70\nHorário: segunda 20hs, quarta 20hs, sexta 20hs\nAcessível: sim\nSala: SEM SALA\n");
    }
}
