/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.InstitucionEducativa;
/**
 *
 * @author Daniel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Entidades
       InstitucionEducativa edu01 = new InstitucionEducativa();
       InstitucionEducativa edu02 = new InstitucionEducativa();
       // Variables
       String nombre01 = "Colegio Tecnico";
       int numAlu01 = 1300;
       int numDoc01 = 45;
       int numSed01 = 20;
       double gastosPE01 = 75.50;
       
       String nombre02 = "Universidad Nacional";
       int numAlu02 = 6000;
       int numDoc02 = 90;
       int numSed02 = 40;
       double gastosPE02 = 250.87;
       // Metodos Establecer Primer Objeto
       edu01.establecerNombre(nombre01);
       edu01.establecerNumAlu(numAlu01);
       edu01.establecerNumDoc(numDoc01);
       edu01.establecerNumSed(numSed01);
       edu01.establecerGastosPE(gastosPE01);
       // Calcular
       edu01.calcularPresupuesto();
       // Metodos Establecer Segundo Objeto
       edu02.establecerNombre(nombre02);
       edu02.establecerNumAlu(numAlu02);
       edu02.establecerNumDoc(numDoc02);
       edu02.establecerNumSed(numSed02);
       edu02.establecerGastosPE(gastosPE02);
       // Calcular
       edu02.calcularPresupuesto();
       // Metodos Obtener
       System.out.printf("Instituciones Educativas\n\nInstitución\nNombre: %s\n"
               + "Número de Alumnos: %d\nNúmero de Docentes: %d\n"
               + "Número de Sedes: %d\nGastos Proyectador por Estudiante: "
               + "%.2f\nPresupuesto: %.2f\n", 
               edu01.obtenerNombre(), 
               edu01.obtenerNumAlu(),
               edu01.obtenerNumDoc(), 
               edu01.obtenerNumSed(), 
               edu01.obtenerGastosPE(),
               edu01.obtenerPresupuesto());
       System.out.printf("\nInstitución\nNombre: %s\n"
               + "Número de Alumnos: %d\nNúmero de Docentes: %d\n"
               + "Número de Sedes: %d\nGastos Proyectador por Estudiante: "
               + "%.2f\nPresupuesto: %.2f\n", 
               edu02.obtenerNombre(), 
               edu02.obtenerNumAlu(),
               edu02.obtenerNumDoc(), 
               edu02.obtenerNumSed(), 
               edu02.obtenerGastosPE(),
               edu02.obtenerPresupuesto());
    }
    
}
