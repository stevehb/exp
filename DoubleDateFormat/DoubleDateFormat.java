import java.text.ParseException;
import java.text.SimpleDateFormat;

class DoubleDateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat formatterParse = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(formatterParse.parse("2010-11-26"));
        System.out.println(s);
    }
}
