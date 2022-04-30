
package paquete1;

import paquete2.EquivalenteHora;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objetos
        EquivalenteHora horaU = new EquivalenteHora();
        EquivalenteHora horaD = new EquivalenteHora();
        //Variables
        double horasU = 24;
        double horasD = 20.45;
        //Metodos Establecer
        horaU.establecerHoras(horasU);
        horaD.establecerHoras(horasD);
        //Metodos Calcular
        horaU.calcularMinutos();
        horaU.calcularSegundos();
        horaU.calcularDias();
        
        horaD.calcularMinutos();
        horaD.calcularSegundos();
        horaD.calcularDias();
        //Metodos Obtener
        System.out.printf("Transformacion de Horas\n\nHoras: %.2f\n"
                + "Minutos: %.2f\nSegundos: %.2f\nDias: %.2f\n\nHoras: %.2f\n"
                + "Minutos: %.2f\nSegundos: %.2f\nDias: %.2f\n"
                ,horaU.obtenerHoras()
                ,horaU.obtenerMinutos()
                ,horaU.obtenerSegundos()
                ,horaU.obtenerDias()
                ,horaD.obtenerHoras()
                ,horaD.obtenerMinutos()
                ,horaD.obtenerSegundos()
                ,horaD.obtenerDias());
    }

}
