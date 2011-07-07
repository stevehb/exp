import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class GetTimeFromLong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Date Long: ");
        long dateLong = in.nextLong();
        Date date = new Date(dateLong);
        System.out.println("Original value: " + dateLong);
        System.out.println("Parsed date   : " + date.toString());
        System.out.println();
    }
}
