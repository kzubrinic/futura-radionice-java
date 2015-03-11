package r02;
/**
 * Izbjegnuta èesta greška kada se iz main metode (static) 
 * pokušavaju koristiti varijable i metode koje nisu static.
 * U main metodi se stvara objekt (vlastitog tipa) i na
 * tom objektu se pozivaju metode i koriste varijable.
 * @author Krunoslav Žubriniæ
 * 11. ožu 2015.
 */
public class IspravljenaGreskaStatic {
	private int x, y;
    public static void main(String[] args)
    {
        // Greška je ispravljena tako da je u static metodi kreiran objekt. varijable i metode
        // Varijablama i metodama se pristupa na tom objektu, tako
        // da se zna kojoj kopiji varijabli se pristupa.
        // Ovakav naèin rada je znatno bolji od prethodnog!
	 IspravljenaGreskaStatic a = new IspravljenaGreskaStatic();
         a.x = 3;
         a.y = 5;
         System.out.println(a.x + " + " + a.y + " = "+a.zbroj(a.x, a.y)); 
    }   
    public int zbroj(int a, int b)
    {
        return a + b;
    }
}
