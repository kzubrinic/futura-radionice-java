package r01;
/**
 * Primjer razlièitih ispisa pomoæu metoda
 * print, println i printf
 * @author Krunoslav Žubriniæ
 * 6. ožu 2015.
 */
public class PrimjeriIspisa {
	public static void main(String[] args) {
		// Nakon metode println automatski se prelazi u novi red.
		// Ovo ide u prvi red ...
        System.out.println("Danas je èetvrtak ");
        // a ovo u sljedeæi.
        System.out.println("26. veljaèe 2015.");
        
        // Nakon metode print ispis ne nastavlja u istom redu.
        // U istom redu se ispisuje tekst s nazivom dana i datum.
        System.out.print("Danas je èetvrtak ");
        System.out.print("26. veljaèe 2015.\n");

        // Metoda println ispisuje vrijednost broja PI s punim
        // brojem decimala.
        System.out.println("PI je " + Math.PI);
        // Pomoæu metode printf može se formatirati ispis.
        // U ovom primjeru PI se ispisuje zaokruèen na 3 decimale.
        System.out.printf("PI na 3 decimale je %.3f\n", Math.PI);

        // Znak backlash ispred posebnog znaka koristi se kada taj posebni
        // znak želimo ispisati.
        // Pod navodnicima se ispisuje rijeè "kišno" s navodnicima. Znak
        // \n na kraju odraðuje prijelaz u novi red.
        System.out.print("Danas je tako \"kišno\" vrijeme!\n");
        // \t ispisuje skok na poziciju sljedeæeg tabulatora, a
        // \\ ispisuje znak \ (backlash) na zaslonu.
        System.out.println("Stvarno je \t \\kišno\\!");
    }
}
