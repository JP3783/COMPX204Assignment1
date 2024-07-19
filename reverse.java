import java.net.InetAddress;

public class reverse{
    public static void main(String[] args){
        try{
            if(args.length == 0){
                System.out.println("Usage: resolve <name1> <name2> ... <nameN>");
                return;
            }
    
            for (String address : args){
                try {
                    //Get the name for the addresses using the InetAddress class
                    
                    
                    // InetAddress address = InetAddress.getByName(name);

                    // String addressString = address.toString();
                    // addressString = addressString.replaceAll("[/*]", " : ");
                    // System.out.println(addressString);

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