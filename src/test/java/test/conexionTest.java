package test;

import static org.junit.Assert.*;
import entidad.conexion;
import org.junit.Test;

public class conexionTest {	

	@Test 
	public void test() {	
		try {
			String mensaje;
			mensaje = conexion.Conectarse();		
			assertEquals(mensaje,"ok");	

		} catch (Exception e) {
			conexion.log("MySQL Connection Failed!");
			fail("Error de prueba");
		}	
		
	}

}
