package r03.rjesenja_zadataka.zadatak5;

/**
 * 5. ZADATAK
 * U nizu znakova su zapisani podaci o trenutnoj vremenskoj prognozi: 
 * grad (niz znakova),	tip vremena (niz znakova), temperatura (realni broj)
 * i tlak (cijeli broj).
 * Podaci su razdvojeni znakom toèke-zarez.
 * Primjerice: "Dubrovnik;malo oblaèno;12.5;1024"
 * Napišite razred VremenskaPrognoza koji treba sadržavati:
 * - Varijablu instance za svaki od podataka o prognozi.
 * - Konstruktor koji ne prima niti jedan parametar.
 * - Konstruktor u kojem možete postaviti vrijednosti varijabli instance.
 * - Metodu ucitajPodatke koja prima niz znakova i pridružuje vrijednosti 
 *   varijablama instance.
 * - Metodu toString koja treba formatirati vrijednosti varijabli instance 
 *   u gore opisanom obliku i vratiti formatirani niz.
 * U main metodi razreda testirajte napisane metode.
 * @author Krunoslav Žubriniæ
 * 12. ožujak 2015.
 */
public class VremenskaPrognoza {
	String grad, opis;
	float temperatura;
	int tlak;
	
	public VremenskaPrognoza(){
		
	}
	public VremenskaPrognoza(String gra, String opi, float tem, int tla){
		grad = gra;
		opis = opi;
		temperatura = tem;
		tlak = tla;
	}
	public void ucitajPodatke(String niz){
		String[] podaci = niz.split(";");
		if (podaci.length < 4){
			System.out.println("Pogrešan primljeni niz. Niz nema 4 podatka!");
			return;
		}
		grad = podaci[0];
		opis = podaci[1];
		temperatura = Float.parseFloat(podaci[2]);
		tlak = Integer.parseInt(podaci[3]);
	}
	public String toString(){
		return grad+ ";" + opis + ";" + temperatura + ";" + tlak;
	}
	
	public static void main(String[] args) {
		// Prvo testiramo stvaranje niza
		VremenskaPrognoza v1 = new VremenskaPrognoza("Dubrovnik", "sunèano", 17.5f, 1200);
		System.out.println(v1);
		System.out.println();
		
		// sada na drugom objektu testiramo uèitavanje podataka
		VremenskaPrognoza v2 = new VremenskaPrognoza();
		v2.ucitajPodatke("Dubrovnik;malo oblaèno;12.5;1024");
		System.out.println(" Grad: " + v2.grad);
		System.out.println(" Opis: " + v2.opis);
		System.out.println(" Temperatura: " + v2.temperatura);
		System.out.println(" Tlak: " + v2.tlak);
	}

}
