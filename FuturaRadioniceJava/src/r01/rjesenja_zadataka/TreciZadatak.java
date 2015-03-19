package r01.rjesenja_zadataka;

import java.util.Scanner;

public class TreciZadatak {
	public static void main(String[] args) 
    {
        int osnovica, stopa;
        float porez;
		Scanner sc = new Scanner(System.in);
        System.out.println("Unesite osnovicu poreza:");
    	osnovica = sc.nextInt();
    	System.out.println("Unesite stopu poreza:");
    	stopa = sc.nextInt();
        porez= (float)osnovica * stopa / 100;
        System.out.printf ("Osnovica je %.2f, stopa je %.2f, a porez je %.2f\n", (float)osnovica, (float)stopa, porez);
        sc.close();
    }
}
