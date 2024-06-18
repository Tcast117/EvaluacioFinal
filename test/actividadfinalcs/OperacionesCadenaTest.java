/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadfinalcs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BIOSTEEL_SISTEMAS
 */
public class OperacionesCadenaTest {
    private OperacionesCadena opc;
    
    public OperacionesCadenaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.opc = new OperacionesCadena();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validacionDatos method, of class OperacionesCadena.
     */
    @Test
    public void testValidacionDatos() {
        assertTrue(opc.validacionDatos("Hola Mundo", "Hola")==true);
        assertFalse(opc.validacionDatos("", "")==true);
        assertFalse(opc.validacionDatos("Hola", "")==true);
        assertFalse(opc.validacionDatos("", "Mundo")==true);
    }

    /**
     * Test of validarCadena method, of class OperacionesCadena.
     */
    @Test
    public void testValidarCadena() {
        assertEquals("Hola", opc.validarCadena("Hola."));
        assertEquals("Hola Mundo", opc.validarCadena("Hola, Mundo!"));
        assertEquals("Java123", opc.validarCadena("Java-123#"));
        assertEquals("", opc.validarCadena("!@#$%^&*()"));
    }

    /**
     * Test of esSubCadenaX method, of class OperacionesCadena.
     */
    @Test
    public void testEsSubCadenaX() {
        assertTrue(opc.esSubCadenaX("Hola Mundo", "Mundo"));
        assertFalse(opc.esSubCadenaX("Hola Mundo", "Java")); // Caso donde y no es subcadena de x
        assertTrue(opc.esSubCadenaX("Hola Hola Hola", "Hola")); // Subcadena repetida
        assertFalse(opc.esSubCadenaX("Hola", "Hola Mundo")); // y es mayor que x
    }

    /**
     * Test of concatenarCadena method, of class OperacionesCadena.
     */
    @Test
    public void testConcatenarCadena() {
        assertEquals("Hola  Mundo", opc.concatenarCadena("Hola", " Mundo"));
        assertEquals("Hello World", opc.concatenarCadena("Hello", "World"));
    }

    /**
     * Test of contarCadena method, of class OperacionesCadena.
     */
    @Test
    public void testContarCadena() {
        assertTrue(opc.contarCadena("Hola", "Hola Mundo")==1);
        assertTrue(opc.contarCadena("Hola", "Hola Hola Hola")==3);
        assertTrue(opc.contarCadena("Java", "Hola Mundo")==0);
        assertTrue(opc.contarCadena("aa", "aaaa")==2);
    }    
}
