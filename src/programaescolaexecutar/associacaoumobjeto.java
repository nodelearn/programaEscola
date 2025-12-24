package programaescolaexecutar;

import escola.Aluno;
import escola.Turma;

import java.util.Date;

public class associacaoumobjeto {
    static void main(String[] args){
        Turma turma1 = new Turma();
        turma1.setNome("1B");
        turma1.setAno(1);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Kawan");
        aluno1.setRa(555);
        aluno1.setDataNascimento(new Date(16102008));
        aluno1.setTurma(turma1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Miguel");
        aluno2.setRa(999);
        aluno2.setDataNascimento(new Date());
        aluno2.setTurma(turma1);

        System.out.println("Informacoes aluno 1");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getTurma().getNome());
    }
}
