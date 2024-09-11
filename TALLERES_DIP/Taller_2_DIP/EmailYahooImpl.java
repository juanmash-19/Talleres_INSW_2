public class EmailYahooImpl extends EmailYahoo implements IServicioEmail{

    public EmailYahooImpl(String image, String to, String subject, String body){
        super(image, to, subject, body);
    }

    @Override
    public void enviarEmail() {
        System.out.println("Enviando email con yahoo");
    }
}
