public class EmailOutlookImpl extends EmailOutlook implements  IServicioEmail {

    public EmailOutlookImpl(String image, String to, String subject, String body) {
        super(image, to, subject, body);
    }

    @Override
    public void enviarEmail() {
        System.out.println("Enviando email Outlook");
    }
}
