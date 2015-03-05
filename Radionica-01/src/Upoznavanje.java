public class Upoznavanje {
	public static void main(String[] args) {
		Prijatelj susjed;
		susjed = new Prijatelj();
		// objekt možemo stvoriti i kraæe u 1 retku
		// Prijatelj susjed = new Prijatelj();
		susjed.ime = "Ivo";
		susjed.starost = 37;
		System.out.println("Dobar dan, ja sam " + susjed.ime);
		susjed.rodjendan();
		System.out.println("Danas mi je roðendan i imam " + susjed.starost+" godina.");
	}
}
