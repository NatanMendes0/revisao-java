package Modelos;

public class Estudos {
    private String materia, atividade;

    public Estudos(String materia, String atividade) {
        this.materia = materia;
        this.atividade = atividade;
    }

    @Override
    public String toString() {
        return "Matéria = '" + materia + " | "  +
               "Atividade = '" + atividade + '\'';
    }
}
