public class Main {
    public static void main(String[] args) {
        // criar os objetos da classe pessoas
        Pessoas p1 = new Pessoas();
        p1.ExibirDados();

        Pessoas p2 = new Pessoas(10, "Gasparzinho", "Lugar nenhum", "10", "07000-000", "Todo Lugar");
        p2.ExibirDados();

        Associados a1 = new Associados("Ativo",123456,11,"Marco","Rua xxxxx","152","07021-123","CECAP");
        a1.ExibirDados();
    }
}