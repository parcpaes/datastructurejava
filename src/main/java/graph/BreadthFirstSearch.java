package graph;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int edgeTo[];
    private final int source;
    private int distTo[];

    public BreadthFirstSearch(Graph graph, int source) {
        marked = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        this.source = source;
        distTo = new int[graph.V()];
        bfs(graph, source);
    }

    private void bfs(Graph graph, int source) {
        Deque<Integer> queue = new LinkedList<>();
        marked[source] = true;
        queue.add(source);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int w : graph.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    marked[w] = true;
                    distTo[w] = distTo[v] + 1;
                    queue.add(w);
                }
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public int getDistanceFromVertex(int v) {
        return distTo[v];
    }
}
