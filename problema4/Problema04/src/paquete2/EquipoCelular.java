package paquete2;

/**
 *
 * @author Daniel
 */
public class EquipoCelular {

    private String sO;
    private String pantalla;
    private String direcMac;
    private String infoIMEI;
    private double costoInicial;
    private double ivaPorcent;
    private double ivaCostoInicial;
    private double costoFinal;

    public void establecerSO(String c) {
        sO = c;
    }

    public void establecerPantalla(String c) {
        pantalla = c;
    }

    public void establecerDirecMac(String c) {
        direcMac = c;
    }

    public void establecerInfoIMEI(String c) {
        infoIMEI = c;
    }

    public void establecerCostoInicial(double c) {
        costoInicial = c;
    }

    public void establecerIvaPorcent(double c) {
        ivaPorcent = c;
    }

    public void calcularIvaCostoInicial() {
        ivaCostoInicial = costoInicial * (ivaPorcent / 100);
    }

    public void calcularCostoFinal() {
        costoFinal = ivaCostoInicial + costoInicial;
    }

    public String obtenerSO() {
        return sO;
    }

    public String obtenerPantalla() {
        return pantalla;
    }

    public String obtenerDirecMac() {
        return direcMac;
    }

    public String obtenerInfoIMEI() {
        return infoIMEI;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public double obtenerIvaPorcent() {
        return ivaPorcent;
    }

    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }
}
