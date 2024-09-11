public class Sistema {
    private IServicioEmail servicioEmail;

    public Sistema(IServicioEmail servicioEmail) {
        this.servicioEmail = servicioEmail;
    }

    public void enviarEmail() {
        servicioEmail.enviarEmail();
    }
}
