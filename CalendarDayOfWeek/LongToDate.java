import java.util.Calendar;

public class LongToDate {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Include Unix times in command line.");
            return;
        }

        Calendar cal = Calendar.getInstance();
        for(String s : args) {
            Long time = Long.parseLong(s);
            cal.setTimeInMillis(time);
            System.out.println("Date: " + cal.toString());
        }

    }
}
