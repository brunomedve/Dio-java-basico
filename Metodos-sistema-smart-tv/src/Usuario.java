public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - tv ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - tv ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo status - Volume atual ? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo status - volume atual ? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
