
public class Conditionals {
    public static void main(String[] args) {

        // In Java, there are four types of conditional statements:

        // if statement: executes a block of code if a condition is true
        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // if-else statement: executes one block of code if a condition is true, and
        // another block of code if the condition is false
        int age2 = 16;

        if (age2 >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // else-if statement: executes one of several blocks of code based on multiple
        // conditions

        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        // switch statement: executes one of many blocks of code based on the value of
        // an expression

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
