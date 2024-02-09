/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ud5.cuenta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author DAM104
 */
public class CuentaTest {
    private Cuenta cuenta;
    private Cuenta cuenta2;
    
    public CuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        cuenta = new Cuenta("CYEBTA1", 100);
        cuenta2 = new Cuenta("JOAJSFDJ", 0);
    }
    
    @AfterEach
    public void tearDown() {
        Cuenta cuenta = null;
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        //System.out.println("getSaldo");
        //Cuenta instance = new Cuenta("CYEBTA1", 100);
        //float expResult = 100.0F;
        //float result = instance.getSaldo();
        assertEquals(100, cuenta.getSaldo(), 0);
    }
    
    /**
     * Test of setSaldo method, of class Cuenta.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        float saldoCta = 100.0F;
        Cuenta instance = new Cuenta("JOAJSFDJ", 0);
        instance.setSaldo(saldoCta);
        assertEquals(saldoCta, instance.getSaldo(), 0);
    }

    /**
     * Test of ingresarDinero method, of class Cuenta.
     */
    @Test
    public void testIngresarDinero() {
        System.out.println("ingresarDinero");
        float importe = 300.0F;
        Cuenta instance = new Cuenta("CYEBTA1", 100);
        instance.ingresarDinero(importe);
        assertEquals(400, instance.getSaldo(), 0);
    }

    /**
     * Test of extraerDinero method, of class Cuenta.
     */
    @Test
    public void testExtraerDinero() {
        System.out.println("extraerDinero");
        float importe = 40.0F;
        Cuenta instance = new Cuenta("CYEBTA1", 100);
        instance.extraerDinero(importe);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(60, instance.getSaldo(), 0);
    }

  
    /**
     * Test of getNumero method, of class Cuenta.
     */
    @Disabled
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Cuenta instance = null;
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of setNumero method, of class Cuenta.
     */
    @Disabled
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numCta = "";
        Cuenta instance = null;
        instance.setNumero(numCta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of monstrarCuenta method, of class Cuenta.
     */
    @Disabled
    @Test
    public void testMonstrarCuenta() {
        System.out.println("monstrarCuenta");
        Cuenta instance = null;
        instance.monstrarCuenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
