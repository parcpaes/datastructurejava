package graph;

public class ConnectedC {
    private boolean [] marked;
    private int[] id;
    private int count;

    public ConnectedC(Graph graph){
        marked = new boolean[graph.V()];
        id = new int[graph.V()];
        for (int i = 0; i < graph.V(); i++) {
            if(!marked[i]){
                dfs(graph,i);
                count++;
            }
        }
    }
    private void dfs(Graph graph,int v){
        marked[v]=true;
        id[v]=count;
        for (int w : graph.adj(v)) {
            if(!marked[w]) dfs(graph,w);
        }
    }

    public boolean connected(int v,int w){
        return id[v] == id[w];
    }

    public int id(int v){
        return id[v];
    }

    public int count(){
        return count();
    }
}
