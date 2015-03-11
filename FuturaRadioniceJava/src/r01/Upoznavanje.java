package r01;
/**
 * Primjer stvaranja jednog objekta, pristup varijablama
 * i metodama stvorenog objekta.
 * @author Krunoslav �ubrini�
 * 6. o�u 2015.
 */
public class Upoznavanje {
	public static void main(String[] args) {
		// Deklarira se varijabla referenca za pristup
		// objektu tipa Prijatalj
		Prijatelj susjed;
		// Stvara se novi objekt tipa Prijetalj pomo�u operatora new.
		// Prethodno deklarirana referenca susjed povezuje se sa
		// stvorenim objektom.
		susjed = new Prijatelj();
		// Napomena: Objekt mo�emo stvoriti i kra�e u 1 retku
		// Prijatelj susjed = new Prijatelj();
		
		// Vrijednost varijable objekta mijenja se pomo�u operatora "to�ka"
		// Sintaksa je: referenca to�ka imeVarijable.
		susjed.ime = "Ivo";
		susjed.starost = 37;
		// Ispisuje se ime prijatelja (sadr�aj varijable ime objekta).
		System.out.println("Dobar dan, ja sam " + susjed.ime);
		// Metode se na stvorenom objektu pozivaju na isti na�in kao
		// �to se pristupa varijablama (pomo�u operatora "to�ka").
		// Poziva se metoda rodjendan() koja mijenja starost susjeda.
		susjed.rodjendan();
		// Ispisuje se starost prijatelja (sadr�aj varijable starost objekta).
		System.out.println("Danas mi je ro�endan i imam " + susjed.starost+" godina.");
	}
}
