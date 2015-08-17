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
public class Pitija implements Runnable{
	Map<String,String> mapa = new HashMap<String,String>();
	private static int portNumber = 999;

	private Socket clientSocket;

	Pitija(Socket cs) {
		clientSocket = cs;
	}
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket cl = null;
		try {
			serverSocket = new ServerSocket(portNumber);
			while (true) {
				cl = serverSocket.accept();
				// Server koji komunicira s toèno odreðenim klijentom u jednoj dretvi
				Pitija v = new Pitija(cl);
				v.napuniMapu();
				Thread t = new Thread(v);
				t.start();
			}
		} catch (IOException e) {
			System.out.println("Greška kod slušanja na portu 999" );
			e.printStackTrace();
		}
		finally{
			if (serverSocket != null)
				try {
					serverSocket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (cl != null)
				try {
					cl.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	
	public void run() {
		obrada();

	}
	public synchronized void obrada() {
		int[] niz = {12, 7, 1, 3, 5, 4, 0, 9, 7, 8}; 
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			// objekt za slanje poruka klijentima
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			// objekt za primanje poruka od klijenata
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String inputLine, poruka=null;
			// prima poruke klijenta
			while ((inputLine = in.readLine()) != null) {
				if (mapa.containsKey(inputLine))
					poruka = mapa.get(inputLine);
				else {
					Iterator it = mapa.values().iterator();
					int br = (int)(Math.random()*(mapa.values().size()));
					int i = 0;
					for (i=0;it.hasNext();i++){
						if (i == br){
							poruka = (String) it.next();
							break;
						}
						else
							it.next();
					}
				}
				// prosljeðuje primljenu poruku klijentu
				out.println(poruka);
			}
		} catch (IOException e) {
			System.out.println("Greška kod slušanja na portu 999");
			System.out.println(e.getMessage());
		}
		finally{
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
