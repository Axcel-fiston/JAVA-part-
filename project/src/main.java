import java.util.Stack;
import java.util.Vector;

class Graph {
    private int vertices;
    private Vector<Integer>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new Vector[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new Vector<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void DFS(int startNode) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertices];

        stack.push(startNode);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            if (!visited[currentNode]) {
                System.out.print(currentNode + " ");
                visited[currentNode] = true;
            }

            for (int neighbor : adjacencyList[currentNode]) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }
}
public class main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 5);

        System.out.println("Depth-First Search traversal of the graph starting from vertex 0 is: ");
        graph.DFS(0);
    }
}