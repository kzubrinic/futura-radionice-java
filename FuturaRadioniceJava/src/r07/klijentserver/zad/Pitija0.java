/**
 * 
 */
package r07.klijentserver.zad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Krunoslav Žubriniæ
 * 21. svi 2015.
 */
public class Pitija0 {
	Map<String,String> mapa = new HashMap<String,String>();
	private static int portNumber = 999;

public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = null;
    Socket clientSocket = null;
    PrintWriter out = null;
    BufferedReader in = null;
    Pitija0 p = new Pitija0();
    p.napuniMapu();
    try {
    	// postavlja port na kojem poslužitelj sluša
    	serverSocket = new ServerSocket(portNumber);
    	// prihvaæa veze klijenata
        clientSocket = serverSocket.accept();
        // objekt za slanje poruka klijentima
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        // objekt za primanje poruka od klijenata
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine, poruka = null;
        // primap oruke klijenta
        while ((inputLine = in.readLine()) != null) {
        	// Ako pitanje postoji u mapi, èitaj odgovor
        	if (p.mapa.containsKey(inputLine))
				poruka = p.mapa.get(inputLine);
			else {
				// Ako pitanje ne postoji u mapui, izaberi sluèajni odgovor iz mape
				Iterator it = p.mapa.values().iterator();
				int br = (int)(Math.random()*(p.mapa.values().size()));
				int i = 0;
				for (i=0;it.hasNext();i++){
					if (i == br){
						poruka = (String) it.next();
						break;
					}
					else
						it.next();
				}
        	// prosljeðuje primljenu poruku svim klijentima
            out.println(inputLine);
			}
        }
    } catch (IOException e) {
        System.out.println("Greška kod slušanja na portu " + portNumber );
        System.out.println(e.getMessage());
    }
    finally{
    	if (serverSocket != null)
    		serverSocket.close();
    	if (clientSocket != null)
    		clientSocket.close();
    	if (in != null)
    		in.close();
    	if (out != null)
    		out.close();
    }
}
	private void napuniMapu(){
		mapa.put("Koji je danas dan?", "Danas");
		mapa.put("Kakvo je vrijeme?", "Nije loše");
		mapa.put("Koliko je sati?", "Pravo vrijeme");
		mapa.put("Kako se zoveš?", "Zovem se");
		mapa.put("Gdje si?", "Ovdje");
		mapa.put("Kuda ideš?", "Tamo");
		mapa.put("Kako æu proæi?", "Proæi æeš");
	}

}

