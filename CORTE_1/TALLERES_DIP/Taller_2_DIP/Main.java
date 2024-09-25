public class Main {
    public static void main(String[] args) {
        IServicioEmail servicioEmail = new EmailGmailImpl("", "", "","");
        Sistema sistema = new Sistema(servicioEmail);
        sistema.enviarEmail();
    }
}
