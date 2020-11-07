import java.util.ArrayList;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios;

    Turma() {
        this.nome = "";
        this.professor = "";
        this.numAlunos = 0;
        this.acessivel = false;
        this.horarios = null;
        horarios = new ArrayList<Integer>();
    }

    Turma(String nome, String professor, int numAlunos, boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        horarios = new ArrayList<Integer>();
    }

    void addHorario(int horario) {
        this.horarios.add(horario);
    }

    String getHorariosString() {
        ArrayList<String> saida = new ArrayList<String>();
        String exit = "";
        for (int x = 0; x < this.horarios.size(); x++)
            saida.add("");

        ArrayList<Integer> segunda = new ArrayList<Integer>();
        ArrayList<Integer> terca = new ArrayList<Integer>();
        ArrayList<Integer> quarta = new ArrayList<Integer>();
        ArrayList<Integer> quinta = new ArrayList<Integer>();
        ArrayList<Integer> sexta = new ArrayList<Integer>();

        ArrayList<Integer> oito = new ArrayList<Integer>();
        ArrayList<Integer> dez = new ArrayList<Integer>();
        ArrayList<Integer> doze = new ArrayList<Integer>();
        ArrayList<Integer> catorze = new ArrayList<Integer>();
        ArrayList<Integer> dezesseis = new ArrayList<Integer>();
        ArrayList<Integer> dezoito = new ArrayList<Integer>();
        ArrayList<Integer> vinte = new ArrayList<Integer>();

        for (int x = 1; x <= 7; x++)
            segunda.add(x);
        for (int x = 8; x <= 14; x++)
            terca.add(x);
        for (int x = 15; x <= 21; x++)
            quarta.add(x);
        for (int x = 22; x <= 28; x++)
            quinta.add(x);
        for (int x = 29; x <= 35; x++)
            sexta.add(x);

        for (int i = 0; i < this.horarios.size(); i++) {
            if (segunda.contains(this.horarios.get(i)))
                saida.set(i, "segunda");
            else if (terca.contains(this.horarios.get(i)))
                saida.set(i, "terça");
            else if (quarta.contains(this.horarios.get(i)))
                saida.set(i, "quarta");
            else if (quinta.contains(this.horarios.get(i)))
                saida.set(i, "quinta");
            else if (sexta.contains(this.horarios.get(i)))
                saida.set(i, "sexta");
        }

        for (int x = 1; x <= 35; x += 7)
            oito.add(x);
        for (int x = 2; x <= 35; x += 7)
            dez.add(x);
        for (int x = 3; x <= 35; x += 7)
            doze.add(x);
        for (int x = 4; x <= 35; x += 7)
            catorze.add(x);
        for (int x = 5; x <= 35; x += 7)
            dezesseis.add(x);
        for (int x = 6; x <= 35; x += 7)
            dezoito.add(x);
        for (int x = 7; x <= 35; x += 7)
            vinte.add(x);

        for (int i = 0; i < this.horarios.size() - 1; i++) {
            if (oito.contains(this.horarios.get(i)))
                exit += saida.get(i) + " 8hs";
            else if (dez.contains(this.horarios.get(i)))
                exit += saida.get(i) + " 10hs";
            else if (doze.contains(this.horarios.get(i)))
                exit += saida.get(i) + " 12hs";
            else if (catorze.contains(this.horarios.get(i)))
                exit += saida.get(i) + " 14hs";
            else if (dezesseis.contains(this.horarios.get(i)))
                exit += saida.get(i) + " 16hs";
            else if (dezoito.contains(this.horarios.get(i)))
                exit += saida.get(i) + " 18hs";
            else if (vinte.contains(this.horarios.get(i)))
                exit += saida.get(i) + " 20hs";

            exit += ", ";
        }

        if (oito.contains(this.horarios.get(horarios.size() - 1)))
            exit += saida.get(horarios.size() - 1) + " 8hs";
        else if (dez.contains(this.horarios.get(horarios.size() - 1)))
            exit += saida.get(horarios.size() - 1) + " 10hs";
        else if (doze.contains(this.horarios.get(horarios.size() - 1)))
            exit += saida.get(horarios.size() - 1) + " 12hs";
        else if (catorze.contains(this.horarios.get(horarios.size() - 1)))
            exit += saida.get(horarios.size() - 1) + " 14hs";
        else if (dezesseis.contains(this.horarios.get(horarios.size() - 1)))
            exit += saida.get(horarios.size() - 1) + " 16hs";
        else if (dezoito.contains(this.horarios.get(horarios.size() - 1)))
            exit += saida.get(horarios.size() - 1) + " 18hs";
        else if (vinte.contains(this.horarios.get(horarios.size() - 1)))
            exit += saida.get(horarios.size() - 1) + " 20hs";

        return String.format("%s", exit);
    }

    String getDescricao() {
        if (this.acessivel == true)
            return String.format("Turma: %s\nProfessor: %s\nNúmero de Alunos: %s\nHorário: %s\nAcessível: sim",
                    this.nome, this.professor, this.numAlunos, this.getHorariosString());
        else
            return String.format("Turma: %s\nProfessor: %s\nNúmero de Alunos: %s\nHorário: %s\nAcessível: não",
                    this.nome, this.professor, this.numAlunos, this.getHorariosString());

    }
}
