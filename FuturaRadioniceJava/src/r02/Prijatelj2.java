package r02;
/**
 * Primjer razreda s konstruktorima
 * @author Krunoslav Žubriniæ
 * 11. ožu 2015.
 */
public class Prijatelj2 {
	String ime;
	int starost;
	// defaultni konstruktor
	public Prijatelj2(){
		System.out.println("Novi prijatelj!");
	}
	// konstruktor koji postavlja ime
	public Prijatelj2(String im){
		ime = im;
		System.out.println("Novi prijatelj "+ime);
	}
	// konstruktor koji postavlja ime i starost
	public Prijatelj2(String im, int sta){
		ime = im;
		starost = sta;
		System.out.println("Novi prijatelj " + ime + " ima " + starost + " godina.");
	}
	public void setIme(String im){
		ime = im;
	}
	public void setStarost(int sta){
		starost = sta;
	}
	public String toString(){
		return "Ime: " + ime + " Starost: " + starost;
	}
}
