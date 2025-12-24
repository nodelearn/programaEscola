package escola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Integer cargaHoraria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }

        ArrayList<Professor> professores;

        ArrayList<Turma> turmas;

    }
}
