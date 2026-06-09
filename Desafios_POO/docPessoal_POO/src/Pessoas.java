public class Pessoas {
    protected int ID;
    protected String nome;
    protected String logradouro;
    protected String numero;
    protected String CEP;
    protected String bairro;

    //getters e setters
    public int getId() { return this.ID; }
    public void setId(int id) { this.ID = id; }

    public String getNome() {return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLogradouro() { return this.logradouro; }
    public void setLogradouro(String log) { this.logradouro = log; }

    public String getNumero() {return this.numero; }
    public void setNumero(String num) { this.numero = num; }

    public String getCEP() { return this.CEP; }
    public void setCEP(String cep) { this.CEP = cep; }

    public String getBairro() {return this.bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    // método construtor - sem parametros
    public Pessoas() {
        this.setId(0);
        this.setNome("");
        this.setLogradouro("");
        this.setNumero("");
        this.setCEP("");
        this.setBairro("");
    }

    // método construtor - com parametros
    // sobrecarga - ato de ter dois blocos de códigos com mesmo nome, entretanto, com assinatura diferentes (parametros)
    public Pessoas(int id, String nome, String log, String num, String cep, String bairro) {
        this.setId(id);
        this.setNome(nome);
        this.setLogradouro(log);
        this.setNumero(num);
        this.setCEP(cep);
        this.setBairro(bairro);
    }

    //método
    public void ExibirDados() {
        System.out.println("==== Dados da pessoa ====");
        System.out.println("ID            : " + this.getId());
        System.out.println("Nome          : " + this.getNome());
        System.out.println("Logradouro    : " + this.getLogradouro());
        System.out.println("Número        : " + this.getNumero());
        System.out.println("CEP           : " + this.getCEP());
        System.out.println("Bairro        : " + this.getBairro());
    }
}
