package com.hedima.modelo;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precio;
    private int existencias;

    private FechaEncapsulada fecha;


    //Constructores
    public Producto(){

    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(int idProducto, String nombreProducto){

        this.idProducto= idProducto;
        this.nombreProducto=nombreProducto;
    }

    public Producto(int pIdProducto, String pNombreProducto, double pPrecio, int pExistencias){

        idProducto=pIdProducto;
        nombreProducto=pNombreProducto;
        precio=pPrecio;
    }



//Setters y Getters

    public void setIdProducto(int idProducto){
        this.idProducto=idProducto;
    }
    public int getIdProducto(){
        return  idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
}
