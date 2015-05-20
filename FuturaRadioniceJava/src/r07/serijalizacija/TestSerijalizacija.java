package r07.serijalizacija;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Krunoslav Žubriniæ
 * 19. svi 2015.
 */
public class TestSerijalizacija {

	public static void main(String[] args) {
		Osoba o = new Osoba("Pero", "Periæ", 27, "01.01.1988" );
		System.out.println(o);
		try{
			FileOutputStream fs = new FileOutputStream("osoba.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(o);
			os.close();
			System.out.println("Serijalizacija uspješno završena!");
		} catch (Exception e){
			System.out.println("Greška serijalizacije!");
			e.printStackTrace();
		}
		
	}

}
