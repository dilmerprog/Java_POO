public class Cursos {

    // Atributos
    private String nomeDoCurso;
    private int cargaHoraria;
    private double valorMensalidade;

    //Atributp de Classe
    static int totalCursosCriados = 0;

    //Construtor
    public Cursos(String nomeDoCurso, int cargaHoraria, double valorMensalidade) {
        this.nomeDoCurso = nomeDoCurso;
        this.cargaHoraria = cargaHoraria;
        this.valorMensalidade = valorMensalidade;

        totalCursosCriados++;
    }

    //Getters e Setters
    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    //Metodo
    public void MostrarDadosCurso() {
        System.out.println("Nome do curso: " + nomeDoCurso);
        System.out.println("Carga horária: " + cargaHoraria);
        System.out.println("Mensalidade: " + valorMensalidade);
    }
}
