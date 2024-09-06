package org.prueba.unitaria;

import org.junit.jupiter.api.Test;
import org.servicios.empleado.ServicioEmpleado;

import junit.framework.TestCase;

/*
 * PRUEBA UNITARIA JUNIT
 * 
 * 1.- DEBEMOS HEREDAR DE TestCase
 * 2.- DEBEMOS CREAR EL METODO test()
 * 3.- TODOS LOS METODOS DEBEN COMENZAR CON EL NOMBRE TEST
 * 4.- TODOS LOS METODOS DEBEN LLAMAR AL METODO test()
 */

class PruebaUnitariaEmpleado extends TestCase{
	
	ServicioEmpleado servicioEmpleado = null ;

	@Test
	void test() {
		servicioEmpleado = new ServicioEmpleado();
		
	}
	
	public void salarioBonoEmpleado() {
		test();
		assertTrue(servicioEmpleado.salarioBonoEmpleado(20000.0, 5000.0)==25000.0);
	}
	
	@Test
	public void testSalarioPrestamoEmpleado() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamoEmpleado(2000.0, 25000), 12500);
	}

}