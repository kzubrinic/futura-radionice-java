package r02.rjesenja_zadataka;
import java.util.Arrays;
/**
 * 3. ZADATAK
 * Napišite razred Lotto koji ima varijablu instance 
 * (polje za pohranu 7 cijelih brojeva). Razred treba imati 2 metode:
 * - Metoda generiraj treba generirati sedam cijelih brojeva 
 *   (1 ≤ broj ≤ 39) i spremiti ih u polje. Jedan broj se smije u polje 
 *   zapisati samo jednom. Generirane brojeve sortirajte u uzlaznom 
 *   redosljedu (od manjih prema većima).
 * - Metoda ispisi treba ispisati sve generirane brojeve iz polja.
 * U main metodi generirajte brojeve i ispišite na zaslon generirane 
 * brojeve.
 * @author Krunoslav Žubrinić
 * 12. ožujak 2015.
 */
public class Lotto {
	int[] niz = new int[7];
	public void generiraj() {
		int br, j=0;
		while (j < 7){
			// generira broj u intervalu 7-39 (ključuje i 7 i 39)
			br = 7+(int)(Math.random()*33);
			boolean izvucen = false;
			// provjerava je li broj već izvučen
			for (int i=0;i<7;i++){
				if (niz[i] == br){
					izvucen = true;
					break;
				}
			}
			// ako broj nije prije izvučen zapisuje se u polje
			// brojač izvučenih brojeva j se povećava za 1
			if (!izvucen){
				niz[j] = br;
				j++;
			}
		}
		// sortira izvučene brojeve
		Arrays.sort(niz);
	}
	public void ispisi(){
		System.out.println("Izvučeni su sljedeći brojevi:");
		for (int i = 0; i < 7; i++){
			System.out.print(niz[i]+", ");
		}
	}
	public static void main(String[] args) {
		// stvaramo novi objekt tipa Lotto da bismo mogli iz static metode
		// main pozivati metode i koristiti varijable koje nisu static
		Lotto l = new Lotto();
		l.generiraj();
		l.ispisi();
	}

}
