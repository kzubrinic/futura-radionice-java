/**
 * 
 */
package r03;

/**
 * Testiranje getter i setter metoda - uèahurivanje varijabli
 * @author Krunoslav Žubriniæ
 * 26. ožu 2015.
 */
import java.util.Scanner;

public class TestPdv1 {
	public static void main(String[] args) {
        Pdv1Isp novi = new Pdv1Isp();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite osnovicu: ");
		double o = s.nextDouble();
        System.out.printf("Za osnovicu %.2f (stopa %.2f) PDV je %.2f\n", o, novi.getPdv(), novi.racPdv(o));
        System.out.print("Unesite novu stopu PDV-a: ");
		double st = s.nextDouble();
		novi.setPdv(st);
		System.out.printf("Za osnovicu %.2f (stopa %.2f) PDV je %.2f\n", o, novi.getPdv(), novi.racPdv(o));
    }
}
