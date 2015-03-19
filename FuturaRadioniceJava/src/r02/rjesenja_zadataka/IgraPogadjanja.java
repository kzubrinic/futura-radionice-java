package r02.rjesenja_zadataka;
import java.util.Random;
import java.util.Scanner;
/**
 * 1. ZADATAK
 * Napravite jednostavnu igru pogaðanja brojeva. 
 * Generirajte sluèajan broj u intervalu 1-20.
 * Pomoæu metode stvorenog objekta tipa Scanner unesite s tipkovnice 
 * cijeli broj u intervalu 1-20.
 * - Ako je uneseni broj jednak generiranom, ispišite poruku 
 *   "Bravo pogodio si!" i prekinite izvoðenje programa.
 * - Ako je uneseni broj manji od generiranog, ispišite poruku 
 *   "Unesite veæi broj!" i omoguæite ponovni unos.
 * - Ako je uneseni broj veæi od generiranog, ispišite poruku 
 *   "Unesite manji broj!" i omoguæite ponovni unos.
 * Igra se treba odvijati sve dok ne pogodite generirani broj.
 * Na kraju ispišite iz kojeg pokušaja ste pogodili broj.
 * @author Krunoslav Žubriniæ
 * 12. ožujka 2015.
 */

public class IgraPogadjanja
{
    private Scanner s = new Scanner(System.in);
    private int izabran = 0, unesen = 0;
    public static void main(String[] args)
    {
        int provjeri, n=0;
        IgraPogadjanja ip = new IgraPogadjanja();
        ip.izabran = ip.generirajBroj();
        while(true){
            ip.unesen = ip.unesiBroj();
            provjeri = ip.provjeri();
            n++;
            if (provjeri==0){
                System.out.println("Bravo! Pogodili ste!");
                break;
            }
            else if ((provjeri < 0)){
                System.out.println("Unesite VEÆI broj!");
            }
            else{
                System.out.println("Unesite MANJI broj!");
            }
        }
        ip.s.close();
        System.out.println("Pogodili ste iz " + n + "-tog pokušaja!");
    }
    private int generirajBroj(){
        return 1+(int)(Math.random()*20);
    }
    private int unesiBroj(){
        System.out.print("Unesite broj: ");
        return s.nextInt();
    }
    private int provjeri(){
        if (unesen == izabran)
            return 0;
        else if (unesen < izabran)
            return -1;
        else
            return 1;
    }
}

