public class Cliente {
    protected String nome, email;
    protected int numero;

    //getters
    public String getNome() { return this.nome; }
    public String getEmail() { return this.email; }
    public int getNumero() { return this.numero; }

    //setters
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setNumero(int num) { this.numero = num; }

    public void MostrarDados() {
        System.out.println("===== Dados dos Clientes =====");
        System.out.println("Número   : " + this.getNumero());
        System.out.println("Nome     : " + this.getNome());
        System.out.println("E-mail   : " + this.getEmail());
    }
}
