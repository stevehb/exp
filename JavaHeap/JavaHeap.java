public class JavaHeap {
    public static void main(String[] args) {
        long maxMem = Runtime.getRuntime().maxMemory();
        long totalMem = Runtime.getRuntime().totalMemory();
        long freeMem = Runtime.getRuntime().freeMemory();
        long megabytes = 1024 * 1024;

        System.out.println("On this machine,\n" +
                           "\tthe max heap is " + maxMem + " bytes (" + (maxMem / megabytes) + "MB)\n" +
                           "\tthe current heap is " + totalMem + " bytes (" + (totalMem / megabytes) + "MB)\n" +
                           "\tthe current free heap is " + freeMem + " bytes (" + (freeMem / megabytes) + "MB)");
    }
}


                           
