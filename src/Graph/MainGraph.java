package Graph;

public class MainGraph {
    public static void main(String args[]){
        Graph g = new Graph(8);
        g.add(0,1);
        g.add(0,4);
        g.add(1,2);
        g.add(1,3);
        g.add(4,2);
        g.add(4,5);
        g.add(2,5);
        g.add(5,6);
        g.add(5,7);
        g.add(5,3);
        g.add(6,7);
        g.print();
        System.out.println("\nThe no of edges is "+ Graph.numEdges(g));
        System.out.println("The path is "+ Graph.checkPath(g,0,6));
        BFs b = new BFs();
        System.out.println( "The breath first search is "+ b.checkbfs(g));
        ChechDfs d = new ChechDfs();
        System.out.println("The depth first search is "+ d.dfs(g));
        DetectCycle c = new DetectCycle();
        System.out.println("The detect cycle is "+ c.detectCycle(g));
        MotherVertex m = new MotherVertex();
        System.out.println("The mother vertex is "+m.findMotherVertex(g));
        System.out.println("The shortest path is "+g.findShortestPathLength(g,0,7));
        g.removeEdge(g,5,3);
    }
}
