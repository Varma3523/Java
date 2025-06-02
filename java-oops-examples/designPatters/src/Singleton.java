//Design patterns are reusable solutions to common software design problems. They represent best practices evolved over time by experienced developers.//


public class Singleton {
    // Private static instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code here
    }

    // Public static method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the singleton
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}