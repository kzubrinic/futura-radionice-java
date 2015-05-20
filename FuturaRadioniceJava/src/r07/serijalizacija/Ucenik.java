package r07.serijalizacija;

/**
 * @author Krunoslav Žubriniæ
 * 19. svi 2015.
 */
// Ovaj razred ne implmentira suèelje Serializable, ali ga implementira 
// njemu nadreðeni razred Osoba
public class Ucenik extends Osoba {
	// Razred Skola mora implementirati suèelje Serializable
	private Skola skola;
	public Ucenik(String i, String p, int s, String d, Skola sk) {
		super(i, p, s, d);
		skola = sk;
	}
	public Skola getSkola() {
		return skola;
	}
	public void setSkola(Skola skola) {
		this.skola = skola;
	}
	public String toString() {
		return "Uèenik/uèenica: "+ super.toString()+ skola;
	}
}
