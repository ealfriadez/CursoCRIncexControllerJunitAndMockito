package pe.edu.unfv.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IndexControllerTest {
		
	@Test
	public void test() {
		
		IndexController indexController = new IndexController();
		
		String[] paramArray = null;
		String resutActual = "El array esta vacio";
		String resultReal = indexController.welcome(paramArray);
		
		assertEquals(resultReal, resutActual);
	}

	@Test
	public void arraySinDatosTest() {
		
		IndexController indexController = new IndexController();
		
		String[] paramArray = new String[3];
		String resutActual = "param[0]null\n" + "param[1]null\n" + "param[2]null\n";
		String resultReal = indexController.welcome(paramArray);
		
		assertEquals(resultReal, resutActual);
	}
	
	@Test
	public void arrayConDatosTest() {
		
		IndexController indexController = new IndexController();
		
		String[] paramArray = new String[] {"java", "desde", "0"};
		String resutActual = "param[0]java\n" + "param[1]desde\n" + "param[2]0\n";
		String resultReal = indexController.welcome(paramArray);
		
		assertEquals(resultReal, resutActual);
	}
}
