package paquete1;

import paquete2.Terreno;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos
        Terreno terU = new Terreno();
        Terreno terD = new Terreno();
        //Valores entrada
        double ancho = 170.50;
        double largo = 150.60;
        double valorMetroCuadrado = 7.60;
        
        double ancho2 = 50.25;
        double largo2 = 60.60;
        double valorMetroCuadrado2 = 3.60;
        //Metodos Establecer
        terU.establecerAncho(ancho);
        terU.establecerLargo(largo);
        terU.establecerMetroCuadrado(valorMetroCuadrado);

        terD.establecerAncho(ancho2);
        terD.establecerLargo(largo2);
        terD.establecerMetroCuadrado(valorMetroCuadrado2);
        //Metodos Calcular
        terU.calcularArea();
        terU.calcularCostoTerreno();

        terD.calcularArea();
        terD.calcularCostoTerreno();
        //Metodos Obtener
        System.out.printf("Costo Terreno\n\nTerreno Uno\nAncho: %.2f\n"
                + "Largo: %.2f\nValor Metro Cuadrado: %.2f\n"
                + "Area: %.2f\nCosto del Terreno: %.2f\n\n"
                + "Terreno Dos\nAncho: %.2f\nLargo: %.2f\n"
                + "Valor Metro Cuadrado: %.2f\n"
                + "Area: %.2f\nCosto del Terreno: %.2f\n",
                terU.obtenerAncho(),
                terU.obtenerLargo(),
                terU.obtenerMetroCuadrado(),
                terU.obtenerArea(),
                terU.obtenerCostoTerreno(),
                terD.obtenerAncho(),
                terD.obtenerLargo(),
                terD.obtenerMetroCuadrado(),
                terD.obtenerArea(),
                terD.obtenerCostoTerreno());
    }
}
