

public class DataTypesAndVariables {

    public static void main(String[] args) {
        // there two main data types in java primitive and non-primitive

        // Primitive data types are the basic data types that are built-in in Java.
        // They are predefined by the language and have fixed sizes and formats
        // There are eight primitive data types in Java:
        /*
         * byte: a 1-byte integer value that can store whole numbers from -128 to 127
         * short: a 2-byte integer value that can store whole numbers from -32,768 to
         * 32,767
         * int: a 4-byte integer value that can store whole numbers from -2,147,483,648
         * to 2,147,483,647
         * long: an 8-byte integer value that can store whole numbers from
         * -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * float: a 4-byte floating-point value that can store fractional numbers with
         * up to 6-7 decimal digits
         * double: an 8-byte floating-point value that can store fractional numbers with
         * up to 15 decimal digits
         * char: a 2-byte character value that can store a single Unicode character
         * boolean: a 1-bit logical value that can store either true or false
         */

        // Non-primitive data types are the complex data types that are derived from
        // primitive data types or defined by the programmer.
        // They are also called reference types because they refer to objects (instances
        // of classes) that have their own attributes and methods.
        // Some examples of non-primitive data types are:
        /*
         * String: a sequence of characters enclosed by double quotes
         * Array: a collection of elements of the same type stored in a contiguous
         * memory location
         * Class: a blueprint for creating objects that have properties (attributes) and
         * behaviors (methods)
         * Interface: an abstract type that defines a set of methods that a class must
         * implement
         * Enum: a special type of class that defines a fixed set of constants
         */

        // To declare a variable in Java,
        // you need to specify its type and name,
        // and optionally assign it an initial value. For example:

        int age = 25;
        char gender = 'M';
        String name = "John";
        boolean isMarried = false;

        // You can also declare a variable without assigning it an initial value and the
        // Compiler will assign a default value depending on its type.
        // The default values for primitive data types are:

        // byte, short, int, long: 0
        // float, double: 0.0
        // char: ‘\u0000’ (the null character)
        // boolean: false

        // The default value for non-primitive data types is null.

        // You can also declare multiple variables of the same type in one line by
        // separating them with commas. For example:

        int x = 10, y = 20;

        // You can change the value of a variable after declaring it by using the
        // assignment operator (=). For example:

        int num = 10;
        System.out.println(num); // 10
        num = 20;
        System.out.println(num); // 20
    }
}
