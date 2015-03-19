package r02.rjesenja_zadataka;
/**
 * 2. ZADATAK
 * Napravite razred Osoba koji èuva ime i prezime osobe i 
 * datum roðenja (dva niza znakova).
 * Razred treba imati:
 * - Konstruktor koji prima ime i prezime osobe i datum roðenja 
 *   te postavlja varijable instance na primljene vrijednosti.
 * - Metodu equals koja služi za usporeðivanje osoba (osobe su iste 
 *   ako imaju jednako ime i prezime i datum roðenja).
 * - Metodu toString koja predstavlja osobu imenom i prezimenom 
 *   te datumom roðenja.
 * @author Krunoslav Žubriniæ
 * 12. ožujak 2015.
 */
public class Osoba {
	// Varijable koje èuvaju ime i prezime te datum roðenja
    String imePrezime, datumRod;
    int starost = 0;
    /**
     * Konstruktor prima vrijednosti i inicijalizira varijable instance.
     */
    public Osoba(String ip, String dr){
        imePrezime = ip;
        datumRod = dr;
    }
    boolean equals(Osoba o){
        // ako se preda neinicijalizirana varijabla, javit æe se greška
    	// pa moramo spreijèiti taj sluèaj.
    	if (o == null)
    		return false;
    	// obje reference pokazuju na isti objekt
    	// "this" predstavalja ovaj objekt 
        if (o == this)
            return true;
        // smatramo da su dvije osobe iste ako imaju isto ime i datum roðenja
        if ((imePrezime.equals(o.imePrezime)) && (datumRod.equals(o.datumRod)))
            return true;
        
        // inaèe, osobe su razlièite
        return false;    
    }
    public String toString(){
        return "Ime i prezime: " + imePrezime + " Datum roðenja: " + datumRod;
    }
}
