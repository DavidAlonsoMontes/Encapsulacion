package com.hedima.modelo;

public class Empleado {

    String nombre;
    double sueldo;


    public Empleado(String nombre)
    {
        this.nombre=nombre;
    }

    public Empleado(String nombre, double sueldo){
        this.sueldo=sueldo;
    }

    public void calcularNomina(double retencion){
        double nomina;
        nomina=(sueldo/100)*retencion;
        System.out.println("La nomina se queda en: "+nomina);
    }
}
