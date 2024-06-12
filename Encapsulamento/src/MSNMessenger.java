public class MSNMessenger {
   public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo MSN Menssager");
    salvarHistoricoMensagem();
   }
   public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN Menssager");
   }
   private void validarConectadoInternet(){
    System.out.println("Validando se está conectado a internet");
   }
   private void salvarHistoricoMensagem() {
    System.out.println("Salvando histórico da mensagem");
   }
}
