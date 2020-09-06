public class MotherVertex {
        public static int findMotherVertex(Graph g){
            // Write - Your - Code
            int c = 0;
            int p=0;
            int s =0;
            for(int i=0;i<g.vertices;i++){
                c=p;
                p = Count(g,i);
                if(p>c)
                    s = i;
            }
            return s;
        }
        public static int Count(Graph g,int source){
            int i=0;
            DoublyLinkedList<Integer>.Node temp = g.adjacencyList[source].headNode;
            while(temp!=null){
                temp = temp.nextNode;
                i++;
            }
            return i;
        }
    }

