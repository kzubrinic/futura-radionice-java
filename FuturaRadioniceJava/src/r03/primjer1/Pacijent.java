
package r03.primjer1;

/**
 * primjer naslje�ivanja - testiranje
 * @author Krunoslav �ubrini�
 * 26. o�u 2015.
 */
public class Pacijent {
	public static void main(String[] args) {
		Pedijatar prvi = new Pedijatar();
		Kirurg drugi = new Kirurg();
		prvi.piseRecepte();
		prvi.lijeciPacijente();
		drugi.lijeciPacijente();
		drugi.lijeciPacijente(true);
	}
}
