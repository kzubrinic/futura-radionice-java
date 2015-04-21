/**
 * 
 */
package r05.iznimke;

/**
 * @author Krunoslav Žubriniæ
 * 21. tra 2015.
 */
import java.util.*;
public class NajvecaGreska
{
    public void ispisiNajgore (int i) { 
        int z[]={1,7,9};
        try {
            System.out.println("Treæi element je " + z[i]);
        }
        catch (Exception e) {
            // Nemam vremena pa æu obradu iznimki pa æu
            // programski kod napisati u iduæoj verziji.
            // Valjda se neæe dogoditi neka greška
        }
    }
    public void ispisiDobro (int i) { 
        int z[]={1,7,9};
        try {
            System.out.println("Treæi element je " + z[i]);
        }
        catch (Exception e) {
            System.out.println("Greška u metodi ispisiDobro "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ispisiBolje (int i) { 
        int z[]={1,7,9};
        System.out.println("Treæi element je " + z[i]);
    }
    
    public void ispisiIdealno (int i) { 
        int z[]={1,7,9};

        if (i>2){
        	System.out.println("Indeks mora biti u intervalu 0-2!");
        	return;
        }
        System.out.println("Treæi element je " + z[3]);
    }

	public static void main(String[] args) {
		NajvecaGreska n = new NajvecaGreska();
		System.out.println("============================");
		System.out.println("NIKAKVA informacija o grešci");
		System.out.println("============================");
		n.ispisiNajgore(3);
		System.out.println("==========================");
		System.out.println("DOBRA informacija o grešci");
		System.out.println("==========================");
		n.ispisiDobro(3);
		System.out.println("====================================");
		System.out.println("IDEALNO - sprijeèiti nastanak greške");
		System.out.println("====================================");
		n.ispisiIdealno(3);
		// prekida izvoðenje programa pa je poziv stavljen na kraj!
		// Inaèe po gradaciji kvalitete bi bio izmeðu nikakve i dobre.
		System.out.println("===============================");
		System.out.println("MALO bolja (od nikakve!) informacija o grešci");
		System.out.println("===============================");
		n.ispisiBolje(3);
	}

}
