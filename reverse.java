import java.net.InetAddress;

public class reverse{
    public static void main(String[] args){
        try{
            if(args.length == 0){
                System.out.println("Usage: resolve <address1> <address2> ... <addressN>");
                return;
            }
            //Loop through arguments in the command line
            for (String address : args){
                try {
                    //Get the address for the arguments using the InetAddress class
                    InetAddress inetAddress = InetAddress.getByName(address);
                    //Performs a reverse DNS lookup to get the name for the given IP address
                    //Gets the fully qualified domain name for this IP address.
                    String name = inetAddress.getCanonicalHostName();
                    //Specify IP address without a name
                    //If an address does not match a name
                    if(name.compareTo(address) == 0){
                        //Display "no name"
                        System.out.println(address + " : no name");
                    } else{
                        //Display its name
                        System.out.println(address + " : " + name);
                    }
                } catch (Exception e) {
                    //If IPv4 address is NOT found
                    System.out.println(address + " : no name");
                }
            }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
