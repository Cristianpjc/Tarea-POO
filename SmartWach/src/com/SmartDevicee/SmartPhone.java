package com.SmartDevicee;

public class SmartPhone {

    // Atributos

    String color;
    String fabricante;
    String modelo;
    int year;
    double peso;
    double tamanho;
    String reproduceVideos;

    String reproduceMusicas;

    public SmartPhone() {
    }

    public SmartPhone(String color, String fabricante, String modelo, int year, double peso, double tamanho, String reproduceVideos, String reproduceMusicas) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.peso = peso;
        this.tamanho = tamanho;
        this.reproduceVideos = reproduceVideos;
        this.reproduceMusicas = reproduceMusicas;
    }

    public void reproductor(String peliculas) {
        this.reproduceVideos = peliculas;
    }

    public void reproductor2(String musicas) {
        this.reproduceMusicas = musicas;
    }
}
