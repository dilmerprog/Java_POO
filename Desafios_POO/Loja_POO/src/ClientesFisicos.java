public class ClientesFisicos extends Cliente{
    protected String rg, cpf;

    // gettters
    public String getRG() { return this.rg; }
    public String getCpf() { return this.cpf; }

    // setters
    public void setRG(String rg) { this.rg = rg; }
    public void setCPF(String cpf) { this.cpf = cpf; }

    public void MostrarDados() {
        System.out.println("==== Dados dos Clientes Fídicos ====");
        System.out.println("Número    : " + this.getNumero());
        System.out.println("Nome      : " + this.getNome());
        System.out.println("E-mail    : " + this.getEmail());
        System.out.println("RG        : " + this.getRG());
        System.out.println("CPF       : " + this.getCpf());
    }

}
