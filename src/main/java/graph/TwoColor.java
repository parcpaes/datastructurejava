package graph;

import java.util.LinkedList;
import java.util.Queue;

public class TwoColor {
    private boolean[] marked;
    private boolean[] color;
    private boolean isColorable=true;

    public TwoColor(Graph graph){
        marked = new boolean[graph.V()];
        color = new boolean[graph.V()];
        for (int s = 0; s < graph.V(); s++) {
            if(!marked[s])
                bfs(graph,s);
        }
    }

    private void bfs(Graph graph, int v) {
        Queue<Integer> queue = new LinkedList<>();
        marked[v]=true;
        color[v]=true;
        queue.add(v);
        while(!queue.isEmpty()){
            int vertex = queue.poll();
            for(int w: graph.adj(vertex)){
                if(!marked[w]){
                    marked[w]=true;
                    color[w]=!color[vertex];
                    queue.add(w);
                }else if(color[w]==color[vertex]){
                    isColorable=false;
                    return;
                }
            }
        }
    }

    public boolean isColorable() {
        return isColorable;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0,3);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(3,2);
        graph.addEdge(1,4);
        graph.addEdge(3,5);

        TwoColor twoColor = new TwoColor(graph);
        System.out.println(twoColor.isColorable());
    }
}
