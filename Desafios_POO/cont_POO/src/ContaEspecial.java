public class ContaEspecial extends ContaComum {
    public float limite;

    public void setLimite(float valor) {
        this.limite = valor;
    }

    public float getLimite() {
        return this.limite;
    }

    public ContaEspecial() {
        super();
        this.setLimite(0);
    }

    public ContaEspecial(float saldo, float limite) {
        super(saldo);
        this.setLimite(limite);
    }

    // polimorfimo
    @Override
    public String Saque(float valor) {
        float futuruSaldo = this.getSaldo() + this.getLimite() - valor;
        if (futuruSaldo >= 0) {
            this.setSaldo(futuruSaldo);
            return "Saque efetuado com sucesso!";
        }else {
            return "Saldo insuficiente, restando apenas R$ " +this.getSaldo();
        }
    }
}
