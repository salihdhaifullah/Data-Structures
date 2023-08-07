public class Queues {
    public static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue<E> {
        private Node<E> head;
        private Node<E> tail;
        private int size;

        public Queue() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public int getSize() {
            return size;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public E peek() {
            if (isEmpty())
                return null;

            return head.data;
        }

        public E dequeue() {
            if (isEmpty())
                return null;

            final E data = head.data;
            head = head.next;
            size--;
            return data;
        }

        public void enqueue(E item) {
            final Node<E> node = new Node<E>(item);

            if (isEmpty()) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }

            size++;
        }

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.getSize());
        System.out.println(queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
