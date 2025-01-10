
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero da agência:");
        int Numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String NomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        Double Saldo = scanner.nextDouble();
        scanner.close();

        System.out.printf("Olá " + NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta "+ Numero +" e seu saldo "+ Saldo +" já está disponível para saque");

    }
}
