/**
 * 
 */
package r07.serijalizacija;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Krunoslav �ubrini�
 * 19. svi 2015.
 */
public class TestUcenik {
	public static void main(String[] args) {
		Ucenik uc = new Ucenik("Ana", "Ani�", 16, "01.01.1999", new Skola("Gimnazija") );
		System.out.println(uc);
		try{
			FileOutputStream fs = new FileOutputStream("ucenik.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(uc);
			os.close();
			System.out.println("Serijalizacija uspje�no zavr�ena!");
			
			FileInputStream fis = new FileInputStream("ucenik.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Ucenik uc2 = (Ucenik)ois.readObject();
			ois.close();
			System.out.println(uc2);
			System.out.println("Deserijalizacija uspje�no zavr�ena!");
			
		} catch (Exception e){
			System.out.println("Gre�ka serijalizacije/deserijalizacije!");
			e.printStackTrace();
		}
	}
}
