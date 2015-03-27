package r02.rjesenja_zadataka;
import java.util.Random;
import java.util.Scanner;
/**
 * 1. ZADATAK
 * Napravite jednostavnu igru poga�anja brojeva. 
 * Generirajte slu�ajan broj u intervalu 1-20.
 * Pomo�u metode stvorenog objekta tipa Scanner unesite s tipkovnice 
 * cijeli broj u intervalu 1-20.
 * - Ako je uneseni broj jednak generiranom, ispi�ite poruku 
 *   "Bravo pogodio si!" i prekinite izvo�enje programa.
 * - Ako je uneseni broj manji od generiranog, ispi�ite poruku 
 *   "Unesite ve�i broj!" i omogu�ite ponovni unos.
 * - Ako je uneseni broj ve�i od generiranog, ispi�ite poruku 
 *   "Unesite manji broj!" i omogu�ite ponovni unos.
 * Igra se treba odvijati sve dok ne pogodite generirani broj.
 * Na kraju ispi�ite iz kojeg poku�aja ste pogodili broj.
 * @author Krunoslav �ubrini�
 * 12. o�ujka 2015.
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
                System.out.println("Unesite VE�I broj!");
            }
            else{
                System.out.println("Unesite MANJI broj!");
            }
        }
        ip.s.close();
        System.out.println("Pogodili ste iz " + n + "-tog poku�aja!");
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

