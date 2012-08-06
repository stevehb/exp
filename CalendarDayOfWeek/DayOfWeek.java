import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeek {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("Before:\n" +
                           "\tday=" + cal.get(Calendar.DAY_OF_MONTH) + "\n" +
                           "\tmonth=" + cal.get(Calendar.MONTH) + "\n" +
                           "\tyear=" + cal.get(Calendar.YEAR));

        cal.add(Calendar.DAY_OF_WEEK, Calendar.MONDAY - cal.get(Calendar.DAY_OF_WEEK));

        System.out.println("After:\n" +
                           "\tday=" + cal.get(Calendar.DAY_OF_MONTH) + "\n" +
                           "\tmonth=" + cal.get(Calendar.MONTH) + "\n" +
                           "\tyear=" + cal.get(Calendar.YEAR));

        //System.out.println("Calendar.SUNDAY=" + Calendar.SUNDAY);
        //System.out.println("Calendar.MONDAY=" + Calendar.MONDAY);
        //System.out.println("day of week: " + cal.get(Calendar.DAY_OF_WEEK));
        //System.out.println("first day of week: " + cal.getFirstDayOfWeek());
    }
}
