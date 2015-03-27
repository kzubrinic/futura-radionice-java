package r02;
/**
 * Primjer razreda i metode koja koristi varijable instance
 * @author Krunoslav Žubriniæ
 * 11. ožu 2015.
 */
public class Pjesma {
	private String autor;
	public void sviranje() {
		System.out.println("Svira "+autor);
	}
	public void setAutor(String novi) {
		autor = novi;
	}
	public static void main(String[] args) {
		Pjesma p1 = new Pjesma();
		Pjesma p2 = new Pjesma();
		p1.setAutor("Bach");
		p2.setAutor("Mozart");
		p1.sviranje();
		p2.sviranje();
	}

}
