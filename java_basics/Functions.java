

public class Functions {
    // Functions are blocks of code that perform a specific task and can be reused in different parts of the program.
    // Functions are also known as methods in Java, and they must be declared within a class.

    // Functions have the following advantages:

    // They reduce code duplication by allowing you to write the code once and use it many times.
    // They improve readability and maintainability by breaking down the code into smaller and meaningful units.
    // They facilitate modular programming by separating the logic of the program into independent modules.
    // They enable code reuse by allowing you to create libraries of functions that can be used by other programs.
    // Functions have the following syntax:

    // modifier returnType functionName(parameterList) {
        // body of the function
    // }

    // The components of a function are:

    // modifier: specifies the access level of the function, such as public, private, protected, or default.
    // modifier also indicates whether the function is static or non-static. Static functions belong to the class and can be called without creating an object of the class. Non-static functions belong to the object and can be called only through an object of the class.
    // returnType: specifies the type of value that the function returns. If the function does not return any value, it is declared as void.
    // functionName: specifies the name of the function. It should follow the naming conventions of Java and be descriptive and meaningful.
    // parameterList: specifies the list of parameters that the function accepts. Parameters are variables that hold the values passed to the function when it is called. Each parameter has a type and a name, separated by a space. Multiple parameters are separated by commas. If the function does not accept any parameters, the parameter list is empty.
    // body: specifies the block of code that defines the logic of the function. It is enclosed within curly braces.

    // For example, suppose we want to create a function that calculates and returns the area of a circle given its radius.
    //  We can write it as follows:
    public static double areaOfCircle(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }

    public static void main(String[] args) {
        // call the function with different arguments and print the results
        System.out.println(areaOfCircle(5)); // 78.53981633974483
        System.out.println(areaOfCircle(10)); // 314.1592653589793
        System.out.println(areaOfCircle(2.5)); // 19.634954084936208
    }
}
