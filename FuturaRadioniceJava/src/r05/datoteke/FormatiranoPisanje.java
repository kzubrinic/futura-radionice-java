/**
 * 
 */
package r05.datoteke;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Krunoslav Žubriniæ
 * 21. tra 2015.
 */
public class FormatiranoPisanje {

	public void unosPodataka() {
        Scanner s = new Scanner(System.in);
        PrintWriter datoteka=null;
        String dat=null;
        try {
            // unos podataka
            System.out.print("Unesi naziv datoteke: ");
            dat = s.nextLine();
            // drugi parametar konstruktora FileWriter tru znaèi da se podaci dodaju
            //  u datoteku (slièno kao append u C-u)
            // Inaèe je "normalno" ponašanje da se stara datioteka gazi novom!
            datoteka = new PrintWriter(new FileWriter(dat,true));
            datoteka.println("Ovo ide u prvi red");
            datoteka.println("Ovo ide u drugi red "+175);
            datoteka.println("Primjeri naših èestih æukastih žalosnih ðonovskih slova");
            datoteka.print("Ovo ide u posljednji red "+3.76);
            datoteka.close();
            prikazi(dat);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Greška rada s datotekom");
            e.printStackTrace();
        }

        
    }
    private void prikazi(String ime) throws IOException{
        BufferedReader dat = null;
        String c = "";
        dat = new BufferedReader(new FileReader(ime));
        while ((c = dat.readLine()) != null) {
            System.out.println(c);
        }
        dat.close();
    }

	public static void main(String[] args) {
		FormatiranoPisanje fp = new FormatiranoPisanje();
		fp.unosPodataka();

	}

}
