package r07.serijalizacija;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Krunoslav �ubrini�
 * 19. svi 2015.
 */
public class TestSerijalizacija {

	public static void main(String[] args) {
		Osoba o = new Osoba("Pero", "Peri�", 27, "01.01.1988" );
		System.out.println(o);
		try{
			FileOutputStream fs = new FileOutputStream("osoba.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(o);
			os.close();
			System.out.println("Serijalizacija uspje�no zavr�ena!");
		} catch (Exception e){
			System.out.println("Gre�ka serijalizacije!");
			e.printStackTrace();
		}
		
	}

}
