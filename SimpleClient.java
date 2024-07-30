import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Usage: java SimpleClient <hostname> <address>");
            return;
        }
        try {
            //GET the IP address and the port number and store them in variables
            InetAddress ia = InetAddress.getByName(args[0]);
            int portNumber = Integer.parseInt(args[1]);
            //Create a socket passing in the hostname and portNumber
            Socket socket = new Socket(ia, portNumber);
            //Use a reader to read from the writer in SimpleServer
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            //Create a string variable for the lines
            String line;
            //While line is not null, print to the output
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            
            //Close the socket
            socket.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
