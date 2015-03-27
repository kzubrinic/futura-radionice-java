package r02.rjesenja_dz.zadatak2;

/**
 * Implementirati razred Igra koji treba sadr�avati:
 * - varijablu razreda brojIgraca tipa int;
 * - varijablu instance idIgraca tipa int;
 * - defaultni konstruktor koji bilje�i uklju�ivanje novog igra�a u igru 
 *   na na�in da 
 *   - vrijednost varijabli brojIgraca i iBrojIgraca inkrementira;
 *   - pridru�i id (varijabla idIgraca) svakom novom igra�u. Id igra�a 
 *     je slu�ajan broj u intervalu izme�u 100.000 i 999.999;
 * - metodu String toString() koja vra�a podatke o trenutnoj igri u obliku: 
 *   Trenutni broj igra�a ove igre je: brojIgraca. ID igra�a je: idIgraca.
 * 
 * @author Krunoslav �ubrini�
 * 27. o�u 2015.
 */
public class Igra {
	private static int brojIgraca;
	private int idIgraca;
	
	public Igra(){
		brojIgraca++;
		idIgraca = 100000 + (int)(Math.random()*900000);
	}
	public String toString(){
		return "Trenutni broj igra�a ove igre je: "+ brojIgraca + " ID igra�a je: " + idIgraca;
	}
}
