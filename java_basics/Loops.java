public class Loops {
    public static void main(String[] args) {
        // loops are statements that allow a block of code to be executed repeatedly
        // based on a condition.
        // There are three types of loops in Java: for loop, while loop and do-while
        // loop.

        // A for loop is used when we know the number of iterations in advance.
        // The syntax of a for loop is:

        // for (initialization; condition; update) {
        // loop body
        // }

        // For example

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // A while loop is used when we don’t know the number of iterations in advance,
        // but we have a boolean condition that determines when to stop the loop.
        // It consists of two parts

        // while (condition) {
        // loop body
        // }

        // For example

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // A do-while loop is similar to a while loop, except that it executes the loop
        // body at least once before checking the condition.

        // do {
        // loop body
        // } while (condition);

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        // enhanced for loop: This is a special type of for loop that can iterate over
        // arrays or collections without using an explicit index variable.

        // for (type element : arrayOrCollection) {
        // loop body
        // }

        // For example

        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.println(number);
        }

        // keywords

        // break: This keyword can be used to exit the current loop immediately.
        // continue: This keyword can be used to skip the current iteration of the loop
        // and continue with the next one.
    }
}
