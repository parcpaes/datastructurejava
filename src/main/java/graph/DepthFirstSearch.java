package graph;

import java.util.Stack;

public class DepthFirstSearch {
    private boolean [] marked;
    private int [] edgeTo;
    private int count;
    private int source;

    public DepthFirstSearch(Graph graph,int source){
        this.source = source;
        marked = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        dfs(graph,source);
    }

    private void dfs(Graph graph, int v) {
        count++;
        marked[v] = true;
        for(int w: graph.adj(v)){
            if(!marked[w]){
                dfs(graph,w);
                edgeTo[w]=v;
            }
        }
    }

    public boolean hasPathTo(int v){
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v){
        if(!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();
        for(int x=v;x!=source;x=edgeTo[x]){
            path.push(x);
        }
        path.push(source);
        return path;
    }

    public int count(){
        return count;
    }
}
