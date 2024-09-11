public class EmailGmail extends Email {
    
    public EmailGmail(String to, String subject, String body) {
        super(to, subject, body);
    }
    
    @Override
    public void enviarEmail() {
        // Implementación de envío a Gmail
    }
}

