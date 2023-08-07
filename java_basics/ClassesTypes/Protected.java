package ClassesTypes;

public class Protected {
  // protected: This keyword indicates that a class is accessible only within the
  // same package where it is declared or by subclasses in any package.
  // A protected class can have protected or non-protected methods and variables.
  // A protected class is also usually used as a nested or inner class within
  // another class.
  // An example of a protected class is:

  // A public class named Super
  public class Super {
    // A protected inner class named Sub
    protected class Sub {
      // A protected method named print
      protected void print() {
        System.out.println("This is a subclass");
      }
    }
  }

  // Another public class named Test in a different package
  public class Test extends Super {
    // A public method named display
    public void display() {
      // Creating an object of the subclass using inheritance
      Sub s = new Sub();
      // Calling the subclass method
      s.print();
    }
  }
}
