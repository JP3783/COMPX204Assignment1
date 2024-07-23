import java.io.IOException;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        //Get the port which it is listening to and display to output
        ServerSocket serverSocket = new ServerSocket();
        System.out.println("Listening on port " + serverSocket.getLocalPort());

        
        //Close the connection
        serverSocket.close();
    }

    /**
     * Binds the ServerSocket to a specific address
     * @param endpoint the IP address and port number to bind to
     */
    public void bind(SocketAddress endpoint){

    }
}
