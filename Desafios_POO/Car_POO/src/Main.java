public class Main {
    public static void main (String[] args) {
        //criando um objeto da clase veiculos
        //nome_classe nome_objeto = new nome_classe();
        Veiculos carro1 = new Veiculos();
        carro1.setPlaca("AAA-1111");
        carro1.setMarca("Audi");
        carro1.setModelo("RS5");
        carro1.setAnoFab(2015);
        Veiculos.cor = "Azul";


        Veiculos carro2 = new Veiculos();
        carro2.setPlaca("BBB-2222");
        carro2.setMarca("Volkswagem");
        carro2.setModelo("Fusca");
        carro2.setAnoFab(1975);
    }
}