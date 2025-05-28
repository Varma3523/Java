/*                                             Exception Handling Flow in Java


Exception handling in Java follows a well-defined flow that allows programs to deal with unexpected or exceptional situations gracefully. Here's a comprehensive overview of how exception handling works in Java:

1. Exception Hierarchy

Java exceptions are organized in a hierarchy:

Throwable
 ├── Error (unchecked) - Serious problems not intended to be caught (e.g., OutOfMemoryError)
 └── Exception
      ├── RuntimeException (unchecked) - Programming errors (e.g., NullPointerException)
      └── Checked Exceptions - Must be caught or declared (e.g., IOException)



2. Exception Handling Flow

The typical flow of exception handling follows these steps:

Exception Occurs: When an exceptional condition arises in a method, an exception object is created.
Method Stack Unwinding: The JVM looks for an exception handler in the current method.
Handler Search:
If found, the exception is handled
If not found, the method terminates and the exception propagates to the calling method
Propagation Continues: This process repeats up the call stack until a handler is found
Default Handler: If no handler is found, the default handler terminates the program and prints the stack trace





3. Key Exception Handling Constructs

try-catch-finally Block

java
try {
    // Code that might throw an exception
} catch (ExceptionType1 e1) {
    // Handler for ExceptionType1
} catch (ExceptionType2 e2) {
    // Handler for ExceptionType2
} finally {
    // Code that always executes (for cleanup)
}
throws Clause

java
public void myMethod() throws IOException {
    // Method code that might throw IOException
}
throw Statement

java
throw new ExceptionType("Error message");





4. Exception Handling Process in Detail

Exception Thrown:
An exception can be thrown either by the JVM (for standard exceptions) or explicitly by code using the throw keyword
The normal flow of execution stops immediately
Exception Propagation:
The runtime system searches backward through the call stack for an appropriate handler
It starts with the method where the error occurred
If no handler is found, it moves to the previous method in the call stack
Handler Matching:
The first catch block that can handle the exception type (or its superclass) is executed
Catch blocks are evaluated in order from top to bottom
finally Execution:
The finally block (if present) always executes, regardless of whether an exception was thrown or caught
This makes it ideal for resource cleanup (closing files, database connections, etc.)





5. Best Practices

Specific Before General: Catch more specific exceptions before more general ones
Don't Swallow Exceptions: Avoid empty catch blocks
Use Finally for Cleanup: Ensure resources are properly released
Document Exceptions: Use @throws in JavaDoc for checked exceptions
Create Meaningful Exceptions: Provide descriptive messages when creating custom exceptions
Prefer Checked for Recoverable Conditions: Use checked exceptions when recovery is possible
Use Unchecked for Programming Errors: Use RuntimeException for programming mistakes\






6. Custom Exceptions

You can create your own exception classes by extending Exception or RuntimeException:

java
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}





7. Try-with-Resources (Java 7+)

For automatic resource management:

java
try (InputStream input = new FileInputStream("file.txt");
     OutputStream output = new FileOutputStream("output.txt")) {
    // Work with resources
} catch (IOException e) {
    // Handle exception
}
// Resources are automatically closed here




8. Multi-catch (Java 7+)

Catch multiple exceptions in a single catch block:

java
try {
    // code that might throw exceptions
} catch (IOException | SQLException e) {
    // handle both exceptions
}
Understanding this flow helps you write more robust Java applications that can handle errors
gracefully and maintain stability even when unexpected situations occur.



*/