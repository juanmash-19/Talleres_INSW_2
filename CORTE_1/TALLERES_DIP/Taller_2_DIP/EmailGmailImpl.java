public class EmailGmailImpl implements IServicioEmail {
    
    public EmailGmailImpl(String image, String to, String subject, String body) {
        super(image, to, subject, body);
    }

    @Override
    public void enviarEmail(Email email) {
        EmailGmail gmail = (EmailGmail) email;
        System.out.println("Enviando email a gmail");
}
}
