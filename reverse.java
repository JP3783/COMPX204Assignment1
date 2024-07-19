import java.net.InetAddress;

public class reverse{
    public static void main(String[] args){
        try{
            if(args.length == 0){
                System.out.println("Usage: resolve <name1> <name2> ... <nameN>");
                return;
            }
    
            for (String name : args){
                try {
                    //Get the address for the arguments using the InetAddress class
                    InetAddress address = InetAddress.getByName(name);

                    //At the moment, the "address" return in the format "www.google.com/172.217.24.36"
                    //So replace the "/" with a " : " and print it to the output
                    String addressString = address.toString();
                    addressString = addressString.replaceAll("[/*]", " : ");
                    System.out.println(addressString);

                } catch (Exception e) {
                    //If IPv4 address is NOT found
                    System.out.println(name + " : unknown host");
                }
            }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}