public class Upoznavanje {
	public static void main(String[] args) {
		Prijatelj susjed;
		susjed = new Prijatelj();
		// objekt mo�emo stvoriti i kra�e u 1 retku
		// Prijatelj susjed = new Prijatelj();
		susjed.ime = "Ivo";
		susjed.starost = 37;
		System.out.println("Dobar dan, ja sam " + susjed.ime);
		susjed.rodjendan();
		System.out.println("Danas mi je ro�endan i imam " + susjed.starost+" godina.");
	}
}
