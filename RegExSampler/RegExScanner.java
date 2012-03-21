import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExScanner {

    public static void main(String[] args) {
        if(args.length != 2) {
            System.err.println("USAGE: java RegExScanner <string> <regex>");
            return;
        }

        String target = args[0];
        String regex = args[1];

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(target);

        System.out.println("target=" + target);
        System.out.println("regex=" + regex);
        System.out.println("matches()=" + matcher.matches());
    }
}

