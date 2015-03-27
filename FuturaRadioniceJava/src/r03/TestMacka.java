package r03;

import java.util.Scanner;

/**
 * Testiranje getter i setter metoda - u�ahurivanje varijabli
 * @author Krunoslav �ubrini�
 * 26. o�u 2015.
 */
public class TestMacka {
	public static void main(String[] args) {
		Macka m = new Macka();
		Scanner s = new Scanner(System.in);
		
		boolean greska;
		do{
			System.out.print("Unesite visinu ma�ke u cm: ");
			int v = s.nextInt();
			greska = m.setVisina(v);
		} while (!greska);
		
		System.out.println("Ma�ka je visoka "+m.getVisina()+ " cm.");

	}

}
