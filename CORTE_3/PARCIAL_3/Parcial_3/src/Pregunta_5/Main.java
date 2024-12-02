/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_5;

/**
 *
 * @author juanm
 */
public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();

        Command encenderComputador = new EncenderComputador(computador);
        Command apagarComputador = new ApagarComputador(computador);
        Command encenderCelular = new EncenderCelular(celular);
        Command apagarCelular = new ApagarCelular(celular);

        Invoker invoker = new Invoker();

        invoker.setCommand(encenderComputador);
        invoker.ejecutarComando();

        invoker.setCommand(apagarComputador);
        invoker.ejecutarComando();

        invoker.setCommand(encenderCelular);
        invoker.ejecutarComando();

        invoker.setCommand(apagarCelular);
        invoker.ejecutarComando();
    }
}
