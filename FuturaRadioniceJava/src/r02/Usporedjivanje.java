package r02;

/**
 * Testiranje jednakosti dva objekta metodom equals
 * @author Krunoslav Žubriniæ
 *
 */
public class Usporedjivanje {

	public static void main(String[] args) {
		Krug k1 = new Krug(3.17f);
		Krug k2 = new Krug(8.99f);
		Krug k3 = new Krug(3.17f);
		Krug k4 = null;
		System.out.print("Krugovi " + k1 + " i " + k2 + " su: "); 
		if (k1.equals(k2))
			System.out.println("jednaki");
		else
			System.out.println("razlièiti");
		
		System.out.print("Krugovi " + k1 + " i " + k3 + " su: ");
		if (k1.equals(k3))
			System.out.println("jednaki");
		else
			System.out.println("razlièiti");
		
		System.out.print("Krug " + k1 + " u usporedbi sa samim sobom je: ");
		if (k1.equals(k1))
			System.out.println("jednak");
		else
			System.out.println("razlièit");
		
		System.out.print("Krug " + k1 + " u usporedbi sa NULL je: ");
		if (k1.equals(k4))
			System.out.println("jednak");
		else
			System.out.println("razlièit");
	}

}
