package r02.rjesenja_dz.zadatak1;

/**
 * Implementirati testni razred TestTrokut. U main metodi testnog razreda 
 *  	stvoriti dva objekta tipa Trokut. Ispisati njihov opseg, površinu i 
 *  	duljine stranica. Ovisno o tome jesu li dva trokuta jednaka ispisati 
 *  	na zaslon tekst Trokuti su jednaki ili Trokuti su razlièiti.
 * @author Krunoslav Žubriniæ
 * 27. ožu 2015.
 */
import java.util.Scanner;
public class TestTrokut {

	public static void main(String[] args) {
		float[] duljineS = new float[6];
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite duljine stranica 1. trokuta: ");
		duljineS[0]=s.nextFloat();
		duljineS[1]=s.nextFloat();
		duljineS[2]=s.nextFloat();
		System.out.print("Unesite duljine stranica 2. trokuta: ");
		duljineS[3]=s.nextFloat();
		duljineS[4]=s.nextFloat();
		duljineS[5]=s.nextFloat();
		Trokut t1 = new Trokut(duljineS[0], duljineS[1], duljineS[2]);
		System.out.println("STVOREN JE 1. TROKUT: "+t1);
		Trokut t2 = new Trokut(duljineS[3], duljineS[4], duljineS[5]);
		System.out.println("STVOREN JE 2. TROKUT: "+t2);
		System.out.println("Opseg 1. trokuta je: "+ t1.vratiOpseg() + " , a 2. je: : "+t2.vratiOpseg());
		System.out.println("Površina 1. trokuta je: "+ t1.vratiPovrsinu() + " , a 2. je: : "+t2.vratiPovrsinu());
		if (t1.equals(t2))
			System.out.println("Trokuti su jednaki!");
		else
			System.out.println("Trokuti su razlièiti!");
	}

}
