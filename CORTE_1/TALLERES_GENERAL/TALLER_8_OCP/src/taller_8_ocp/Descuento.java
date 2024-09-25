/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Descuento to edit this template
 */
package taller_8_ocp;

/**
 *
 * @author juanm
 */
public abstract class Descuento  {
    private float valor;

    public Descuento(float valor) {
        this.valor = valor;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
}
