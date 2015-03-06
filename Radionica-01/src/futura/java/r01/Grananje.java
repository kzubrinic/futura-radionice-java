// Program je smješten u paket futura.java.r01 
package futura.java.r01;
//Klasa Scanner je opisana u paketu java.util pa taj paket treba
//ukljuèiti u program.
import java.util.Scanner;
/**
 * Primjer višestrukog grananja
 * @author Krunoslav Žubriniæ
 * 6. ožu 2015.
 */
public class Grananje {
	public static void main(String[] args)
    {
		System.out.println("Unesite starost osobe:");
		// Stvara se objekt tipa Scanner za unos podataka sa standardnog
		// ulaza (System.in).
		Scanner sc = new Scanner(System.in);
		// Sa standardnog ulaza se unosi cijeli broj.
    	int starost = sc.nextInt();
    	// Ovisno o vrijednosti unesenog broja izvršava se odreðeni
    	// dio programskog koda.
        if (starost < 13)
            System.out.println("Dijete");
        else if ((starost > 12) && (starost < 20))
            System.out.println("Tinejdžer");
        else if ((starost > 19) && (starost < 41))
            System.out.println("Mlada osoba");
        else if ((starost > 40) && (starost < 61))
            System.out.println("Srednje stara osoba");
        else
            System.out.println("Stara osoba");
        // Skener se zatvara.
        sc.close();
    }
}
