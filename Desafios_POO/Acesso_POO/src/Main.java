import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        // criando objeto da classe conta
        Conta conta1 = new Conta();

        System.out.println("Digite o Número da Conta:");
        conta1.setNroConta(entrada.nextInt());

        System.out.println("Digite a agência :");
        conta1.setAgencia(entrada.nextInt());

        System.out.println("Saldo da Conta: ");
        conta1.setSaldo(entrada.nextFloat());

        System.out.println("Digite o nome da pessoa: ");
        conta1.setNome(entrada.next());

        conta1.MonstrarDados();

        System.out.println("Digite o valor do Depósito: ");
        conta1.Depositar(entrada.nextFloat());

        conta1.MonstrarDados();

        System.out.println("Digite o valor do Saque: ");
        conta1.Sacar(entrada.nextFloat());

        conta1.MonstrarDados();
    }
}
