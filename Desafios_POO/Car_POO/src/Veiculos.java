public class Veiculos {
    // declaração de atributos (variáveis)
    String placa, marca, modelo;
    int anoFab;
    static String cor;

    //getters (leitura) e setters (define ou atribui valores)
    public void setPlaca(String _placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFab(int ano) {
        this.anoFab = ano;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnoFab() {
        return this.anoFab;
    }

    //Criação dos métodos
    public void frear() {
        System.out.println("O veículo está frando!");
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando, cuidado!");
    }
}
