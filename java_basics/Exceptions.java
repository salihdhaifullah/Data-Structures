public class Exceptions {
    public static void main(String[] args) {
        // Exception and exception handling are important concepts in Java.
        // An exception is an event that disrupts the normal flow of the program and may
        // cause it to terminate abnormally.
        // Exception handling is a mechanism to handle runtime errors and prevent the
        // program from crashing.
        // It also helps to maintain the normal flow of the program and provide a better
        // user experience.

        // There are different types of exceptions in Java,
        // such as checked exceptions, unchecked exceptions, and errors.
        // Checked exceptions are those that are checked at compile-time and must be
        // handled or declared by the programmer.
        // For example, IOException, SQLException, etc.
        // Unchecked exceptions are those that are checked at runtime and are usually
        // caused by programming errors or logical mistakes.
        // For example, ArithmeticException, NullPointerException,
        // ArrayIndexOutOfBoundsException, etc.
        // Errors are those that are beyond the control of the programmer and indicate
        // serious problems with the system or environment.
        // For example, OutOfMemoryError, StackOverflowError, etc.

        // To handle exceptions in Java, we use the try-catch-finally blocks.
        // The try block contains the code that may throw an exception.
        // The catch block contains the code that handles the specific exception thrown
        // by the try block.
        // The finally block contains the code that is always executed regardless of
        // whether an exception occurs or not.
        // For example:

        try {
            // code that may throw an exception
            int data = 50 / 0; // this will throw ArithmeticException
        } catch (ArithmeticException e) {
            // code that handles the exception
            System.out.println("Cannot divide by zero");
        } finally {
            // code that is always executed
            System.out.println("This is always executed");
        }

        try {
            checkAge(15); // this will throw CustomException
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    // We can also use the throw and throws keywords to create our own exceptions.
    // The throw keyword is used to create an exception object and throw it.
    // The throws keyword is used to declare that a method may throw one or more
    // exceptions.
    // For example:

    public static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}
// Class, Interfaces, Object, Inheritance, Polymorphism, Abstraction, Encapsulation
