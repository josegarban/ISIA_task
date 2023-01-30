/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package matrices;

import java.awt.Dimension;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author José
 */
public class MatrizTest {
    
    public MatrizTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumarDosMatrices method, of class Matriz.
     */
    @Test
    public void testSumarDosMatrices() throws Exception {
        System.out.println("sumarDosMatrices");
        Matriz a = new Matriz(3, 3, true);
        Matriz b = new Matriz(3, 3, true);        
        Matriz r = Matriz.sumarDosMatrices(b, a);
        int result [][] = { { r.datos[0][0], r.datos[0][1], r.datos[0][2] },
                            { r.datos[1][0], r.datos[1][1], r.datos[1][2] },
                            { r.datos[2][0], r.datos[2][1], r.datos[2][2] }};

        
        int [][] ea = a.datos;
        int [][] eb = b.datos;        
        int matA[][] = { { ea[0][0], ea[0][1], ea[0][2] },
                         { ea[1][0], ea[1][1], ea[1][2] },
                         { ea[2][0], ea[2][1], ea[2][2] }};
        int matB[][] = { { eb[0][0], eb[0][1], eb[0][2] },
                         { eb[1][0], eb[1][1], eb[1][2] },
                         { eb[2][0], eb[2][1], eb[2][2] }};
        
        int filasA = a.getDimension().height; 
        int columnasA = a.getDimension().width; 
        int[][] expResult = {{0, 0, 0},{0, 0, 0},{0, 0, 0},};
        int i, j;
        for (j = 0; j < filasA; j++) { 
            for (i = 0; i < columnasA; i++) { 
                expResult[i][j] += matA[i][j] + matB[i][j]; 
            } 
        }         
        
        System.out.println(Arrays.toString(expResult));
        Assert.assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of invertirMatriz method, of class Matriz.
     */
    @Test
    public void testInvertirMatriz() {
        System.out.println("invertirMatriz");
        Matriz b = new Matriz(3, 3, true);        
        Matriz r = Matriz.invertirMatriz(b);
        int result [][] = { { r.datos[0][0], r.datos[0][1], r.datos[0][2] },
                            { r.datos[1][0], r.datos[1][1], r.datos[1][2] },
                            { r.datos[2][0], r.datos[2][1], r.datos[2][2] }};
        
        int filasB = b.getDimension().height; 
        int columnasB = b.getDimension().width; 
        int[][] expResult = {{0, 0, 0},{0, 0, 0},{0, 0, 0},};
        int i, j;
        for (j = 0; j < filasB; j++) { 
            for (i = 0; i < columnasB; i++) { 
                expResult[i][j] += b.datos[j][i]; 
            } 
        }                        
        Assert.assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicarDosMatrices method, of class Matriz.
     */
    @Test
    public void testMultiplicarDosMatrices() throws Exception {
        System.out.println("multiplicarDosMatrices");
        Matriz a = new Matriz(3, 3, true);
        Matriz b = new Matriz(3, 3, true);        
        Matriz r = Matriz.multiplicarDosMatrices(a, b);
        int result [][] = { { r.datos[0][0], r.datos[0][1], r.datos[0][2] },
                            { r.datos[1][0], r.datos[1][1], r.datos[1][2] },
                            { r.datos[2][0], r.datos[2][1], r.datos[2][2] }};

        
        int [][] ea = a.datos;
        int [][] eb = b.datos;        
        int matA[][] = { { ea[0][0], ea[0][1], ea[0][2] },
                         { ea[1][0], ea[1][1], ea[1][2] },
                         { ea[2][0], ea[2][1], ea[2][2] }};
        int matB[][] = { { eb[0][0], eb[0][1], eb[0][2] },
                         { eb[1][0], eb[1][1], eb[1][2] },
                         { eb[2][0], eb[2][1], eb[2][2] }};        
        int[][] expResult = {{0, 0, 0},{0, 0, 0},{0, 0, 0},};
        
        int i, j, k; 
        for (i = 0; i < 3; i++) { 
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++){
                    expResult[i][j] += matA[i][k] * matB[k][j]; 
                }
            } 
        }         
        
        Assert.assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Doble transposición de matrices
     */
    @Test
    public void testDobleInversion() {
        System.out.println("invertirMatriz");
        Matriz b = new Matriz(3, 3, true);        
        int expResult[][] = {{ b.datos[0][0], b.datos[0][1], b.datos[0][2] },
                            { b.datos[1][0], b.datos[1][1], b.datos[1][2] },
                            { b.datos[2][0], b.datos[2][1], b.datos[2][2] }};

        Matriz r1 = Matriz.invertirMatriz(b);
        Matriz r2 = Matriz.invertirMatriz(r1);
        
        int filasB = b.getDimension().height; 
        int columnasB = b.getDimension().width; 
        int[][] result = {{0, 0, 0},{0, 0, 0},{0, 0, 0},};
        int i, j;
        for (j = 0; j < filasB; j++) { 
            for (i = 0; i < columnasB; i++) { 
                result[i][j] += r2.datos[i][j]; 
            } 
        }                        
        Assert.assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    
    /**
     * Multiplicar dos matrices de tamaños diferentes
     */
    @Test
    public void testMultiplicarDosMatricesYTransponer() throws Exception {
        System.out.println("multiplicarDosMatrices");
        Matriz a = new Matriz(3, 3, true);
        Matriz b = new Matriz(3, 3, true);        
        //Producto transpuesto
        Matriz r = Matriz.invertirMatriz(Matriz.multiplicarDosMatrices(a, b));
        int result [][] = { { r.datos[0][0], r.datos[0][1], r.datos[0][2] },
                            { r.datos[1][0], r.datos[1][1], r.datos[1][2] },
                            { r.datos[2][0], r.datos[2][1], r.datos[2][2] }};
        
        
        //Transponer
        Matriz at = Matriz.invertirMatriz(a);
        Matriz bt = Matriz.invertirMatriz(b); 
        Matriz rt = Matriz.invertirMatriz(Matriz.multiplicarDosMatrices(a, b));
        int expResult [][] = { { rt.datos[0][0], rt.datos[0][1], rt.datos[0][2] },
                                { rt.datos[1][0], rt.datos[1][1], rt.datos[1][2] },
                                { rt.datos[2][0], rt.datos[2][1], rt.datos[2][2] }};
        
        Assert.assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplicarDimensionesIncompatibles() throws Exception {
        System.out.println("multiplicarDosMatrices");
        Matriz a = new Matriz(3, 3, true);
        Matriz b = new Matriz(4, 4, true);        
        
        int expResult, result;
        expResult = a.getDimension().width;
        result = b.getDimension().height;
                
        Assert.assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

}
  