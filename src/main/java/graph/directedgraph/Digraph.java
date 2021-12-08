package graph.directedgraph;

import java.util.Arrays;
import java.util.LinkedList;

public class Digraph {
    private final int V;
    private int E;
    private LinkedList<Integer> adj[];

    public Digraph(int vertices) {
        V = vertices;
        this.E=0;
        adj = new LinkedList[vertices];
        Arrays.setAll(adj, (v)-> new LinkedList<>());
    }

    public int V(){
        return V;
    }
    public int E(){
        return E;
    }

    public void addEdge(int v,int w){
        adj[v].add(w);
        E++;
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }

}
