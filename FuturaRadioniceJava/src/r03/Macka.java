package r03;

import java.util.Scanner;

/**
 * Primjer getter i setter metoda - u�ahurivanje varijabli
 * @author Krunoslav �ubrini�
 * 26. o�u 2015.
 */
public class Macka {
	private int visina;
	
	// Metoda koja vra�a vrijednost private varijable
	public int getVisina() {
		return visina;
	}

	// Metoda koja postavlja vrijednost private varijable
    public boolean setVisina(int visina) {
    	if (visina < 1 || visina > 100) {
    		System.out.println("Gre�ka! visina mora biti izme�u 1 i 100!");
    		return false;
	    }
	    else {
	        this.visina=visina;
	        return true;
	    }
	}
}
