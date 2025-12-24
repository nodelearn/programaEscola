package programaescolaexecutar;

import escola.Disciplina;

public class Main {
    public static void main(String[] args){
        // Nosso código que criamos

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Geografia");
        disciplina1.setCargaHoraria(0);

        System.out.println(disciplina1.getNome());
        System.out.println(disciplina1.getCargaHoraria());

    }
}