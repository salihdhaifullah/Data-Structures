import java.util.ArrayList;

public class Tree<E> {

    public static class Node<E> {
        E data;
        ArrayList<Node<E>> children;

        public Node(E data) {
            this.data = data;
            this.children = new ArrayList<Node<E>>();
        }
    }

    Node<E> root;

    public Tree(E root) {
        this.root = new Node<E>(root);
    }

    public Node<E> addChild(Node<E> parent, E child) {
        Node<E> newNode = new Node<E>(child);
        parent.children.add(newNode);
        return newNode;
    }

    public void printTree() {
        printTreeHelper(this.root);
    }

    private void printTreeHelper(Node<E> node) {
        if (node == null) return;

        System.out.print(node.data + " ");

        for (Node<E> child : node.children) {
            printTreeHelper(child);
        }
    }

    public static void main(String[] args) {
        Tree<String> tree = new Tree<String>("root");
        Node<String> n1 = tree.addChild(tree.root, "bin");
        Node<String> n2 = tree.addChild(tree.root, "home");
        Node<String> n3 = tree.addChild(tree.root, "usr");

        tree.addChild(n1, "test.exe");

        Node<String> n4 = tree.addChild(n2, "images");
        tree.addChild(n4, "hello.png");
        tree.addChild(n4, "sun.jpeg");

        tree.addChild(n3, "Isabella");
        Node<String> n5 = tree.addChild(n3, "Alex");
        tree.addChild(n5, "hello-world");
        tree.addChild(n5, "csavasaas");

        tree.printTree();
    }
}
