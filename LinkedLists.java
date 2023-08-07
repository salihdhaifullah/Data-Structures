public class LinkedLists {

    public static class Node<T> {
        T data; // data field
        Node<T> next; // reference to the next node

        // constructor
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList<T> {
        Node<T> head;
        Node<T> tail;

        public LinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void add(T data) {
            final Node<T> newNode = new Node<T>(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void print() {
            if (head == null) {
                System.out.println("The list is empty");
            } else {
                Node<T> current = head;
                while (current != null) {
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }

    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alex");
        linkedList.add("Joe");
        linkedList.add("Amelia");
        linkedList.add("Ava");

        linkedList.print();
    }
}





