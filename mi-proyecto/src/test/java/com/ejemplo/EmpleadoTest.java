package com.ejemplo;

import junit.framework.TestCase;

public class EmpleadoTest extends TestCase {

  public void testCalculoSalarioMensual() {
    Empleado emp = new Empleado("Juan", 100);
    assertEquals(3000.0, emp.calcularSalarioMensual());
  }

  // No hay prueba para calcularBonoAnual() ni imprimirReporte()
}
