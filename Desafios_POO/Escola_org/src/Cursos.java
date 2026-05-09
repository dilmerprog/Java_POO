public class Cursos {

    // Atributos
    private String nomeDoCurso;
    private int cargaHoraria;
    private float valorMensalidade;

    //Atributp de Classe
    static int totalCursosCriados = 0;

    //Construtor
    public Cursos(String nomeDoCurso, int cargaHoraria, float valorMensalidade) {
        this.nomeDoCurso = nomeDoCurso;
        this.cargaHoraria = cargaHoraria;
        this.valorMensalidade = valorMensalidade;

        totalCursosCriados++;
    }

    //Getters e Setters
    public String getNomeDoCurso() {
        return nomeDoCurso;
    }


}
