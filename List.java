public class List <V> {
    int size;
    int capacity;
    V[] array;

    public List() {
        this.size = 0;
        this.capacity = 10;
        this.array = (V[]) new Object[(capacity)];
    }

    public void add(V element) {
        if (size == capacity) {
            capacity += 10;

            V[] tempArray = (V[]) new Object[capacity];

          for (int i = 0; i < size; i++) {
            tempArray[i] = array[i];
          }

          array = tempArray;
        }

        array[size] = element;
        size++;

      }

      public V get(int index) {
        return array[index];
      }

      public void set(int index, V element) {
        array[index] = element;
      }

      public void remove(int index) {
        V[] tempArray = (V[]) new Object[capacity];
        int x = 0;

        for (int i = 0; i < index; i++) {
            tempArray[x] = array[i];
            x++;
        }

        for (int i = (index + 1); i < size; i++) {
            tempArray[x] = array[i];
            x++;
        }

        array = tempArray;
        size--;
      }

      public int size() {
        return size;
      }

      public boolean isEmpty() {
        return size == 0;
      }

      public void printArray() {
        System.out.print("[");
        for (V v : array) {
            if (v == null) continue;
            System.out.print(v + ",");
        }
        System.out.print("]");
        System.out.println();
      }


    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();

        list.add(10); // add 10 to the end of the list
        list.printArray(); // add 10 to the end of the list
        list.add(20); // add 20 to the end of the list
        list.printArray(); // add 10 to the end of the list
        list.add(30); // add 30 to the end of the list
        list.printArray(); // add 10 to the end of the list
        list.set(1, 40); // replace 20 with 40
        list.printArray(); // add 10 to the end of the list
        list.remove(2); // remove 10 from the list
        list.printArray(); // add 10 to the end of the list
        list.remove(0); // remove 10 from the list
        list.printArray(); // add 10 to the end of the list
        System.out.println(list.size()); // print 2
        System.out.println(list.isEmpty()); // print false
    }
}
