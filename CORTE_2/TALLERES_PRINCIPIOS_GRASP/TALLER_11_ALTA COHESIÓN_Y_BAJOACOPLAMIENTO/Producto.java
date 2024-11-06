public class Producto {

    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    public Producto(int idProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }
    
    @return 
    public int getIdProducto() {
        return idProducto;
    }
    
    @param idProducto 
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @return
    public String getNombreProducto() {
        return nombreProducto;
    }

    @param nombreProducto 
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    @return 
    public double getPrecioProducto() {
        return precioProducto;
    }
    
    @param precioProducto 
 
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
}