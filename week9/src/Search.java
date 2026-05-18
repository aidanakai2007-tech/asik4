import java.util.*;

public abstract class Search<V> {
    protected WeightedGraph<V> graph;
    protected Vertex<V> source;

    public Search(WeightedGraph<V> graph, Vertex<V> source) {
        this.graph = graph;
        this.source = source;
    }

    public abstract void search();
}