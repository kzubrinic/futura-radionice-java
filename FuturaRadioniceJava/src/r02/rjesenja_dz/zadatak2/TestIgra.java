package r02.rjesenja_dz.zadatak2;

/**
 * Implementirati testni razred TestIgra. U main metodi testnog razreda:
 * - Stvoriti tri objekta tipa Igra.
 * - Ispisati tekstualnu reprezentaciju stvorenih objekata;
 * Na temelju na�ina na koji se mijenjaju vrijednosti varijabli brojIgraca 
 *   i idIgraca pojedinog objekta uo�ite razliku u pona�anju varijabli 
 *   instance i varijabli razreda.
 * @author Krunoslav �ubrini�
 * 27. o�u 2015.
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
