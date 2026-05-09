public class Main {
    public static void main(String[] args) {

        // Criando Contas
        ContaBancaria conta1 = new ContaBancaria("João", 123);
        ContaBancaria conta2 = new ContaBancaria("Maria", 456);

        //Operações
        conta1.depositar(1500);
        conta1.sacar(200);

        conta2.depositar(500);

        //Transferência
        conta1.exibirDados();
        conta2.exibirDados();
    }
}