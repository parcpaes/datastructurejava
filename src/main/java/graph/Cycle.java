package graph;

public class Cycle {
    private boolean[] marked;
    private boolean hasCycle;

    public Cycle(Graph graph){
        marked = new boolean[graph.V()];
        for (int s = 0; s < graph.V(); s++) {
            if(!marked[s]) dfs(graph,s,s);
        }
    }

    private void dfs(Graph graph, int v, int u) {
        marked[v]=true;
        for(int w:graph.adj(v)){
            if(!marked[w]){
                dfs(graph,w,v);
            }else if(w!=u){
                hasCycle=true;
            }
        }
    }

    public boolean isHasCycle() {
        return hasCycle;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        Cycle cycle = new Cycle(graph);
        System.out.println(cycle.isHasCycle());
    }
}
