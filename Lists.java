import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
    // The List interface is a generic interface, meaning that it can hold elements of any type.
    // For example, you can create a list of strings, a list of integers, or a list of custom objects


    // The List interface is an abstract concept meaning you cannot create an instance of it directly.
    // You have to use one of its implementing classes to create a concrete list object.
    // The most commonly used implementing class is ArrayList which uses an array as the underlying data structure.
    // Another popular implementing class is LinkedList which uses a doubly-linked list as the underlying data structure.
    // Each implementing class has its own advantages and disadvantages in terms of performance and memory usage.

    // ArrayList
    List<String> names = new ArrayList<String>();

    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    names.add("David");

    System.out.println("ArrayList: " + names);
    System.out.println("First name: " + names.get(0));

    names.set(0, "Anna");
    System.out.println("Modified ArrayList: " + names);

    names.remove(0);
    System.out.println("Modified ArrayList: " + names);


    // LinkedList
    List<Integer> numbers = new LinkedList<Integer>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);

    System.out.println("LinkedList: " + numbers);
    System.out.println("First number: " + numbers.get(0));

    numbers.set(0, 15);
    System.out.println("Modified LinkedList: " + numbers);

    numbers.remove(0);
    System.out.println("Modified LinkedList: " + numbers);

    // ArrayList internally uses a dynamic array to store the elements, while LinkedList internally uses a doubly linked list to store the elements.
    // ArrayList is better for storing and accessing data, while LinkedList is better for manipulating data.
    // ArrayList has a fixed initial capacity that can be resized if needed, while LinkedList has no initial capacity and grows dynamically as elements are added.
    // ArrayList can only act as a list, while LinkedList can act as both a list and a queue.
    // ArrayList provides random access to elements using the index, while LinkedList provides sequential access to elements using pointers.
    // ArrayList is faster in searching elements, while LinkedList is faster in adding and removing elements.
    }
}
