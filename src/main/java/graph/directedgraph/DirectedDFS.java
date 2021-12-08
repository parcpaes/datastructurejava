package graph.directedgraph;

public class DirectedDFS {
    private boolean[] marked;
    public DirectedDFS(Digraph digraph, int s){
        marked = new boolean[digraph.V()];
        dfs(digraph,s);
    }

    private void dfs(Digraph digraph, int v) {
        marked[v]=true;
        for(int w: digraph.adj(v)){
            if(!marked[w]) dfs(digraph,w);
        }
    }

    public boolean visited(int v){
        return marked[v];
    }
}
