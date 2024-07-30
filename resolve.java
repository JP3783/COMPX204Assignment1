import java.net.InetAddress;

public class resolve{
    public static void main(String[] args){
        try{
            if(args.length == 0){
                System.out.println("Usage: resolve <name1> <name2> ... <nameN>");
                return;
            }
            //Loop through arguments in the command line
            for (String name : args){
                try {
                    //Get the address for the arguments using the InetAddress class
                    InetAddress address = InetAddress.getByName(name);
                    //Get the hostaddress and store it in a string variable
                    String addressString = address.getHostAddress();
                    System.out.println(name + " : " + addressString);
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
