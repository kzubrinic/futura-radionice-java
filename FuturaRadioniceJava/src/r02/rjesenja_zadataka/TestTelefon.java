package r02.rjesenja_zadataka;

/**
 * U main metodi testnog razreda TestTelefon testirajte napisano u razredu Telefon.
 * @author Krunoslav Žubriniæ
 * 17. ožujak 2015.
 */
public class TestTelefon {

	public static void main(String[] args) {
		String sBr = "0B0dostava";
		Telefon t = new Telefon();
		if (t.provjeriTelBroj(sBr))
			System.out.println("Telefonski broj: " + sBr + " je ispravan!");
		else 
			System.out.println("Telefonski broj: " + sBr + " NIJE ispravan!");
		String bBr = t.vratiTelBroj(sBr);
		System.out.println("Telefonski broj: " + sBr + " je "+ bBr);
		String fBr = t.oblikujBroj(bBr);
		System.out.println("Formatiran telefonski broj je " + fBr);
	}

}
