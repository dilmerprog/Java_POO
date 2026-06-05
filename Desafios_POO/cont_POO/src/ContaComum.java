public class ContaComum {
    protected float saldo;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public ContaComum() {
        this.setSaldo(0);
    }

    public ContaComum(float saldo) {
        this.setSaldo(saldo);
    }

    public String Saque(float valor) {
        float futuroSaldo = this.getSaldo() - valor;
        if (futuroSaldo >= 0) {
            this.setSaldo(futuroSaldo);
            return "Saque efetuado com sucesso!";
        }else {
            return "Saque insuficiente, restando apenas R$ " + this.getSaldo();
        }
    }
}
