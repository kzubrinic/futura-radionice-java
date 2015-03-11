package r02;
import java.util.Scanner;
/**
 * Primjer razreda koji koristi varijablu razreda "pdv"
 * @author Krunoslav Žubriniæ
 * 10. ožu 2015.
 */
public class Pdv1 {
		private static double pdv = 0;

		public void postaviStopu(double s) {
			pdv = s;
		}
		public double vratiStopu(){
			return pdv;
		}
		
		public double racPdv(double osnova) {
			double iznosPdva;
			iznosPdva = osnova * pdv / 100;
			return iznosPdva;
		}
		public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			System.out.print("Unesite stopu PDV-a: ");
			double pomPdv = s.nextDouble();
			System.out.print("Unesite osnovicu: ");
			double osnovica = s.nextDouble();
			Pdv1 p1 = new Pdv1();
			p1.postaviStopu(pomPdv);
			Pdv1 p2 = new Pdv1();
			p2.postaviStopu(pomPdv+10);
			// Stopa PDV-a u oba objekta je pomPdv+10 !
			// Razlog za to je što je varijabla pdv static odnosno
			//	varijabla razreda. Promjena varijable u bilo kojem
			//	objektu mijenja vrijednost dostupnu svim razredima.
			System.out.println("Stopa je: " + p1.vratiStopu());
			System.out.println(p1.racPdv(osnovica));
			System.out.println("Stopa je: " + p2.vratiStopu());
			System.out.println(p2.racPdv(osnovica));
		}
}
