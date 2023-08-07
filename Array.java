public class Array {
    public static void main(String[] args) {
        // An array is a collection of similar types of data that can be accessed by an index.
        // An array has a fixed size
        // An array can only store elements of the same type
            new Scanner(System)
        int[] numbers = new int[10];
        numbers[0] = 5;
        numbers[1] = 10;

        System.out.println(numbers[0]); // 5
        System.out.println(numbers[9]); // 0 which is the default value

        // You can change the value of an element by assigning a new value to it:
        numbers[0] = 100;
        System.out.println(numbers[0]); // 100

        // You can find out the length of an array by using the length property:
        System.out.println(numbers.length); // 10

        // You can also initialize an array with values
        int[] nums = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
    }
}
