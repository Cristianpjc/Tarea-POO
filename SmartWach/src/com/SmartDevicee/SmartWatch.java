package com.SmartDevicee;

public class SmartWatch {


    //Atributos
    String color;
    String fabricante;
    String modelo;
    int year;
    double peso;
    String apaga;


    //Contructores
    public SmartWatch() {
    }

    public SmartWatch(String color, String fabricante, String modelo, int year, double peso, String apaga) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.peso = peso;
        this.apaga = apaga;
    }


    //Metodos de comportamientos
    public void boton(String apretarboton) {
        this.apaga = apretarboton;
    }

}
