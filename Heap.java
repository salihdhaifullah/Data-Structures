import java.util.Arrays;

public class Heap {
    private int[] heap;
    private int size;
    private int capacity;
    private int initialCapacity;

    public Heap(int capacity) {
        this.capacity = capacity;
        this.initialCapacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    public int peek() {
        return heap[0];
    }

    // Method to delete and return the first element from the heap
    public int delete() throws Exception {
        if (size == 0)
            throw new Exception("Heap is Empty");

        // Check if there is only one element in the heap
        if (size == 1) {
            int min = heap[0];
            capacity = initialCapacity;
            size = 0;
            heap = new int[capacity];

            return min;
        }

        // Store the minimum element and replace it with the last element in the array
        int min = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = 0;
        size--;

        // Fix the heap property by moving the element down if it is larger than its
        // children
        heapify(0);

        // Return the minimum element
        return min;
    }

    // Method to fix the heap property for a given node and its subtree

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public void insert(int data) {
    }

    public void heapify(int currentIndex) {

    }

    public class minHeap extends Heap {

        public minHeap(int capacity) {
            super(capacity);
        }

        @Override
        public void insert(int data) {
            if (size == capacity) {
                capacity += 10;
                int[] temp = Arrays.copyOf(heap, capacity);
                heap = temp;
            }

            // Insert the new element at the end of the array
            int newElementIndex = size;
            heap[newElementIndex] = data;
            size++;

            // they are no elements in the heap no need to swap
            if (newElementIndex == 0)
                return;

            // check if Parent value is greater then the new element value
            // if so we swap them so the Parent become the child and child become Parent

            while (heap[getParentIndex(newElementIndex)] > heap[newElementIndex]) {
                swap(newElementIndex, getParentIndex(newElementIndex));
                newElementIndex = getParentIndex(newElementIndex);
            }
        }

        @Override
        public void heapify(int currentSmallestValueIndex) {
            // Get the left and right child indices
            int leftChildIndex = getLeftChildIndex(currentSmallestValueIndex);
            int rightChildIndex = getRightChildIndex(currentSmallestValueIndex);

            int smallest = currentSmallestValueIndex;

            if (leftChildIndex < size && heap[leftChildIndex] < heap[smallest]) {
                smallest = leftChildIndex;
            }

            if (rightChildIndex < size && heap[rightChildIndex] < heap[smallest]) {
                smallest = rightChildIndex;
            }

            if (smallest == currentSmallestValueIndex)
                return;

            // If the node is not the smallest,
            // swap it with its smallest child and recurse on the child

            swap(currentSmallestValueIndex, smallest);
            heapify(smallest);
        }

    }

    public class maxHeap extends Heap {

        public maxHeap(int capacity) {
            super(capacity);
        }

        @Override
        public void insert(int data) {
            if (size == capacity) {
                capacity += 10;
                int[] temp = Arrays.copyOf(heap, capacity);
                heap = temp;
            }

            // Insert the new element at the end of the array
            int newElementIndex = size;
            heap[newElementIndex] = data;
            size++;

            // they are no elements in the heap no need to swap
            if (newElementIndex == 0)
                return;

            // check if Parent value is greater then the new element value
            // if so we swap them so the Parent become the child and child become Parent

            while (heap[getParentIndex(newElementIndex)] < heap[newElementIndex]) {
                swap(newElementIndex, getParentIndex(newElementIndex));
                newElementIndex = getParentIndex(newElementIndex);
            }
        }

        @Override
        public void heapify(int currentSmallestValueIndex) {
            // Get the left and right child indices
            int leftChildIndex = getLeftChildIndex(currentSmallestValueIndex);
            int rightChildIndex = getRightChildIndex(currentSmallestValueIndex);

            int smallest = currentSmallestValueIndex;

            if (leftChildIndex < size && heap[leftChildIndex] > heap[smallest]) {
                smallest = leftChildIndex;
            }

            if (rightChildIndex < size && heap[rightChildIndex] > heap[smallest]) {
                smallest = rightChildIndex;
            }

            if (smallest == currentSmallestValueIndex)
                return;

            // If the node is not the smallest,
            // swap it with its smallest child and recurse on the child

            swap(currentSmallestValueIndex, smallest);
            heapify(smallest);
        }

    }

    public class Main {
        public Main() throws Exception {
            minHeap minHeap = new minHeap(10);
            minHeap.insert(10);
            minHeap.insert(15);
            minHeap.insert(20);
            minHeap.insert(40);
            minHeap.insert(5);
            minHeap.insert(30);
            minHeap.insert(25);
            minHeap.insert(35);
            minHeap.printHeap();

            System.out.println("Deleting min element: " + minHeap.delete());
            minHeap.printHeap();
            System.out.println("#".repeat(35));

            maxHeap maxHeap = new maxHeap(10);
            maxHeap.insert(10);
            maxHeap.insert(15);
            maxHeap.insert(20);
            maxHeap.insert(40);
            maxHeap.insert(5);
            maxHeap.insert(30);
            maxHeap.insert(25);
            maxHeap.insert(35);
            maxHeap.printHeap();

            System.out.println("Deleting min element: " + maxHeap.delete());
            maxHeap.printHeap();
        }

    }

    public static void main(String[] args) throws Exception {
        Main g = new Main();
    }
}
