/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_2;

/**
 *
 * @author juanm
 */
public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new Hamburguesa.Builder()
                .setTipoTomate("Tomate normal")
                .setTipoLechuga("Lechuga verde")
                .setTipoCarne("Res tipo Angus")
                .setTipoQueso("Mozarella")
                .setTipoPan("Brioche")
                .build();

        System.out.println(hamburguesa);
    }
}