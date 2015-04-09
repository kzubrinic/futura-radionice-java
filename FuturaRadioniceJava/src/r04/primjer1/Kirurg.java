package r04.primjer1;

/**
 * primjer naslje�ivanja
 * @author Krunoslav �ubrini�
 * 26. o�u 2015.
 */
public class Kirurg extends Lijecnik {
	public void lijeciPacijente() {
		System.out.println("Obavlja kirur�ke operacije");
	}
	// kirurg radi na zamjeni "obi�nog" lije�nika
	// poziva se metoda nadre�enog razreda
	public void lijeciPacijente(boolean zamjena) {
		System.out.print("Kirurg na zamjeni: ");
		super.lijeciPacijente();
	}
}
