import java.util.HashMap;
import java.util.LinkedList;

class Graph {
    private HashMap<Integer, LinkedList<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        if (!adjList.containsKey(vertex)) {
            adjList.put(vertex, new LinkedList<>());
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        if (adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
        }
    }

    public void printGraph() {
        for (int vertex : adjList.keySet()) {
            System.out.println(vertex + ": " + adjList.get(vertex));
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addVertex(5);

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        g.printGraph();
    }
}
