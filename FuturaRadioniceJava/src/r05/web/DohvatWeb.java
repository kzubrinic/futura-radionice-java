package r05.web;

/**
 * @author Krunoslav Žubriniæ
 * Prilagoðen primjer sa službenog Java tutoriala dostupnog na
 * https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
 * 21. tra 2015.
 */
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DohvatWeb {
	public static void main(String[] args) throws Exception {
		String stranica = "http://web.textfiles.com/computers/3dbasics.txt";
		String nazivDat = stranica.substring(stranica.lastIndexOf('/')+1);
		BufferedReader in = null;
		PrintWriter pw = null;
		// Podaci potrebni za povezivanje s URL adresom
		try{
			URL oracle = new URL(stranica);
			// Povezujemo se sa stranicom
			URLConnection yc = oracle.openConnection();
			// Stvara se bufferirani tok podataka s web adrese na koju smo spojeni
			in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			// objekt za spremanje teksta na disk
			pw = new PrintWriter(new FileWriter(nazivDat));
			String inputLine;
			while ((inputLine = in.readLine()) != null){ 
				// ispiši na ekran
				System.out.println(inputLine);
				// i zapiši u datoteku
				pw.println(inputLine);
			}
		} catch(IOException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			try {
				if (in != null)
					in.close();
				if (pw != null)
					pw.close();
			} catch (IOException e1){
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			}
		}
	}
}
