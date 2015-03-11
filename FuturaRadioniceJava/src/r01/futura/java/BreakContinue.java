// Program je smješten u paket futura.java.r01 
package r01.futura.java;
//Klasa Scanner je opisana u paketu java.util pa taj paket treba
//ukljuèiti u program.
import java.util.Scanner;
/**
 * Primjer korištenja break i continue unutar petlje
 * @author Krunoslav Žubriniæ
 * 6. ožu 2015.
 */
public class BreakContinue {
	public static void main(String[] args)
    {
		int broj = 0;
		// Stvara se objekt tipa Scanner za unos podataka sa standardnog
		// ulaza (System.in)
		Scanner sc = new Scanner(System.in);
    	// Beskonaèna petlja
    	for (; ;){
    		System.out.println("Unesite cijeli broj:");
    		// Unos cijelog broja u varijablu broj.
    		broj = sc.nextInt();
    		// Ako je unesena nula ili negativan broj - izlazak iz petlje.
    		if (broj <= 0)
    			break;
    		// Svaki broj veæi od 99 preskoèi i vrati se na poèetak petlje.
    		else if (broj > 99)
    			continue;
    		// Svaki drugi broj ispiši (svaki jedno i dvoznamenkasti broj).
    		else
    			System.out.println(broj);
    	}
    	// Skener se zatvara.
    	sc.close();
   	}
}
