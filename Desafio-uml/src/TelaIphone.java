import aparelho.Iphone;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;
import tocador_musica.ReprodutorMusical;

public class TelaIphone {
    public static void main(String[] args) {
        Iphone em = new Iphone();

        NavegadorInternet navegadorInternet = em;
        
        ReprodutorMusical reprodutorMusical = em;

        AparelhoTelefonico aparelhoTelefonico = em;

        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioVoz();
        

    }
}
