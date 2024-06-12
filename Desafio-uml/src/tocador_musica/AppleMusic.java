package tocador_musica;

public class AppleMusic implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando");
    }
    public void pausar() {
        System.out.println("Pausando musica");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }
}
