package r02;
import java.util.Scanner;
/**
 * Primjer kori�tenja metode za generiranje slu�ajnih brojeva i jo� nekih
 * metoda razreda Math
 * @author Krunoslav �ubrini�
 * 11. o�u 2015.
 */

public class Standardne
{
	/*
	 * Primjer generiranja slu�ajnih brojeva.
	 * Metoda Math.random() generira broj u intervalu 0<=broj<1
	 * �elimo li dobiti slu�ajni cijeli broj u intervalu od 0 do 15
	 * trebamo dobiveni rezultat pomno�iti s 16.
	 * �elimo li krenuti od nekog drugog broja ve�eg od nule,
	 * trebamo dobiveni rezultat uve�ati za taj broj, i za toliko 
	 * smanjiti krajnji broj. primjerice �elimo li brojeve u intervalu
	 * od 50 do 75, trebamo izgenerirati slu�ajni broj u intervalu od 
	 * 0 do 25 i tom rezultatu dodati 50. Dobiva se broj u intervalu
	 * od 0+50 do 25+50 odnosno 50-75.
	 * Metoda Math.random() vra�a podatak tipa duoble, pa rezultat
	 * nakon mno�enja treba pretvoriti u cijeli broj.
	 */
    public void desetSlucajnih(int pocetak, int kraj, int broj)
    {
    	System.out.println("Brojevi u intervalu od "+ pocetak + " do " + (kraj-1));
        for (int i = 0; i < broj; i++)
        	System.out.println(pocetak + (int)(Math.random() * (kraj-pocetak)));
    }
    // Primjer jo� nekih static metoda razreda Math
    public void josNekeMath()
    {
        double x = 10, y = 7.671, neg = -12; 
        System.out.println();
        System.out.println("Modulo broja "+ neg + " je " + Math.abs(neg));
        System.out.println("Od dva broja "+ x + " i " + y + ", ve�i je " + Math.max(x,y));        
        System.out.println(x + " na tre�u je " + Math.pow(x, 3));
        System.out.println(y + " zaokru�en iznosi " + Math.round(y));        
        System.out.println("Kvadratni korijen broja "+ x + " je " + Math.sqrt(x));
    }
       
    public static void main(String[] args){
    	Standardne st = new Standardne();
    	Scanner s = new Scanner(System.in);
    	System.out.print("Unesite po�etak niza za generiranje slu�ajnih brojeva:");
    	int poc = s.nextInt();
    	System.out.print("Unesite kraj niza za generiranje slu�ajnih brojeva:");
    	int kraj = s.nextInt();
    	System.out.print("Unesite koliko slu�ajnih brojeva �elite:");
    	int broj = s.nextInt();
    	st.desetSlucajnih(poc, kraj, broj);
    	s.close();
    	
    	st.josNekeMath();
    }
    
}
