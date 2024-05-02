import java.util.*;
class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
    
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

  
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    
    void printGraph() {
        for (int i = 0; i < V; ++i) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head");
            for (Integer pCrawl : adj[i]) {
                System.out.print(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }
}


public class Main {
    public static void main(String args[]) {
        
        Graph g = new Graph(5);

       
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}
