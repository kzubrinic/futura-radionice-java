/**
 * 
 */
package r07.klijentserver;

/**
 * @author Krunoslav �ubrini�
 * 19. svi 2015.
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;
 
public class Klijent {
    public static void main(String[] args) throws IOException {
         
        if (args.length != 2) {
            System.err.println(
                "Kori�tenje: java Klijent <host name> <port number>");
            System.exit(1);
        }
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);
        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        Scanner s = new Scanner(System.in);
        try {
            echoSocket = new Socket(hostName, portNumber);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            String userInput;
            while ((userInput = s.nextLine()) != null) {
                out.println("Klijent �alje upit: "+ userInput);
                System.out.println("Poslu�itelj vra�a: " + in.readLine());
            }
        } catch (UnknownHostException e) {
            System.err.println("Nepoznat poslu�itelj " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Gre�ka spajanja na poslu�itelj " + hostName);
            System.exit(1);
        }
        finally {
        if (echoSocket != null)
        	echoSocket.close();
    	if (in != null)
    		in.close();
    	if (out != null)
    		out.close();
    	if (s != null)
    		s.close();
        }
    }
}
