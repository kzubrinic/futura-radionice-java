/**
 * 
 */
package r05.rjesenja_zadataka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Krunoslav Žubriniæ
 * 21. tra 2015.
 */
public class Zadatak2 {

	BufferedReader dat;
    public void citajDatoteku(String d, float v) throws IOException {
    	String ispis = String.format("DATOTEKA: %s VELIÈINA: %.2fKB", d, v);
        String c = "";
            dat = new BufferedReader(new FileReader(d));
            System.out.println("============================");
            System.out.println(ispis);
            System.out.println("============================");

            while ((c = dat.readLine()) != null) {
                // readLine() skida znak za novi red pa je potrebno dodati za prikaz na ekranu
                System.out.println(c.toUpperCase());
            }
            dat.close();
 
    }
	public static void main(String[] args) {
		Zadatak2 z = new Zadatak2();
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite naziv datoteke: ");
		String d = s.nextLine();
		s.close();
		File m = new File(d);
		if (!m.exists())
			System.out.println("Unesena datoteka ne postoji!");
		else{
			float v = (float)m.length()/1024;
			
			try {
				z.citajDatoteku(d, v);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
