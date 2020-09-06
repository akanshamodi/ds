public class Graph {
    int vertices;
    DoublyLinkedList<Integer> adjacencyList[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new DoublyLinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new DoublyLinkedList<>();
        }
    }

    public void add(int source, int destination) {
        if (source < vertices && destination < vertices) {
            adjacencyList[source].insertAtEnd(destination);
            //for an undirected graph
          //  adjacencyList[destination].insertAtEnd(source);
        }
    }
    public void print(){
        for(int i=0;i<vertices;i++) {
            if (adjacencyList[i] != null) {
                System.out.println();
                System.out.print("|"+i+"|"+"->");
                DoublyLinkedList<Integer>.Node temp = adjacencyList[i].getHeadNode();
                while(temp!=null){
                    System.out.print("["+temp.data+"]"+"->");
                    temp = temp.nextNode;
                }
                System.out.print("null");
            }
            else
            System.out.print("|"+i+"|"+"->"+"null");
        }
    }
    public static int numEdges(Graph g) {
        int count=0;
        for(int i=0;i<g.vertices;i++){
            DoublyLinkedList<Integer>.Node temp = g.adjacencyList[i].headNode;
            while(temp!=null){
                count++;
                temp=temp.nextNode;
            }
        }
        return count;
    }
    public static boolean checkPath(Graph g, int source, int destination) {
        int i=source;
        DoublyLinkedList<Integer>.Node temp = g.adjacencyList[i].headNode;
        DoublyLinkedList<Integer>.Node curr = g.adjacencyList[i].headNode;
        while(temp!=null){
            while(temp.data != destination) {
                if( g.adjacencyList[temp.data].headNode!=null){
                    temp = g.adjacencyList[temp.data].headNode;
                }
            }
            if(temp.data==destination)
            {
                return true;
            }
            temp = curr.nextNode;
        }
        return false;
    }
}
