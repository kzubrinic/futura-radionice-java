/**
 * Primjer jednostavne klase koja èuva informacije
 * o imenu i starosti prijatelja
 * Zbog jednostavnosti, ne koristi modifikatore pristupa
 * @author Krunoslav Žubriniæ
 * 6. ožu 2015.
 */
public class  Prijatelj 
{		
	// Varijable koje èuvaju ime i starost prijatelja
	String ime;
	int starost = 0;
	/**
	 * Metoda rodjendan() poveæava starost osobe za 1 godinu.
	 */
	void rodjendan(){
		starost = starost + 1;
	}	
}