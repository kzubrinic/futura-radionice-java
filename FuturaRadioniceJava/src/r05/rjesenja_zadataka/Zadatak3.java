package r05.rjesenja_zadataka;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * @author Krunoslav �ubrini�
 * 21. tra 2015.
 */
public class Zadatak3 {
	private BufferedReader in;
	private PrintWriter pw;

	public void obrada() throws IOException {
		String stranica = "http://www.zaba.hr/home/ZabaUtilsWeb/utils/tecaj/prn/danas";
		String nazivDat = "srednji.txt";
		Scanner s1 = new Scanner(System.in);
		System.out.print("Unesite oznaku valute: ");
		String v = s1.nextLine();

		// Podaci potrebni za povezivanje s URL adresom
		URL o = new URL(stranica);
		// Povezujemo se sa stranicom
		URLConnection yc = o.openConnection();
		// Stvara se bufferirani tok podataka s web adrese na koju smo spojeni
		in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
		// objekt za spremanje teksta na disk
		pw = new PrintWriter(new FileWriter(nazivDat));
		String inputLine, oznaka="";
		float sr=0f;
		while ((inputLine = in.readLine()) != null){ 
			// �ita redak po redak
			Scanner s2 = new Scanner(inputLine);
			
			while (s2.hasNext()) {
				// prvi token je �ifra - ona nas ne zanima pa ju preska�emo
				preskoci(s2);
				// sljede�i je oznaka - ona nas zanima pa ju �itamo u varijablu
				if (s2.hasNext())
					oznaka = s2.next();
				// tre�i je jedinica - preska�emo, isto kao i �etvrti i peti
				for (int i = 0; i<3; i++)
					preskoci(s2);
				// �esti je srednji te�aj i njega �itamo
				// Moramo pretvarati posredno: String->Float->float jer je u
				// datoteci decimalna to�ka, alokalne postavke su kod nas hrvatske (zarez)
				if (s2.hasNext())
					sr = Float.parseFloat(s2.next().toString());
				// sedmi i osmi preska�emo
				for (int i = 0; i < 2; i++)
					preskoci(s2);
			}
			s2.close();
			if (oznaka.equals(v)){
				// ispi�i na ekran
				String st = String.format("%s:%.6f", oznaka,sr);
				System.out.println("Prona�eno: " + st);
				// i zapi�i u datoteku
				pw.println(st);
				break;
			}
		}
		s1.close();


	}
	private void preskoci(Scanner s){
		if (s.hasNext())
			s.next();
	}
	public static void main(String[] args){
		Zadatak3 z = new Zadatak3();
		try {
			z.obrada();
		} catch(IOException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			try {
				if (z.in != null)
					z.in.close();
				if (z.pw != null)
					z.pw.close();
			} catch (IOException e1){
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			}
		}
	}
}
