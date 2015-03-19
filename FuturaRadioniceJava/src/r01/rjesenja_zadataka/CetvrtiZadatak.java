package r01.rjesenja_zadataka;
import java.util.*;
public class CetvrtiZadatak {
	public static void main(String[] args) 
    {
        int n, suma = 0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cijeli broj u intervalu 10-1000:");
    	n = sc.nextInt();
    	if ((n >= 10) && (n <= 1000))
    	{
	        for (int i=0;i<=n;i++) {
             if (i % 2 == 0) 
                suma = suma + i;
	        }
	        System.out.println("Zbroj parnih brojeva od 1 do " + n + " je " + suma);
    	}
    	else
    	{
    		System.out.println("Uneseni broj nije u zadanom intervalu!");
    	}
        sc.close();
    }
}
