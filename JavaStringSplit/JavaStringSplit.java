
public class JavaStringSplit {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("USAGE: java JavaStringSplit <string1> [ <string2> ... <stringN> ]");
        }
        
        for(int i = 0; i < args.length; i++) {
            String[] strArr = args[i].split(",");
            System.out.println("String[" + i + "] = '" + args[i] + "'");
            for(int j = 0; j < strArr.length; j++) {
                System.out.println("\t" + j + ": " + strArr[j]);
            }
        }
    }
}
