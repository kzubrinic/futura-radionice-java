/**
 * Primjer jednostavne klase koja �uva informacije
 * o imenu i starosti prijatelja
 * Zbog jednostavnosti, ne koristi modifikatore pristupa
 * @author Krunoslav �ubrini�
 * 6. o�u 2015.
 */
public class  Prijatelj 
{		
	// Varijable koje �uvaju ime i starost prijatelja
	String ime;
	int starost = 0;
	/**
	 * Metoda rodjendan() pove�ava starost osobe za 1 godinu.
	 */
	void rodjendan(){
		starost = starost + 1;
	}	
}