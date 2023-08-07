public class Set<V> {
    int size;
    int capacity;
    V[] array;

    public Set() {
        this.size = 0;
        this.capacity = 10;
        this.array = (V[]) new Object[(capacity)];
    }

    public void add(V element) throws Exception {
        if (size == capacity) {
            capacity += 10;

            V[] tempArray = (V[]) new Object[capacity];

            for (int i = 0; i < size; i++) {
                tempArray[i] = array[i];
            }

            array = tempArray;
        }

        if (contains(element)) throw new Exception("element \"" + element + "\" is all ready exist");

        array[size] = element;
        size++;
    }

    public V get(int index) {
        return array[index];
    }

    public boolean contains(V element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) continue;
            if (array[i] == element) return true;
        }

        return false;
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
            if (v == null)
                continue;
            System.out.print(v + ",");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Set<Integer> set = new Set<Integer>();

        set.add(10);
        set.printArray();
        set.add(20);
        set.printArray();
        set.add(30);
        set.printArray();
        set.remove(2);
        set.printArray();
        set.remove(0);
        set.printArray();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
