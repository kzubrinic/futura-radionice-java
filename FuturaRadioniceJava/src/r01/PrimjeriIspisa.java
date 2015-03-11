package r01;
/**
 * Primjer razli�itih ispisa pomo�u metoda
 * print, println i printf
 * @author Krunoslav �ubrini�
 * 6. o�u 2015.
 */
public class PrimjeriIspisa {
	public static void main(String[] args) {
		// Nakon metode println automatski se prelazi u novi red.
		// Ovo ide u prvi red ...
        System.out.println("Danas je �etvrtak ");
        // a ovo u sljede�i.
        System.out.println("26. velja�e 2015.");
        
        // Nakon metode print ispis ne nastavlja u istom redu.
        // U istom redu se ispisuje tekst s nazivom dana i datum.
        System.out.print("Danas je �etvrtak ");
        System.out.print("26. velja�e 2015.\n");

        // Metoda println ispisuje vrijednost broja PI s punim
        // brojem decimala.
        System.out.println("PI je " + Math.PI);
        // Pomo�u metode printf mo�e se formatirati ispis.
        // U ovom primjeru PI se ispisuje zaokru�en na 3 decimale.
        System.out.printf("PI na 3 decimale je %.3f\n", Math.PI);

        // Znak backlash ispred posebnog znaka koristi se kada taj posebni
        // znak �elimo ispisati.
        // Pod navodnicima se ispisuje rije� "ki�no" s navodnicima. Znak
        // \n na kraju odra�uje prijelaz u novi red.
        System.out.print("Danas je tako \"ki�no\" vrijeme!\n");
        // \t ispisuje skok na poziciju sljede�eg tabulatora, a
        // \\ ispisuje znak \ (backlash) na zaslonu.
        System.out.println("Stvarno je \t \\ki�no\\!");
    }
}
