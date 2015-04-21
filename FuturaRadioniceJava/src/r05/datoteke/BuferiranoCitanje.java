package r05.datoteke;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Krunoslav Žubriniæ
 * 21. tra 2015.
 */
public class BuferiranoCitanje {
	BufferedReader dat;
    public void citajRetke() throws IOException {
        String c = "";
        String ime = "README.TXT";
            dat = new BufferedReader(new FileReader(ime));
            System.out.println("============================");
            System.out.println("SADRŽAJ DATOTEKE README.TXT");
            System.out.println("============================");

            while ((c = dat.readLine()) != null) {
                // readLine() skida znak za novi red pa je potrebno dodati za prikaz na ekranu
                System.out.println(c);
            }
            dat.close();
 
    }

    public void citajTokene() throws IOException {
        Scanner s = null;
        String c = "";
        String ime = "README.TXT";
            s = new Scanner(new BufferedReader(new FileReader(ime))); 
            // Rijeèi se rastavljaju na malom slovu o
            s.useDelimiter("o");
            System.out.println("================================================");
            System.out.println("SADRŽAJ DATOTEKE README.TXT RASTAVLJAN NA TOKENE");
            System.out.println("================================================");
            while ((s.hasNext())) {
                // metoda hasNext() provjerava da li postoji slijedeæi token
                // metoda next() pristupa nizu znakova
                System.out.println(s.next());
            }
    }
    
	public static void main(String[] args) {
		BuferiranoCitanje bc = new BuferiranoCitanje();
		try {
			bc.citajRetke();
			bc.citajTokene();
		} catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
		finally {
			try{
                if (bc.dat != null)
                    bc.dat.close();
            }
            catch (IOException e) {
                System.out.println("Greška pri zatvaranju datoteke! " + e.getMessage());
                e.printStackTrace();
            }
        }
	}

}
