// Program je smje�ten u paket futura.java.r01 
package r01.futura.java;
// Klasa Scanner je opisana u paketu java.util pa taj paket treba
// uklju�iti u program.
import java.util.Scanner;
/**
 * Primjer for petlje.
 * @author Krunoslav �ubrini�
 * 6. o�u 2015.
 */
public class Petlja {
	public static void main(String[] args)
    {
		System.out.println("Unesite cijeli broj:");
		// Stvara se objekt tipa Scanner za unos podataka sa standardnog
		// ulaza (System.in).
		Scanner sc = new Scanner(System.in);
		// Sa standardnog ulaza unosi se cijeli broj.
    	int n = sc.nextInt();
    	// Petlja se vrti n puta. 
    	//   - Na po�etku se vrijednost varijable i (indeksa) postavlja na nulu.
    	//   - Na po�etku izvo�enja petlje provjerava se uvjet (je li i manji od n).
    	//     Ako je uvjet istinit, nastavlja se izvo�enje petlje.
    	//   - Na dnu petlje varijabla i se inkrementira (pove�ava se njezina vrijednost).
    	for (int i=0; i<n; i++){
    		// Ako je varijabla i parna ispisuje se jedan tekst...
    	    if (i % 2 == 0)
    	        System.out.println(i + " je paran broj.");
    	    // ina�e se ispisuje drugi tekst.
    	    else 
    	        System.out.println(i + " je neparan broj.");
    	}
    	// Skener se zatvara.
    	sc.close();
   	}
}