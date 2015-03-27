package r02.rjesenja_dz.zadatak1;

/**
 * Implementirati razred Trokut koji treba sadržavati:
 *  - tri varijable instance tipa float koje èuvaju duljine stranica trokuta;
 *  - konstruktor koji prima tri parametra tipa float i postavlja vrijednosti 
 *  	varijabli instance na primljene vrijednosti;
 *  - metodu float vratiOpseg() koja raèuna i vraæa opseg trokuta kao zbroj 
 *  	duljina stranica;
 *  - metodu float vratiPovrsinu() koja raèuna površinu trokuta pomoæu 
 *  	Heronove formule \(P = \sqrt{s(s-a)(s-b)(s-c)}\), gdje je s 
 *  	polovica opsega trokuta.
 *  - metodu boolean equals(Trokut) koja usporeðuje jesu li dva trokuta jednaka. 
 *  	Dva trokuta su jednaka ako ako su im sve tri stranice jednake duljine.
 *  - metodu String toString() koja vraæa podatke o trokutu u obliku niza znakova: 
 *  	Trokut duljina stranica a=duljina, b=duljina, c=duljina.
 *  
 * @author Krunoslav Žubriniæ
 * 27. ožu 2015.
 */
public class Trokut {
	public float a, b, c;
	public Trokut(){}
	public Trokut(float a, float b, float c){
		// "this" oznaèava varijablu instancu ovog objekta. Treba se koristiti
		// onda ako se lokalna varijabla i varijabla instance zovu jednako.
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public float vratiOpseg(){
		return a + b + c;
	}
	public float vratiPovrsinu(){
		float s = vratiOpseg() / 2;
		return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public boolean equals(Trokut t){
		if (t == null) return false;
		if ((t == this) || (a==t.a && b==t.b && c==t.c)) return true;
		return false;
	}
	public String toString(){
		return "Trokut duljina stranica a=" +a+", b=" +b+ ", c="+c;
	}
}
