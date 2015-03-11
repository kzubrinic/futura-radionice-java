// Program je smje�ten u paket futura.java.r01 
package r01.futura.java;
// Razred Scanner je opisan u paketu java.util pa taj paket treba
// uklju�iti u program.
import java.util.Scanner;
/**
 * Ra�unaje opsega. Primjer jednostavnog programa gdje se unosi
 * podatak, obra�uje i ispisuje.
 * @author Krunoslav �ubrini�
 * 6. o�ujak 2015.
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
		// Na zaslonu se ispisuje rezultat mno�enja unesenog broja s 4.
		System.out.print(i*4); 
		// Skener se zatvara.
		sc.close();
	}
}

