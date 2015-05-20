/**
 * 
 */
package r07.klijentserver;

/**
 * @author Krunoslav Žubriniæ
 * 19. svi 2015.
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;
 
public class Klijent {
    public static void main(String[] args) throws IOException {
         
        if (args.length != 2) {
            System.err.println(
                "Korištenje: java Klijent <host name> <port number>");
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
                out.println("Klijent šalje upit: "+ userInput);
                System.out.println("Poslužitelj vraæa: " + in.readLine());
            }
        } catch (UnknownHostException e) {
            System.err.println("Nepoznat poslužitelj " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Greška spajanja na poslužitelj " + hostName);
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
