public class Gc {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Object();                                // Creates objects that will be garbage collected
        }
        System.gc();                                    // Suggests JVM to run GC (not guaranteed)
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected!");
    }
}