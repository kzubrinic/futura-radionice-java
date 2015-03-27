package r02.rjesenja_dz.zadatak2;

/**
 * Implementirati razred Igra koji treba sadržavati:
 * - varijablu razreda brojIgraca tipa int;
 * - varijablu instance idIgraca tipa int;
 * - defaultni konstruktor koji bilježi ukljuèivanje novog igraèa u igru 
 *   na naèin da 
 *   - vrijednost varijabli brojIgraca i iBrojIgraca inkrementira;
 *   - pridruži id (varijabla idIgraca) svakom novom igraèu. Id igraèa 
 *     je sluèajan broj u intervalu izmeðu 100.000 i 999.999;
 * - metodu String toString() koja vraæa podatke o trenutnoj igri u obliku: 
 *   Trenutni broj igraèa ove igre je: brojIgraca. ID igraèa je: idIgraca.
 * 
 * @author Krunoslav Žubriniæ
 * 27. ožu 2015.
 */
public class Igra {
	private static int brojIgraca;
	private int idIgraca;
	
	public Igra(){
		brojIgraca++;
		idIgraca = 100000 + (int)(Math.random()*900000);
	}
	public String toString(){
		return "Trenutni broj igraèa ove igre je: "+ brojIgraca + " ID igraèa je: " + idIgraca;
	}
}
