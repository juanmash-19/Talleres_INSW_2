/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_2;

/**
 *
 * @author juanm
 */
public class Hamburguesa {
    private String tipoTomate;
    private String tipoLechuga;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

    private Hamburguesa(Builder builder) {
        this.tipoTomate = builder.tipoTomate;
        this.tipoLechuga = builder.tipoLechuga;
        this.tipoCarne = builder.tipoCarne;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "tipoTomate='" + tipoTomate + '\'' +
                ", tipoLechuga='" + tipoLechuga + '\'' + 
                ", tipoCarne='" + tipoCarne + '\'' +
                ", tipoQueso='" + tipoQueso + '\'' +
                ", tipoPan='" + tipoPan + '\'' +
                '}';
    }
}
