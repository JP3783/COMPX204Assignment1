import java.io.IOException;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        //Get the port which it is listening to and display to output
        //Set to 0 so it can choose an available port all the time
        ServerSocket serverSocket = new ServerSocket(0);
        System.out.println("Listening on port " + serverSocket.getLocalPort());

        while (true) {
            Socket socket = serverSocket.accept();
            InetAddress clientAddress = socket.getInetAddress();
            System.out.println("Client connected from " + clientAddress.getHostAddress() + ":" + socket.getPort());

            //Get client hostname from IP address
            String clientHostname = clientAddress.getHostName();
            //Greet the client
            System.out.println("Hello, " + clientHostname + ".");
            System.out.println("Your IP address is " + clientAddress.getHostAddress());
            
            //Close the connection
            serverSocket.close();
        }
    }

    /**
     * Binds the ServerSocket to a specific address
     * @param endpoint the IP address and port number to bind to
     */
    public void bind(SocketAddress endpoint){
        
    }
}
