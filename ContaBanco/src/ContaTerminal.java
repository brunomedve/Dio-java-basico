import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor digite o número da sua conta: ");
        int conta = scanner.nextInt();

        double saldo = 237.48;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + " ,conta " + conta + " , e seu saldo é de R$ " + saldo + " ja está disponínel");

        scanner.close();
    }
}
