
public class Gomila {
	public static void main(String[] args) {
		Prijatelj desniSusjed = new Prijatelj();
		desniSusjed.ime = "Maro";
		desniSusjed.starost = 24;
		
		Prijatelj lijeviSusjed = new Prijatelj();
		lijeviSusjed.ime = "Baro";
		lijeviSusjed.starost = 15;
		
		Prijatelj kolegicaIzSkole = new Prijatelj();
		kolegicaIzSkole.ime = "Mare";
		kolegicaIzSkole.starost = 20;
		kolegicaIzSkole.rodjendan();
		
		Prijatelj prijateljicaIzVrtica = new Prijatelj();
		prijateljicaIzVrtica.ime = "Kate";
		prijateljicaIzVrtica.starost = 19; 
		
		System.out.println("Dobar dan, ja sam " + desniSusjed.ime + " i imam " + desniSusjed.starost + " godina.");
		System.out.println("Dobar dan, ja sam " + lijeviSusjed.ime + " i imam " + lijeviSusjed.starost + " godina.");
		System.out.println("Dobar dan, ja sam " + kolegicaIzSkole.ime + " i imam " + kolegicaIzSkole.starost + " godina.");
		System.out.println("Dobar dan, ja sam " + prijateljicaIzVrtica.ime + " i imam " + prijateljicaIzVrtica.starost + " godina.");
	}
}
