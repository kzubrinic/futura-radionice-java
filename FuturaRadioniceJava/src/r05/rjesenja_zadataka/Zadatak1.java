package r05.rjesenja_zadataka;

import java.io.File;
import java.util.Scanner;

/**
 * @author Krunoslav Žubriniæ
 * 21. tra 2015.
 */
public class Zadatak1 {

	private void obrada(){
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite naziv mape: ");
		String d = s.nextLine();
		File m = new File(d);
		if (!m.exists()){
			System.out.println("Unesena mapa ne postoji!");
			return;
		}
		File[] dat = m.listFiles();
		int brDat = 0, brMap = 0;
		String vrsta = "";
		for (File f : dat){
			if (f.isFile())
				brDat++;
			if (f.isDirectory())
				brMap++;
			if (f.length()>10240)
				System.out.println("Datoteka "+f.getName()+" je velika "+f.length()/10240 + "KB");
		}
		System.out.println("Mapa sadrži " + brMap + " mape i " + brDat + " datoteke!");
	}
	
	public static void main(String[] args) {
		Zadatak1 z = new Zadatak1();
		z.obrada();
	}

}
