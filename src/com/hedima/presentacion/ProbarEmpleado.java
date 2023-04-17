package com.hedima.presentacion;

import com.hedima.modelo.Empleado;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Empleado emp=new Empleado("Paco",100000);
        emp.calcularNomina(25);
    }
}
