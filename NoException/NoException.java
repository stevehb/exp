public class NoException {
    public static void main(String[] args) {
        try {
            String nStr = null;
            System.out.println("using null string: " + nStr);
            int len = nStr.length();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
