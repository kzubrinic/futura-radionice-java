// Program je smje�ten u paket futura.java.r01 
package r01.futura.java;
//Klasa Scanner je opisana u paketu java.util pa taj paket treba
//uklju�iti u program.
import java.util.Scanner;
/**
 * Primjer kori�tenja break i continue unutar petlje
 * @author Krunoslav �ubrini�
 * 6. o�u 2015.
 */
public class BreakContinue {
	public static void main(String[] args)
    {
		int broj = 0;
		// Stvara se objekt tipa Scanner za unos podataka sa standardnog
		// ulaza (System.in)
		Scanner sc = new Scanner(System.in);
    	// Beskona�na petlja
    	for (; ;){
    		System.out.println("Unesite cijeli broj:");
    		// Unos cijelog broja u varijablu broj.
    		broj = sc.nextInt();
    		// Ako je unesena nula ili negativan broj - izlazak iz petlje.
    		if (broj <= 0)
    			break;
    		// Svaki broj ve�i od 99 presko�i i vrati se na po�etak petlje.
    		else if (broj > 99)
    			continue;
    		// Svaki drugi broj ispi�i (svaki jedno i dvoznamenkasti broj).
    		else
    			System.out.println(broj);
    	}
    	// Skener se zatvara.
    	sc.close();
   	}
}
