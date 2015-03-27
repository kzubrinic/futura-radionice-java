package r02;
/**
 * Primjer dohvaæanja podniza znakova i znaka koji se nalazi na odreðenoj poziciji
 * @author Krunoslav Žubriniæ
 * 11. ožujak 2015.
 */
import java.util.Scanner;

public class Podniz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite niz znakova: ");
		String niz = s.nextLine();
		System.out.print("Unesite poèetnu poziciju podniza: ");
		int a = s.nextInt();
		System.out.print("Unesite završnu poziciju podniza: ");
		int b = s.nextInt();
		boolean indeksiOk = true;
		// Ako se pokuša dohvatiti znak van niza javiti æe se greška.
		// Na ovaj naèin sprjeèavamo pojavu greške.
		if ((a >= niz.length()) || (a < 0)){
			System.out.println("Indeks "+ a + " je van raspona niza " + niz + " duljine " + niz.length());
			indeksiOk = false;
		}
		if ((b >= niz.length()) || (b < 0)){
			System.out.println("Indeks "+ b + " je van raspona niza " + niz + " duljine " + niz.length());
			indeksiOk = false;
		}
		if (a > b){
			System.out.println("Prvi indeks "+ a + " ne smije biti veæi od drugog " + b);
			indeksiOk = false;
		}
		if (indeksiOk)
			System.out.printf("Podniz niza %s od %d do %d pozicije je %s.\n", niz, a, b, niz.substring(a, b));
		indeksiOk = true;	
		
		System.out.print("Unesite poziciju znaka koji želite dohvatiti: ");
		a = s.nextInt();
		s.nextLine(); // uklanja \n koji nextInt preskaèe
		
		// Ako se pokuša dohvatiti znak van niza javiti æe se greška.
		// Na ovaj naèin sprjeèavamo pojavu greške.
		if ((a >= niz.length()) || (a < 0)){
			System.out.println("Indeks "+ a + " je van raspona niza " + niz + " duljine " + niz.length());
			indeksiOk = false;
		}
		if (indeksiOk)
			System.out.printf("Na %d poziciji niza %s nalazi se znak %c.\n", a, niz, niz.charAt(a));
		
		System.out.print("Unesite podniz koji želite pronaæi: ");
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
