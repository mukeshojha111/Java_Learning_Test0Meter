package Learning_Java;

public class CustomObjectCleanup extends Object{
	protected void finalize() throws Throwable {
        try {
            System.out.println("Custom cleanup code executed before garbage collection.");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Creating an object
        CustomObjectCleanup customObject = new CustomObjectCleanup();

        // Making the object reference null
        customObject = null;

        // Explicitly triggering garbage collection
        System.gc();
    }
}
