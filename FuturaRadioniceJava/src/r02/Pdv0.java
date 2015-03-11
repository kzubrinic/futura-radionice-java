package r02;
import java.util.Scanner;
/**
 * Primjer razreda koji koristi varijablu instance "pdv"
 * @author Krunoslav Žubriniæ
 * 10. ožu 2015.
 */
public class Pdv0 {
		private double pdv = 0;

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
			Pdv0 p1 = new Pdv0();
			p1.postaviStopu(pomPdv);
			Pdv0 p2 = new Pdv0();
			p2.postaviStopu(pomPdv+10);
			// Stopa PDV-a u prvom objektu je pomPdv, a u drugom pomPdv+10 !
			// Razlog za to je što svaki objekt ima svoju kopiju
			//	varijable pdv.
			System.out.println("Stopa je: " + p1.vratiStopu());
			System.out.println(p1.racPdv(osnovica));
			System.out.println("Stopa je: " + p2.vratiStopu());
			System.out.println(p2.racPdv(osnovica));
		}
}
