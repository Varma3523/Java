
//   Spring Boot simplifies Spring application development with auto-configuration and starter dependencies.




//Key Features:

//Auto-configures Tomcat, Spring MVC, JSON binding
//No XML configuration needed
//Run with mvn spring-boot:run





/*package org.example;

@SpringBootApplication // Auto-configures Spring
public class MyApp {
    public static void main(String[] args) {
        // Starts embedded Tomcat server on port 8080
        SpringApplication.run(MyApp.class, args);
    }
}

@RestController // Handles HTTP requests
class HelloController {

    @GetMapping("/hello") // GET /hello -> "Hello World"
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/user/{name}") // Path variable
    public String greetUser(@PathVariable String name) {
        return "Hello " + name;
    }
}