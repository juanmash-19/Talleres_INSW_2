/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_5;

/**
 *
 * @author juanm
 */
public class ApagarComputador implements Command {
    private Computador computador;

    public ApagarComputador(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.apagar();
    }
}

