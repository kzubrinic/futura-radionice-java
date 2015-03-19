package r01.rjesenja_zadataka;
import java.util.*;
public class PetiZadatak {
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite cijeli broj u intervalu 5-15:");
		n = sc.nextInt();
		if ((n >= 5) && (n <= 15))
		{
			for (int i=1;i<=n;i=i+2) {
				for (int j=1;j<=n;j=j+2) {
					System.out.printf("%3d ", i*j); 
				}
				System.out.print ("\n") ;
			}
		}
		else
		{
			System.out.println("Uneseni broj nije u zadanom intervalu!");
		}
		sc.close();
	}
}
