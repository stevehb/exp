public class JavaShortCast {
    public static void main(String[] args) {
        int realVal = 0;
        short shortVal = 0;
        for(int i = 32765; i <= 32770; i++) {
            realVal = i;
            shortVal = (short)realVal;
            System.out.println("realVal=" + realVal + "\tshortVal=" + shortVal);
        }
        for(int i = 65534; i <= 65538; i++) {
            realVal = i;
            shortVal = (short)realVal;
            System.out.println("realVal=" + realVal + "\tshortVal=" + shortVal);
        }
    }
}
