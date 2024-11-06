package Pregunta5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BancoTest {
    private Banco banco;

    @BeforeAll
    public static void beforeAll(){
        banco = new Banco();
        CuentaBancaria cuenta1 = new CuentaBancaria("Marco ", 5000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Juan ", 7000);
        CuentaBancaria cuenta3 = new CuentaBancaria("Carlos ", 3000);
        List<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        banco.setCuentas(cuentas);
        System.out.println("Inicio pruebas unitarias");
    }
    @Test
    public void existeCuentaTest(){
        boolean bandera = banco.existeCuenta("Alejandro");
        Assertions.assertTrue(bandera);
    }
    @Test
    public void existeCuentaFallidoTest(){
        boolean bandera = banco.getCuentas("Jhonatan");
        Assertions.assertFalse(bandera);
    }
    @Test
    public void depositarTest(){
        System.out.println("depositarTest()");
        cuenta.depositar(5000);
        Assertions.osserEquals(10000, cuenta.getSaldo());
    }
    @Test
    public void retirarTest(){
        System.out.println("retirarTest()");
        cuenta.depositar(3000);
        Assertions.osserEquals(5000, cuenta.getSaldo());
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach()");
        cuenta = new CuentaBancaria("Juan Martín", 10000)
    }

    @AfterAll
    public static void afterAll(){
        System.out.print("Finalizo pruebas unitarias");
    }
}
