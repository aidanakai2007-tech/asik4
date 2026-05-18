public class Main {
    public static void main(String[] args) {

        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> A = new Vertex<>("A");
        Vertex<String> B = new Vertex<>("B");
        Vertex<String> C = new Vertex<>("C");
        Vertex<String> D = new Vertex<>("D");

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);

        graph.addEdge(A, B, 1);
        graph.addEdge(A, C, 4);
        graph.addEdge(B, C, 2);
        graph.addEdge(B, D, 5);
        graph.addEdge(C, D, 1);

        System.out.println("BFS:");
        BreadthFirstSearch<String> bfs =
                new BreadthFirstSearch<>(graph, A);
        bfs.search();

        System.out.println("\nDijkstra:");
        DijkstraSearch<String> dijkstra =
                new DijkstraSearch<>(graph, A);
        dijkstra.search();
    }
}