package graph;

import java.util.Arrays;
import java.util.LinkedList;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adj; //adjacency list

    public Graph(int vertices) {

        this.vertices = vertices;
        adj = new LinkedList[this.vertices];
        Arrays.setAll(adj, (v) -> new LinkedList<>());
//        for(int v=0;v<vertices;v++){
//            adj[v] = new LinkedList<>();
//        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int V() {
        return vertices;
    }
}
