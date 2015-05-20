package r07.serijalizacija;

import java.io.Serializable;

/**
 * @author Krunoslav �ubrini�
 * 19. svi 2015.
 */
public class Skola implements Serializable{
	private String naziv;
	// Varijable razreda se ne serijaliziraju (jer njihove vrijednosti ne
	// pripadaju pojedinom objektu ve� razredu).
	public static int trajanje = 4;

	public Skola(String n){
		naziv = n;
	}
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public String toString(){
		return " �kola: " + naziv+ " ("+ trajanje + ")";
	}
}
