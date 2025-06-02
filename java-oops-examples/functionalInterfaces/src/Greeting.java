      // A functional interface has exactly one abstract method, often used with lambda expressions.

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

class Main {
    public static void main(String[] args) {
        Greeting greet = (name) -> System.out.println("Hello, " + name);
        greet.sayHello("Alice");  // Output: Hello, Alice
    }
}