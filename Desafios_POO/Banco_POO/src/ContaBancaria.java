public class ContaBancaria {

    // Atributos (encapsulados)
    private String titular;
    private double saldo;
    private int numeroConta;

    // Construtor
    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    // Getter e Setter
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    // Métofos
    public void  depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System. out.println("Valor inválido para depósito");
        }
    }

    public void sacar(double valor) {
        double taxa = 2.0;
        double valorTotal = valor + taxa;

        if (valorTotal <= saldo) {
            saldo -= valorTotal;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir (ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
        } else {
            System.out.println("Transferência inválida");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("-----------------------");
    }
}