package r07.klijentserver;

/**
 * @author Krunoslav �ubrini�
 * 19. svi 2015.
 */
import java.net.*;
import java.io.*;
 
public class Server {
    public static void main(String[] args) throws IOException {
         
        if (args.length != 1) {
            System.err.println("Kori�tenje: java Server <port number>");
            System.exit(1);
        }
         
        int portNumber = Integer.parseInt(args[0]);
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {
        	// postavlja port na kojem poslu�itelj slu�a
        	serverSocket = new ServerSocket(Integer.parseInt(args[0]));
        	// prihva�a veze klijenata
            clientSocket = serverSocket.accept();
            // objekt za slanje poruka klijentima
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            // objekt za primanje poruka od klijenata
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String inputLine;
            // primap oruke klijenta
            while ((inputLine = in.readLine()) != null) {
            	// proslje�uje primljenu poruku svim klijentima
                out.println(inputLine);
            }
        } catch (IOException e) {
            System.out.println("Gre�ka kod slu�anja na portu " + portNumber );
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
}
