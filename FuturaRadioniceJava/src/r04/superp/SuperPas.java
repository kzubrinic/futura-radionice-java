package r04.superp;

/**
 * @author Krunoslav Žubriniæ
 * 9. tra 2015.
 */
public class SuperPas extends PorodicaPasa {
	    SuperPas(String ime) {
	        super(ime);
	        System.out.println("Izvodi se konstruktor razreda SuperPas");
	     }
	    public void glasanje() {
	        super.glasanje();   
	     }   
	    public void hranjenje() {
	        super.hranjenje();   
	    }   
}
