/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author UTPL
 */
public class Terreno {

    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerLargo(double c) {
        largo = c;
    }

    public void establecerMetroCuadrado(double c) {
        valorMetroCuadrado = c;
    }

    public void calcularArea() {
        area = largo * ancho;
    }

    public void calcularCostoTerreno() {
        costo_terreno = area * valorMetroCuadrado;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerCostoTerreno() {
        return costo_terreno;
    }
}
