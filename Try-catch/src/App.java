import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Seu nome é " + nome + " sua idade é " + idade + " sua altura é " + altura);

            scanner.close();

        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
