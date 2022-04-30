
package paquete2;

/**
 *
 * @author Daniel
 */
public class InstitucionEducativa {
    
    private String nombre;
    private int numAlu;
    private int numDoc;
    private int numSed;
    private double gastosPE;
    private double presupuesto;
    
   public void establecerNombre(String c) {
        nombre = c;
    }
   public void establecerNumAlu(int c){
       numAlu = c;
   }
   public void establecerNumDoc(int c){
       numDoc = c;
   }
   public void establecerNumSed(int c){
       numSed = c;
   }
   public void establecerGastosPE(double c){
       gastosPE = c;
   }
   public void calcularPresupuesto(){
       presupuesto = numAlu * gastosPE;
   }
   public String obtenerNombre(){
       return nombre;
   }
   public int obtenerNumAlu(){
       return numAlu;
   }
   public int obtenerNumDoc(){
       return numDoc;
   }
   public int obtenerNumSed(){
       return numSed;
   }
   public double obtenerGastosPE(){
       return gastosPE;
   }
   public double obtenerPresupuesto(){
       return presupuesto;
   }
}
