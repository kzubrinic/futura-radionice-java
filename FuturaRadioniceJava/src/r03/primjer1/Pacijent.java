
package r03.primjer1;

/**
 * primjer nasljeðivanja - testiranje
 * @author Krunoslav Žubriniæ
 * 26. ožu 2015.
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
