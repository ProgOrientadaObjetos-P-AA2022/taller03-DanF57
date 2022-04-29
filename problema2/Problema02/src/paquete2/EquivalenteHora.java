package paquete2;

/**
 *
 * @author UTPL
 */
public class EquivalenteHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public void establecerHoras(double c) {
        horas = c;
    }

    public void calcularMinutos() {
        minutos = horas * 60;
    }

    public void calcularSegundos() {
        segundos = minutos / 60;
    }

    public void calcularDias() {
        dias = horas / 24;
    }

    public double obtenerHoras() {
        return horas;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerSegundos() {
        return segundos;
    }

    public double obtenerDias() {
        return dias;
    }

}
