// Program je smješten u paket futura.java.r01 
package futura.java.r01;
//Klasa Scanner je opisana u paketu java.util pa taj paket treba
//ukljuèiti u program.
import java.util.Scanner;
/**
 * Primjer programa kod kojeg treba pretvoriti podatak iz jednog tipa
 * u drugi da bi rezultat bio ispravan.
 * @author Krunoslav Žubriniæ
 * 6. ožu 2015.
 */
public class Dijeljenje {
	public static void main(String[] args) {
		int a, b;
		float c;
		// Stvara se objekt tipa Scanner za unos podataka sa standardnog
		// ulaza (System.in)
		Scanner s = new Scanner(System.in);
		// Sa standardnog ulaza se unose dva cijela broja: a i b
		System.out.println("Unesite prvi broj:");
		a = s.nextInt();
		System.out.println("Unesite drugi broj:");
		b = s.nextInt();
		// U Javi rezultat dijeljenja dva cijela broja je cijeli broj.
		// Želimo li ispravan rezultat (realan broj), barem jedan
		// od brojava koji se dijele treba pretvoriti u realni tip (float)
		// ili (double).
		c = (float)a/b;
		// Rezultat se ispisuje zaokružen na dvije decimale.
		System.out.printf("%d dijeljeno s %d je %.2f\n", a, b, c);
		// Skener se zatvara.
		s.close();
	}
}
