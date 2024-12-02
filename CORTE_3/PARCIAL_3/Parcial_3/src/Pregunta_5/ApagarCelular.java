/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_5;

/**
 *
 * @author juanm
 */
public class ApagarCelular implements Command {
    private Celular celular;

    public ApagarCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.apagar();
    }
}
