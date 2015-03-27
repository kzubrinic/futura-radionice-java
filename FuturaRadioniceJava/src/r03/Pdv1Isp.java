
package r03;

/**
 *  Primjer getter i setter metoda - u�ahurivanje varijabli
 * @author Krunoslav �ubrini�
 * 26. o�u 2015.
 */
public class Pdv1Isp {
    // varijabla instance - vidljiva u �itavom razredu
    private static double pdv = 25.0;
    private boolean nulta = false;
    
    public double racPdv(double osnova) {
        // lokalna varijabla - vidljiva samo u ovoj metodi
        double iznosPdva;
        iznosPdva=osnova*pdv/100;
        return iznosPdva;
    }
    public void setPdv(double pdv) {
        Pdv1Isp.pdv=pdv;
    } 
    public double getPdv() {
          return pdv;
    }
    public boolean isNulta() {
          return nulta;
    }
}
