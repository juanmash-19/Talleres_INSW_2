public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String direccionCliente;
    public Cliente(int idCliente, String nombreCliente, String direccionCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
    }
    
    @return 
 
    public int getIdCliente() {
        return idCliente;
    }

    @param idCliente 
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @return 

    public String getNombreCliente() {
        return nombreCliente;
    }
    @param nombreCliente
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    @return 
    
    public String getDireccionCliente() {
        return direccionCliente;
    }
    
    @param direccionCliente 
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}