public class BFs {
    public static String checkbfs(Graph g){
        String result = "";
        boolean visited[] = new boolean[g.vertices];
        if(g.vertices<1)
            return result;
        for(int i=0;i<g.vertices;i++){
            if(!visited[i])
            result = result + bfS(g,i,visited);
        }
        return result;
    }
    public static String bfS(Graph g,int source,boolean[] visited){
        String result = "";
        Queue<Integer> q = new Queue<>(g.vertices);
        q.enqueue(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int current = q.dequeue();
            result = result + String.valueOf(current);
            DoublyLinkedList<Integer>.Node temp = g.adjacencyList[current].headNode;
            while(temp!=null){
                if(!visited[temp.data]) {
                    q.enqueue(temp.data);
                    visited[temp.data] = true;
                }
                temp = temp.nextNode;
            }
        }
        return result;
    }
}
