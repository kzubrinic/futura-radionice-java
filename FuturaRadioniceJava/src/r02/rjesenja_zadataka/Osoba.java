package r02.rjesenja_zadataka;
/**
 * 2. ZADATAK
 * Napravite razred Osoba koji �uva ime i prezime osobe i 
 * datum ro�enja (dva niza znakova).
 * Razred treba imati:
 * - Konstruktor koji prima ime i prezime osobe i datum ro�enja 
 *   te postavlja varijable instance na primljene vrijednosti.
 * - Metodu equals koja slu�i za uspore�ivanje osoba (osobe su iste 
 *   ako imaju jednako ime i prezime i datum ro�enja).
 * - Metodu toString koja predstavlja osobu imenom i prezimenom 
 *   te datumom ro�enja.
 * @author Krunoslav �ubrini�
 * 12. o�ujak 2015.
 */
public class Osoba {
	// Varijable koje �uvaju ime i prezime te datum ro�enja
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
        // ako se preda neinicijalizirana varijabla, javit �e se gre�ka
    	// pa moramo spreij�iti taj slu�aj.
    	if (o == null)
    		return false;
    	// obje reference pokazuju na isti objekt
    	// "this" predstavalja ovaj objekt 
        if (o == this)
            return true;
        // smatramo da su dvije osobe iste ako imaju isto ime i datum ro�enja
        if ((imePrezime.equals(o.imePrezime)) && (datumRod.equals(o.datumRod)))
            return true;
        
        // ina�e, osobe su razli�ite
        return false;    
    }
    public String toString(){
        return "Ime i prezime: " + imePrezime + " Datum ro�enja: " + datumRod;
    }
}
