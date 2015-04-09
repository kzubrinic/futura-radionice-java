package r04.primjer1;

/**
 * primjer nasljeðivanja
 * @author Krunoslav Žubriniæ
 * 26. ožu 2015.
 */
public class Kirurg extends Lijecnik {
	public void lijeciPacijente() {
		System.out.println("Obavlja kirurške operacije");
	}
	// kirurg radi na zamjeni "obiènog" lijeènika
	// poziva se metoda nadreðenog razreda
	public void lijeciPacijente(boolean zamjena) {
		System.out.print("Kirurg na zamjeni: ");
		super.lijeciPacijente();
	}
}
