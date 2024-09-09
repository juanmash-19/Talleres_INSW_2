public  abstract class  PesoPaquete {
    private double peso;

    public PesoPaquete(double peso) {
        this.peso = peso;
    }

    /**
     * @return 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}
