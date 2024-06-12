package navegador;

public class Safari implements NavegadorInternet {
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionou nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizou página");
    }
}
