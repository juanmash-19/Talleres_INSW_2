public class Main {
    public static void main(String[] args) {
        //Creamos el usuario
        Usuario usuario = new Usuario("Juan", "Suarez", "juansuarez@gmail.com", "123456789");

        //Enviamos el correo electrónico
        Correo CorreoServicio = new CorreoServicio();
            CorreoServicio.enviarCorreo(usuario, "Apreciado Juan bienvenido");

        //Validamos la contraseña
        ValidaContraseña valida = new ContraseñaValida();
        boolean esValida = valida.validarContraseña(usuario.getContraseña());
        
        //Mostramos si la contraseña es válida
        System.out.println("Contraseña válida: " + esValida);

        //Calculamos el salario
        CalculaSalario calculadoSalario = new CalculaSalario();
        double salario = calculadoSalario.CalculaSalario(usuario);
        
        //Mostramos el salario
        System.out.println("Salario calculado: " + salario);
        
    }
    
}
