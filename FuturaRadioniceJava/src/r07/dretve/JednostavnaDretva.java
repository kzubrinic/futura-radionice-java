/**
 * 
 */
package r07.dretve;

/**
 * @author Krunoslav Žubriniæ
 * 19. svi 2015.
 */
public class JednostavnaDretva implements Runnable{
	// Posao koji se obavlja u dretvi stavlja se u metodu run
	public void run(){  
		for (int i = 0; i<20; i++){
			// dohvaæa naziv trenutne dretve
			String naziv = Thread.currentThread().getName();
			System.out.println("Dretva " + naziv + " radi.");  
		}
	}   
	public static void main(String args[]){  
		JednostavnaDretva obj = new JednostavnaDretva();  
		Thread t1 = new Thread(obj);  
		t1.start();
	}  
}
