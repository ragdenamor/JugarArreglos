/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itszn.edu.mx.jugandoarreglos.OperacionesArreglos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ghost
 */
public class PruebasUnitariasArreglos {
    
    public PruebasUnitariasArreglos() {
    }
    
 
    private OperacionesArreglos opa;
    @BeforeEach
    public void setUp() {
        opa=new OperacionesArreglos();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void pruebaSuma1(){
        float[] entrada={10f,15f,10f};
        float salidaEsperada=35f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaSuma2nulo(){
        float[] entrada=null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    @Test
public void pruebaPromedio1() {
    float[] entrada = {10f, 20f, 30f};
    float salidaEsperada = 20f;
    float salidaReal = opa.calcularPromedio(entrada);
    assertEquals(salidaEsperada, salidaReal);
}

@Test
public void pruebaPromedio2Vacio() {
    float[] entrada = {};
    float salidaEsperada = 0f;
    float salidaReal = opa.calcularPromedio(entrada);
    assertEquals(salidaEsperada, salidaReal);
}

//---------------------------------------------

@Test
public void pruebaContarMayoresQue1() {
    float[] entrada = {5f, 10f, 15f, 20f};
    int salidaEsperada = 2; // mayores que 10 son 15 y 20
    int salidaReal = opa.contarMayoresQue(entrada, 10f);
    assertEquals(salidaEsperada, salidaReal);
}

@Test
public void pruebaContarMayoresQue2Ninguno() {
    float[] entrada = {1f, 2f, 3f};
    int salidaEsperada = 0; // ninguno mayor que 5
    int salidaReal = opa.contarMayoresQue(entrada, 5f);
    assertEquals(salidaEsperada, salidaReal);
}

//---------------------------------------------

@Test
public void pruebaInvertirArreglo1() {
    float[] entrada = {1f, 2f, 3f, 4f};
    float[] salidaEsperada = {4f, 3f, 2f, 1f};
    float[] salidaReal = opa.invertirArreglo(entrada);
    assertArrayEquals(salidaEsperada, salidaReal);
}

@Test
public void pruebaInvertirArreglo2UnoSolo() {
    float[] entrada = {7f};
    float[] salidaEsperada = {7f};
    float[] salidaReal = opa.invertirArreglo(entrada);
    assertArrayEquals(salidaEsperada, salidaReal);
}

//---------------------------------------------

@Test
public void pruebaObtenerAbsolutos1() {
    float[] entrada = {2f, -3f, -4f, 5f};
    float[] salidaEsperada = {2f, 3f, 4f, 5f};
    float[] salidaReal = opa.obtenerAbsolutos(entrada);
    assertArrayEquals(salidaEsperada, salidaReal);
}

@Test
public void pruebaObtenerAbsolutos2Ceros() {
    float[] entrada = {0f, -1f, 1f};
    float[] salidaEsperada = {0f, 1f, 1f};
    float[] salidaReal = opa.obtenerAbsolutos(entrada);
    assertArrayEquals(salidaEsperada, salidaReal);
}

}
