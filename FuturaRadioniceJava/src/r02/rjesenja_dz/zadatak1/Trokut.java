package r02.rjesenja_dz.zadatak1;

/**
 * Implementirati razred Trokut koji treba sadr�avati:
 *  - tri varijable instance tipa float koje �uvaju duljine stranica trokuta;
 *  - konstruktor koji prima tri parametra tipa float i postavlja vrijednosti 
 *  	varijabli instance na primljene vrijednosti;
 *  - metodu float vratiOpseg() koja ra�una i vra�a opseg trokuta kao zbroj 
 *  	duljina stranica;
 *  - metodu float vratiPovrsinu() koja ra�una povr�inu trokuta pomo�u 
 *  	Heronove formule \(P = \sqrt{s(s-a)(s-b)(s-c)}\), gdje je s 
 *  	polovica opsega trokuta.
 *  - metodu boolean equals(Trokut) koja uspore�uje jesu li dva trokuta jednaka. 
 *  	Dva trokuta su jednaka ako ako su im sve tri stranice jednake duljine.
 *  - metodu String toString() koja vra�a podatke o trokutu u obliku niza znakova: 
 *  	Trokut duljina stranica a=duljina, b=duljina, c=duljina.
 *  
 * @author Krunoslav �ubrini�
 * 27. o�u 2015.
 */
public class Trokut {
	public float a, b, c;
	public Trokut(){}
	public Trokut(float a, float b, float c){
		// "this" ozna�ava varijablu instancu ovog objekta. Treba se koristiti
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
