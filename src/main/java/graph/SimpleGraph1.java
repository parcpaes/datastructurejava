package graph;

public class SimpleGraph1 {
    public static void buildSimpleGraph(){
        Graph graph = new Graph(5);
        graph.addEdge(0,4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);

        for(int v=0;v<graph.V();v++){
            for(int w : graph.adj(v)){
                System.out.println(v+" - "+w);
            }
        }
    }
    public void dfs(Graph graph){
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(graph,0);
        for(int v: depthFirstSearch.pathTo(5)){
            System.out.println(v);
        }
    }
    public static void bfs(Graph graph){
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(graph,0);
        int dist = breadthFirstSearch.getDistanceFromVertex(7);
        System.out.println(dist);
    }
    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(0,2);
        graph.addEdge(0,5);
        graph.addEdge(0,1);
        graph.addEdge(2,1);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,6);
        graph.addEdge(4,7);
        bfs(graph);
    }

    public static int degree(Graph graph,int v){
        int degree = 0;
        for(int w:graph.adj(v)) degree++;
        return degree;
    }
}
