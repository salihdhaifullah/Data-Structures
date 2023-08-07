public class Stacks {
    public static class Stack<T> {
        private T[] data;
        private int top;
        private int capacity;

        public Stack(int capacity) {
             data = (T[]) new Object[capacity];
             top = -1;
             this.capacity = capacity;
        }

        public boolean isFull() {
            return (top + 1) == capacity;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(T data) {
            if (isFull()) {
                System.out.println("Stack Is Full");
                return;
            }
            top += 1;
            this.data[top] = data;
        }

        public T pop() {
            if (isEmpty()) {
            System.out.println("Stack Is Empty");
            return null;
            } else {
                T item = data[top];
                top -= 1;
                System.out.println(item);
                return item;
            }
        }

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(5);

        stack.push(0);
        stack.push(12);
        stack.push(2190);
        stack.push(98979);
        stack.push(-3223);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}


