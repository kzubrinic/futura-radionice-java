// Program je smješten u paket futura.java.r01 
package r01.futura.java;
// Razred Scanner je opisan u paketu java.util pa taj paket treba
// ukljuèiti u program.
import java.util.Scanner;
/**
 * Raèunaje opsega. Primjer jednostavnog programa gdje se unosi
 * podatak, obraðuje i ispisuje.
 * @author Krunoslav Žubriniæ
 * 6. ožujak 2015.
 */
public class Opseg {
	public static void main(String[] args) {
		System.out.println("Unesite duljinu:");
		// Stvara se objekt tipa Scanner za unos podataka sa standardnog
		// ulaza (System.in).
		Scanner sc = new Scanner(System.in);
		// Sa standardnog ulaza unosi se cijeli broj.
    	int i = sc.nextInt();
		System.out.println("Opseg kvadrata je ");
		// Na zaslonu se ispisuje rezultat množenja unesenog broja s 4.
		System.out.print(i*4); 
		// Skener se zatvara.
		sc.close();
	}
}

