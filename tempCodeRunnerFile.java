class Demo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called.");
        // Perform cleanup
    }
}

public class FinalizeExample {
    public static void main(String[] args) {
        Demo obj = new Demo();

        // Make object eligible for garbage collection
        obj = null;

        // Requesting garbage collection
        System.gc();

        System.out.println("Main method execution complete.");
    }
}
