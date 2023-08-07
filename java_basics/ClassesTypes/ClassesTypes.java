package ClassesTypes;

import ClassesTypes.Abstract.Cat;
import ClassesTypes.Abstract.Dog;
import ClassesTypes.Protected.Test;

public class ClassesTypes {
  // A class in Java is a template or blueprint for creating objects that have
  // state (attributes) and behavior (methods).
  // A class can have different types of keywords that modify its properties or
  // functionality.
  // Some of the keywords that can be used with a class are:

  // final: This keyword indicates that a class cannot be extended by any other
  // class.
  // A final class is immutable and prevents inheritance.
  // A final class can have final or non-final methods and variables.
  // An example of a final class is:
  // A final class named Math
  final class Math {
    // A final variable named PI
    public static final double PI = 3.14;

    // A non-final method named square
    public static int square(int x) {
      return x * x;
    }
  }

  // public: This keyword indicates that a class is accessible by any other class
  // in any package.
  // A public class can have public or non-public methods and variables.
  // An example of a public class is:

  // A public class named Hello
  public static class Hello {
    // A public method named greet
    public void greet() {
      System.out.println("Hello, world!");
    }
  }

  // private: This keyword indicates that a class is accessible only within the
  // same file where it is declared.
  // A private class can have private or non-private methods and variables.
  // A private class is usually used as a nested or inner class within another
  // class.
  // An example of a private class is:

  // A public class named Outer
  public static class Outer {
    // A private inner class named Inner
    private class Inner {
      // A private method named display
      private void display() {
        System.out.println("This is an inner class");
      }
    }

    // A public method named show
    public void show() {
      // Creating an object of the inner class
      Inner i = new Inner();
      // Calling the inner class method
      i.display();
    }
  }

  public static void main(String[] args) {
    Abstract a = new Abstract();
    Dog d = a.new Dog();
    Cat c = a.new Cat();

    // Calling methods on objects
    d.makeSound();
    d.eat();
    c.makeSound();
    c.eat();

    System.out.println(Math.PI);
    System.out.println(Math.square(5));

    // Creating an object of the public class
    Hello h = new Hello();
    // Calling the public method on the object
    h.greet();

    Outer o = new Outer();
    // Calling the outer class method
    o.show();

    Protected p = new Protected();
    Test t = p.new Test();

    // Calling the outer class method
    t.display();
  }
}
