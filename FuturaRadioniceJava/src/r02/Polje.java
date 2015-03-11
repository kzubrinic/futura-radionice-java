package r02;
import java.util.Arrays;
/**
 * Primjer polja
 * @author Krunoslav Žubriniæ
 * 11. ožu 2015.
 */
public class Polje {
	// Polje od 10 cijelih brojeva
	public int[] poljeInt = new int[10];
	// Polje od 8 cijelih brojeva inicijalizirano podacima
	public int[] polje2 = {2, 5, 1, 7, 6, 4, 9, 8};
	// Polje u koje se smještaju objekti tipa Prijatelj2 (4 objekta)
	public Prijatelj2[] poljePrij = new Prijatelj2[4];
	
	public void duljinaPolja(){
		// duljina polja
		System.out.print("Duljina polja je: ");
		System.out.print(poljeInt.length + ", " + polje2.length + " i " + poljePrij.length);
		System.out.println();
	}
	
	public void sortirajPolja(){
		// sortiraju se polja popunjena brojevima
		Arrays.sort(poljeInt);
		Arrays.sort(polje2);
	}
	public void napuniPolja(){
		// polje cijelih brojeva puni sluèajnim brojevima u intervalu 0-10
		for (int i = 0; i < 10; i++)
        	poljeInt[i] = 1 + (int)(Math.random() * 10);
		
		// Polje objekata tipa Prijatelj2 puni s nekoliko objekata
		Prijatelj2 p1 = new Prijatelj2("Ana", 25);
		Prijatelj2 p2 = new Prijatelj2("Vlaho", 19);
		Prijatelj2 p3 = new Prijatelj2("Pero", 37);
		Prijatelj2 p4 = new Prijatelj2("Ivana", 30);
		
		poljePrij[0] = p1;
		poljePrij[1] = p2;
		poljePrij[2] = p3;
		poljePrij[3] = p4;
	}
	
	public void ispisiPolja(){
		for (int i = 0; i < poljeInt.length; i++)
			System.out.println(poljeInt[i]);
		System.out.println();
		for (int i = 0; i < polje2.length; i++)
			System.out.println(polje2[i]);
		System.out.println();
		for (int i = 0; i < poljePrij.length; i++)
			System.out.println(poljePrij[i]);
		System.out.println();
	}

	
	public static void main(String[] args){
		Polje p = new Polje();
		p.duljinaPolja();
		p.napuniPolja();
		p.ispisiPolja();
		p.sortirajPolja();
		p.ispisiPolja();
	}
}
