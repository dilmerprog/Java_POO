public class Main {
    public static void main (String[] args) {
        // criando um objeto da classe Pessoas
        // Nome_da_Classe nome_obj = new Nome_da_Classe();
        Pessoa pes1 = new Pessoa();
        pes1.nome = "Lucio";
        pes1.altura = 1.73f;
        pes1.peso = 83;

        pes1.Respirar();
        pes1.Comer();
        pes1.Falar();

        Pessoa pes2 = new Pessoa();
        pes2.nome = "Nelson";
        pes2.altura = 1.74f;
        pes2.peso = 70;

        pes2.Respirar();
        pes2.Falar();
        pes2.Comer();
    }
}