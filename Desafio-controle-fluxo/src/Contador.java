import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro:");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo dois:");
        int segundoParametro = scanner.nextInt();

        scanner.close();

        try {
            contar(primeiroParametro, segundoParametro);

        } catch (ParametrosIvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosIvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosIvalidosException("O segundo parametro deve ser maior que o primeiro");

        }
        for(int i = primeiroParametro; i <= segundoParametro; i++){
            System.out.println(i);
        }
    }
}