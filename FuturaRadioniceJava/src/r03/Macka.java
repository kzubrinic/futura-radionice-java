package r03;

import java.util.Scanner;

/**
 * Primjer getter i setter metoda - uèahurivanje varijabli
 * @author Krunoslav Žubriniæ
 * 26. ožu 2015.
 */
public class Macka {
	private int visina;
	
	// Metoda koja vraæa vrijednost private varijable
	public int getVisina() {
		return visina;
	}

	// Metoda koja postavlja vrijednost private varijable
    public boolean setVisina(int visina) {
    	if (visina < 1 || visina > 100) {
    		System.out.println("Greška! visina mora biti izmeðu 1 i 100!");
    		return false;
	    }
	    else {
	        this.visina=visina;
	        return true;
	    }
	}
}
