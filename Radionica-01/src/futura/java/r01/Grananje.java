package futura.java.r01;
import java.util.*;
public class Grananje {
	public static void main(String[] args)
    {
		System.out.println("Unesite starost osobe:");
		Scanner sc = new Scanner(System.in);
    	int starost = sc.nextInt();
        if (starost < 13)
            System.out.println("Dijete");
        else if ((starost > 12) && (starost < 20))
            System.out.println("Tinejdžer");
        else if ((starost > 19) && (starost < 41))
            System.out.println("Mlada osoba");
        else if ((starost > 40) && (starost < 61))
            System.out.println("Srednje stara osoba");
        else
            System.out.println("Stara osoba");
        sc.close();
    }
}
