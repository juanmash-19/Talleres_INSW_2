//Clase cliente
class Cliente {
    private String nombre;
    private String correo;
    
    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

// Getters
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}