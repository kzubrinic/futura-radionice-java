package r07.serijalizacija;

/**
 * @author Krunoslav �ubrini�
 * 19. svi 2015.
 */
// Ovaj razred ne implmentira su�elje Serializable, ali ga implementira 
// njemu nadre�eni razred Osoba
public class Ucenik extends Osoba {
	// Razred Skola mora implementirati su�elje Serializable
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
		return "U�enik/u�enica: "+ super.toString()+ skola;
	}
}
