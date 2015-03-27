package r02;
/**
 * Primjer dohva�anja podniza znakova i znaka koji se nalazi na odre�enoj poziciji
 * @author Krunoslav �ubrini�
 * 11. o�ujak 2015.
 */
import java.util.Scanner;

public class Podniz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite niz znakova: ");
		String niz = s.nextLine();
		System.out.print("Unesite po�etnu poziciju podniza: ");
		int a = s.nextInt();
		System.out.print("Unesite zavr�nu poziciju podniza: ");
		int b = s.nextInt();
		boolean indeksiOk = true;
		// Ako se poku�a dohvatiti znak van niza javiti �e se gre�ka.
		// Na ovaj na�in sprje�avamo pojavu gre�ke.
		if ((a >= niz.length()) || (a < 0)){
			System.out.println("Indeks "+ a + " je van raspona niza " + niz + " duljine " + niz.length());
			indeksiOk = false;
		}
		if ((b >= niz.length()) || (b < 0)){
			System.out.println("Indeks "+ b + " je van raspona niza " + niz + " duljine " + niz.length());
			indeksiOk = false;
		}
		if (a > b){
			System.out.println("Prvi indeks "+ a + " ne smije biti ve�i od drugog " + b);
			indeksiOk = false;
		}
		if (indeksiOk)
			System.out.printf("Podniz niza %s od %d do %d pozicije je %s.\n", niz, a, b, niz.substring(a, b));
		indeksiOk = true;	
		
		System.out.print("Unesite poziciju znaka koji �elite dohvatiti: ");
		a = s.nextInt();
		s.nextLine(); // uklanja \n koji nextInt preska�e
		
		// Ako se poku�a dohvatiti znak van niza javiti �e se gre�ka.
		// Na ovaj na�in sprje�avamo pojavu gre�ke.
		if ((a >= niz.length()) || (a < 0)){
			System.out.println("Indeks "+ a + " je van raspona niza " + niz + " duljine " + niz.length());
			indeksiOk = false;
		}
		if (indeksiOk)
			System.out.printf("Na %d poziciji niza %s nalazi se znak %c.\n", a, niz, niz.charAt(a));
		
		System.out.print("Unesite podniz koji �elite prona�i: ");
		String pod = s.nextLine();
		
		int poz = niz.indexOf(pod);
		if (poz < 0)
			System.out.println("Podniz " + pod + " se ne nalazi u nizu " + niz);
		else
			System.out.println("indexOf(): Podniz " + pod + " se u nizu " + niz + " nalazi na poziciji " + poz);
		
		poz = niz.lastIndexOf(pod);
		if (poz < 0)
			System.out.println("Podniz " + pod + " se ne nalazi u nizu " + niz);
		else
			System.out.println("lastIndexOf(): Podniz " + pod + " se u nizu " + niz + " nalazi na poziciji " + poz);
		s.close();
	}

}
