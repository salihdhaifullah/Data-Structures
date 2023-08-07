public class HashTable <K, V> {
    public static class Node <K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    Node<K, V>[] table;
    int capacity;
    int size;
    final double loadFactor = 0.75;

    public HashTable() {
        this.size = 0;
        this.capacity = 10;
        this.table = (Node<K, V>[]) new Node[capacity];
    }

    public int hash(K k) {
        String key = k.toString();
        int hash = 0;
        for (byte b : key.getBytes()) {
            hash += b;
        }
        return hash % capacity;
    }

    public void remap() {
            capacity = capacity * 2;
            Node<K, V>[] newTable = (Node<K, V>[]) new Node[capacity];
            for (int i = 0; i < table.length; i++) {
                Node<K, V> node = table[i];
                if (node == null) continue;

                while (node != null) {
                    Node<K,V> newNode = new Node<K,V>(node.key, node.value);
                    int index = hash(newNode.key);

                    if (newTable[index] == null) {
                        newTable[index] = newNode;
                    }
                    else if (newTable[index].next == null) {
                        newTable[index].next = newNode;
                    }
                    else if (newTable[index].next != null) {
                        Node<K, V> current = newTable[index];
                        while (current.next != null) {
                            current = current.next;
                        }
                        current.next = newNode;
                    }
                    node = node.next;
                }
            }
        table = newTable;
    }

    public void insert(K key, V value) {
        if ((double) size / capacity > loadFactor) remap();

        int index = hash(key);
        Node<K, V> node = new Node<K, V>(key, value);

        if (table[index] == null) {
            table[index] = node;
        }
        else if (table[index].next == null) {
            table[index].next = node;
        }
        else {
            Node<K, V> current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }


    public V get(K key) {
        int index = hash(key);
        System.out.print(index + " ");
        if (table[index] == null) return null;
        if (table[index].next == null || table[index].key == key) return table[index].value;

        else {
            Node<K, V> current = table[index];

            while (current.next != null) {
                current = current.next;
                if (current.key == key) {
                    return current.value;
                };
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable<String, String> table = new HashTable<String, String>();

        table.insert("hello1", "world");
        table.insert("world1", "hello");
        table.insert("hello2", "world");
        table.insert("world2", "hello");
        table.insert("hello3", "world");
        table.insert("world3", "hello");
        table.insert("hello4", "world");
        table.insert("world4", "hello");
        table.insert("hello5", "world");
        table.insert("world5", "hello");
        table.insert("G", "B");

        table.insert("Love Mom", "Love Mom");
        table.insert("Mom", "Mom");
        table.insert("Love", "Love");
        table.insert("alex", "alex");
        table.insert("Alex", "Alex");
        table.insert("read", "read");

        System.out.println(table.get("hello1"));
        System.out.println(table.get("world1"));
        System.out.println(table.get("hello2"));
        System.out.println(table.get("world2"));
        System.out.println(table.get("hello3"));
        System.out.println(table.get("world3"));
        System.out.println(table.get("hello4"));
        System.out.println(table.get("world4"));
        System.out.println(table.get("hello5"));
        System.out.println(table.get("world5"));
        System.out.println(table.get("G"));

        System.out.println(table.get("Love Mom"));
        System.out.println(table.get("Mom"));
        System.out.println(table.get("Love"));
        System.out.println(table.get("alex"));
        System.out.println(table.get("Alex"));
        System.out.println(table.get("read"));
        System.out.println(table.get("ass"));
    }
}
