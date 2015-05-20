package r07.dretve;

/**
 * @author Krunoslav Žubriniæ
 * 19. svi 2015.
 */
public class VisestrukeDretve implements Runnable{
	// Posao koji se obavlja u dretvi stavlja se u metodu run
	public void run(){  

		try {
			// Dretva pauzira 2 sekunde
			Thread.sleep(2000);
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		for (int i = 0; i<20; i++){
			// dohvaæa naziv trenutne dretve
			String naziv = Thread.currentThread().getName();
			System.out.println("Dretva " + naziv + " radi.");  
		}
	}   
	public static void main(String args[]){  
		VisestrukeDretve obj = new VisestrukeDretve();  
		Thread t1 = new Thread(obj);  
		t1.setName("PRVA");
		Thread t2 = new Thread(obj);
		t2.setName("DRUGA");
		Thread t3 = new Thread(obj);
		t3.setName("TREÆA");
		t1.start();  
		t2.start();
		t3.start();
	}  
}
