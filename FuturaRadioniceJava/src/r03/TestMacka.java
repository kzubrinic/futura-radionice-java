package r03;

import java.util.Scanner;

/**
 * Testiranje getter i setter metoda - uèahurivanje varijabli
 * @author Krunoslav Žubriniæ
 * 26. ožu 2015.
 */
public class TestMacka {
	public static void main(String[] args) {
		Macka m = new Macka();
		Scanner s = new Scanner(System.in);
		
		boolean greska;
		do{
			System.out.print("Unesite visinu maèke u cm: ");
			int v = s.nextInt();
			greska = m.setVisina(v);
		} while (!greska);
		
		System.out.println("Maèka je visoka "+m.getVisina()+ " cm.");

	}

}
