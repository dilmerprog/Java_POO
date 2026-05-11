public class Alunos {
    //Atributos
    private String ra;
    private String nomeAluno;
    private String email;

    //Relação
    private Cursos curso;

    //Atributo
    static int totalAlunosCadastrados = 0;

    //Construtor
    public Alunos(String ra, String nomeAluno, String email, Cursos curso) {
        this.ra = ra;
        this.nomeAluno = nomeAluno;
        this.email = email;
        this.curso = curso;

        totalAlunosCadastrados++;
    }

    //Getters e Stters
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void  setCurso(Cursos curso) {
        this.curso = curso;
    }

    //Métodos
    public void MonstraDadosAluno() {
        System.out.println("RA: " + ra);
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Email: " + email);

        //Pegando nome do curso
        System.out.println("Curso: " + curso.getNomeDoCurso());
    }
}

