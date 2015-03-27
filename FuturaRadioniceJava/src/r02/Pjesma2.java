package r02;
/**
 * Primjer greške koja demonstrira sluèaj kada static metoda 
 * pokušava izravno koristiti varijable koje nisu static i pozivati
 * metode koje nisu static.
 * Program je namjerno ostavljen neispravan.
 * 
 * @author Krunoslav Žubriniæ
 * 11. ožu 2015.
 */
public class Pjesma2 {
	private String autor;
	
	public void sviranje() {
		System.out.println("Svira "+autor);
	}
	public static void setAutor(String novi) {
		// greška jer static metoda ne može izravno koristiti
		// varijable koje nisu static. Razlog je taj što se static
		// varijabla poziva navoðenjem naziva razreda, a ne objekta
		// dakle, ovdje bi to bilo Pjesma2.setAutor(ime)
		autor = novi;
	}
	public static void premotaj() {
		// greška jer static metoda ne može izravno pozivati
		// metode koje nisu static. Ovaj problem se može jednostavno
		// riješiti tako da se ne-static metoda pozove na 
		// konkretnom objektu primjerice p1.vratiDuljinu(), ako je
		// p1 deklarirana kao varijabla instance.
		int duljina = vratiDuljinu();
	}
	public int vratiDuljinu(){
		return 0;
	}
	public static void main(String[] args) {
		Pjesma2 p1 = new Pjesma2();
		Pjesma2 p2 = new Pjesma2();
		// Static varijable i metode se trebaju pozivati navoðenjem 
		//	naziva razreda, a ne stvorenog objekta
		//Pjesma2.setAutor("Novi autor");
		p1.setAutor("Bach");
		p2.setAutor("Mozart");
		p1.sviranje();
		p2.sviranje();
		p1.premotaj();
	}
}
