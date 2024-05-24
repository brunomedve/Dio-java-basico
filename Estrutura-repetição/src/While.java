import java.util.concurrent.ThreadLocalRandom;

public class While {
    
    public static void main(String[] args) {
        
     double mesada = 50.0;
     
     while (mesada > 0) {
        double valorDoce = valorAleatorio();

        System.out.println("Valor do code: " + valorDoce + "Adicionado no carrinho");
     }

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
