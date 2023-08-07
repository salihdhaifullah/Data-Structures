package ClassesTypes;

public class Abstract {
  // abstract: This keyword indicates that a class is incomplete and cannot be
  // instantiated.
  // An abstract class can have abstract methods that have no implementation and
  // must be overridden by subclasses.
  // An abstract class can also have concrete methods that have implementation and
  // can be inherited by subclasses.
  // An example of an abstract class is:

  abstract class Animal {
    // An abstract method named makeSound
    abstract void makeSound();

    // A concrete method named eat
    void eat() {
      System.out.println("Eating...");
    }
  }

  // A subclass named Dog that extends Animal
  public class Dog extends Animal {
    // An implementation of the abstract method
    void makeSound() {
      System.out.println("Woof!");
    }
  }

  // A subclass named Cat that extends Animal
  public class Cat extends Animal {
    // An implementation of the abstract method
    void makeSound() {
      System.out.println("Meow!");
    }
  }

}
