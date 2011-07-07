import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DateParser {
    static final String format = "MM/yyyy";
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);        
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER DATE STRING (" + format + "): ");
        String dateString = in.nextLine();
        while ((dateString != null) && (dateString.length() > 0)) {
            try {
                Date date = sdf.parse(dateString);
                System.out.println("Original string: " + dateString);
                System.out.println("Parsed date    : " + date.toString());
                System.out.println();
            } catch(ParseException e) {
                System.out.println("ERROR: could not parse date in string: '" +
                                   dateString + "'");
                System.out.println("\texception: " + e.getMessage());
            }
            System.out.print("ENTER DATE STRING: ");
            dateString = in.nextLine();
        }
    }
}
