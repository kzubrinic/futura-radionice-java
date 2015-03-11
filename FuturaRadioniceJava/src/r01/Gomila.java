package r01;
/**
 * Primjer stvaranja vi�e objekata, mijenjanja
 * njihovih svojstava i pozivanja metoda.
 * @author Krunoslav �ubrini�
 * 6. o�u 2015.
 */
public class Gomila {
	public static void main(String[] args) {
		// Stvara se objekt tipa Prijatelj
		Prijatelj desniSusjed = new Prijatelj();
		// Postavlja se ime prijatelja na stvorenom objektu.
		// Mijenja se vrijednost varijable pomo�u operatora "to�ka"
		// Sintaksa je: referenca to�ka imeVarijable
		desniSusjed.ime = "Maro";
		// Postavlja se starost prijatelja na stvorenom objektu
		desniSusjed.starost = 24;
		
		// Stvara se novi objekt tipa Prijatelj
		// Sada na raspolaganju imamo dva objekta tipa Prijatelj
		// Prvom pristupamo pomo�u reference "desniSusjed", a
		// drugom pomo�u reference "lijeviSusjed"
		Prijatelj lijeviSusjed = new Prijatelj();
		// Postavlja se ime i starost drugog prijatelja
		lijeviSusjed.ime = "Baro";
		lijeviSusjed.starost = 15;
		
		// Stvara se jo� jedan novi objekt tipa Prijatelj i postavlja
		// ime i starost
		Prijatelj kolegicaIzSkole = new Prijatelj();
		kolegicaIzSkole.ime = "Mare";
		kolegicaIzSkole.starost = 20;
		// Poziva se metoda na stvorenom objektu. Sintaksa je ista
		// kao kod pristupa varijablama (pomo�u operatora "to�ka").
		kolegicaIzSkole.rodjendan();
		
		// Stvara se jo� jedan novi objekt tipa Prijatelj i postavlja
		// ime i starost
		Prijatelj prijateljicaIzVrtica = new Prijatelj();
		prijateljicaIzVrtica.ime = "Kate";
		prijateljicaIzVrtica.starost = 19; 
		
		// Ispisuju se vrijednosti varijabli svakog od �etiri stvorena objekta.
		System.out.println("Dobar dan, ja sam " + desniSusjed.ime + " i imam " + desniSusjed.starost + " godina.");
		System.out.println("Dobar dan, ja sam " + lijeviSusjed.ime + " i imam " + lijeviSusjed.starost + " godina.");
		System.out.println("Dobar dan, ja sam " + kolegicaIzSkole.ime + " i imam " + kolegicaIzSkole.starost + " godina.");
		System.out.println("Dobar dan, ja sam " + prijateljicaIzVrtica.ime + " i imam " + prijateljicaIzVrtica.starost + " godina.");
	}
}
