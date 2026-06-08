public class Main {
    public static void main(String[] args) {
    Cliente cli1 = new Cliente();
    cli1.setNumero(10);
    cli1.setNome("Lucio");
    cli1.setEmail("lucio@teste.com");

    // chamaando o método MostrarDados
        cli1.MostrarDados();

        ClientesFisicos cli2 = new ClientesFisicos();
        cli2.setNumero(11);
        cli2.setNome("Nelson");
        cli2.setEmail("Nelson@teste.com");
        cli2.setRG("12.123.123-X");
        cli2.setCPF("123.456.789-00");

        cli2.MostrarDados();
    }
}