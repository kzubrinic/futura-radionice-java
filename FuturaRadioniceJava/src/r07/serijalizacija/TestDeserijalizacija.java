package r07.serijalizacija;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Krunoslav Žubriniæ
 * 19. svi 2015.
 */
public class TestDeserijalizacija {
	public static void main(String[] args) {
		try{
			FileInputStream fs = new FileInputStream("osoba.ser");
			ObjectInputStream is = new ObjectInputStream(fs);
			
			Osoba o = (Osoba)is.readObject();
			is.close();
			System.out.println(o);
			System.out.println("Deserijalizacija uspješno završena!");
		} catch (Exception e){
			System.out.println("Greška deserijalizacije!");
			e.printStackTrace();
		}
		
	}

}
