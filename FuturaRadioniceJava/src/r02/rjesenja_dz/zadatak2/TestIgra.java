package r02.rjesenja_dz.zadatak2;

/**
 * Implementirati testni razred TestIgra. U main metodi testnog razreda:
 * - Stvoriti tri objekta tipa Igra.
 * - Ispisati tekstualnu reprezentaciju stvorenih objekata;
 * Na temelju naèina na koji se mijenjaju vrijednosti varijabli brojIgraca 
 *   i idIgraca pojedinog objekta uoèite razliku u ponašanju varijabli 
 *   instance i varijabli razreda.
 * @author Krunoslav Žubriniæ
 * 27. ožu 2015.
 */
public class TestIgra {

	public static void main(String[] args) {
		Igra i1 = new Igra();
		System.out.println(i1);
		Igra i2 = new Igra();
		System.out.println(i2);
		Igra i3 = new Igra();
		System.out.println(i3);

	}

}
