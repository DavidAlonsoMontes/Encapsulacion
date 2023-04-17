package com.hedima.modelo;

public class FechaEncapsulada {
    private int anho;
    private int mes;
    private int dia;

    public FechaEncapsulada(){

        //se puede poner una fecha estandar
    }

    public FechaEncapsulada(int anho, int mes, int dia){

        this.setAnho(anho);
        this.setMes(mes);
        this.setDia(dia);
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public void setMes(int mes) {
        if(mes<=1&&mes<=12){
            this.mes = mes;
        }
        else {
            System.out.println("El mes es erroneo, verifica la entrada.");
        }

    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnho() {
        return anho;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }
    public void imprimirFecha(){

        System.out.println("La fecha es: "+getAnho()+"-"+getMes()+"-"+getDia());
    }
}
