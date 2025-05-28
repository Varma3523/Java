


//                     Having multiple constructors with different parameters in the same class.


class Person {
    private String name;
    private int age;

    // Constructor 1
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor 2
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor 3
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();          // Uses constructor 1
        Person p2 = new Person("Alice");   // Uses constructor 2
        Person p3 = new Person("Bob", 30); // Uses constructor 3

        p1.display();  // Name: Unknown, Age: 0
        p2.display();  // Name: Alice, Age: 0
        p3.display();  // Name: Bob, Age: 30
    }
}