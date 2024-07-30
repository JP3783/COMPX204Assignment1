import java.io.PrintWriter;
import java.net.*;

public class SimpleServer {
    /**
     * This is the main method of the program.
     * @param args these are the arguments passed in from the command line
     */
    public static void main(String[] args){
        try {
            //Get the port which it is listening to and display to output
            //Set to 0 so it can choose an available port all the time
            ServerSocket serverSocket = new ServerSocket(0);
            System.out.println("Listening on port " + serverSocket.getLocalPort());

            while(true){
                //Accepts a new connection
                Socket s = serverSocket.accept();

                //Create stream writer and reader to send/receive over the network
                PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
                InetAddress ia = s.getInetAddress();

                //Create string variables to store the hostname and hostaddress
                String hostname = ia.getHostName();
                String IPaddress = ia.getHostAddress();

                //Write the output lines
                writer.println("Hello, " + hostname + ".");
                writer.println("Your IP address is " + IPaddress);

                //Close the serverSocket
                serverSocket.close();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
