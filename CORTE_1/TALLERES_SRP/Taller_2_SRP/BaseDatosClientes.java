// Clase para guardarr la base de datos de Clientes
class ClienteDAO {
    public void guardarCliente(Cliente cliente) {
        //  Como se guardaria el cliente en la base de datos
        System.out.println("Conectando a la base de datos...");
        System.out.println("Guardando cliente " + cliente.getNombre() + " con correo " + cliente.getCorreo() + " en la base de datos.");
    }
}