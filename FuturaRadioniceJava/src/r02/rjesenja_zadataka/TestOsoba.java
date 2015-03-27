package r02.rjesenja_zadataka;
import java.util.Scanner;
/**
 * 2. ZADATAK
 * Napi�ite testni razred TestOsoba. 
 * U main metodi razreda stvorite dva objekta tipa Osoba.
 * Ispi�ite osobe pozivom metode System.out.print(Osoba var). Ispisat
 * �e se niz znakova koji vra�a metoda toString.
 * Pomo�u metode equals provjerite radi li se u dva stvorena 
 * objekta o istoj osobi.
 * @author Krunoslav �ubrini�
 * 12. o�ujak 2015.
 */
public class TestOsoba {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite ime 1. osobe: ");
		String i1 = s.nextLine();
		System.out.print("Unesite datum ro�enja 1. osobe: ");
		String d1 = s.nextLine();
		System.out.print("Unesite ime 2. osobe: ");
		String i2 = s.nextLine();
		System.out.print("Unesite datum ro�enja 2. osobe: ");
		String d2 = s.nextLine();
		s.close();
		
		// stvaraju se dva objekta tipa Osoba
		Osoba o1 = new Osoba(i1, d1);
		Osoba o2 = new Osoba(i2, d2);
		
		// ispisuje se niz znakova koji vra�a metoda toString u razredu Osoba
		System.out.println(o1);
		System.out.println(o2);
		
		// provjera jednakosti
		if (o1.equals(o2))
			System.out.println("Radi se o istoj osobi.");
		else
			System.out.println("Radi se dvije razli�ite osobe.");
	}

}
