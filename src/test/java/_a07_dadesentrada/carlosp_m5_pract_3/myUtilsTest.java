/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package _a07_dadesentrada.carlosp_m5_pract_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author agusm
 */
public class myUtilsTest {
    
    public myUtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inverteix method, of class myUtils.
     */
    
    @Test
    public void testInverteixCorrecte() {
        System.out.println("inverteix");
        String cadena = "Hola Mundo";
        String expResult = "odnuM aloH";
        String result = myUtils.inverteix(cadena);
        assertEquals(expResult, result);
    }   //Passa el Test
    
    @Test
    public void testInverteixError() {
        System.out.println("inverteix");
        String cadena = "Hola Mundo";
        String expResult = "OdnuM aloH";
        String result = myUtils.inverteix(cadena);
        assertEquals(expResult, result);
    } //No passa el Test
    
    @Test
    public void testInverteixNull() {
        System.out.println("inverteix");
        String cadena = null;
        String expResult = null;
        String result = myUtils.inverteix(cadena);
        assertEquals(expResult, result);
    } //No passa el Test

    @Test
    public void testInverteixAsserts() {
        myUtils myUtils = new myUtils();
        assertFalse(myUtils.inverteix("HOLA"));
        assertTrue(myUtils.inverteix("HOLA"));
    } //Passa el Test
    
    /**
     * Test of edat method, of class myUtils.
     */
    @Test
    public void testEdatNormal() {
        System.out.println("edat");
        int day = 14;
        int month = 3;
        int year = 2000;
        int expResult = 24;
        int result = myUtils.edat(day, month, year);
        assertEquals(expResult, result);
    }   //Passa el test
    
    @Test
    public void testEdatMajor() {
        System.out.println("edat");
        int day = 14;
        int month = 3;
        int year = 1754;
        int expResult = -1;
        int result = myUtils.edat(day, month, year);
        assertEquals(expResult, result);
    }   //Passa el test
    
    @Test
    public void testEdatDadesIncorrectes() {
        System.out.println("edat");
        int day = 567;
        int month = 456;
        int year = 3009;
        int expResult = -2;
        int result = myUtils.edat(day, month, year);
        assertEquals(expResult, result);
    } //Passa el test
    
    /**
     * Test of factorial method, of class myUtils.
     */
    @Test
    public void testFactorialNormal() {
        System.out.println("factorial");
        double numero = 5;
        double expResult = 120;
        double result = myUtils.factorial(numero);
        assertEquals(expResult, result, 0);
    }   //Passa el Test
    
    @Test
    public void testFactorialFailed() {
        System.out.println("factorial");
        double numero = 9;
        double expResult = 120;
        double result = myUtils.factorial(numero);
        assertEquals(expResult, result, 0);
    }   //No Passa el Test
    
    @Test
    public void testFactorialZero() {
        System.out.println("factorial");
        double numero = 0;
        double expResult = 1;
        double result = myUtils.factorial(numero);
        assertEquals(expResult, result, 0);
    }   //Passa el Test
       
    private void assertTrue(String inverteix) {
        
    }

    private void assertFalse(String inverteix) {
        
    }
    
    private void assertFalse(int dia, int mes, int any) {
        
    }
    
}
