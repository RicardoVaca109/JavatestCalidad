package com.ejemplo;

public class Empleado {

  private String nombre;
  private double salarioBase;

  public Empleado(String nombre, double salarioBase){
    this.nombre = nombre;
    this.salarioBase = salarioBase;
  }

  public double calcularSalarioMensual(){
    return salarioBase * 30; // ← cobertura será probada
  }

  public double calcularBonoAnual(){
    double bono = 0; // ← variable no usada, PMD lo detecta
    return salarioBase * 12 * 0.10;
  }

  public void imprimirReporte(){
    System.out.println("Empleado: " + nombre);
    System.out.println("Salario: " + salarioBase);
  }
}
