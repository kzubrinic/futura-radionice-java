package r02.rjesenja_zadataka;
import java.util.Scanner;
/**
 * 4. ZADATAK
 * Napi�ite razred EMail koji vr�i razne obrade e-mail adrese. 
 * Razred treba sadr�avati:
 * - Metodu provjeriEmail koja prima niz znakova (e-mail adresu) 
 *   i vra�a logi�ku vrijednost true, ako je adresa ispravna, 
 *   odnosno false ako nije ispravna. E-mail adresa je ispravna ako 
 *   sadr�i to�no jedan znak @ i barem jednu to�ku koja se nalazi na 
 *   poziciji iza znaka @.
 * - Metodu vratiDomenu koja prima niz znakova (e-mail adresu) i 
 *   vra�a domenu (niz znakova iza znaka @ ).
 * U main metodi razreda testirajte napisanu funkcionalnost.
 * @author Krunoslav �ubrini�
 * 12. o�ujka 2015.
 */
public class EMail {

	public boolean provjeriEmail(String email){
		int at = email.indexOf("@");
		int drugiAt = email.lastIndexOf("@");
		int tocka = email.lastIndexOf(".");
		// ispravna adresa sadr�ai samo jedan znak @ i to�ku iza znaka @
		if ((at != drugiAt) || (at < 0) || (tocka < at))
			return false;
		
		return true;
	}
	public String vratiDomenu(String email){
		int at = email.indexOf("@");
		return email.substring(at+1);
	}

	public static void main(String[] args) {
		EMail e = new EMail();
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite e-mail adresu: ");
		String adr = s.nextLine();
		if (e.provjeriEmail(adr)){
			System.out.println("E-mail adresa " + adr + " je ispravna!");
			System.out.println("Domena e-mail adrese je " + e.vratiDomenu(adr));
		}
		else{
			System.out.println("E-mail adresa " + adr + " NIJE ispravna!");
		}
	}

}
