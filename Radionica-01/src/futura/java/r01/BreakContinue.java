package futura.java.r01;
import java.util.*;
public class BreakContinue {
	public static void main(String[] args)
    {
		int broj = 0;
		Scanner sc = new Scanner(System.in);
    	
    	for (; ; ){
    		System.out.println("Unesite cijeli broj:");
    		broj = sc.nextInt();
    		// unesena nula ili negativan broj - izlazak iz petlje
    		if (broj <= 0)
    			break;
    		// brojeve veæe od 99 preskoèi
    		else if (broj > 99)
    			continue;
    		else
    			// inaèe, ispiši broj (svaki jedno i dvoznamenkasti broj)
    			System.out.println(broj);
    	}
    	sc.close();
   	}
}
