public class Associados extends Pessoas{
    // extends corresponde ao conceito de herança
    // Associados é a classe filha
    // Pesssoa e a classe pai

    private String situacao;
    private int nro_associado;

    // get e set
    public String getSituacao() { return this.situacao; }
    public void setSituacao(String sit) { this.situacao = sit; }

    public int getNro_associado() { return this.nro_associado; }
    public void setNro_associado(int num) { this.nro_associado = num; }

    // construtor - sem parametros
    public Associados() {
        super();                       // carrega ou chama para executar o metodo
                                       // construtor da classe pai (pessoas)
        this.setSituacao("");
        this.setNro_associado(0);
    }

    public Associados(String situacao, int nro_assoc, int id, String nome, String log, String num, String cep, String bairro){
        super(id, nome, log, num, cep, bairro);
        this.setSituacao(situacao);
        this.setNro_associado(nro_assoc);
    }

    public void ExibirDados() {
        super.ExibirDados();  // irá carregar o método exibidados da classe pai
        System.out.println("==== Dados da pessoa ====");
        System.out.println("Nro.Associado: " + this.getNro_associado());
        System.out.println("Sistuação    : " + this.getSituacao());

    }
}
