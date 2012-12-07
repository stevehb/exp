public class Main {
    static long rand;

    public static void main(String[] args) throws Exception {
        doReflectionOptimized();
        doReflection();
        doRegular();
    }

    public void doSomething(long l) {
        rand = l;
    }

    public static void doRegular() throws Exception {
        long start = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            Main m = new Main();
            m.doSomething(start);
        }
        System.out.println("Regular: " + (System.currentTimeMillis() - start));
        System.out.println("\trand=" + rand);
    }

    public static void doReflection() throws Exception {
        long start = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) { 
            Main m = (Main)Class.forName("Main").newInstance();
            m.doSomething(start);
        }
        System.out.println("Reflection: " + (System.currentTimeMillis() - start));
        System.out.println("\trand=" + rand);
    }

    public static void doReflectionOptimized() throws Exception {
        long start = System.currentTimeMillis();
        Main m = (Main)Class.forName("Main").newInstance();
        for (int i=0; i<1000000; i++) { 
            m.doSomething(start);
        }
        System.out.println("ReflectionOptimized: " + (System.currentTimeMillis() - start));
        System.out.println("\trand=" + rand);
    }
}
