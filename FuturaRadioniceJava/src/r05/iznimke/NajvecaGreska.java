/**
 * 
 */
package r05.iznimke;

/**
 * @author Krunoslav �ubrini�
 * 21. tra 2015.
 */
import java.util.*;
public class NajvecaGreska
{
    public void ispisiNajgore (int i) { 
        int z[]={1,7,9};
        try {
            System.out.println("Tre�i element je " + z[i]);
        }
        catch (Exception e) {
            // Nemam vremena pa �u obradu iznimki pa �u
            // programski kod napisati u idu�oj verziji.
            // Valjda se ne�e dogoditi neka gre�ka
        }
    }
    public void ispisiDobro (int i) { 
        int z[]={1,7,9};
        try {
            System.out.println("Tre�i element je " + z[i]);
        }
        catch (Exception e) {
            System.out.println("Gre�ka u metodi ispisiDobro "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ispisiBolje (int i) { 
        int z[]={1,7,9};
        System.out.println("Tre�i element je " + z[i]);
    }
    
    public void ispisiIdealno (int i) { 
        int z[]={1,7,9};

        if (i>2){
        	System.out.println("Indeks mora biti u intervalu 0-2!");
        	return;
        }
        System.out.println("Tre�i element je " + z[3]);
    }

	public static void main(String[] args) {
		NajvecaGreska n = new NajvecaGreska();
		System.out.println("============================");
		System.out.println("NIKAKVA informacija o gre�ci");
		System.out.println("============================");
		n.ispisiNajgore(3);
		System.out.println("==========================");
		System.out.println("DOBRA informacija o gre�ci");
		System.out.println("==========================");
		n.ispisiDobro(3);
		System.out.println("====================================");
		System.out.println("IDEALNO - sprije�iti nastanak gre�ke");
		System.out.println("====================================");
		n.ispisiIdealno(3);
		// prekida izvo�enje programa pa je poziv stavljen na kraj!
		// Ina�e po gradaciji kvalitete bi bio izme�u nikakve i dobre.
		System.out.println("===============================");
		System.out.println("MALO bolja (od nikakve!) informacija o gre�ci");
		System.out.println("===============================");
		n.ispisiBolje(3);
	}

}
