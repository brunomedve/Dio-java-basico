package aparelho;

import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;
import tocador_musica.ReprodutorMusical;

    public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    public void ligar() {
        System.out.println("Ligando do iphone");
    }
    public void atender() {
        System.out.println("Atendendo do iphone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio voz do iphone");
    }

    public void tocar() {
        System.out.println("Tocando musica do iphone");
    }
    public void pausar() {
        System.out.println("Pausando Musica do iphone");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando musica do iphone");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina do iphone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba do iphone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do iphone");
    }
}
