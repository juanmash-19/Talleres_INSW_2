public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private double salario; 

    // Metodos para obtener la informacion del usuario
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    // Metodo para enviar correos
    public void enviarCorreo(String mensaje) {

    }

    // Metodo para validar la contraseña
    public boolean validarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }
    
    // Metodo para calcular el salario
    public double CalcularSalario(){
        return salario;
    }
}