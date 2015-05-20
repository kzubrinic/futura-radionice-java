package r07.klijentserver;

/**
 * @author Krunoslav Žubriniæ
 * 19. svi 2015.
 */
import java.net.*;
import java.util.ArrayList;
import java.io.*;

// Poslužitelj koji sluša više klijenata i odgovara na njihove upite
public class VisestrukiServer implements Runnable{
	private static int portNumber;

	private Socket clientSocket;

	VisestrukiServer(Socket cs) {
		clientSocket = cs;
	}
	public static void main(String[] args) throws IOException {

		if (args.length != 1) {
			System.err.println("Korištenje: java Server <port number>");
			System.exit(1);
		}
		portNumber = Integer.parseInt(args[0]);
		ServerSocket serverSocket = null;
		Socket cl = null;
		try {
			serverSocket = new ServerSocket(portNumber);
			while (true) {
				cl = serverSocket.accept();
				// Server koji komunicira s toèno odreðenim klijentom u jednoj dretvi
				VisestrukiServer v = new VisestrukiServer(cl);
				Thread t = new Thread(v);
				t.start();
			}
		} catch (IOException e) {
			System.out.println("Greška kod slušanja na portu " + portNumber );
			System.out.println(e.getMessage());
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
			String inputLine, poruka;
			// primap oruke klijenta
			while ((inputLine = in.readLine()) != null) {
				String[] razbijeno = inputLine.split(":");
				int indeks = Integer.parseInt(razbijeno[1].trim().substring(0, 1));
				if ((indeks > 9) || (indeks < 0))
					poruka = "Indeks mora biti u intervalu 0-9!";
				else
					poruka = "Na "+ indeks + ". poziciji se nalazi broj " + niz[indeks];
				// prosljeðuje primljenu poruku klijentu
				out.println(poruka);
			}
		} catch (IOException e) {
			System.out.println("Greška kod slušanja na portu " + portNumber );
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
}
