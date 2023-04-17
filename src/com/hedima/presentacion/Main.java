package com.hedima.presentacion;

import com.hedima.modelo.FechaEncapsulada;
import com.hedima.modelo.Producto;

public class Main {
    public static void main(String[] args) {


        Producto p1 = new Producto(2,"Teclado");
        p1.setIdProducto(1);
        System.out.println("IdProducto " + p1.getIdProducto());
        System.out.println("Nombre Producto " + p1.getNombreProducto());

        Producto p2 = new Producto();
        p2.setIdProducto(3);
        System.out.println("Id producto " + p2.getIdProducto());

        Producto p3 = new Producto(4,"ratón inalambrico",22.5,50);
        System.out.println("Id producto " + p3.getIdProducto());


        FechaEncapsulada fecha1= new FechaEncapsulada(1975,10,29);
        fecha1.imprimirFecha();
    }
}