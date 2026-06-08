public class Conta {
    private int nro_conta, agencia;
    private float saldo;
    private String nome;

    //getters
    public int getNroConta() {
        return this.nro_conta;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String getNome() {
        return this.nome;
    }

    //setters
    public void setNroConta(int num) {
        this.nro_conta = num;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void MonstrarDados() {
        System.out.println("==== Dados da Conta ====");
        System.out.println("Nro. Conta : " + this.getNroConta());
        System.out.println("Agência    : " + this.getAgencia());
        System.out.println("Saldo      : " + this.getSaldo());
        System.out.println("Nome       : " + this.getNome());
    }

    public void Depositar(float valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void Sacar(float valor) {
        this.setSaldo(this.getSaldo() - valor);
    }
}
