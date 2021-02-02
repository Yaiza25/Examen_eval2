import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.*;

public class Test1 {

    @Test
	@DisplayName("Prueba de devolver un int")
	void test1() {
		// preparacion 
		Funciones fn = new Funciones();
		// ejecucion
		int resultado = fn.devolverInt(" unnO ");
		// asercion/Confirmacion 
		assertEquals(1, resultado); 
    }

    @Test
	@DisplayName("Prueba de devolver un ArrayList")
	void test2() {
		// preparacion 
		Funciones fn = new Funciones();
		// ejecucion
		List<Integer> resultado = fn.devolverArrayList(" uUno  DoOS ");
		// asercion/Confirmacion 
		List<Integer> arrayEsperado = new ArrayList<Integer>(List.of(1, 2));
		assertEquals(arrayEsperado, resultado); 
    }
    
    @Test
	@DisplayName("Prueba de valores proporcionales")
	void test3() {
		// preparacion 
		Funciones fn = new Funciones();
        // ejecucion
        List<Integer> array = new ArrayList<Integer>(List.of(1, 2, 3));
		List<Double> resultado = fn.valoresProporcionales(array, 60);
		// asercion/Confirmacion 
		List<Double> arrayEsperado = new ArrayList<Double>(List.of(10.0, 20.0, 30.0));
		assertEquals(arrayEsperado, resultado); 
    }
    
    @Test
	@DisplayName("Prueba de cadena proporcionalidad")
	void test4() {
		// preparacion 
		Funciones fn = new Funciones();
        // ejecucion
		List<Double> resultado = fn.cadenaProporcionalidad(" Doos   1  TrRes   CUAaaaTRO  ", 100);
		// asercion/Confirmacion 
		List<Double> arrayEsperado = new ArrayList<Double>(List.of(20.0, 10.0, 30.0, 40.0));
		assertEquals(arrayEsperado, resultado); 
	}
    
}