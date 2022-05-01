package paquete1;

import paquete2.EquipoCelular;

/**
 *
 * @author Daniel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objetos
        EquipoCelular ec1 = new EquipoCelular();
        EquipoCelular ec2 = new EquipoCelular();
        // Variables
        String sO1 = "Android";
        String pantalla1 = "20cm";
        double costoInicial1 = 600;
        double ivaPorcent1 = 12;
        String direcMac1 = "1.0.210.1231";
        String infoIMEI1 = "0.001.be.0e0";

        String sO2 = "iOS";
        String pantalla2 = "22cm";
        double costoInicial2 = 1200;
        double ivaPorcent2 = 16;
        String direcMac2 = "1.0.210.13451";
        String infoIMEI2 = "0.021.01.0e0";
        // Metodos
        ec1.establecerSO(sO1);
        ec1.establecerPantalla(pantalla1);
        ec1.establecerCostoInicial(costoInicial1);
        ec1.establecerIvaPorcent(ivaPorcent1);
        ec1.establecerDirecMac(direcMac1);
        ec1.establecerInfoIMEI(infoIMEI1);
        
        ec2.establecerSO(sO2);
        ec2.establecerPantalla(pantalla2);
        ec2.establecerCostoInicial(costoInicial2);
        ec2.establecerIvaPorcent(ivaPorcent2);
        ec2.establecerDirecMac(direcMac2);
        ec2.establecerInfoIMEI(infoIMEI2);
        //Calcular
        ec1.calcularIvaCostoInicial();
        ec1.calcularCostoFinal();
        ec2.calcularIvaCostoInicial();
        ec2.calcularCostoFinal();
        //Obtener
        System.out.printf("Equipos Celulares\n\nEquipo Celular Uno\n"
                + "Sistema Operativo: %s\nPantalla: %s\nCosto Inicial: %.2f\n"
                + "Porcentaje IVA: %.1f\nIVA Resultante: %.2f\nDirección Mac: "
                + "%s\nInformación IMEI: %s\nCosto Final: %.2f\n"
                , ec1.obtenerSO()
                , ec1.obtenerPantalla()
                , ec1.obtenerCostoInicial()
                , ec1.obtenerIvaPorcent()
                , ec1.obtenerIvaCostoInicial()
                , ec1.obtenerDirecMac()
                , ec1.obtenerInfoIMEI()
                , ec1.obtenerCostoFinal());
        System.out.printf("\nEquipo Celular Dos\n"
                + "Sistema Operativo: %s\nPantalla: %s\nCosto Inicial: %.2f\n"
                + "Porcentaje IVA: %.1f\nIVA Resultante: %.2f\nDirección Mac: "
                + "%s\nInformación IMEI: %s\nCosto Final: %.2f\n"
                , ec2.obtenerSO()
                , ec2.obtenerPantalla()
                , ec2.obtenerCostoInicial()
                , ec2.obtenerIvaPorcent()
                , ec2.obtenerIvaCostoInicial()
                , ec2.obtenerDirecMac()
                , ec2.obtenerInfoIMEI()
                , ec2.obtenerCostoFinal());
    }

}
