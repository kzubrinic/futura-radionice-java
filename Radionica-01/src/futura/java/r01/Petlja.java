package futura.java.r01;
import java.util.*;
public class Petlja {
	public static void main(String[] args)
    {
		System.out.println("Unesite cijeli broj:");
		Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	for (int i=0; i<n; i++){
    	    if (i % 2 == 0)
    	        System.out.println(i + " je paran broj.");
    	    else 
    	        System.out.println(i + " je neparan broj.");
    	}
    	sc.close();
   	}
}