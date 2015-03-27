package r02;
import java.util.Scanner;
/**
 * Primjer korištenja metode za generiranje sluèajnih brojeva i još nekih
 * metoda razreda Math
 * @author Krunoslav Žubriniæ
 * 11. ožu 2015.
 */

public class Standardne
{
	/*
	 * Primjer generiranja sluèajnih brojeva.
	 * Metoda Math.random() generira broj u intervalu 0<=broj<1
	 * Želimo li dobiti sluèajni cijeli broj u intervalu od 0 do 15
	 * trebamo dobiveni rezultat pomnožiti s 16.
	 * Želimo li krenuti od nekog drugog broja veæeg od nule,
	 * trebamo dobiveni rezultat uveæati za taj broj, i za toliko 
	 * smanjiti krajnji broj. primjerice želimo li brojeve u intervalu
	 * od 50 do 75, trebamo izgenerirati sluèajni broj u intervalu od 
	 * 0 do 25 i tom rezultatu dodati 50. Dobiva se broj u intervalu
	 * od 0+50 do 25+50 odnosno 50-75.
	 * Metoda Math.random() vraæa podatak tipa duoble, pa rezultat
	 * nakon množenja treba pretvoriti u cijeli broj.
	 */
    public void desetSlucajnih(int pocetak, int kraj, int broj)
    {
    	System.out.println("Brojevi u intervalu od "+ pocetak + " do " + (kraj-1));
        for (int i = 0; i < broj; i++)
        	System.out.println(pocetak + (int)(Math.random() * (kraj-pocetak)));
    }
    // Primjer još nekih static metoda razreda Math
    public void josNekeMath()
    {
        double x = 10, y = 7.671, neg = -12; 
        System.out.println();
        System.out.println("Modulo broja "+ neg + " je " + Math.abs(neg));
        System.out.println("Od dva broja "+ x + " i " + y + ", veæi je " + Math.max(x,y));        
        System.out.println(x + " na treæu je " + Math.pow(x, 3));
        System.out.println(y + " zaokružen iznosi " + Math.round(y));        
        System.out.println("Kvadratni korijen broja "+ x + " je " + Math.sqrt(x));
    }
       
    public static void main(String[] args){
    	Standardne st = new Standardne();
    	Scanner s = new Scanner(System.in);
    	System.out.print("Unesite poèetak niza za generiranje sluèajnih brojeva:");
    	int poc = s.nextInt();
    	System.out.print("Unesite kraj niza za generiranje sluèajnih brojeva:");
    	int kraj = s.nextInt();
    	System.out.print("Unesite koliko sluèajnih brojeva želite:");
    	int broj = s.nextInt();
    	st.desetSlucajnih(poc, kraj, broj);
    	s.close();
    	
    	st.josNekeMath();
    }
    
}
