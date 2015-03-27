package r02;
/**
 * Primjer metode equals i toString
 * @author Krunoslav Žubriniæ
 *
 */
public class Krug {
	private float polumjer;
	public Krug(float p){
		polumjer = p;
	}
	public boolean equals(Krug k){
		if (k == null)
			return false;
		if (!(k instanceof Krug)) 
			return false;
		if ((polumjer == k.polumjer) || (k == this))
			return true;
		return false;
	}
	
	public String toString(){
		return "Krug polumjera " +polumjer;
	}
}
