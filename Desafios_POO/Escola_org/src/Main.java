public class Main {

    public static void main(String[] args) {

        //Crinado cursos
        Cursos curso1 = new Cursos(
                "Java",
                80,
                350.0
        );

        Cursos curso2 = new Cursos(
                "Python",
                60,
                300.0
        );

        //Criando Alunos
        Alunos aluno1 = new Alunos(
                "001",
                "Carlos",
                "Carlos@gmail.com",
                curso1
        );

        Alunos aluno2 = new Alunos(
                "002",
                "Ana",
                "ana@gmail.com",
                curso2
        );

        //Mostrar Cursos
        System.out.println("==== Cursos ====");

        curso1.MostrarDadosCurso();
        System.out.println();

        curso2.MostrarDadosCurso();
        System.out.println();

        //Total de Cursos
        System.out.println("Total de cursos: " + Cursos.totalCursosCriados);
        System.out.println();

        //Mostrar Alunos
        System.out.println("==== Alunos ====");

        aluno1.MonstraDadosAluno();
        System.out.println();

        aluno2.MonstraDadosAluno();
        System.out.println();


        //Total de Alunos
        System.out.println("Total de alunos: " + Alunos.totalAlunosCadastrados);
    }
}
