package futura.java.r01;
import java.util.*;
public class Dijeljenje {
	public static void main(String[] args) {
		int a, b;
		float c;
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite prvi broj:");
		a = s.nextInt();
		System.out.println("Unesite drugi broj:");
		b = s.nextInt();
		c = (float)a/b;
		System.out.printf("%d dijeljeno s %d je %.2f\n", a, b, c);
		s.close();
	}
}
