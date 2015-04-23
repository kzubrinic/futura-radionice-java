package r04.rjesenja_zadataka;

/**
 * @author Krunoslav Žubriniæ
 * 23. tra 2015.
 */
public class TestStudent {
	private Baza b;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestStudent t = new TestStudent();
		t.b = new Baza();
		t.b.dodajStudenta(new Integer(1), "Ana", new Float(2.67));
		t.b.dodajStudenta(new Integer(2), "Pero", new Float(4.95));
		t.b.dodajStudenta(new Integer(3), "Ivo", new Float(3.96));
		t.b.ispisiStudente();
		t.b.obrisiStudenta(new Integer(2));
		t.b.ispisiStudente();
		t.b.ispisiStudenta(new Integer(3));
		t.b.nulirajOcjene();
		t.b.ispisiStudente();
		
	}
}
